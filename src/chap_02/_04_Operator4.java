package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean apple = true;
        boolean banana = true;
        boolean orange = true;

        System.out.println(apple || banana || orange);
        //or 연산자 -> ||

        System.out.println(apple && banana && orange);
        //and 연산자 -> &&

        System.out.println((5 > 3) && (3 > 1));
        System.out.println((5 > 3) && (3 < 1));

        System.out.println((5 > 3) || (3 > 1));
        System.out.println((5 < 3) || (3 < 1));
        System.out.println((5 > 3) || (3 < 1));

        //논리 부정 연산자
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5 ==5));
        System.out.println(!(5 == 3));
        // ! -> not (반대로 해줌)

    }
}
