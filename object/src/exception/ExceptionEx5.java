package exception;

public class ExceptionEx5 {
    public static void main(String[] args) {
        try {
            
            String data1 = args[0];

            System.out.println(3 / 0);
        } catch (ArrayIndexOutOfBoundsException e) { // main(String[] args) 의 0 번에 있는걸 가져오라 했지만, 0번엔 아무것도 없기에
            System.out.println("매개변수 확인");
            System.out.println(e.getMessage()); // Index 0 out of bounds for length 0
        } catch (ArithmeticException e) {
            System.out.println("0 으로 나누었습니다");
        }

    }
}
