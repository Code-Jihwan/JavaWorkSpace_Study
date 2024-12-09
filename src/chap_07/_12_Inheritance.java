package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속 : 부모 클래스에서 제공되는 모든 것들을 자식 클래스에서 가져다 쓴다. 하나의 부모로 부터만 상속을 받는다.
        // 단축키 : command 누르고 메소드 눌러서 이동. command + option + 방향키 : 이전, 이후 전환.

        // 객체 만듬
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        System.out.println("-------------------");

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        System.out.println("-------------------");

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();


    }
}
