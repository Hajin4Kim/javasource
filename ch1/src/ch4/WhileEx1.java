package ch4;

public class WhileEx1 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("HEllo");
            i++;
        }

        i = 1;
        while (i < 11) {
            System.out.println(i + "\t");
            i++;
        }

        i = 1;
        int sum = 0;
        while (i < 101) {
            sum += i;
            i++;
        }
        System.out.println( "1~100 까지의 합 >> " + sum );





    }
}
