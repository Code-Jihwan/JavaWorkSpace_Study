package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        //break
        //치킨 집에서 매일 20마리만 판매 (1인당 1마리 구매 가능)

        //for문
        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if (i == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;  //for 반복문 탈출 조건을 만들어주어야 한다.
            }
        }
        System.out.println("영업 종료");

        System.out.println("-------------------");

        //while 문
        int index = 1;
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            if (index == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("close");
    }
}
