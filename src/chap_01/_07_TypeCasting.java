package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환
        // int to flout, double
        int score = 93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((double)score);

        //flout, double to int
        float score_f = 93.3F;
        double score_d = 98.3;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        // 정수 + 살수 연산
        score = 93 + (int) 98.3;
        System.out.println(score);

        score_d = (double) 93 + 98.8;
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score;
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int) score_d;
        // double -> flout -> long -> int (수동 형변환)

        // 숫자를 -> 문자열로
        String s1 = String.valueOf(93);

        // 문자를 -> 숫자로
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("100");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(s2);

    }
}
