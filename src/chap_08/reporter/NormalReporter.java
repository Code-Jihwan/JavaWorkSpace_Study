package chap_08.reporter;

// NormalReporter 클래스는 Reportable 인터페이스를 구현하는 클래스이다.
public class NormalReporter implements Reportable { // implements 구현하다
    @Override
    public void report() {
        System.out.println("일반 화재 신고를 진행합니다.");
    }



}
