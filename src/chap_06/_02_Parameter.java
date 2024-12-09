package chap_06;

public class _02_Parameter {
    public static void power(int num) {  // Parameter, 매개변수
        int result = num * num;
        System.out.println(num + "의 2승은 " + result);
    }

    public static void powerByExp(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        System.out.println(num + "의 " + exponent + " 승은 " + result + "입니다.");
    }

    public static void main(String[] args) {
        //Parameter(파라미터) = 전달값
        //2 -> 2*2 = 4
        //3 -> 3*3 = 9

        // 인수, Argument
        power(3);
        powerByExp(3, 3);

    }
}
