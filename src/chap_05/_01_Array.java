package chap_05;

import java.sql.SQLOutput;

public class _01_Array {
    public static void main(String[] args) {
        //배열 : (여러개의 자료) 같은 자료형의 값 여러 개를 저장하는 연속된 공간

        //배열 선언 첫 번째 방법
        //String[] coffees = new String[4];   //크기 4개의 String 타입 배열

        //두 번째 방법
        //String coffees[] = new String[4];

//        coffees[0] = "아메리카노";   // 0부터 시작
//        coffees[1] = "카페라때";
//        coffees[2] = "라때";
//        coffees[3] = "카페모카";

        //세 번쨰 방법
        //String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        //네 번째 방법
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        //커피 주문
        System.out.println(coffees[0] + " 하나");
        System.out.println(coffees[1] + " 하나");
        coffees[2] = "애플 망고 에스프레소"; //배열 값 변경
        System.out.println(coffees[2] + " 하나");
        System.out.println(coffees[3] + " 하나");

        //다른 자료형
        int[] i = new int[] {
                1234,
                5678,
                890
        };

        i[2] = 9999;
        System.out.println(i[2]);

        double[] d = new double[] {10.0, 20.0, 30.0};
        boolean[] b = {true, true, false};

    }
}
