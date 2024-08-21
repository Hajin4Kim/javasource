package ch3;

import java.util.Scanner;

public class SwitchEx4 {
    public static void main(String[] args) {
        // 피연산자 2개와 연산자 1개를 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.println("연산자(+, -, *, /) 입력 >> ");
        String op = sc.nextLine();
        System.out.println("숫자 1 입력 >> ");
        int num1 = sc.nextInt();
        System.out.println("숫자 2 입력 >> ");
        int num2 = sc.nextInt();
        
        int result;
        switch (op) {
            case "+":
                result = num1 + num2;
                System.out.printf("%d + %d = %d",num1, num2, result);
                break;
            case "-":
                result = num1 - num2;
                System.out.printf("%d - %d = %d",num1, num2, result);
                break;
            case "*":
                result = num1 * num2;
                System.out.printf("%d * %d = %d",num1, num2, result);
                break; 
            case "/":
                result = num1 / num2;
                System.out.printf("%d / %d = %d",num1, num2, result);
                break;
        
            default: 
                break;
        }
        
        
        sc.close();
    }
}
