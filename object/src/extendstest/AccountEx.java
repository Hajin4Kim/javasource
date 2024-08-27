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
        
        
    }
}
