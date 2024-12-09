package chap_06;

public class _07_VariableScope {
    public static void methodA(int number) {
        //System.out.println(number);
    }

    public static void methodB() {
        int result = 1; //지역변수 : 변수가 선언된 영역 내에서만 사용이 가능

    }

    public static void main(String[] args) {
        //변수의 범위
        //메인 영역에서 생성된 변수는 메인 영역 안에서만 사용이 가능
        int number = 3;

        //어떤 메소드 안에서 만든 변수는 다른 곳에서 사용이 불가
        //System.out.println(result);

        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
        }
        //System.out.println(i);

        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }
    }
}
