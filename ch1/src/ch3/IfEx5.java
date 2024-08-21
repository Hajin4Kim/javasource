package ch3;

import java.util.Scanner;

public class IfEx5 {
    public static void main(String[] args) {

        //근무시간에 따른 임금 계산
        // 근무시간 입력받기, 8시간까지 시간단 기본임금(1만원) 제공, 초과근무시간은 시간당 기본임금 * 1.5 배 제공

        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 근무시간을 입력해 주세요. >> ");
        int workingHours = sc.nextInt();
        int pay;
        int rate = 10000;

        if (workingHours > 8) {
            pay = (int) (rate * (workingHours - 8) * 1.5) + rate * 8;
        } else{
            pay = rate * workingHours;
        }
        System.out.printf("근무시간: %d 시간, 임금: %d 원  \n", workingHours, pay);

        sc.close();
    }
}
