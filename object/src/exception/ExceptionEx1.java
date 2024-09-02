package exception;

public class ExceptionEx1 {
    public static void main(String[] args) {
        
        int number = 100;
        int result = 0;

        // Unchecked Exception
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int)(Math.random() * 10);
                System.out.println(result);

                int num = Integer.parseInt("abc"); // Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
                System.out.println(num);
            } catch (ArithmeticException | NumberFormatException e) {
                // System.out.println("0 으로 나눴음");
                // e.printStackTrace();
                System.out.println(e.getMessage());
            }
            
        }

        


    }
}
