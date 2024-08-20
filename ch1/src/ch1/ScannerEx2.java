package ch1;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        
        // 키보드에서 입력받을 준비 완
        Scanner sc = new Scanner(System.in);
        // 사용자가 어떤 값을 입력해야 하는지 알려주기
        System.out.println("숫자 입력하시오 >> ");
        //TODO:대부분의 경우, 키보드로 입력받는 값은 string로 옴
        int num = sc.nextInt(); //nextInt() 단점땜에 잘 안씀
        System.out.printf("num = %d\n", num);

        sc.close(); //키보드 입력 종료
        

    }
}
