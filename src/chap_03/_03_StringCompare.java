package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); //같으면 true, 다르면 false
        System.out.println(s2.equals("python")); //대소문자 구별함
        //대소문자 구분 없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        //문자열 비교 심화
        s1 = "1234"; //벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        //서로 같은 메모리 공간을 "참조"
        System.out.println(s1.equals(s2));  //내용을 비교
        System.out.println(s1 == s2);   //참조하는 곳을 비교

        s1 = new String("1234");    //서로 다른 메모지 종이 (비교)
        s2 = new String("1234");
        //서로 참조하는 공간이 다름 (서로 다른 공간에 저장되어 있는 것이다.)
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        //.equals()는 문자열의 값(내용)만 보기 때문에 true. == 는 참조하는 곳을 비교
    }
}
