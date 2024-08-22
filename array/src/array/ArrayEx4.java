package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        // 배열: 한 번 생성하면 길이 변경 불가

        
        //학생 10명의 점수 배열 생성
        int mathScore[] = {88,78,69,55,45,66,78,72,53,22};

        // 5명의 점수를 추가되어야 한다면?
            // 15명의 점수를 담을 저장공간을 새로 생성
        int[] mathScore2 = new int[15];
            // 기존 10명의 점수를 복사
        for (int i = 0; i < mathScore.length; i++) {
            mathScore2[i] = mathScore[i];
        }
        //복사 후 확인
        for (int i = 0; i < mathScore2.length; i++) {
            System.out.printf("%d\t", mathScore2[i]);
            
        }
        System.out.println();

        // 남은 5 공간에 5명이 점수를 입력 받은 후 배열 요소 채우기
        Scanner sc = new Scanner(System.in);

        for (int i = 10; i < 15; i++) {
            System.out.printf("%d 번 학생의 점수를 입력하시오 >> ", i);
            mathScore2[i] = sc.nextInt();
        }
        //확인
        System.out.println(Arrays.toString(mathScore2));

        sc.close();
    }
}
