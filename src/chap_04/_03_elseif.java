package chap_04;

public class _03_elseif {
    public static void main(String[] args) {
        //조건문 else if

        //한라봉 에이드가 있으면 +1
        //또는 망고 주스가 있으면 +1
        //또는 아이스 아메리카노 +1

        boolean hallbongAde = true;
        boolean mangoJuice = true;

        if (hallbongAde) {
            System.out.println("Hallbong Ade +1");
        } else if (mangoJuice) {
            System.out.println("Mango Juice +1");
        }
        else {
            System.out.println("ice americano +1");
        }
        System.out.println("coffee order done");

        System.out.println("--------------------");

        // else if는 여러번 가능
        hallbongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if (hallbongAde) {
            System.out.println("Hallbong Ade +1");
        } else if (mangoJuice) {
            System.out.println("Mango Juice +1");
        }
        else if (orangeJuice) {
            System.out.println("Orange Juice +1");
        }
        else {
            System.out.println("ice americano +1");
        }
        System.out.println("coffee order done");

        System.out.println("--------------------");

        // else 는 없어도 가능
        hallbongAde = false;
        mangoJuice = false;
        orangeJuice = false;

        if (hallbongAde) {
            System.out.println("Hallbong Ade +1");
        } else if (mangoJuice) {
            System.out.println("Mango Juice +1");
        }
        else if (orangeJuice) {
            System.out.println("Orange Juice +1");
        }
        System.out.println("coffee order done");
    }
}
