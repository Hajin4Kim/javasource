package ch2;

public class OperEx1 {
    public static void main(String[] args) {
        // 연산자(operator)
        // 1) 산술 연산자 : +, -, *, /, %
        // 2) 비교 연산자 : >, <, >=, <=, ==, !=
        // 3) 논리 연산자 : &&, ||, !
        // 4) 대입 연산자 : =

        // 연산자 우선순위
            // 산술 > 비교 > 논리 > 대입 순으로 수행됨 

        // 두 개의 정수형 변수를 선언한 후 사칙연산 프로그램 작성
        int num1 = 10, num2 = 20;

        System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
        System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
        System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
        // 나누기: 몫 만 출력
        System.out.printf("%d / %d = %d\n", num2, num1, (num2 / num1));
        System.out.printf("%d %% %d = %d\n", num1, num2, (num1 % num2)); //TODO: 나머지 연산자는 %% 두번 해야 함

        // 서로 다른 타입의 연산의 경우 -> 큰 타입이 적용됨
        float result = num1 + num2;
        System.out.printf("%d + %d = %f\n", num1, num2, result);
        result = num1 - num2;
        System.out.printf("%d - %d = %f\n", num1, num2, result);
        result = num1 * num2;
        System.out.printf("%d * %d = %f\n", num1, num2, result);
        result = num1 / num2;
        System.out.printf("%d / %d = %f\n", num1, num2, result);
        result = num1 / (float)num2;
        System.out.printf("%d / %d = %f\n", num1, num2, result);
        
        char ch1 = 'A' + 1; // UNICODE 
        System.out.println("ch1 = " + ch1);
        
    
    }
}
