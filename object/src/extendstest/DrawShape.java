package extendstest;

public class DrawShape {
    public static void main(String[] args) {
        // 인스턴스 생성
        Point[] p = {
            new Point(100, 100),
            new Point(140, 50),
            new Point(200, 100),
        };

        Triangle triangle = new Triangle(p);

        //TODO: p1 변수 쓰는 경우 ; Point p1 = new Point(150, 150);
        Circle circle = new Circle(new Point(150, 150), 50); //TODO: p1 변수 안쓰는경우; 쓰는 경우엔 저 자리에 p1
        
        triangle.draw();
        circle.draw();
        
    }
}
