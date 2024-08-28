package poly;

public class CarEx {
    public static void main(String[] args) {
        Car car = null;

        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water(); // FireEngine.java 

        car = fe; // Car car = new FireEngine();
        // car.water(); (안됨)

        //TODO: 조상타입은 자손타입으로 강제 형변환
        fe2 = (FireEngine)car;
        fe2.water();

        Car car2 = new Car(); //처음부터 new Car 인데 아예 FireEngine 으로 바꾸지 못한다 => 에러 발생 //TODO: 처음에 담긴거 자체가 Car(심지어 부모) 
        //TODO: ClassCastException (실행 시, 런타임 오류 발생) : instanceof 연산자 사용하여 오류 잡기
        if (car2 instanceof FireEngine) { //TODO: 이렇게 예외를 잡아놔야 함
            fe = (FireEngine)car2;
            fe.drive();
        }
        if (car2 instanceof Car) {
            
        }
        
        
    }
}
