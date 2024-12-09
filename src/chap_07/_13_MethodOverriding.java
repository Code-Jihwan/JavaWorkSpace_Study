package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 덮어쓰는 동작을 한다. (재정의!) -> @Override
        // 부모 클래스에 정의 되어있는 어떤 메소드를, 자식 클래스에서 재정의 (새롭게 정의)해서 자식 클래스의 메소드가 호출 되도록 동작
        // 자식클이 부모클을 덮어쓰기 때문에 (재정의) -> 같은 이름의 메소드라도 객체마다 서로 다른 동작을 할 수 있게 된다.

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

    }
}
