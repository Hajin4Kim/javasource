package ch3;
import java.util.Scanner;

public class IfEx7 {
    public static void main(String[] args) {
        // 세 개의 숫자 입력 받은 후, 입력 받은 세개의 수 중 가장 작은 숫자 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력. >> ");
        int firstNum = sc.nextInt();

        System.out.print("두 번째 숫자 입력. >> ");
        int secondNum = sc.nextInt();

        System.out.print("세 번째 숫자 입력. >> ");
        int thirdNum = sc.nextInt();

        // 내가 짠 코드
        // if (firstNum > secondNum && secondNum > thirdNum) {
        //     System.out.printf("세번째 숫자가 가장 작은 수: %d ", thirdNum);
        // }else if (secondNum > thirdNum && thirdNum > firstNum) {
        //     System.out.printf("첫번째 숫자가 가장 작은 수: %d ", firstNum);
        // }else if (thirdNum > firstNum && firstNum > secondNum){
        //     System.out.printf("두번째 숫자가 가장 작은 수: %d ", secondNum);
        // }
        
        // 선생님 코드
        int min = firstNum;
        if (min > secondNum) {
            min = secondNum;
        }
        if (min > thirdNum) {
            min = thirdNum;
        }
        System.out.println("제일 작은 수는 : " + min);

        // 제일 큰 수 출력 
        int max = firstNum;
        if (max < secondNum) {
            max = secondNum;
        }
        if (max < thirdNum) {
            max = thirdNum;
        }
        System.out.println("제일 큰 수는 : " + max);

        sc.close();
    }
}
