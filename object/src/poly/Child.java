package poly;

public class Child extends Parent {

    String name;

    void play(){
        System.out.println("놀자!!!!!!");
    }

    @Override
    void print() {
        super.print(); //TODO: super = (가려지는 )부모의 print 메소드 호출 가능하게하는 코드
        System.out.println("자식 메소드");
    }
}
