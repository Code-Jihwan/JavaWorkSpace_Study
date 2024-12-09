package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //Switch case

        //석차에 따른 장학금 지금
        //1등: 전약 장학금
        //2등: 반액 장학금
        //3등: 반액 장학금
        //그 외: 장학금 대상 아님

        //if else 문 이용 -> 여러 조건 또는 범위로 나타나는 경우에!
        int ranking = 1;

        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        System.out.println("-----------------");

        //Switch case 문 이용 -> 명확한 값(케이스)으로 나타나는 경우에!
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("장학금 조회 완료 #2");

        System.out.println("--------------------");


        //case 2 와 3을 통합
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("장학금 조회 완료 #2");

        System.out.println("--------------------");

        //중고상품의 등급에 따른 가격을 책정 (1급: 최상, 4급: 최하)
        int grade = 1; //등급
        int price = 7000;   //기본 가격
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격: " + price + "원");

        System.out.println("--------------------------");
    }
}
