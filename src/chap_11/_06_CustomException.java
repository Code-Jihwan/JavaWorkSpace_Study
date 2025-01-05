package chap_11;

public class _06_CustomException {
    public static void main(String[] args) {
        // 사용자 정의 예외
        int age = 17;
        try {
            if (age < 19) {
                // System.out.println("만 19세 미만에게는 판매하지 않습니다.");
                // throw 사용해서 강제로 에러 발생시킴
                throw new AgeLessThan19Exception("만 19세 미만에게는 판매하지 않습니다.");
            } else {
                System.out.println("주문하신 상품 여기 있습니다.");
            }
        } catch (AgeLessThan19Exception e) {
            System.out.println("조금 더 성장한 뒤에 오세요.");
        } catch (Exception e) {
            System.out.println("모든 예외를 처리합니다.");
        }
    }
}

// exception 예외를 만들 때는 반드시 Exception 클래스를 상속을 해주어야 한다.
// AgeLessThan19Exception 라는 사용자 정의 예외가 만들었음.
class AgeLessThan19Exception extends Exception {
    // 생성자 만들기
    public AgeLessThan19Exception(String message) {
        super(message); // 부모클래스 생성자 호출
    }
}