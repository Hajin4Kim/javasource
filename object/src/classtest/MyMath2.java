package classtest;

public class MyMath2 {
    // 인스턴스 (멤버) 변수
    private long a; 
    private long b;

    // 생성자
    public MyMath2(long a, long b){
        this.a = a;
        this.b = b;
    }
    
    // 인스턴스 메소드
    long add (){
        return a + b;
    }
    long subtract (){
        subtract(15,5); //TODO: static 호출은 문제 없음
        return a - b;
    }
    long multiply (){
        return a * b;
    }
    double divide (){
        return a / b;
    }

    // 클래스 메소드
    static long add (long c, long d){
        // Cannot make a static reference to the non-static field a
        // System.out.println(a);

        //TODO: a 변수에 접근하려면 : 1> 인스턴스 생성 or 2> a를 static으로 선언
        // MyMath2 myMath2 = new MyMath2(10, 5);
        // math.a = 15;
        return c + d;
    }
    static long subtract (long c, long d){
        return c - d;
    }
    static long multiply (long c, long d){
        return c * d;
    }
    static double divide (long c, long d){
        return c / d;
    }


    
}
