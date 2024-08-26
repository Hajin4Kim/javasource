package classtest;

public class Account {
    private String accountNo;// 계좌번호(accountNo) : 101-11-12345
    private String owner;// 계좌주 (owner) : 홍길동
    private int balance;// 잔액(balance) : 10000000

    public Account(String accountNo, String owner, int balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    // 기능
    // 예금(deposit)
    public void deposit(int amount) {
        // 잔액 = 잔액 + 예금
        // return 없음
        balance += amount;
        System.out.println();
    }

    // 출금(withdraw)
    public int withdraw(int amount) {
        // 잔액 = 잔액 - 출금
        // 잔액 return
        if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
            return -1;
        }else {
            balance -= amount;
            return balance;
        }
    }

    public int getBalance(){
        return balance;
    }

}
