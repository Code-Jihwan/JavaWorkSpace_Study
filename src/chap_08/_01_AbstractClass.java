package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction) -> 보여줄 것은 보여주고, 숨길것은 숨기기 위해서
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 클래스는 객체를 생성할 수 없다. 추상 클래스를 상속한 자식클래스로는 객체를 만드는 것이 가능하다.
        // 추상 메소드 (추상 클래스 또는 인터페이스에서 사용 가능한, 껍데기만 있는 메소드)
        // 추상 메소드가 추상 클래스에 있다고 하면, 자식 클래스에서는 반드시 추상 메소드를 구현해야만 된다.

        // Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

    }
}
