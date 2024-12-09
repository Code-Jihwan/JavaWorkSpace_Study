package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.record(true, false, 10);
        System.out.println("------------");
        b1.record(false, true, 20);
        System.out.println("------------");
        b1.record(true, true, 30);
        System.out.println("------------");
        b1.record();
        System.out.println("------------");

        // 함수를 사용하고, 함수를 command 키 누르고 클릭하면 그 함수의 메소드 오버라이딩 된 정보들을 볼 수 있음.
    }
}
