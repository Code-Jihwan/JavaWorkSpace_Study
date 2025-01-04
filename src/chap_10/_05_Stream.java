package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 Stream : 자바에서는 데이터가 흐른다.
        // 필터링 할 수 있다. 데이터 걸러 낼 수 있다. 원하는 데이터만 뽑아 낼 수 있다.
        // 배열이나 파일에서 컬렉션에서 만들 수 있다.
        // 스트림은 한번 사용하면 다시 사용 할 수 없기 때문에 매번 새롭게 만들어야 한다.

        // 스트림 생성하기 위한 방법
        // Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
        // 만든 것을 stream 객체로 받아오기 위해서 -> option + command + v
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"Java", "C#", "Python", "PHP", "C++", "C"};
        Stream<String> langStream = Arrays.stream(langs);


        // Collection.stream()
        List<String> langList = new ArrayList<>();
        // langList.add("Java");
        // langList.add("C#");
        langList = Arrays.asList("Java", "C#", "Python", "PHP", "C++", "C");
        // System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();


        // Stream.of()
        Stream<String> langListOfStream = Stream.of("Java", "C#", "Python", "PHP", "C++", "C");


        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : 정수기의 여러가지 필터. 중간에 이런 저런 필터링 작업을 하는 것. 갯수 제안없이 여러번
        // -> filter, map, sorted, distinct, skip, ...

        // 최종 연산 (Terminal Operation) : 최종적으로 만들어지는 결과물. 딱 한번만 쓸 수 있다.
        // -> count, min, max, sum, forEach, anyMatch, allMatch, ...

        // 한 번 쓰고난 스트림은 데이터가 소진됨, 재사용 불가, 처음부터 데이터 준비한 상태에서 새롭게 필터링

        // 90점 이상인 점수만 출력 filtering
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        // Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        // 위 두 문장은 같은 값 출력.
        System.out.println("-------------------");

        // 90점 이사인 사람의 수
        long count  = Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("-------------------");

        // 90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("-------------------");

        // 90점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("-------------------");


        // "Java", "C#", "Python", "PHP", "C++", "C"
        // c로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("C")).forEach(System.out::println);
        System.out.println("-------------------");

        // java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("Java")).forEach(System.out::println);
        System.out.println("--------------------");

        // 글자 길이가 4이하인 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <=  4).sorted().forEach(System.out::println);
        System.out.println("--------------------");

        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어
        langList.stream().filter(x -> x.length() <=  4).filter(x -> x.contains("C")).forEach(System.out::println);
        System.out.println("-------------------");

        // 4글자 이하의 언어들은 모두 c 라는 글자를 포함하는지 여부
        boolean allMatch = langList.stream().filter(x -> x.length() <= 4).allMatch(x -> x.contains("C"));
        System.out.println(allMatch);
        System.out.println("-------------------");

        // 4글자 이하의 언어 중에서 c 라는 글자가 하나라도 있는지 여부
        boolean anyMatch = langList.stream().filter(x -> x.length() <= 4).anyMatch(x -> x.contains("C"));
        System.out.println(anyMatch);
        System.out.println("-------------------");


        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        // map
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("C"))
                .map(x -> x + " (어려워요)")
                .forEach(System.out::println);
        System.out.println("-------------------");

        // c 라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream()
                .filter(x -> x.contains("C"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("-------------------");


        // c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartsWithC = langList.stream()
                .filter(x -> x.contains("C"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        langListStartsWithC.stream().forEach(System.out::println);
        System.out.println("-------------------");

    }
}
