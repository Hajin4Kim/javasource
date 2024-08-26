package classtest;
// 속성, 생성자 X / 기능만 있는 클래스
public class Calculator {
    
    public void powerOn() {
        System.out.println("전원 켜기");
    }
    int plus(int x, int y){
        return x + y;
    }
    double divide(int x, int y){
        // return int = > double 자동 형 변환
        return (double) x / y;
    }
    public void powerOff() {
        System.out.println("전원 끄기");
    }
    
    
    
}
