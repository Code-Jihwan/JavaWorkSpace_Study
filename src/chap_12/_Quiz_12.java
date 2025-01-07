package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        // Runnable 객체로 쓰레드 만들고
        Runnable runnableA = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("A 상품 준비 " + i + "/5");
                };
                System.out.println(" -- A 상품 준비 완료 -- ");
            }
        };

        Runnable runnableB = () -> {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("B 상품 준비 " + i + "/5");
                };
                System.out.println(" -- B 상품 준비 완료 -- ");
            };

        // 쓰레드 돌리기 위해서는 쓰레드 객체를 만듬
        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();

        // 끝날때 까지 기다리는 것을 join() 으로 했었다.
//        try {
//            threadA.join(); // threadA 가 종료 될때까지 기다렸다가, 다 끝나면 넘어간다.
//            threadB.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // 다른 방법
        // threadA.isAlive();  // isAlive() 이 쓰레드가 살아있는지를 보는 것.
        // 쓰레드가 도는 동안에는 isAlive() 가 true 가 된다.

        // join 이랑 같은 기능
        while (threadA.isAlive() || threadB.isAlive()) {

        }

        Runnable runnableSet = () -> {
            System.out.println(" == 세트 상품 포장 시작 ==");
            for (int i = 0; i <= 5; i++) {
                System.out.println(" 세트 상품 준비 " + i + "/5");
            };
            System.out.println(" == 세트 상품 포장 완료 ==");
        };

        Thread threadSet = new Thread(runnableSet);
        threadSet.start();
    }
}

