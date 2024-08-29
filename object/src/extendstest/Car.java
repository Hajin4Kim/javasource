package extendstest;

public abstract class Car { //TODO: 추상클래스 abstract
    //멤버변수
    private String name;

    public Car(String name) {
        this.name = name;
    }

    //추상메소드
    abstract void drive(); //return 필요없음

    // 일반메소드
    void stop(){
        System.out.println(name + " 자동차를 멈춥니다");
    }
}
