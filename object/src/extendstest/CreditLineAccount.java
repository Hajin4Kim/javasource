package extendstest;


// 은행계좌 + 마이너스 가능한 계좌
public class CreditLineAccount extends Account {

    private int creditLine; // 마이너스 한도

    public CreditLineAccount(String accountNo, String owner, int balance) {
        super(accountNo, owner, balance); //TODO: 부모의 생성자 호출 : 무조건 첫 줄 위치해야 한다
        this.creditLine = creditLine;
    }

    @Override
    public int withdraw(int amount) {
        if (getBalance() + creditLine < amount) {
            
        }
        //잔액 + 마이너싀 한도 = 사용금액
        if (getBalance() + creditLine < amount) {
            return -1;
        }   
        setBalance(amount);
        return getBalance();
        }
        public int getCreditLine(){
            return creditLine;
        }    
        
        
    
}
