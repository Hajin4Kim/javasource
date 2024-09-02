package api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // TODO: Interface 는 List 안됨

        // add() : 순서대로 추가
        list.add("사과");
        list.add("배");
        list.add("수박");
        list.add("사과");
        list.add("복숭아");
        list.add("포도");

        // list 요소 접근
        // 방법1) fori
        for (int i = 0; i < list.size(); i++) {
            String data = list.get(i);
        }
        // 방법2) for each => 추천하는 방법
        for (String data : list) {
            
        }
        // 방법3) Iterator
        // Iterator = interface
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String data = iter.next();
        }

        // set 요소 접근하기
        Set<String> set = new HashSet<>();
        set.add("사과");
        set.add("배");
        set.add("수박");
        set.add("사과");
        set.add("복숭아");
        set.add("포도");
        // fori 는 안됨
        // for each 가능
        for (String data : set) {
            
        }
        // iterator 가능
        iter = set.iterator();
        while (iter.hasNext()) {
            String data = iter.next();
        }





    }
}
