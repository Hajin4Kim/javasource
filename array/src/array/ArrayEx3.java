package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        // char 선업 면언 생성,
        // 배열 파이 명
        //TODO: 둘 다 OK! 타일 배열명[] / 타입[] 배열명
        // char 배열명!

        char [] chArr = {'a', 'b','c','d'};
        System.out.println(Arrays.toString(chArr)); // 이렇게 하면 편하나, 대괄호 안에 든 형태로만 표출됨

        //인덱스 필요한 경우
        for (int i = 0; i < chArr.length; i++) {
            System.out.print(chArr[i] + "\t"); 
        }

        // 화면에 하나씩 출력만 원한다면 훨씬 편하다 TODO: 향상된 for 문 (for each)
        for (char c : chArr) {
            System.out.print(c + "\t");
        }
        
        // float 배열 선언, 솔온 배열 선언, 생성
        float[] flArr = {12.5f, 13.6f, 14.5f, 153.7f};
        for (float f : flArr) {
            System.out.println(f);
        }

        // String 배열 선언,  생선
        String [] strArr = {"A", "B", "C", "D" };
        // TODO: ArrayIndexOutofBoundsException => 에러 숙지
        // System.out.println(strArr[5]); //4인데 5를 부르면
        for (String string : strArr) {
            System.out.println(string);
        }
    }
}
