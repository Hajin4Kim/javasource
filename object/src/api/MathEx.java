package api;

public class MathEx {
    public static void main(String[] args) {
        // java.lang.Math : 수학 (모든것이 static)
        // 생성자, default 제공 안함

        double val = 90.7552;
        //TODO: round() : 반올림 = long 으로 return
        System.out.println("round() :" + Math.round(val)); // long 으로 반환
        // ceil(): 올림
        System.out.printf("ceil(%3.1f) = %3.1f\n" , 1.1 , Math.ceil(1.1));
        // floor(): 버림
        System.out.printf("floor(%3.1f) = %3.1f\n" , 1.5 , Math.floor(1.5));

        System.out.printf("round(%3.1f) = %d\n" , 1.1 , Math.round(1.1));
        System.out.printf("round(%3.1f) = %d\n" , 1.5 , Math.round(1.5)); // 2

        //TODO: rint() : round int = round() 처럼 소수점 첫째 자리에서 반올림 후 double 로 return
        System.out.printf("rint(%3.1f) = %3.1f\n" , 1.5 , Math.rint(1.5));
        // round(): 소수점 첫째 자리가 5 일때 큰 값으로 반올림
        System.out.printf("round(%3.1f) = %d\n" , -1.5 , Math.round(-1.5)); // -1 = 음수는 버림의 개념으로 간다.
        // rint() : 소수점 첫째 자리가 5 미만일 때 큰 값으로 반올림 
            // 음수에서는 양수와 다르게 -1.5를 버림하게 됨
        System.out.printf("rint(%3.1f) = %3.1f\n" , -1.5 , Math.rint(-1.5));
        System.out.printf("ceil(%3.1f) = %3.1f\n" , -1.5 , Math.ceil(-1.5));
        System.out.printf("floor(%3.1f) = %3.1f\n" , -1.5 , Math.floor(-1.5));











    }
}
