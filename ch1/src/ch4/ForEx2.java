package ch4;

public class ForEx2 {
    public static void main(String[] args) {
        // 1~100 까지의 합
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum = sum + i;
        }
        System.out.println("1~100 의 합: " + sum);

        // 1~100 까지 홀수만 합
        sum = 0;
        for (int i = 1; i < 101; i++) { // if문 또는 i+=2
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("1~100 까지 홀수의 합: " + sum);

        // 1~100 까지 짝수만 합
        sum = 0;
        for (int i = 1; i < 101; i++) { //if문 또는 i+=2
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("1~100 까지 짝수의 합: " + sum);








    }
}
