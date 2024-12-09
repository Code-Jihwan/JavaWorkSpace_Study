package chap_04;

public class _02_else {
    public static void main(String[] args) {
        //조건문 if else
        int hour = 10;

        if (hour < 14) {
            System.out.println("ice americano +1");
        }
        else {  //그 외 경우이면
            System.out.println("decaffeinated ice americano +1");
        }
        System.out.println("coffe order done #1");

        //오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        boolean moringCoffee = true;
        if (hour >= 14 || moringCoffee == true) {
            System.out.println("decaffeinated ice americano +1");
        }
        else {
            System.out.println("ice americano +1");
        }
        System.out.println("coffe order done #2");
    }
}
