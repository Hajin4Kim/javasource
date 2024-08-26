package classtest;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();

        long add = myMath.add(5L, 3L);
        long subtract = myMath.subtract(5L, 3L);
        long multiply = myMath.multiply(5L, 3L);
        double divide = myMath.divide(5L, 0L);

        int divideInt = myMath.divide(5, 0);
        // System.out.println("myMath.divideInt(5) : " + divideInt);

        // TODO: println() 함수도 오버로딩 되어있음 (어떤 타입을 넣어도 다 가능하게끔)
        System.out.println("add(5L, 3L) : " + add);
        System.out.println("subtract(5L, 3L) : " + subtract);
        System.out.println("myMath.multiply(5L, 3L) : " + multiply);
        System.out.println("myMath.divide(5L, 3L) : " + divide);
        
        MyMath2 math2 = new MyMath2(15, 5);
        //TODO: 인스턴스 메소드 사칙연산
        System.out.println("15 + 5 = " + math2.add());
        System.out.println("15 - 5 = " + math2.subtract());
        System.out.println("15 * 5 = " + math2.multiply());
        System.out.println("15 / 5 = " + math2.divide());


        //TODO: 클래스 메소드 사칙연산
        System.out.println("15 + 5 = " + MyMath2.add(15,5));
        System.out.println("15 - 5 = " + MyMath2.subtract(15,5));
        System.out.println("15 * 5 = " + MyMath2.multiply(15,5));
        System.out.println("15 / 5 = " + MyMath2.divide(15,5));
    }
}
