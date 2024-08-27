package extendstest;

import java.util.Scanner;

// 은행 계좌 +  직불카드
public class CheckingAccount extends Account {

    private String cardNo;

    // TODO: 부모 생성자 가져오는 건 필수
    public CheckingAccount(String accountNo, String owner, int balance, String cardNo) {
        super(accountNo, owner, balance);
        this.cardNo = cardNo;
    }

    // 사용 금액을 지불한다
    // int pay(){} 메소드 생성 => 사용금액, 카드번호 받기
    // checkingAccount.pay("222-22", 20000);
    // 카드번호 일치 시 금액 인출

    
    int pay(String cardNo, int amount) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("카드번호 입력 >> ");
        // cardNo = sc.nextLine();

        // System.out.println("사용금액 입력 >> ");
        // amount = sc.nextInt();

        if (!cardNo.equals(this.cardNo)) {
            return -1;
        }
        System.out.println("카드 번호가 일치하지 않습니다");

        //일치 시 금액 인출
        // 잔액 = 잔액 - 사용액;
        // balance = super.getBalance() - amount; //TODO: setter 가 필요한 상황
        return super.withdraw(amount);

    }

}
