package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류 (에러 error, 예외 exception)
        // int i = "문자열";
        // int[] arr = new int[3];
        // arr[5] = 100;
//        A a = new A();
//        a.method(); // StackOverflowError 벌샹

        try {
            // 시도하려는 코드
            // System.out.println(3 / 0);  // 문제 발생

            // int[] arr = new int[10];
            // arr[100] = 100;

            Object obj = "test";
            System.out.println((int)obj);
        } catch (Exception e) {
            // 시도하는 코드에서 문제가 발생 한다면, 처리 및 어떤 문제가 발생했는지 알려줌
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}

