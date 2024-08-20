package ch1;

public class CastingEx1 {
    public static void main(String[] args) {
        // TODO: 강제 형변환(casting) = 현타입을 다른타입으로 변환
        // TODO: 형변환 방법: (변경할타입)변수명

        double d = 85.4;
        // 작은타입 = 큰타입
        int score = (int) d;
        System.out.printf("score = %d\n\n", score);

        // 자동형변환: 작은타입 => 큰타입 (따로 건드릴 필요 X)
        // byte --> short --> int --> long --> float --> double
        // char --> int --> long --> float --> double

        byte byteValue = 10;
        int intValue = byteValue;
        System.out.printf("int 형 변환 후 %d\n", intValue);

        long longValue = intValue;
        System.out.printf("long 형 변환 후 %d\n", longValue);

        double doubleValue = longValue;
        System.out.printf("double 형 변환 후 %f\n", doubleValue);

        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;");
        char ch = 'a';
        intValue = ch;
        System.out.printf("int 형 변환 후 %d\n", intValue);
        
    }
}
