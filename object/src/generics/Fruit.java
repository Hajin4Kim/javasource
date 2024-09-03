package generics;

public class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }


}

class Apple extends Fruit{
    @Override
    public String toString() {
        return "APPLE";
    }
}
class Grape extends Fruit{
    @Override
    public String toString() {
        return "Grape";
    }
}

class FruitBox<T extends Fruit> extends Box3<T>{
// 제한된 지네릭 클래스
}

class Juice {
    String name;

    Juice(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

class Juicer { // 특정 과일 박스를 건네면 해당 박스 안에 있는 '과일' 들을 주스로 만들어주는 메소드
    static Juice makeJuice(FruitBox<? extends Fruit> box){
        String tmp = "";
        for(Fruit f : box.getList()){
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}
class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}