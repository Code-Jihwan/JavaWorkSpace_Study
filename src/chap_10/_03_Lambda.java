package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        // 람다식 : 간결한 형태의 코드 뭉치
        // 람다식은 접근 제어자가 필요 없다. public 필요없음, 이름도 필요 없음, 리턴 타입도 필요 없다. (알아서 지정해준다)
        // (전달값1, 전달값2, ... ) -> { 코드 }
    }
//    public void print() {
//        String s = "test";
//        System.out.println(s);
//    }

//    () -> {
//        String s = "test";
//        System.out.println(s);
//    }

//    public void print(String s) {
//        System.out.println(s);
//    }

    // 전달 값이 1개이면 괄호도 없어도 됨. 코드가 1줄이면 중괄호랑 세미콜론도 없어도 됨.
//    s -> System.out.println(s)

//    public int add(int a, int b) {
//        return a + b;
//    }

    // 전달값의 자료형도 지워도 됨
    // return 이 포함되면 중괄호는 있어야 함
    // return 을 지우면 자동으로 연산 결과를 리턴해 준다.
//    (a, b) -> a + b
}
