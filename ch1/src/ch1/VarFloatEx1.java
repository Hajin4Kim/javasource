package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {
        // 타입 변수명 = 초기화값;
        // TODO: 반드시 float 타입 뒤에 F 또는 f 붙이기 (default 인식: 실수는 double 로 )
        float score = 90.14F;
        double score2 = 98.5d; //뒤에 D 또는 d 생략가능

        score2 = 90d; // .0 실수형태로 나옴

        System.out.println("score = " + score);
        System.out.println("score2 = " + score2);

        int value1 = 92;
        double score3 = value1;
        System.out.println("score3 = " + score3);
    }
}
// TODO: 큰값 -> 작은타입 (X) -- 처리는 가능하나 값의 손실