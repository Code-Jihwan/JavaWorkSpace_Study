package chap_07.camera;

public class SlowActionCam {
    public String name;

    public SlowActionCam() {
        this.name = "슬로우 액션 카메라";
    }

    // 부모클래스에서 메소드에 final 키워드 사용하면 -> 자식클래스에서는 오버라이딩 불가
    public void makeVideo() {
        System.out.println("자체 개발한 비디오 제작 가능");
    }

}
