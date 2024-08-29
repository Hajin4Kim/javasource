package poly;

public class Buyer {
    int money = 1000; // 고객이 가지고 있는 돈
    int bonusPoint = 0;

    //TODO: 구입한 제품을 저장하기 위한 배열 (장바구니)

    // Computer computers[] = new Computer[3]; //TODO: 상속의 개념을 사용해, 이런 개별로 생성하지 않고,
    // 부모로
    // Air airs[] = new Air[3];
    Product[] products = new Product[10];
    int i = 0;

    // Product p = new Computer();
    // Product p = new Air();
    void buy(Product p) { // TODO: 다형성: 부모-자식 으로 : ProductEx.java에 넘기기
        // money 보다 물건의 가격이 적은지 확인
        if (money < p.price) {
            System.out.println("잔액 부족으로 물건 구입 불가.");
            return;
        }
        // money - 물건가격 = 현재 money
        money -= p.price;
        // 보너스포인트 += 구입 가격에 따른 포인트
        bonusPoint += p.bonusPoint;
        products[i++] = p; // TODO: 장바구니에 담기
        System.out.println(p + " 을/를 구입하셨습니다.");
    }

    // void buy(Air air){ //TODO: 같은 형태의 객체가 여러 개 중복되어 생기면 너무 코드가 지저분해진다 위의 방법으로 해,
    // 공통으로 처리한다.
    // // money 보다 물건의 가격이 적은지 확인
    // if (money < air.price) {
    // System.out.println("잔액 부족으로 물건 구입 불가.");
    // return;
    // }
    // // money - 물건가격 = 현재 money
    // money -= air.price;
    // // 보너스포인트 += 구입 가격에 따른 포인트
    // bonusPoint += air.bonusPoint;
    // System.out.println(air + " 을/를 구입하셨습니다.");
    // }

    void summery(){
        // 구매한 물품에 대한 정보 출력
        int sum = 0;
        String itemList = "";
        for (Product product : products) {
            if (product != null) {
                sum += product.price;
                itemList += product + ", "; //TODO: 주소 => 문자열로 변환 일어남
            }
        }
            // 구입한 물품의 총 금액은 ~~ 만원 입니다.
            System.out.printf( "구입한 물품의 총 금액은 %d 만원 입니다.\n" , sum);
            // 구입한 제품은 Computer ~~, Air ~~ 입니다.
        System.out.printf( "구입한 제품 금액은 %s 만원 입니다.\n", itemList);

    }
}
