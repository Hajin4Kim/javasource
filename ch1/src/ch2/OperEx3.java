package ch2;

import java.util.Scanner;

public class OperEx3 {
    public static void main(String[] args) {
        // 534 자루의 연필을 30명의 학생들에게 똑같은 갯수로 나눌 때 학생 한 명당 몇 개를 나눠가질 수 있고 최종적으로 몇 개가 남는지 출력하기
        int pencil = 534, student = 30, quotient = pencil / student, remainder = pencil % student;

        //내 답
        System.out.printf("학생 %d명에게 %d개의 연필을 나누어 주면 \n %d 자루 씩 나누어 가질 수 있고, \n %d 자루가 최종적으로 남는다", pencil, student, quotient, remainder);
        // 선생님 답
        System.out.printf("학생 한 명당 %d 자루 \n", (pencil / student));
        System.out.printf("남은 연필 %d 자루 \n", (pencil % student));


        //사다리꼴의 넓이 구한 후 출력하기
        //윗변: 5, 아랫변: 10, 높이: 7
        // 조건) 변수 사용, 소수자리수까지 출력
        int upperSide =5, lowerSide =10, height = 7;
        double result = (double) (upperSide+lowerSide) * height / 2; //TODO: 앞에 (double) 을 붙이던가, 뒤에 2를 2.0 으로 바꾸던가 해야 함
        System.out.printf("사다리꼴의 넓이는 %.1f \n", result);//TODO: .1f 로 소숫점 한 자리 까지만
    
        //TODO: 변수 num 의 값 보다 크면서 가장 가까운 10의 배수에서 변수 num 의 값을 뺀 나머지를 구한 후 출력
        // 예를 들어 24 라면, 30 - 24 = 6 이므로 6 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력하시오 >> ");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        int res = 10 - (num % 10) ;

        System.out.println(res);
        sc.close();
    }
}
