package chap_07;

public class BlackBoxRefurbish {
    // 4개의 인스턴스 변수 선언
    public String modelName;   // 모델명
    String resolution; // 해상도
    private int price;  // 가격
    protected String color; // 색상


    // Getter, Setter 자동으로 만들기 (Code -> Generate -> Getter, Setter 선택해서 변수 클릭해서 만들기)
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}