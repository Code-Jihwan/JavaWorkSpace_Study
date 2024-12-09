package chap_07;

import java.awt.*;

public class _08_Constructor {
    public static void main(String[] args) {
        // 생성자 -> 객체가 생성 될 때 자동으로 호출되는 메소드. 생성자도 여러개 만들 수 있음.
        BlackBox b1 = new BlackBox();
        b1.modelName="까망이";
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);

        System.out.println("----------------------");

        BlackBox b2 = new BlackBox("하양이", "UHD", 14000000, "화이트" );
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);
    }
}
