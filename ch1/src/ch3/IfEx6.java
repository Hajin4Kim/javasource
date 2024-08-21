package ch3;

import java.util.Scanner;

public class IfEx6 {
    public static void main(String[] args) {
        //윤년(leap year), 평년 구하기
        //  윤년 : 2012, 2016, 2020, 2024
        // 윤년: 년도를 4 로 나눈 나머지가 0 이고, 년도를 100으로 나눈 나머지가 0이 아니거나 년도를 400 으로 나눈 나머지가 0인 경우

        // 현재 년도가 윤년인지 평년인지 구하기

        Scanner sc = new Scanner(System.in);
        System.out.print("현재 년도를 입력해 주세요. >> ");

        int currentYear = sc.nextInt();
        // int leapYear;
        // int normalYear;
        
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
            System.out.printf("%d 년은 윤년 입니다.",currentYear);
        }else{
            System.out.printf("%d 년은 평년 입니다.",currentYear);
        }
        sc.close();
    }
}
