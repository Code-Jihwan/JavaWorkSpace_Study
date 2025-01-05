package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");    // throw 사용해서 강제로 에러 발생시킴
            // System.out.println("택시에 탑승한다.");
        } catch (Exception e) {
            System.out.println("!! 문제 발생 : " + e.getMessage());
        } finally {
            // 반드시 실행해야하는 코드
            // try 문 내에서 작업하던거를 정리하는 코드를 넣으면 된다.
            System.out.println("택시의 문을 닫는다.");
        }

        // try + catch(s)
        // try + catch(s) + finally
        // try + finally

        System.out.println("-----------------------");

        try {
            System.out.println(3 / 0);
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
