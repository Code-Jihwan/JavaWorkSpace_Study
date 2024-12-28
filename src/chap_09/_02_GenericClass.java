package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VipUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("----------------------");

        CoffeeByName c3 = new CoffeeByName(1);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("대상혁");
        c4.ready();

        System.out.println("----------------------");

        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        // 오브잭트라서 바로 가져오는 것은 안되니깐 형변환 해서 가져오자
        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        System.out.println("----------------------");

        // 제네릭 클래스 사용
        // 제네릭 클래스를 이용해서 하나의 클래스에서 서로 다른 형태의 데이터를 받아서 한꺼번에 처리
        Coffee<Integer> c5 = new Coffee<>(25);
        c5.ready();

        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("홍길동");
        c6.ready();

        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("----------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("대상혁"));
        // 대상혁 이라는 이름을 가진 User 객체를 만들고 그 객체를 CoffeeByUser 클래스를 생성 할 때 집어 넣어서 커피 주문을 함
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("이상혁"));
        c8.ready();

        System.out.println("----------------------");

        orderCoffee("김철수");
        orderCoffee(2);

        System.out.println("----------------------");

        orderCoffee("대상혁", "아메리카노");
        orderCoffee(1, "자바칩프라푸치노");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
