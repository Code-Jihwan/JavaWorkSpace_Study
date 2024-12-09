package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //continue
        //치킨 주문 손님중에 노쇼 손님이 있다고 가정
        //for 문

        int max = 20;   //최대 치킨 판매 수량
        int sold = 0;   //현재 치킨 판매 수량
        int noShow = 17;    //대기번호 17번 손님이 노쇼
        for (int i = 1; i <50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            //손님이 없다면? (noShow)
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;   //continue 만나면 이하 코드는 모두 무시하고, 다음 증감 과정으로 넘어간다.
            }

            sold++; //판매 처리
            if (sold == max) {
                System.out.println("재료소진");
                break;
            }
        }
        System.out.println("close");

        System.out.println("-----------------");

        //while 문
        sold = 0;
        int index = 0;  //손님 번호
        while (index < 50) {    //아래에 break 탈출 조건이 있기 때문에, while(true)로 해도 무한반복 걸리지 않는다.
            index++;
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            //noShow 고객이 생김
            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("close");
    }
}
