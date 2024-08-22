package ch4;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // for, while 과 다른 점은 {} 를 수행 한 후, 조건식을 검사
        // ==> 최소 1번은 실행됨

        
        //  1~ 100 사이의 임의의 숫자를 추출 후, 그 숫자를 알아맞추기
        Scanner sc = new Scanner(System.in);

        int answer = (int)(Math.random() * 100 ) + 1;   
        int input = 0;
        do {
            System.out.println("1 ~ 100 사이의 숫자 입력>> ");
            input = sc.nextInt();

            if (answer< input){
                System.out.println("더 작은 수 입력해주세요");
            }else{
                System.out.println("더 큰 수 입력해주세요");
            }
        } while (answer != input);

        System.out.println("정답!! 프로그램 종료");
        
        sc.close();


    }
}
