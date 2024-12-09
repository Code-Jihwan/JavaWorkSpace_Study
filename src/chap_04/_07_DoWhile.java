package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //반복문 Do While
        int distance = 25;
        int move = 0;       //현재 이동 거리
        int height = 2;     //2m

        while (move + height < distance) {  //전체거리보다 작은 경우에
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착함");

        System.out.println("---------------");

        //키가 엄청 큰 사람?
        move = 0;
        height = 25;

        while (move + height < distance) {  //전체거리보다 작은 경우에
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착함");

        System.out.println("---------------");

        //Do while 반복문  (일단 한번은 먼저 실행하고)
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착함");
    }
}
