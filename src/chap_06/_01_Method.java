package chap_06;

public class _01_Method {
    // 메소드 정의
    public static void sayHello() {
        System.out.println("안녕하세요 메소드입니다!");
    }

    public static void main(String[] args) {
        //메소드 (기능을 하는 코드들의 묶음)
        //메소드는 동작을 하는것이기 때문에 이름 지을때 동사를 쓴다.

        System.out.println("메소드 호출 전");

        // 메소드 호출
        sayHello();
        sayHello();
        sayHello();

        System.out.println("메소드 호출 후");
    }
}
