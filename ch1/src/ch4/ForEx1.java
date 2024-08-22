package ch4;

public class ForEx1 {
    public static void main(String[] args) {
        // 반복문
        // 안녕하세요 10번 출력
        // for, while, do-while
        
        for (int i = 0; i < 10; i++) {
            // System.out.println("안녕하세요");
        }
        // 1) int i = 0; 실행
        // 2) i < 10; 조건 검사
        // 3) for 블럭 안의 구문 실행
        // 4) i++ 실행
        // 5) i<10; 조건 검사
        // 6) for 블럭 안의 구문 실행
        // 4 ~6 반복 실행
        //TODO: i = 10 이 된 후 조건검사 false 가 되면 반복문 종료

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }

        //  i = i+2 짝수만
        for (int i = 2; i < 11; i+=2) {
            System.out.print(i + "\t");
        }
        // 홀수만 출력
        for (int i = 1; i < 11; i+=2) {
            System.out.print(i + "\t");
        }
        // 시작을 10
        for (int i = 10; i > 0; i--) {
            System.out.print(i + "\t");
        }
    }
}
