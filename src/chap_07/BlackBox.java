package chap_07;

public class BlackBox {
    // 4개의 인스턴스 변수 선언
    String modelName;   // 모델명
    String resolution; // 해상도
    int price;  // 가격
    String color; // 색상
    int serialNumber;
    // 이것들은 인스턴스 변수

    static int counter = 0; // 시리얼 번호 생성해주는 역할 (처음엔 0이었다가 ++ 연산을 통해서 값을 증가)
    static boolean canAutoReport = false;   //자동 신고 기능
    // static 붙은건 클래스 변수 -> 이 클래스로 부터 만들어지는 모든 객체에 똑같이 적용

    // 생성자 위치
    // 생성자는 클래스 이름과 똑같다. (반환형 따로 없음)
    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다. : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {    // 생성자가 호출 될 떄 전달 받는 파라미터 값을
//        this(); // (기본 생성자 호출) 기본 생성자를 바로 접근 -> 수행하고 나서 아래 동작 수행함
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName; //인스턴스 변수 modelName 에 우리가 전달받은 파라미터 modelName 을 정의
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    // 클래스 안에서 기능을 담당하는 메소드도 만들수 있음
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) {    // 일반 영상
            return 9;
        }
        else if (type == 2) {   // 이벤트 영상
            return 1;
        }
        return 10;  // 전체 영상 개수
    }

    // showDateTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        // 메소드 오버로딩 시 다 쓰면 너무 복잡하고 유지보수를 용의하게 하기 위해서. 그냥 호출해서 사용
        record(true, true, 5);  // 기본값으로 설정
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터 (1588-1234) 로 연결합니다.");

        // static 으로 선언한 클래스 변수는 -> static 클래스 매소드에서 바로 사용이 가능
        // 인스턴스 변수는 객체가 만들어져야 만들어지는 인스턴스 변수이기 때문에 -> static 클래스 매소드에서 직접 접근 x

    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
        // this 를 붙여주면 현재 클래스의 인스턴스 변수에 직접 접근이 가능하다.

        // 메소드 내에서 사용하려고 하는, 인스턴스 변수와 파라미터 변수의 이름이 똑같다면
        // this. 을 붙여서 -> 이것은 인스턴스 변수다! 라고 명확하게 알려줄 수 있다.
    }

    // Getter & Setter
    // Getter : 값을 가지고 오는 메소드
    String getModelName() {
        return modelName;
    }

    // Setter : 값을 설정하는 메소드
    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

}
