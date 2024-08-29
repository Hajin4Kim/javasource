package shop;

import java.util.Scanner;

public class MyShop implements IShop {

    private String title;

    // User 배열 생성
    User users[] = new User[2];

    // 상품 배열 생성
    Product[] products = new Product[5];
    
    // 장바구니 배열 생성
    Product[] cart = new Product[10];

    // 밖에 선언해야 여기저기서 사용 가능
    Scanner sc = new Scanner(System.in);

    // 선택된 user 의 index 보관
    private int selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // user 2명 임의로 생성 후 users[] 배열에 담기
        users[0] = new User("홍길동", PayType.CARD);
        users[1] = new User("성춘향", PayType.CASH);
    }

    @Override
    public void genProduct() {
        // CellPhone, SmartTv 5개 생성 후 product[] 배열에 담기
        products[0] = new CellPhone("iphone 13", 150, "KT");
        products[1] = new CellPhone("galaxy note 13", 120, "SKT");
        products[2] = new CellPhone("galaxy z filp", 130, "LG");
        products[3] = new SmartTv("samsung ultra HD", 180, "4K");
        products[4] = new SmartTv("LG smart", 140, "1080");

    }    

    @Override
    public void start() {
        // 출력
        // MyShop : 메인화면 - 계정선택 (users 배열 사용)
        // ============================
        // [1] 길동(CARD)
        // [2] 춘향(CASH)
        // [X] 종료
        // 선택 >>
        System.out.println(title + " : 메인화면 - 계정선택");
        System.out.println("============================");

        for (int i = 0; i < users.length; i++) {
            System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());
        }
        System.out.println("[X] 종료");
        System.out.println("선택 >> ");
        // 사용자 입력 1,2,X 중 받기
        // 사용자 입력이 1,2 인 경우, productList() 호출
        // 사용자 입력이 X 인 경우: System.exit(0);
        String input = sc.nextLine();

        switch (input) {
            case "1":
            case "2":
            // 배열 index 와 동일하도록 -1
                selUser = Integer.parseInt(input) - 1;
                productList();
                break;
            case "X" :
            case "x" :
                System.exit(0);
                break;
            default:
                System.out.println("입력을 확인해 주세요");
                start();
                break;
        }

    }

    public void productList() {
        // 출력
        // MyShop : 상품목록 - 상품선택 (products 배열 사용)
        // ============================
        // [1] 상품 ...
        // [2] 상품 ...
        // [..5] 상품 ...
        // [h] 메인화면
        // [c] 체크아웃
        // 선택 >>
        System.out.println(title + " : 상품목록 - 상품선택");
        System.out.println("============================");
        
        int i = 0;
        for (Product product : products) {
            System.out.printf("[%d]", i++);
            product.printDetail();            
        }
        // 메뉴 받기
        // 0~4 or h or c
        // h: 메인화면 - 계정선택 호출
        // c: checkOut() 호출
        // 0~4 중 입력받으면 cart[10 개 공간 만들기] 에 담기 (c 누르기 전까지 계속)
        System.out.println("메뉴 선택 >> ");
        String input = sc.nextLine();

        switch (input) {
            case "0": case "1": case "2": case "3": case "4":
                System.out.println("Cart 에 담기");
                for (int j = 0; j < cart.length; j++) {
                    if (cart[j] == null) { // 배열의 빈 곳 찾기
                        cart[j] = products[Integer.parseInt(input)]; // product의 []째 제품찾으면 cart[j] 에 넣기
                        break;
                    }
                }
                productList();
                break;
            case "h" :
                System.out.println("[h] 메인화면");
                start();
                break;
            case "c" :
                System.out.println("[c] 체크아웃");
                checkOut();
                break;
            default:
                System.out.println("입력을 확인해 주세요");
                productList();
                break;
        }
    }

    public void checkOut(){
        // 최종: cart 화면 출력
        System.out.println();
        System.out.println(title + " - " + users[selUser].getName() +" : 체크아웃");
        System.out.println("============================");

        int i = 0, sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s (%d) \n", i++, product.getpName(), product.getPrice());
                sum += product.getPrice();
            }
        }
        
        // 결제 방법 : CARD or CASH
        System.out.println("결제 방법: " + users[selUser].getPayType());
        // 합계: 카트에 담긴 물건
        System.out.println("합계: " + sum);
        // [p] 이전
        System.out.println("[p] 이전");
        // [q] 결제완료
        System.out.println("[q] 결제완료");

        // 입력값에 따라
            // p : 상품목록 화면 보여주기
            // q : 종료
        String input = sc.nextLine();

        switch (input) {
            case "p" :
                System.out.println("[p] 이전");
                productList();
                break;
            case "q" :
                System.out.println("[q] 결제완료");
                System.exit(0);
                break;
            default:
                System.out.println("입력값을 확인해 주세요");
                checkOut();
                break;
        }
    }
}

