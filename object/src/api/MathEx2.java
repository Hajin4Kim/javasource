package api;

public class MathEx2 {
    public static void main(String[] args) {
        // Math.random() : 1~3 사이의 임의의 숫자 발생


        int num1  = (int)(Math.random() *3 ) + 1;
        int num2  = (int)(Math.random() *3 ) + 1;
        int num3  = (int)(Math.random() *3 ) + 1;
        
        // do {
        //     System.out.println(" num1 = " + num1 + " num2 = " + num2 +" num3 = " + num3 );
        // } while ((num1 == num2 && num1 == num3));
        
        
        while (true) {
            num1  = (int)(Math.random() *3 ) + 1;
            num2  = (int)(Math.random() *3 ) + 1;
            num3  = (int)(Math.random() *3 ) + 1;

            System.out.printf("%d\t%d\t%d\t\n" , num1, num2, num3);

            if (num1 == num2 && num1 == num3) {
                System.out.println("끝");
                break;
            }
        }


        
    }
}
