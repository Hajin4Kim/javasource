package extendstest;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("111", "홍길동", 1000000, "222-22");

        // 입금하다 (Account.java)
        checkingAccount.deposit(100000);
        System.out.println("현재 잔액 : " + checkingAccount.getBalance());
        
        // 사용 금액을 지불한다 
        // pay(){} 메소드 생성 => 사용금액, 카드번호 받기
        int balance = checkingAccount.pay("222-22", 20000);
        System.out.println("현재 잔액 : " + balance);
        
        CreditLineAccount creditLineAccount = new CreditLineAccount("333-33", "현빈", 10000);
        System.out.println("마이너스 통장 계좌잔액 확인 : "+ creditLineAccount.getBalance()); 

        balance = creditLineAccount.withdraw(4000000);
        System.out.println("현재잔액 : " + balance);

        System.out.println("=================================");
        BonusPointAccount bonusPointAccount = new BonusPointAccount("444-55", "김지수", 10000);
        System.out.println("현재 보너스 점수 : " + bonusPointAccount.getBonusPoint());
    
        bonusPointAccount.deposit(2000000);
        System.out.println(" 현재 잔액 : " + bonusPointAccount.getBalance());
        System.out.println("현재 보너스 점수 : " + bonusPointAccount.getBonusPoint());
        
        System.out.println("=================================");
        CheckingTrafficCardAccount cardAccount = new CheckingTrafficCardAccount("555-66", "김수용", 100000, "333-33");
        System.out.println(cardAccount.isHasTrafficCard() ? "교통카드 기능 있음" : "교통카드 기능 없음");
        
        // 교통카드 기능 추가
        cardAccount.setHasTrafficCard(true);
        
        // 교통비 지불
        balance = cardAccount.payTrafficCard("333-33", 2400);
        if (balance == -1) {
            System.out.println("교통카드 기능이 없습니다");
        }else{
            System.out.println("교통비 지불 후 잔액 : " + balance);
        }
        
    }
}
