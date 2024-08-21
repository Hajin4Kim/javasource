package ch2;

public class OperEx5 {
    public static void main(String[] args) {
        // 비교 연산자: >, <, <=, >=, == (같은가), !=(같지 않다)
            // 결과값이 논리값(true, false) 로 출력됨

        int num1 = 10, num2 = 20;
        System.out.println("num1 == num2 = " + (num1 == num2));
        System.out.println("num1 != num2 = " + (num1 != num2));

        char ch1 = 'A', ch2 = 'B';
        int num3 = 65;

        // char 과 int 비교 : 자동형변환 일어남
        System.out.println("ch1 == num3 = " + (ch1 == num3));
        System.out.println("ch1 <= ch2 = " + (ch1 <= ch2));

        // float , double
        float f1 = 0.1f; // 0.1000000000149011612
        double d1 = 0.1; // 0.1000000000000000000
        // float , double 정밀도 차이가 있음 = 둘이 다름
        System.out.println("f1 == d1 = " + (f1 == d1));

        // 문자열 비교 // 문자 와 문자열을 다름
        // c 라는 무자 하나를 저장하고 싶다면 변수의 타입 지정 시 char, String 으로 처리 가능
        // ch 라는 문자열을 저장하고 싶다면 변수 타입 지정 시 String 만 처리 가능

        //TODO: 대문자로 시작하면 자바에서는 객체의 의미가 있음 (객체 상태일 때 할 수 있는 것이 많다)
        //TODO: 자바에서 문자열 생성하는 다양한 방법 때문에 저장되는 위치가 조금 다를 수 있음
            // 때문에 문자열의 비교는 ==를 사용하지 않음 (결과가 달라질 수 있기에)
        String str1 = "gildongHong", str2 = "gildongHong";
        
        //TODO: String 생성 기본원칙
        String str3 = new String("gildongHong");
        System.out.println("str1 == str2 = " + (str1 == str2));
        System.out.println("str1 == str3 = " + (str1 == str3)); //false

        //TODO: equals() : 문자열 비교
        System.out.println("str1 == str3 = " + str1.equals(str3)); //true
        
        str1 = "animal";
        str2 = "Animal";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2)); 

        
        
    }
}
