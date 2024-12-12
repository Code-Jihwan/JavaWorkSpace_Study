package chap_08.camera;

// Camera 라고 하는 추상 클래스가 만들어짐
public abstract class Camera {
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    // 추상 메소드 (추상적으로 제목만 있음)
    public abstract void showMainFeature(); // Camera 클래스를 상속하는 자식 클래스에서 구현해야 하는 메소드
}
