package api;

import java.util.ArrayList;
import java.util.List;


public class ListEx2 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        list.add(new Member("hong123", "홍길동"));
        list.add(new Member("hong124", "김길동"));
        list.add(new Member("hong125", "최길동"));
        list.add(new Member("hong126", "이길동"));

        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.remove(2));

        System.out.println(list);

        //TODO: 일반 LIST 에선, 향상된 for each 쓰는게 편하다 
        for (Member member : list) {
            String id = member.getId();
            String name  = member.getName();
        }


    }
}
