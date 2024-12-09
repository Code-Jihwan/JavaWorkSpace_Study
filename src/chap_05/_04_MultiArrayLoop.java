package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        //다차원 배열 순회
        //2차원 배열 - (3 x 5 크기)
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++) {   //밖에 for문은 세로
            for (int j = 0; j < 5; j++) {    //안에 for문은 가로 (하나의 줄 안에서)
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        };

        System.out.println("----------------------------------------------");

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats2.length; i++) {   //밖에 for문은 세로 첫번째 괄호[]
            for (int j = 0; j < seats2[i].length; j++) {    //안에 for문은 가로 (하나의 줄 안에서)
                //seats2[i]로 해당 줄에 접근해서 그것의 길이를 출력해옴.
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        };

        System.out.println("----------------------------------------------");

        //세로 크기 10 x 가로 크기 15에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < seats3.length; i++) {  //세로
            for (int j = 0; j < seats3[i].length; j++) {    //가로
                seats3[i][j] = eng[i] + (j + 1);
            }
        }
        //표 구매
        seats3[7][8] = "__";
        seats3[7][9] = "___";

        //영화관 좌석번호 확인
        for (int i = 0; i < seats3.length; i++) {   //밖에 for문은 세로 첫번째 괄호[]
            for (int j = 0; j < seats3[i].length; j++) {    //안에 for문은 가로 (하나의 줄 안에서)
                //seats2[i]로 해당 줄에 접근해서 그것의 길이를 출력해옴.
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        };
        System.out.println("----------------------------------------------");
    }
}
