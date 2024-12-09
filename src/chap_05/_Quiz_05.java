package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        //퀴즈 5 (내가 푼거 - 이것도 맞음)
//        int[] shoesSize = new int[10];  //배열 크기 정해서 초기화만.
//        int option = 0;
//        for (int i = 0; i <shoesSize.length; i++) {
//            shoesSize[i] = (250 + option);
//            option += 5;
//            System.out.println("구매 가능 사이즈: " + shoesSize[i] + " (재고 있음)");
//        }

        int[] shoesSize = new int[10];  //배열 크기 정해서 초기화만.
        for (int i = 0; i <shoesSize.length; i++) {
            shoesSize[i] = 250 + (5 * i);
        }
        //순회 하면서 출력
        for (int menu : shoesSize) {
            System.out.println("구매 가능 사이즈: " + menu + " (재고 있음)");
       };
    }
}

