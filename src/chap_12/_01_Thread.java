package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 프로그램이 현재 실행되어 돌아가고 있는 상태를 프로세스
        // 프로세스의 자원을 이용해서 실제로 작업을 수행하는 것을 쓰레드.
        // 하나의 프로세스 (Process)
        // 쓰레드 (Thread) 보통은 하나의 프로세스가 하나의 쓰레드

        // 호텔 방
        // 1 3 5 7 9 (사장)
        // 2 4 6 8 10 (직원)
        // 쓰레드로 동시 청소 구현하기

        // cleanBySelf();
        // 직원이 청소를 하도록 쓰레드 만들기
        CleanThread cleanThread = new CleanThread();    // 객체 만들기
        // cleanThread.run();  // 직원 청소 -> run()를 직접 호출하면 안됨
        cleanThread.start();    // .start() 해야 새로운 쓰레드를 만들어 가지고, CleanThread 내의 run() 메소드 작업이 돌아감

        // 메인 쓰레드 내에서 작업 처리
        cleanByBoss();  // 사장님이 청소

        // 이렇게 해야 동시에 진행함

    }
    
    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }

    public static void cleanByBoss() {
        System.out.println("-- 샤쟝 청소 시작 --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 끝 --");
    }
}
