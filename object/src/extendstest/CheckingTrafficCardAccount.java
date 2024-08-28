package extendstest;

// 은행계좌 와 직불카드 (부모 CheckingAccount)  + 교통카드 (자식자신)
public class CheckingTrafficCardAccount extends CheckingAccount {

    // 교통카드 기능 여부 (True 인 경우만 교통카드 기능 탑재)
    private boolean hasTrafficCard;


    public CheckingTrafficCardAccount(String accountNo, String owner, int balance, String cardNo) {
        super(accountNo, owner, balance, cardNo);
    }
    public CheckingTrafficCardAccount(String accountNo, String owner, int balance, String cardNo, boolean hasTrafficCard) {
        super(accountNo, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }
    
    public boolean isHasTrafficCard() { // boolean 타입의 경우, get 이 아니고 is 로 시작하는 이름임
        return hasTrafficCard;
    }

    // hasTrafficCard 값 변경 메소드 필요 => 교통카드 기능 뺐다 추가했다 하기
    // setter 메소드명 또는 change~~ 
    public void setHasTrafficCard(boolean hasTrafficCard) {
        this.hasTrafficCard = hasTrafficCard;
    }

    // 교통비 지급
    int payTrafficCard(String cardNo, int amount){
        // 교통카드 기능 여부 확인 (=> 없는경우 Back)
        if (!hasTrafficCard) {
            System.out.println("교통카드 기능이 없습니다");
            return -1;
        }
        // 교통비 카드 기능 있다면, 카드번호 확인, 잔액 확인 후 교통비 지불 & 남은 잔액 return
        //TODO: 해당 기능이 있는 부모; CheckingAccount.java 의 pay()를 호출
        return pay(cardNo, amount);

        
    }




}
