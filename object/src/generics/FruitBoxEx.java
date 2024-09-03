package generics;

public class FruitBoxEx {
    public static void main(String[] args) {
        //TODO: = 우측은 생략 가능 *어차피 <Fruit> 이기 때문
        Box3<Fruit> fruitBox = new Box3<>(); 
        Box3<Apple> appleBox = new Box3<>();
        // Box3 grapeBox = new Box3<>();
        Box3<Toy> toyBox = new Box3<>();

        //부모타입 선언 = 자식 포함 가능 Fruit : Fruit + Apple + Grape
        // Apple : Apple
        // Toy : Toy

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);

        //TODO: 제한된 지네릭 클래스
        FruitBox<Fruit> fruitBox2 = new FruitBox<>();
        FruitBox<Apple> appleBox2 = new FruitBox<>();
        FruitBox<Grape> grapeBox2 = new FruitBox<>();
        // T extends Fruit : Fruit 혹은 Fruit 를 상속받은 클래스
        // FruitBox<Toy> toyBox2 = new FruitBox<>(); //Bound mismatch: The type Toy is not a valid substitute for the bounded parameter <T extends Fruit> of the type FruitBox<T>

        fruitBox2.add(new Fruit());
        fruitBox2.add(new Apple());
        fruitBox2.add(new Grape());

        System.out.println(Juicer.makeJuice(fruitBox2));

        appleBox2.add(new Apple());
        //TODO: <Fruit> 와 완전히 일치해야만 가능; 자식인 Apple 도 불가
        // 오버로딩 개념도 통하지 않음
        // < ? extends Fruit> 로 와일드카드 타입 사용하면 가능해짐
        System.out.println(Juicer.makeJuice(appleBox2));

        grapeBox2.add(new Grape());



    }   
}
