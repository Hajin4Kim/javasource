package ch4;

import java.util.Scanner;

public class WhileEx4 {
    public static void main(String[] args) {

        boolean run = true;
        int balance = 0; //잔액


        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("======================================");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("======================================");
            System.out.println("수행할 과정을 번호로 입력하시오 >> ");

            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    // 잔액 = 잔액 + 입금액
                    // TODO:이런 방법도 있다 balance = balance + sc.nextInt();
                    System.out.println("입금액을 입력하시오. >> ");
                    int deposit = sc.nextInt();

                    System.out.printf("입금액: '%d 원', 현재 잔액은 '%d 원' 입니다.\n", deposit, (balance+=deposit));
                    break;
                case 2:
                    // 잔액 = 잔액 - 출금액
                    System.out.println("출금액을 입력하시오. >> ");
                    int withdrawal = sc.nextInt();
                    System.out.printf("출금액: '%d 원', 현재 잔액은 '%d 원' 입니다.\n", withdrawal, (balance-=withdrawal));

                    break;
                case 3:
                    System.out.println();
                    // 잔액 출력
                    System.out.printf("현재 잔액은 '%d 원' 입니다.\n", balance);
                    break;
                case 4:
                    System.out.println("서비스를 종료합니다.");
                    run = false;
                    break;    
        
            }
        }
        sc.close();
        
        
        
        
        
        
        
        
        
        
    }
}
