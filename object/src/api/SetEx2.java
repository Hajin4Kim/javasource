package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 1 ~ 46 임의의 숫자를 6개 추출
        Set<Integer> set = new HashSet<>();

        while (set.size() < 6) {
            int num = (int)(Math.random() * 45) + 1;
            set.add(num);
        }   
        System.out.println(set);

        // 정렬 : set.sort() 구현 안되어있음
            // Collections.sort() 도 안됨

        //TODO: Set => list 구조로 변환하여 sort 사용
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);

        




    }
}
