package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a Person)
        // class Teacher extends Person : 선생님 ( 선생님은 사람이다. Teacher is a Person)
        // 상속은 자식클래스와 부모클래스 사이에 (IS-A) 관계가 있다.

        // 다형성을 사용하면 -> Camera 라는 부모클래스로 서로 다른 형태의 객체를 만들 수 있다. == 다형성 (형태가 다양하다.)
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("-------------------");

        // 객체도 배열로 관리 할 수 있음.
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("-------------------");

//        factoryCam.detectFire();
//        speedCam.checkSpeed();
//        speedCam.recognizeLicensePlate();

        // 다형성을 쓰면 부모 클래스에 있는 메소드만 접근이 가능하다.

        // 이 객체가 어떤 클래스의 인스턴스 인지 확인하는 instanceof 키워드가 있다.

        if (camera instanceof Camera) {
            System.out.println("카메라 입니다.");
        }

        // instanceof 키워드를 사용해서 factoryCam 객체가 FactoryCam 클래스의 인스턴스 인지 여부를 확인하고 맞다면,
        if (factoryCam instanceof FactoryCam) {
           ((FactoryCam)factoryCam).detectFire();  // 형변환을 해서 그 클래스의 메소드에 접근을 할 수 있다.
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam)speedCam).checkSpeed();
            ((SpeedCam)speedCam).recognizeLicensePlate();
        }

        // 모든 자바 클래스는 Object 클래스를 상속하고 있다.
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();

    }
}
