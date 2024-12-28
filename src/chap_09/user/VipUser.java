package chap_09.user;

public class VipUser extends User {
    public VipUser(String name) {
        super("VIP " + name);    // super() 로 부모클래스의 생성자 호출해서 이름을 전달
    }
}
