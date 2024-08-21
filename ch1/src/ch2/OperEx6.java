package ch2;

import java.util.Scanner;

public class OperEx6 {
    public static void main(String[] args) {
        // 논리연산자: &&(and), ||(or), !(not)
        // T && T, T|| T ==> 결과 T

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력하시오 >> ");
        String input = sc.nextLine();
        int value = Integer.parseInt(input);

        // int value = 9;
        // value 가 2의 배수 혹은 3의 배수 인지 확인 후 출력
        if ((value % 3 <= 0) && (value % 2 <= 0)) {
            System.out.printf("%d 는 2 와 3의 배수 입니다 ",value);
        }else if ((value % 3 <= 0) || (value % 2 <= 0)) {
            System.out.printf("%d 는 2 또는 3의 배수 입니다 ",value);
        }else
        System.out.printf("%d 는 2 또는 3의 배수가 아닙니다 ",value);
sc.close();

        char ch1 = 'A';
        System.out.println(ch1 >= 'A');
        System.out.println(ch1 <= 'Z');

        // ch1 이 대문자 라면 ch1 은 대문자 입니다 출력
        if (ch1 >= 'A' && ch1 <= 'Z') {
            System.out.println("ch1 은 대문자 입니다");
        }

    }
}
