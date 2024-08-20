package ch1;

public class VarByteEx1 {
    public static void main(String[] args) {
        // 제 나이는 25 이고, 이름은 홍길동 입니다.
        // 변경되는 부분은 변수로 작성
        // 변수 선언 후 사용 : 타입 변수명 = 초기값;
        // 타입: 정수형, 실수형, 문자형, 논리형
        // 1) 정수형: byte(1byte=8bit), short(2byte), int(4byte), long(8byte)
        // 2) 실수형: float(4byte), double(8byte)
        // 3) 문자형: char(2byte)
        // 4) 논리형: boolean(1byte)
        // 주로 사용하는 타입은 int, double, char, boolean
        // 변수명: 소문자로 시작, 예약어 사용불가, 숫자시작 안됨, 특수문자는 _, $만 가능
        int declareAge = 129;
        String declareName = "gildong";

        declareAge = 40;

        // print: 화면 출력 (엔터 미포함)
        //TODO: println: 화면 출력 후 엔터까지 포함
        // printf: 포맷을 적용한 출력 (엔터 미포함)

        //TODO: %d (정수형), %f (실수형) , %c (문자형), %s (문자열형), %b(논리형)
        // 자바는 문자와 문자열 다름
            // 문자: 하나 => 'a' (홑따옴표)
            // 문자 여러 개 => "abc", "a" ()
        System.out.print("제 나이는 " + declareAge + " 이고, 이름은 " + declareName + " 입니다.");
        System.out.println("제 나이는 " + declareAge + " 이고, 이름은 " + declareName + " 입니다.");
        System.out.printf("제 나이는\\ %d 이고, 이름은 %s 입니다.\n", declareAge, declareName); // enter = \n, tab = \t

    }
}
