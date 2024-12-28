package chap_09.coffee;

import chap_09.user.User;
// 어떤 형태의 타입을 쓰건 상관없는데 반드시 User 라는 클래스를 상속하는 T 를 써야한다는 의미 (원하는 형태의 객체만 받도록 처리)
// User 클래스 또는 User 를 상속하는 VipUser 클래스만 여기에 들어올 수 있다.
public class CoffeeByUser <T extends User> {
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
