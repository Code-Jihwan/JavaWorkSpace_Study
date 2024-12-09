package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        //이중 반복문 일 때 -> 안에 for문이 줄 내용이고, 밖에 for문이 횟수 느낌! (한사이클 돌때 마다)
        // 구구단
        for (int i = 2; i <10; i++) {
            for (int j = 1; j <10; j++) {
                System.out.println("구구단 : " + i + " * " + j + " = " + (i * j) );
            }
            System.out.println("------------------");
        }
    }
}
