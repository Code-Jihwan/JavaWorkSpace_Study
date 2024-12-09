package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();   // b1 객체 만듬
        b1.modelName = "까망이";

        b1.autoReport();    // 지원 안됨
        BlackBox.canAutoReport = true;  // 지원 됨
        b1.autoReport();
        System.out.println("-----------");

        b1.insertMemoryCard(256);
        System.out.println("-----------");

        // 일반 영상 : 1 (type)
        // 이벤트 영상 (충동을 감지) : 2 (type)
        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(2);
        System.out.println("특별 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(3);
        System.out.println("총 영상 파일 수 : " + fileCount + "개");
    }

}
