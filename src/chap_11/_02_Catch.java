package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
            // 시도하려는 코드
            // System.out.println(3 / 0);  // 문제 발생

             int[] arr = new int[10];
             arr[100] = 100;

//            Object obj = "test";
//            System.out.println((int)obj);
//            String s = null;
//            System.out.println(s.toLowerCase());

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // 두가지의 예외 처리를 한꺼번에 처리 할 수 있다.
            System.out.println("뭔가 실수 하셨네요.");

        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("뭔가 실수 하셨네요.");

        } catch (ClassCastException e) {
            System.out.println("잘못된 형 변환입니다.");

        } catch (Exception e) {
            // 시도하는 코드에서 문제가 발생 한다면, 처리 및 어떤 문제가 발생했는지 알려줌
            System.out.println("그 이의 모든 에러는 여기서 처리가 되요.");
            // System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
