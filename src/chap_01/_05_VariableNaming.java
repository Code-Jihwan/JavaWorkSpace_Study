package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        //변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4, 한 단어 또는 2개 이상의 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어는 사용 불가 (public, static, void, int, main ...)

        // 입국 신고서 (여행)
        String nationality = "대한민국";
        String firstName = "jh";
        String lastName = "J";
        String dateOfBirth = "2000-09-21";
        String residentialAddress = "lotte hotel";
        String purposeOfVisit = "travel";
        String flightNo = "KE123";
        String _flightNo = "KE123";
        String _flight_no_2 = "KE123";

        int accompany = 2; //동반 가족 수
        int lengthOfStay = 5;

        String item1 = "watch";

        // 프로그램 흐름을 위해 사용하는 경우 등 (크게 이름이 중요하지 않을 때)
        int i = 0;
        String s = "";
        String str = "";

        // 절대 변하지 않은 상수는 대문자로
        final String CODE = "KR";




    }
}
