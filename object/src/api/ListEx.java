package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {

        // <객체> : 리스트에 담을 타입
        // 1, 2, 3, 4 => <Integer>, <Double>
        // 10 개의 String 을 담는 크기 설정
        List<String> list = new ArrayList<>(); // TODO: Interface 는 List 안됨

        // add() : 순서대로 추가
        list.add("사과");
        list.add("배");
        list.add("수박");
        list.add("사과");
        list.add("복숭아");
        list.add("포도");
        // [사과, 배, 수박, 사과, 복숭아, 포도]

        // .add() : index 에 요소 추가
        // 중간에 넣으면 나머지 값들은 뒤로 밀림
        list.add(2, "바나나"); //TODO: .add(index위치 , "넣을 요소") 

        // 확인
        System.out.println(list); // TODO: toString 오버라이딩 되어있는 상태

        // TODO: 리스트의 크기 : size()
        System.out.println("list 의 크기 : " + list.size());

        System.out.println("특정 위치 요소 가져오기 : " + list.get(3));
        
        // remove(인덱스) : return String
        System.out.println("특정 위치 요소 제거 : " + list.remove(3)); 
        System.out.println(list);

        // remove(오브젝트) : 
        System.out.println("특정 위치 요소 제거 : " + list.remove("복숭아"));
        System.out.println(list);

        System.out.println("특정 요소 포함 여부 : " + list.contains("포도"));
        System.out.println("특정 요소 저장 위치 : " + list.indexOf("포도"));
        Object[] arr = list.toArray();
        for (Object object : arr) {
            System.out.println(object);
        }

        //TODO: list.sort.(Comparator.reverseOrder());
        list.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(list);

        //TODO: java.util.Collections :Collection 과 관련된 유용한 메소드 제공
        Collections.sort(list); // 오름차순
        System.out.println(list);
    }
}
