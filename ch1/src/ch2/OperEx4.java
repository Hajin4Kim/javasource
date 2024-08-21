package ch2;

import java.util.Scanner;

public class OperEx4 {
    public static void main(String[] args) {
        
        // 사용자로부터 한 달 월급 입력받은 후 월급을 10년간 저축한 값 표출
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 월급을 입력하시오 >> ");
        String input = sc.nextLine();

        int salary = Integer.parseInt(input);
        int savingsFor10Years = salary * 12 * 10;

        System.out.printf("당신의 월급 %d 원을 10년간 저축하면 %d 원이 됩니다.", salary ,savingsFor10Years);
        sc.close();
    
    }
}
