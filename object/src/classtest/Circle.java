package classtest;
//TODO: 클래스 내에 선언 순서 상관 없음
//TODO: 속성, 생성자, 메소드 순으로 주로 함
public class Circle {

    // 속성
    private double radius;    // 반지름(radius) : 3.5
    // 기능
        // 원의 넓이 : 반지름 * 반지름 * 3.14
    public double circleArea() {
        return radius * radius * 3.14;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    
    
}
