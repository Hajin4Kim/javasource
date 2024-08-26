package classtest;

public class CircleEx {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);

        System.out.println("원의 넓이 : " + circle.circleArea());

        circle.setRadius(12.4);
        System.out.println("원의 넓이 : " + circle.circleArea());
    }
}
