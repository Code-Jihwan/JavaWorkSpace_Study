package chap_04;

import sun.lwawt.macosx.CSystemTray;

public class _05_For {
    public static void main(String[] args) {
        //반복문 for
        //나코 매장
        //System.out.println("Hello Naco");
        //또 다른 손님 입장
        //System.out.println("Hello Naco");

        for (int i = 0; i < 10 ; i++){ //for (선언; 조건; 증금) {수행 명령}
            System.out.println("어서오세요.반갑습니다! " + i);
        }
        System.out.println("----------------------------");

        //짝수만 출력 (fori만 적고 enter)
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        System.out.println("-------------");

        for (int i = 1; i <10; i+=2) {
            System.out.println(i);
        }

        System.out.println("-------------");

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        
        System.out.println("------------");

        int sum = 0;
        for (int i = 0; i <= 11; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
        System.out.println("총합은 " + sum + "입니다.");
    }
}
