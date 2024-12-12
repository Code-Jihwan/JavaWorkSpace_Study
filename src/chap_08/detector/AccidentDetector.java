package chap_08.detector;

// Detectable 인터페이스 구현
public class AccidentDetector implements Detectable{
    @Override
    public void detect() {
        System.out.println("교통 사고를 감지합니다.");
    }
}
