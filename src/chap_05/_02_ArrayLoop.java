package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        //배열의 인덱스 값을 사용해서 뭘 해야할 때늘 fori 사용
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요.");
        System.out.println("---------------------");


        // enhanced for (for-each) 반복문 -> 배열 값 전체 다 사용할 때 (다 순회)
        for (String cafe : coffees) {   //coffees 배열의 값들을 순서대로 순회.
            System.out.println(cafe + " 하나");
        }
        System.out.println("주세요.");
        System.out.println("---------------------");
    }
}
