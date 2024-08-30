package api;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // System.in : 키보드
        Scanner sc =  new Scanner(System.in);

        String[] argArr = null;
        while (true) {
            String prompt = ">>";
            System.out.println(prompt);

            // hello
            // hello      123
            String input = sc.nextLine();

            // 양쪽 공백 제거
            input = input.trim();

            // 문자열 분리 : 공백 기준
                //TODO: "공백+"  : 공백이 최소 ~ 무한대
                //TODO: regex : 정규식
            argArr = input.split(" +");
            // System.out.println(Arrays.toString(arr));

            // 소문자로 변경
            String cmd = argArr[0].toLowerCase();

            // q or Q 이면 while 종료
            if (cmd.equals("q") || cmd.equals("Q")) {
                System.out.println("종료합니다");
                System.exit(0);
            } else{
                // q Q 가 아니면 배열 출력
                for (String s : argArr) {
                    System.out.println(s);
                }
            }

        }



    }
}
