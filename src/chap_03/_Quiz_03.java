package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String adminNum = "030708-4567890";
        System.out.println(adminNum.substring(0,adminNum.indexOf("-") + 2));
        //substring() 시작위치 ~ 끝 위치 - 1 (모든 위치는 인덱스 번호)
        
    }
}
