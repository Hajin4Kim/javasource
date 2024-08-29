package inter;

public interface PlayingCard {

    //일반 멤버변수 선언 불가 : Illegal modifier for the interface field PlayingCard.name; only public, static & final are permitted
    // private String name;
    
    // 상수만 가능
    public static final int SPADE = 4;
    //TODO: public static final 필수가 아님 => 무조건 상수만 가능하기 때문에 생략 가능
    int DIAMOND = 3;
    static int HEART = 2;
    final int CLOVER = 1;

    
    // interface 내에서;
    //TODO: abstract 키워드 필수 아님 => 모든 메소드가 추상이기 때문
    String getCardNumber();

    // 일반 메소드 선언 불가
    // void method1(){} 
    
    // default, static 붙인 메소드는 가능
    default void method1(){} //TODO: default method는 가능하다 => 일반 메소드처럼 사용 가능
    static void method2(){} 








}
