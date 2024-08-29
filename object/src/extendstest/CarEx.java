package extendstest;

public class CarEx {
    public static void main(String[] args) {
        // Car 인스턴스 생성
        // Car car = new Car() 직접적으론 안됨(abstract 때문)

        //TODO: 다형성을 이용한(자식) 인스턴스 생성은 가능
        Car car  = new SportsCar("포르쉐");
        car.drive();
        car.stop();
    }
}
