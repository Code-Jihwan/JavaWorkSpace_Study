package chap_12.clean;

public class Room {
    public int num = 1;
    // 동기화 처리
    synchronized public void clean(String name) {
        System.out.println(name + " : " + num + "번방 청소 중");
        num++;
    }
}
