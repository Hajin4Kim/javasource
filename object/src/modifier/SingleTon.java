package modifier;

public class SingleTon {

    private static SingleTon singleTon = new SingleTon();

    private SingleTon(){ // new 할때마다 새로운 singleton 객체가 생성되기 때문에 => 인스턴스 하나만 생성하도록 제한
    }

    public static SingleTon getInstance(){
        return singleTon;
    }
}
