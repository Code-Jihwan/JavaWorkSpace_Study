package chap_10;

import java.util.ArrayList;
import java.util.List;

public class _Quiz_10 {
    public static void main(String[] args) {
        // map() 이용하여 원한느 형태로 데이터 가공을 할 수 있음
        // 삼항연산자 사용

        // ArrayList 리스트로 하고 <> 안에 Customer 클래스 넣기
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("챈들러", 50));
        customers.add(new Customer("레이첼", 42));
        customers.add(new Customer("모니카", 21));
        customers.add(new Customer("벤자민", 18));
        customers.add(new Customer("제임스", 5));

        System.out.println("미술관 압장료");
        System.out.println("-----------------");

        // 스트림 이용해서 결과물 도출
        customers.stream().map(x -> x.age >= 20 ? x.name + " 입장료 5000원" : x.name + " 입장료 무료")
                .forEach(System.out::println);
    }
}

class Customer{
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
// 클래스 만들면 생성자도 만들어야 함 control + enter
