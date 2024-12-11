package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final : 어떤 변수를 Final로 선언하게 되면, 선언과 동시에 초기화를 하고, 이후에는 값을 사용 할 수는 있지만 값을 변경하는건 불가능하다.
        // final 키워드 써서, 변수값 고정, 메소드, 상속 기능 막는 역할을 한다.

        // public (final) class ...
        // public (final) void ...
        // public -> abstract -> static -> final -> ...

        ActionCam actionCam = new ActionCam();
        // 어떤 변수 값을 완전히 고정시키고 싶다면.
        // actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("-------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();
    }
}
