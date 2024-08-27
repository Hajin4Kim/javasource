package classtest;

public class CarEx {
    public static void main(String[] args) {
        //TODO: 객체 생성
        Car car = new Car();
        printCar(car); //TODO:parameter 에 car넣기 (변수 선언되는 위치가 다르므로)
        

        // 속성은 변경 가능
        car.company = "현대";
        car.color = "white";
        car.maxSpeed = 200;
        car.model = "소나타";

        printCar(car);

        car.forward();
        car.backward();
        //TODO: NullPointerException 뜨면=> new 아직 안한 상황 인지하기
        Car cars[] = new Car[2];
        // System.out.println(cars[0].color); //NullPointerException: 객체에 값이 아직 할당되지 않았을 때 에러코드: Cannot read field "color" because "cars[0]" is null

        // String 초기화
            //String str = "" / String str = null
        String str = ""; // 빈 문자열
        System.out.println(str.length()); //NullPointerException
    }

    static void printCar(Car car){ //TODO: 같은 타입 Car로 받기 (변수 선언되는 위치가 다르므로)
        // car => 멤버변수, 메소드 접근 가능해짐
        System.out.println("제조사 : " + car.company); //null 
        //TODO: 초기 값이 대문자 로 셋팅된 애들은 대부분 null 이 나옴 (예. String)
        System.out.println("모델 : " + car.model);  //null
        System.out.println("색상 : " + car.color); //null
        System.out.println("최대속력 : " + car.maxSpeed); //0
    }
}
