package ch3;

import java.util.Scanner;

public class IfEx4 {
    public static void main(String[] args) {

        //숫자를 하나 입력받은 후 받은 숫자가 짝수 인지 홀수인지 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요. >> ");
        int num = sc.nextInt();

        if (num % 2 == 0 ) {
            System.out.println("짝수 입니다.");
        }else{
            System.out.println("홀수 입니다.");
        }

        sc.close();
    }
}
