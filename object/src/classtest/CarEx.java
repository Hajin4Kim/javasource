package classtest;

public class CarEx {
    public static void main(String[] args) {
        //TODO: 객체 생성
        Car car = new Car();

        // car => 멤버변수, 메소드 접근 가능해짐
        System.out.println("제조사 : " + car.company); //null 
        //TODO: 초기 값이 대문자 로 셋팅된 애들은 대부분 null 이 나옴 (예. String)
        System.out.println("모델 : " + car.model);  //null
        System.out.println("색상 : " + car.color); //null
        System.out.println("최대속력 : " + car.maxSpeed); //0

        // 속성은 변경 가능
        car.company = "현대";
        car.color = "white";
        car.maxSpeed = 200;
        car.model = "소나타";
        System.out.println("모델 : " + car.model);  //null
        System.out.println("모델 : " + car.model);  //null
        System.out.println("색상 : " + car.color); //null
        System.out.println("최대속력 : " + car.maxSpeed); //0";

        car.forward();
        car.backward();
        
        
        
    }
}
