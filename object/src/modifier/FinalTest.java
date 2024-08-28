package modifier;

public final class FinalTest { // final 클래스  : 상속 불가
    // 상수 (대문자) 선언
    final int MAX_SIZE = 10; // final 멤버변수  : 값 변경 불가 (=상수)

    final int getMaxSize(){ // final 메소드 : @Override 금지
        // final 지역변수 == 상수와 같은 역할
        final int LV = MAX_SIZE; // final 지역변수 : 값 변경 불가 (=상수)
        return MAX_SIZE;
    }

}

// class A extends FinalTest{} (안됨)
