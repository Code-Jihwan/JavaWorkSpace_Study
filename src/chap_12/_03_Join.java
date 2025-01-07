package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        // Join
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
            thread.join(2500);  // 쓰레드가 종료 될 때 까지 기다렸다가, 다 끝나고 나면 다음줄로 넘어가서 실행
            // 최대 2.5초 까지는 기다렸다가 넘어간다.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("-- 샤쟝 청소 시작 --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) " + i + "번방 청소 중");
            try {
                Thread.sleep(1000); // sleep 만나면 우리가 지정한 시간만큼 잠시 멈춤
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 사장 끝 --");
    }
}
