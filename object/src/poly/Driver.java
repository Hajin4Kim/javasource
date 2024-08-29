package poly;

public class Driver {
    void drive(Vehicle v){ //TODO: 부모 상속 다형성
        // Vehicle v = new Bus();
        // v가 접근할 수 있는 범위 제한됨

        // 상속 시 메소드 오버라이딩을 하면 부모메소드는 가려지고, 자식메소드만 실행된다(일반적인경우)
        v.run(); //상속관계: 버스, 택시, 차량 모두 실행됨 (다형성)

    }
}
