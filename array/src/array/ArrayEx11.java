package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx11 {
    public static void main(String[] args) {
        // 동적 배열 생성
        // int[] arr = new int[3];

        // 배열 선언
        int[] arr;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("배열 개수 입력 >> ");
        int num = sc.nextInt();

        // 배열 생성 동적으로
        arr = new int[num];
        System.out.println(Arrays.toString(arr));
        
        sc.close();
        
        
    }
}
