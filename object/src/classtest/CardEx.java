package classtest;

public class CardEx {
    public static void main(String[] args) {

        // TODO: 클래스 변수: 클래스가 메모리에 올라갈 때 이미 로드가 된 상태이므로 인스턴스 생성되기 전에도 부를 수 있음 (private 가
        // 아닌 이상)
        System.out.println("카드 width : " + Card.width);
        System.out.println("카드 height : " + Card.height);

        // 인스턴스 생성 되는 구문
        Card card1 = new Card("Heart", 7);
        System.out.println("card1 kind : " + card1.getKind() + " card1 number : " + card1.getNumber());

        Card card2 = new Card("Spade", 4);
        System.out.println("card2 kind : " + card2.getKind() + " card2 number : " + card2.getNumber());

        Card.width = 150;
        Card.height = 300;
        System.out.println("카드 width : " + Card.width);
        System.out.println("카드 height : " + Card.height);
        // Cannot make a static reference to the non-static method
        firstMethod();

        CardEx obj = new CardEx();
        obj.secondMethod();

    }

    // TODO: non static method : 생성 시기가 다름
    static void firstMethod() {
        
    }

    void secondMethod() {

    }

}
