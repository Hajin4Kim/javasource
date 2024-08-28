package extendstest;
// 은행 계좌
// 체크카드 기능 추가 ( 기존 클래스의 확장: 상속의 개념으로)
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

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }
    public int getBalance(){
        return balance;
    }


    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }


    public void setOwner(String owner) {
        this.owner = owner;
    }


    public void setBalance(int balance) {
        this.balance = balance;
        CreditLineAccount creditLineAccount = new CreditLineAccount("333-33" , "현빈", balance);
        
        System.out.println("마이너스 통장 계좌 잔액 확인: " + creditLineAccount);
    }


    








}




