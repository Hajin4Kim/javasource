package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        // 정수 10개 담을 배열 생성
        // 값을 섞기

        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }
        // System.out.println(Arrays.toString(numArr));
        
        // 100번 loop 돌리기
        // 무작위로 번호 추출하여, index0 부터 시작 -> 만약 추출값이 7 이면 index0 의 값과 7의 값 위치를 서로 뒤바꾼다

        for (int i = 0; i < 100; i++) {
            // 0 ~ 9 중 임의의 숫자 추출
            int n= (int)(Math.random() * 10 );
            // temp 저장공간 생성
            int tmp =numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
                
        }
        System.out.println(Arrays.toString(numArr));

    }
}
