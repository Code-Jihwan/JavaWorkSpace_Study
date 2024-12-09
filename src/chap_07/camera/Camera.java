package chap_07.camera;

public class Camera {   // 부모 클래스
    // 인스턴스 변수
    public String name;

    // 생성자 만들기 : Code -> Generate -> Constructor
    public Camera() {
        this.name = "카메라";
    }

    // 기능을 메소드로 구현
    public void takePicture() {
        // 사진 촬영
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }

    public void  recordVideo() {
        // 동영상 녹화
        System.out.println(this.name + " : 동영상을 녹화합니다.");
    }

    public void showMainFeature() {
        // 주요 기능 소개
        System.out.println(this.name + "의 주요 기능 : 사진 촬영, 동영상 녹화");
    }
}
