package classtest;

public class TriangleEx {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 7);
        
        System.out.println("삼각형 넓이 : " + triangle.getArea());

        // 밑변, 높이 숫자 변경 (Setter 설정)
        triangle.setBaseLine(15);
        System.out.println("삼각형 넓이 : " + triangle.getArea());

        triangle.setBaseLine(10);
        triangle.setHeight(8);

        System.out.println("삼각형 넓이 : " + triangle.getArea());

    }
}
