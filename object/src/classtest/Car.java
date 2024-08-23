package classtest;
// 자바 - 객체 지향 언어 (class)
    // main() 메소드를 가지는 클래스 와 가지지 않는 클래스 (없는 경우 이것 자체를 실행시킬 수 X)
// 클래스 정의: 객체를 정의해 놓은 것
// 클래스 용도: 객체를 생성하는데 사용

// 객체: 사물 또는 개념
public class Car {
    // 특징(속성) => field(변수로 작성)
        // 제조사, 모델, 색상, 최대속도,
    String company;
    String model;
    String color;
    int maxSpeed;
    
    // 기능(동작) => method
    void forward() {
        System.out.println("전진한다.");
    }

    void backward() {
        System.out.println("후진한다.");
    }


}
