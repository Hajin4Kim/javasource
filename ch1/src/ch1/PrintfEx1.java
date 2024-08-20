package ch1;

public class PrintfEx1 {
    public static void main(String[] args) {
    // printf();
    //  boolean: %b, int: %d, float: %f, char: %c, string: %s

    char ch1 = 'A';
    System.out.printf("ch1 = %c\n", ch1);
    System.out.printf("ch1 = %c\n", ch1);
    System.out.printf("ch1 = %10c\n", ch1);

    double d1 = 3.1415d;
    System.out.printf("d1 = %f\n", d1);
    System.out.printf("d1 = %10f\n", d1); // 5의 경우는 무시됨; 해당 변수의 값이 5보다 크기에
    System.out.printf("d1 = %10.2f\n", d1);



    }
}
