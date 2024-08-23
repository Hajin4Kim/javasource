package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx13 {
    public static void main(String[] args) {
        // 5명의 학생들의 점수를 입력받아 최고점수, 평균 출력
        // 5명은 변경 될 수 있음 -> 동적으로 생성

        // 입력받은 숫자를 기반으로 동적 배열 생성
        
        int[] studentScores;

        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수를 입력하시오 >> ");
        int sNum = sc.nextInt();

        studentScores = new int[sNum];
        System.out.println(Arrays.toString(studentScores));
        //최고점수 구하기
        int max = studentScores[0];
        //평균 구하기
        int sum = studentScores[0];
        //TODO: 간단하게 for 문 하나에 합치기
        for (int i = 0; i < studentScores.length; i++) {
            System.out.printf("%d번 점수를 입력하시오 >> ", (i+1));
            studentScores[i] = sc.nextInt();
            // 최고점수 & 평균 구하기
            if (studentScores[i] > max) {
                max = studentScores[i];
            }
            sum += studentScores[i];
        }
        System.out.println(Arrays.toString(studentScores));
        
        System.out.println("최고점수: " + max);
        System.out.println("평균점수: " + sum / studentScores.length);

        sc.close();
    }
}
