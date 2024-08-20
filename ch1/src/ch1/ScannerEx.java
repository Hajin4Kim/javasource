package ch1;

import java.util.*;


public class ScannerEx {
    public static void main(String[] args) {
        //대문자 시작 = class or interface 라고 생각
        // Scanner 는 어디에 선언도니 클래스인가 알려줘야 함
            // System.in(키보드) 로부터 입력받기 위해 필요한 객체 
            // System.out(화면)
        //TODO: 키보드에서 입력받는 프로그램 시작
        Scanner sc = new Scanner(System.in);
        System.out.println("두 자리 정수를 입력해 주세요 >> ");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d\n", num);

        sc.close();
    }
}
