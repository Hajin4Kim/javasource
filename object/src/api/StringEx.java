package api;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        // java.lang.String
            //TODO: 변경 불가능한 (immutable) 클래스 : 한 번 생성된 인스턴스는 "읽기" 만 가능한 상태
        String str = "a";
        str = str + "bcd"; // 기존 str을 파괴하고 다시 인스턴스 생성 후 연결함
        String str5 = "fg";
        str = str + str5; // 기존 str을 파괴하고 다시 인스턴스 생성 후 연결함

        // 문자열 변경이 가능
        // java.lang.StringBuilder
        // java.lang.StringBuffer

        // 문자열 리터럴 지정 ; 저장이 된 후 동일한 문자열이 들어오는 경우엔 한 번만 저장
        String str1 = "abc";
        String str4 = "abc";
        // 생성자 사용 (new)
        String str2 = new String("abc");
        char ch[] = { 'a', 'b', 'c' };
        String str3 = new String(ch);

        System.out.println(str1 == str4); // true
        System.out.println(str1 == str2); // false

        // 1. 문자열 비교 : equals() / equalsIgnoreCase() : 대소문자 구분 없이 비교
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4)); 


        // 2. charAt(int index)
        System.out.println("charAt(1) : " + str1.charAt(1)); // b

        str1 = new String("Hello!! Java");

        // 3. length() ; 중간의 공백 도 문자로 인식하여 카운트 함
        System.out.println("str1 길이 : " + str1.length()); // 12

        // TODO: str1 ==> char 배열로 변환
        // ['H', 'e', 'l', 'l', ...]
        char ch1[] = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            ch1[i] = str1.charAt(i);
        }
        System.out.println(Arrays.toString(ch1));

        // 4.toCharArray() 문자열을 char 배열로 변환 기능: toCharArray()
        char ch2[] = str1.toCharArray();
        System.out.println(Arrays.toString(ch2));

        // 5. indexOf("찾을 문자") : 주어진 문자의 시작위치 리턴 (index는 0 부터 시작)
        //TODO: 못찾는 문자, 없는 문자 = -1 리턴
        System.out.println("indexOf(e) : " + str1.indexOf('e')); // 1
        System.out.println("indexOf(Java) : " + str1.indexOf("Java")); // 8
        System.out.println("indexOf(b) : " + str1.indexOf("b")); // -1
        System.out.println("indexOf(b) : " + str1.indexOf('e', 4)); // ('찾을문자', 시작위치 인덱스 넘버)

        // 6. lastIndexOf("찾을 문자") : indexOf의 반대방향에서부터 시작( 오른쪽부터 시작)
        System.out.println("lastIndexOf(e) : " + str1.lastIndexOf('e')); // 1
        System.out.println("lastIndexOf(Java) : " + str1.lastIndexOf("Java")); // 8

        // 7. contains(문자열) : 지정된 문자열이 포함되어있는지 확인(t/f) return
        System.out.println("contains(e) : " + str1.contains("e")); // true
        System.out.println("contains(f) : " + str1.contains("f")); // false

        // 8. startsWith("문자열") / endsWith("문자열") :지정된 문자열로 시작, 끝나는지 확인 후 return boolean
        str2 = "java.lang.String";
        System.out.println("startsWith() : " + str2.startsWith("java")); // true
        System.out.println("startsWith() : " + str2.startsWith("lang")); // false
        str3 = "file.txt";
        System.out.println("endsWith(txt) : " + str3.endsWith("txt")); // true

        // 9. concat("문자열") : 문자열 뒤로 연결  return String
        System.out.println("concat(str2) : " + str1.concat(str2));

        // 10. replace("old문자", "new문자") : replace("기존 문자"를, "바꿀 문자") 로 변경 후, 새로운 문자열로 리턴
        str1 = "Hellollo";
        System.out.println(str1.replace("ll", "LL")); // HeLLoLLo
        System.out.println(str1.replaceAll("ll", "LL")); // HeLLoLLo
        System.out.println(str1.replaceFirst("ll", "LL")); // HeLLollo // 처음에 찾은 ll 만 LL로 replace
        System.out.println(str1); // Hellollo

        // 11. split("패턴 or 분리기호") : 문자열을 분리자로 나누어 문자 배열로 리턴
        String animals = "cat,dog,bear";
        String[] arr = animals.split(",");
        for (String s : arr) {
            System.out.println(s);
        }
        arr = animals.split(",", 2); //TODO: 나누는 갯수 제한
        for (String s : arr) {
            System.out.println(s); // cat / dog,bear
        }

        // 12. subString(시작위치) : 시작위치부터 끝까지 잘라내서 새로운 문자열로 돌려받기
        // 12. subString(시작위치, 끝위치) : 시작위치포함, 끝위치의 문자는 포함되지 않음
        str1 = "java.lang.Object";
        System.out.println("substring(시작위치) : " + str1.substring(10)); // Object
        System.out.println("substring(시작위치, 끝위치) : " +str1.substring(5,9)); // lang

        // 13. toUpperCase() / toLowerCase() :  대문자 / 소문자로 변환
        System.out.println("toUpperCase() : " + str1.toUpperCase()); // JAVA.LANG.OBJECT
        System.out.println("toLowerCase() : " + str1.toLowerCase()); // java.lang.object

        // 14. trim() : 앞 뒤 공백제거 (중간 공백은 제거 X)
            // .equals () 에서 공백 차이로 같은 문자열같아도 false 뜨는 경우 생기니, DB 저장 시, trim 으로 공백 제거 중요
        str1 = "                     Hello          World     ";
        System.out.println(str1 + "공백"); //                      Hello          World     
        System.out.println("trim() : " + str1.trim()); // Hello          World

        // 15. String.valueOf() : 기본형(char, int, float, double, boolean) 값을 String으로 변환
        System.out.println("String.valueOf(0)" + String.valueOf(0)); // 0 => "0"
        System.out.println("String.valueOf(true)" + String.valueOf(true)); // true => "true"
        System.out.println("String.valueOf(10.5)" + String.valueOf(10.5)); // 10.5 => "10.5"

        int i = 100;
        String newStr = String.valueOf(i); // 성능은 valueOf() 가 좋다
        newStr = i + ""; // 편리함을 따진다면,  + "" 더 많이 사용

        //TODO: Integer.parseInt("33");
        // String 을 기본형 값으로 변환 : "100" => 100

        int j = Integer.parseInt(newStr);
        System.out.println("j = " + j);

        //Error: java.lang.NumberFormatException // TODO: double타입을 parseInt 하려고 하니까 오류난다
        // j = Integer.parseInt("33.5");
        double d = Double.parseDouble("33.5");
        System.out.println("d = " + d);

        // "true" => true
        boolean b = Boolean.parseBoolean("true");
        System.out.println("b = " + b);

        // int(기본타입) => Integer(참조타입) // float (기본타입) => Float(참조타입)
        // boolean (기본타입) => Boolean(참조타입) double (기본타입) => Double(참조타입)
        // char => Character
        float f1 = 3.14f;
        Float f2 = 3.14f; // class 로 정의되어있으므로, f2. 하면 수많은 기능 사용 가능
        
        str1 = "Hello World";
        // 거꾸로 출력
        for (int k = str1.length() -1; k >= 0; k--) {
            System.out.println(str1.charAt(k));
        }
        System.out.println();
        
        //TODO: StringBuffer 의 reverse() 이용
        StringBuffer sb = new StringBuffer(str1);
        System.out.println(sb.reverse());






    }
}
