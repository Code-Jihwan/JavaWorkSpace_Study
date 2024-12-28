package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 (Wrapper) 클래스
        // int, double, float, char 와 같은 값만 가지는 기본 자료형 들을 객체 형태로 만들어가지고 사용할 수 있도록 해주는 역할을 한다.

        Integer i = 123;    // int i  = 123;
        Double d = 1.0;     // double d = 1.0;
        Character c = 'A';  // char c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("--------------------");

        // Wrapper 클래스는 기능 (메소드) 을 가짐
        System.out.println(i.intValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());

        System.out.println("--------------------");

        String s = i.toString();
        System.out.println(s);

    }
}
