package chap_06;

public class _05_Overloading {
    public static int getPower(int num) {
        int result = num * num;
        return result;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        return result;
    }



    public static void main(String[] args) {
        //메소드 오버로딩 -> 같은 이름의 메소드를 여러번 중복해서 선언
        //(1) 전달값의 타입이 다르거나, (2) 전달값의 개수가 다를 때 -> 같은 이름의 메소드를 중복해서 사용 가능
        //반환형이 다른경우에는 메소드를 중복 적용 할 수 없다.
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        //전달값을 서로 다르게 줌. 전달값에 따라 각각 호출했음

        System.out.println(getPower(3, 3));
    }
}
