package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        char ch1 = 'c'; // TODO: char 타입은 "" (X) 에러 발생

        char ch2 = 65; // ASCII / UNI CODE 에 해당하는 문자가 반환됨

        System.out.println("ch1 = " + ch1 + ", ch2 = " + ch2);
        System.out.printf("ch1 = %C, ch2 = %C", ch1, ch2);
    }

}
