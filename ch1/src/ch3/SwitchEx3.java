package ch3;

import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {
        // 가위(1) 바위(2) 보(3) 게임
        // 컴퓨터가 내는 부분 : random 1~3 사이의 숫자
        int computer = (int)(Math.random() * 3) + 1;

        //사용자가 내는 부분: 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(1), 바위(2), 보(3) 일 때, 숫자 입력으로 게임 시작 >>");
        int userG = sc.nextInt();
        int scissor, rock, paper; 
        switch (userG - computer) {
            case 1: //rock > scissor
                System.out.println("바위를 낸 사용자의 승");
                break;
            case 2: //paper > rock
                System.out.println("보를 낸 사용자의 승");
                break;
            case 0: //비기는 경우 
                System.out.println("비겼습니다");
                break;
            case -1: //가위 - 바위
                System.out.println("사용자의 패");
                break;
            case -2: //가위 - 보
                System.out.println("보를 낸 사용자의 승");
                break;
            default:
                System.out.println("숫자 1 ~ 3 중 입력하시오.");
                break;
        }
        sc.close();
    }
}
