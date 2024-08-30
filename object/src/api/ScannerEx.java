package api;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("문자열 입력하시오 >> ");
        // String str = sc.next(); // 안녕하세요 반갑습니다 //TODO: next()  :단어 단위로 읽음. 공백 전까지만
        // System.out.println(str);

        System.out.print("input num1");
        int num1 = sc.nextInt(); // 5 엔터  // int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("연산자 입력하시오 + - * / 중에서");
        // String op = sc.next();
        String op = sc.nextLine(); // 5 이후의 남은 엔터를 읽어들임(그리고 enter가 실행되어, 건너뛰어짐)
        System.out.print("input num2");
        int num2 = sc.nextInt();

        System.out.println();







    }

}
