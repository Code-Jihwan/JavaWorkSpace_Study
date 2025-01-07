package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        // 쓰레드를 만드는 방법이 1) 쓰레드 클래스 상속하는 방법. 2) Runnable 인터페이스를 구현해서 하는 방법

        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start(); //CleanRunnable 에 정의되어있는 동작을 새로운 쓰레드 만들어가지고 동작하게 된다.

        cleanByBoss();

        // 인터페이는 여러번 구현이 가능하기 때문에 다중 상속이 가능하기 떄문에
        // 다른 클래스 상속 할거면 Runnable 로 하고 아니면 Thread 상속해서 하자.
    }

    public static void cleanByBoss() {
        System.out.println("-- 샤쟝 청소 시작 --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }

}
