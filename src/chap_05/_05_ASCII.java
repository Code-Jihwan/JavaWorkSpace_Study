package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        //아스키 코드 (ANSI) : 미국 표준 코드
        char c = 'A';   //알파벳 대문자는 65 부터 시작, 소문자는 97부터 시작, 숫자는 48부터 시작.
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c = 'a';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        c = '0';
        System.out.println(c);
        System.out.println((int)c);

        System.out.println("-----------------------------------");

        //세로 크기 10 x 가로 크기 15에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {  //세로
            for (int j = 0; j < seats3[i].length; j++) {    //가로
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        //영화관 좌석번호 확인
        for (int i = 0; i < seats3.length; i++) {   //밖에 for문은 세로 첫번째 괄호[]
            for (int j = 0; j < seats3[i].length; j++) {    //안에 for문은 가로 (하나의 줄 안에서)
                //seats2[i]로 해당 줄에 접근해서 그것의 길이를 출력해옴.
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        };

    }
}
