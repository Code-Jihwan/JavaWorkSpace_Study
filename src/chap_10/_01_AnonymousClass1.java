package chap_10;

public class _01_AnonymousClass1 {

    public static void main(String[] args) {
        // 익명 클래스 : 이름이 없는 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        System.out.println("--------------------");

        Coffee c2 = new Coffee();
        c2.order("라떼");
        System.out.println("--------------------");

        // 굉장히 친한 친구 방문
        Coffee specialCoffee = new Coffee() {   // 익명 클래스. 어떤 기능을 더 확장. specialCoffee 만을 위한 1회성 코드
            // 동작을 정의
            @Override
            public void order(String coffee_name) { // order 라는 메소드 동작을 재정의!
                super.order(coffee_name);   // 부모클래스의 order 메소드 호출
                System.out.println("(귓속말) 딸기 케이크는 서비스에요.");
            }

            @Override
            public void returnTray() {
                System.out.println("(귓속말) 자리에 두시면 제가 치울께요.");
            }
        };
        specialCoffee.order("바닐라 라떼");
        specialCoffee.returnTray();
    }
}

class Coffee {
    public void order(String coffee_name) {
        System.out.println("주문하신 " + coffee_name + " 나왔습니다.");
    }

    public void returnTray() {
        System.out.println("커피 반납이 완료 되었습니다.");
    }
}