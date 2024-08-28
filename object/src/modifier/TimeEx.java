package modifier;

// java.lang 패키지는 기본 import 되어있어 => import 구문 필요 X
import static java.lang.Math.*; // Math 클래스

public class TimeEx {
    public static void main(String[] args) {
        // The constructor Time() is not visible
        // Time time = new Time();

        Time time1 = new Time();
        Time time2 = new Time();
        System.out.println(time1 == time2); // false

        //TODO: 싱글톤 패턴
        // SingleTon singleTon = new SingleTon();
        //TODO: private =>  인스턴스를 하나만 생성
        SingleTon singleTon1 = SingleTon.getInstance(); //static 이니까, 클래스명.~~ 으로 호출
        SingleTon singleTon2 = SingleTon.getInstance(); //static 이니까, 클래스명.~~ 으로 호출
        System.out.println(singleTon1 == singleTon2); // true

        // 0 <= x < 1
        // java.lang.Math
        // Math : 생성자는 private / 멤버변수와 메소드가 static 상태
        System.out.println(Math.random());
        System.out.println(Math.PI);
        //TODO: static import 한 후 => Math 키워드 떼고 쓰기 가능 
        System.out.println(PI); 
        System.out.println(round(1.5));

        Card card = new Card("HEART", 2);
        System.out.println("numer " + card.NUMBER);
        // NUMBER 또는 KIND 변경 
        // The final field Card.NUMBER cannot be assigned
        // card.NUMBER = 15; // final 변수 변경 불가
    }
}
