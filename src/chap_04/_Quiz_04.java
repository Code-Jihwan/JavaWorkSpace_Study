package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        //4장 퀴즈 - 주차 요금 정산 프로그램
        //주차 요금은 시간당 4000원 (일일 최대 요금은 30000원)
        //경차 또는 장애인 차량은 최종 요금에서 50% 할인

        //일반 차량 5시간 주차시 20000원
        //경차 차량 5시간 주차시 10000원
        //장애인 차량 10시간 주차 시 15000원

        //실행결과 : 주차 요금은 xx 원입니다.

        int parkingTime = 3;    //주차시간
        boolean smallCar = false;   // 경차 여부
        boolean withDisabledPerson = false; // 장애인 차량 여부

        int fee = parkingTime * 4000; //시간당 40000원 곱하기

        //3만원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000;
        }

        if (smallCar || withDisabledPerson) { //or 문
            fee *= 0.5f;    //50% discount
        }

        //실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
