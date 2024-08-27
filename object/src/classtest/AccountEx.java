package classtest;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("101-11-12345", "홍길동", 0);

        // 예금하다
        account.deposit(100000);
        // 잔액 조회
        System.out.println("입금 후 현재 잔액 : " + account.getBalance() + " 원");
        // 출금하다
        int balance = account.withdraw(50000);
        if (balance == -1) {
            System.out.println("잔액이 부족합니다");
        } else {
            // System.out.println("계좌번호 : " + +"계좌주 : " + + "잔액 : " + );
            System.out.println("출금 후 현재 잔액 : " + balance + " 원");
        }
        
    //TODO: 대문자 =>> "주소" 넘어감 / 소문자 => "값" 넘어감
        printAccount(account);
    }

    //TODO: 대문자 =>> "주소" 넘어감 / 소문자 => "값" 넘어감
    static void printAccount(Account account) {

    }

}
