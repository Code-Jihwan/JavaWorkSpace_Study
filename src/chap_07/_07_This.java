package chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "하양이";   // 하양이(최신형)
        b1.appendModelName("(최신형 New)");
        System.out.println(b1.modelName);

        // Mac 에서 코드 추천 수정 -> Option + Enter
        // 코드 보기 -> Option + Space
        //command -> 눌러서 클래스로 가기
    }
}
