package classtest;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // method 호출 => 해당 메소드 실행됨
        calculator.powerOn();

        // return 이 존재 시, 1) 변수에 담기 2) 사용
        int result = calculator.plus(8, 6);
        System.out.println("연산 결과 : " + result);

        double result2 = calculator.divide(9, 2);
        System.out.println("나눗셈 결과 : " + result2);

        // void 라면 호출만 가능
        calculator.powerOff();

        Calculator2 calculator2 = new Calculator2();
        calculator2.execute();




    }
}
