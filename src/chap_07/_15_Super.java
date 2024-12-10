package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super : 부모클래스의 어떤 거를 자식클래스에서 사용하는 역활을 한다.
        // super. -> 부모클래스의 메소드를 호출
        // super() -> 부모클래스의 생성자를 호출

        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("-----------");
        speedCam.takePicture();
        System.out.println("-----------");


    }
}
