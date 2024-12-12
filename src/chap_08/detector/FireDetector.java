package chap_08.detector;

// FireDetector 클래스는 Detectable 인터페이스를 구현하는 클래스이다.
public class FireDetector implements Detectable{
    @Override
    public void detect() {
        System.out.println("일반 성능으로 화재를 감지합니다.");

    }
}
