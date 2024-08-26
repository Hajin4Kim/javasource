package classtest;

public class Triangle {
    // 속성
    private int baseLine;    // 밑변 (baseLine)
    private int height;    // 높이 (height)
    
    // 생성자
    public Triangle(int baseLine, int height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    // 기능
        // 삼각형의 너비 리턴
    public double getArea() {
        return baseLine * height / 2.0;
    }
    
    // 밑변, 높이 변화 (Setter)
    public void setBaseLine(int baseLine) {
        this.baseLine = baseLine;
    }
    public void setHeight(int height) {
        this.height = height;
    }
        
        
        
        
        
}
