package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // Enum (열거형) : 상수들의 묶음
        // 딜략 : JAN, FEB, MAR, ...
        // 옷 사이즈 : S, M, L, XL ...
        // OS 종류 : WIN10, WIN11, MACOS, LINUX, ...
        // 해상도 : HD, FHD, QHD, UHD, ...

        // resolution 라는 열거형은 HD 라는 값을 갖게 된다.
        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.UHD;
        System.out.println(resolution);

        // 열거형은 case 문을 활용 많이 함
        System.out.print("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        System.out.println("------------------------");

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal()); // 열거형을 돌면서 -> 이름 + 순서
        }

        System.out.println("------------------------");

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());    // 이름 + width 가 가지는 상수값

        }
    }
}

enum Resolution {
    HD(1280), FHD(1920), UHD(3840);

    // 값을 저장할 변수를 만듬
    private final int width;
    Resolution(int width) {
        this.width = width;
    }

    // 값을 사용해야 하니깐 getter 만듬
    public int getWidth() {
        return width;
    }
}