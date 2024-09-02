package api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        // Key 는 중복 불가, ( 만약 중복으로 넣었다면 그 중 하나만 저장됨)
        //TODO: Map 은 향상된For 문으로 뽑아낼 수 없다(Key, value) 구조 이기 때문
        //TODO: <Key 타입, Value 타입>
        Map<String,String> map = new HashMap<>();
        
        // 추가 : put()
        map.put("myID", "1234");
        map.put("asdf", "1234");
        map.put("asdf", "1111");

        // 특정 Key 에 해당하는 Value 가져오기
        System.out.println("myID value : " + map.get("myID"));
        System.out.println("myID key 포함 여부 : " + map.containsKey("myID"));
        System.out.println("1111 value 포함 여부 : " + map.containsValue("1111"));

        // 전체 key만 가져오기 
        Set<String> set = map.keySet();
        System.out.println(set);

        // 전체 value만 가져오기 
        Collection<String> values = map.values();
        System.out.println(values);

        //TODO: Map 요소 접근
        // 방법 1 : iterator(Set Entry) 
        Set<Entry<String, String>> set2 = map.entrySet();
        Iterator <Map.Entry<String,String>> iterator = set2.iterator();
        while (iterator.hasNext()) {
            Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }   

        // 방법 2 : key 만 iterator로 변경 
        // >> 2번 방법 추천
        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            String id = iterator2.next();
            String value = map.get(id); // get 으로 키 값 가져오기
            System.out.println(id + " : " + value);
        }


    }
}
