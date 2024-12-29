package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터 -> 데이터 순회 하는 것
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------------");

        // 단축키 option + command + v
        // 커서가 맨 위로 올라갔다가 .next() 사용시 하나씩 내려간다.
        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println("------------------");

        iterator = list.iterator();     // 커서를 처음 위치로 이동
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("------------------");

        iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.contains("(알 수 없음)")) {
                iterator.remove();  // 삭제
            }
        }

        iterator = list.iterator();     // 커서를 처음 위치로 이동
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("------------------");

        // Set 에서 이터레이터 사용 가능
        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");

        // 객체 정의 단축키 option + command + v
        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("------------------");

        // Map 은 이터레이터 제공 X
        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);
        
        // Key, Value 따로 순회해야함
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }

        System.out.println("------------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        System.out.println("------------------");

        // map 에서 Key와 Value를 함께 출력
        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
