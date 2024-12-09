package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int num) {
        int result = num * num;
        return result;
    }

    public static int getPowerByExp(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        return result;
    }


    public static void main(String[] args) {
        // 전달값과 반환값이 함께있는 메소드 Parameter & Return
        int retVal = getPower(2);
        System.out.println(retVal);

        retVal = getPower(3);
        System.out.println(retVal);

        retVal = getPowerByExp(3, 3);
        System.out.println(retVal);

        retVal = getPowerByExp(4, 3);
        System.out.println(retVal);

    }
}
