package chap_12.clean;

public class CleanThread extends Thread {
    public void run() {
        // 쓰레드 실습 : 직원이 청소하는 작업
        System.out.println("-- 직원 청소 시작 (Thread) --");
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("(직원) " + i + "번방 청소 중 (Thread)");
        }
        System.out.println("-- 직원 청소 끝 (Thread) --");
    }
}
