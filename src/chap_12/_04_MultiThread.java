package chap_12;

import sun.misc.Cleaner;

public class _04_MultiThread {
    public static void main(String[] args) {
        // 멀티쓰레드 -> 직원을 2명 두기
        // 익명클래스로
        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작 --");
                for (int i = 1; i <= 10; i+=2) {
                    System.out.println("(직원1) " + i + "번방 청소 중");
                    try {
                        Thread.sleep(1000); // sleep 만나면 우리가 지정한 시간만큼 잠시 멈춤
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("-- 직원1 청소 끝 --");
            }
        };

        Runnable cleaner2 = () -> {
            System.out.println("-- 직원2 청소 시작 --");
            for (int i = 2; i <= 10; i+=2) {
                System.out.println("(직원2) " + i + "번방 청소 중");
                try {
                    Thread.sleep(1000); // sleep 만나면 우리가 지정한 시간만큼 잠시 멈춤
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("-- 직원2 청소 끝 --");
        };

        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);

        cleanerThread1.start();
        cleanerThread2.start();
    }
}
