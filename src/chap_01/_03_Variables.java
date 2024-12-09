package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "지환";
        int hour = 15;
        name = "철수";

        double salary = 50000.00;
        char grade = 'A';

        System.out.println("학점은 " + grade + ". " + "월급은 " + "$" + salary);
        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시 방문 예정입니다.");

        boolean pass = true;
        System.out.println("이번 시험은 합격했을까요? " + pass);

        double d = 4.51234112341234224;
        float f = 4.51234123412341234F;
        System.out.println(d);
        System.out.println(f);

        long l = 100000000000L; //Long int 보다 큰 자료형 값을 가진다.

        //int, long, flout, double, char, String, boolean
    }
}
