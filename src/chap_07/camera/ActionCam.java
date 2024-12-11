package chap_07.camera;

// 상속 자체를 못하도록 클래스를 final 키워드로 막는다.
public final class ActionCam extends Camera {
    public final String lens; // = "광각렌즈";

    // 생성자는 객체가 만들어지는 시점에 호출이 된다.
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }
    public final void makeVideo() {
        System.out.println(this.name + " : "  + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }

}
