package api;

public class StringBufferEx {
    public static void main(String[] args) {
        // 원본 문자열 변경 가능한 (mutable) : delete, append 가능, reverse
        // StringBuffer : 스레드 thread 에 안전, 
        // StringBuilder
        
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");
        // equals() : Object가 상속해준 방식으로 사용
        // @Override 가 안됨 = 오브젝트가 넘겨준대로 주소비교를 했다
        System.out.println(".equals = " + sb1.equals(sb2)); // false
        System.out.println("== = " + (sb1 == sb2)); // false

        // 값비교? ==> String 으로 변환 후 값 비교
        // toString():  StringBuffer => String
        String s1 = sb1.toString(); 
        String s2 = sb1.toString();
        System.out.println(".toString = " + sb1.equals(sb2));

        System.out.println("append() : " + sb1.append("def"));
        System.out.println("insert() : " + sb1.insert(3, "hello")); // insert 할 위치(인덱스), insert할 값(문자열) 
        System.out.println("delete() : " + sb1.delete(2, 5)); // delete 시작할 위치(인덱스), delete 끝날 위치(인덱스)
        System.out.println("replace() : " + sb1.replace(3, sb1.length(), "END")); // replace 시작할 위치(인덱스), 어떤걸 replace할지, replace 할 값(문자열)
















    }

}
