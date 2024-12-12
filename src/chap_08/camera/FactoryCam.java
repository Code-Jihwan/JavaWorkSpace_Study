package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    // FactoryCam 의 인스턴스 변수로
    private Detectable detector;
    private Reportable reporter;

    // Setter 로 값을 넣어줌
    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }


    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
        // 자식 클래스에서 showMainFeature 메소드를 구현 했음
    }

    @Override
    public void detect() {
        detector.detect();

    }

    @Override
    public void report() {
        reporter.report();
    }
}
