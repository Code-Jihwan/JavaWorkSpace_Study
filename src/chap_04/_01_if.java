package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 if
        int hour = 10;

        //if문 내에서 하나의 문장을 실행 할 떄는 { } 생략 가능
        //if문 내에서 2개 이상의 문장을 실행 할 떄는 { } 생략 불가
        if (hour < 14) {
            System.out.println("ice americano + 1");
            System.out.println("one shot plus");
        }
        System.out.println("coffee order done #1");

        System.out.println("------------------");

        //오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour = 13;
        boolean moringCoffee = false;

        if (hour < 14 && !moringCoffee) {
            System.out.println("ice americano + 1");
        }
        System.out.println("coffee order done #2");

        System.out.println("------------------");

        //오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        moringCoffee = true;
        if (hour >= 14 || moringCoffee == true) {
            System.out.println("decaffeinated ice coffee + 1");
        }
        System.out.println("coffee order done #3");
    }
}
