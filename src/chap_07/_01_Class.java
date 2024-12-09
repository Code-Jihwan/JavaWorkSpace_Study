package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Object-Oriented Programming)
        // 유지보수 용이
        // 높은 재사용성

        // 차량용 블랙박스

        // 우리가 만든 첫 번쨰 제품
        // 모델명, 해상도, 가격, 색상
        String modelName = "까망이";
        String resolution = "QHD";
        int price = 20000;
        String color = "블랙";

        // 새로운 제품을 개발
        // 모델명, 해상도, 가격, 색상
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 30000;
        String color2 = "화이트";

        BlackBox bbox = new BlackBox(); //BlackBox 클래스로 부터 bbox 객체를 만드는 과정
        // bbox 객체는 BlackBox 클래스의 인스턴스
        // 종이접기 책 (클래스) -> 종이학 (객체)

        BlackBox bbox2 = new BlackBox();

    }
}
