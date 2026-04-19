package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서 (오름차순)
        list.sort(new Comparator<String>() { // comparator: Functional Interface, compare 메서드 하나만 존재
            @Override
            public int compare(String s1, String s2) { 
                return s1.compareTo(s2);  // s1이 s2보다 사전순으로 작으면 음수, 같으면 0, 크면 양수 반환
               
            }
        }); // 오름차순을 위한 Comparator를 넣어줌
        System.out.println(list);

        list.sort((s1, s2) -> s1.compareTo(s2)); // 람다 표현식으로 간결하게 작성

        // 사전순으로 큰 순서 (내림차순) 
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);  // s2가 s1보다 사전순으로 작으면 음수, 같으면 0, 크면 양수 반환
            }
        }); // 내림차순을 위한 Comparator를 넣어줌
        System.out.println(list);
    }
}
