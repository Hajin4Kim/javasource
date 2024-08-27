package classtest;

public class AccountEx3 {
    public static void main(String[] args) {
        Account2 account2 = new Account2("111", "홍길동", 100000);
        System.out.println(account2); //TODO: 그냥 찍으면 주소나옴 output: classtest.Account2@5ca881b5
        
        //TODO: Account2.java 에서 toString() 오버라이딩 후 
            // : Account2 [accountNo=111, owner=홍길동, balance=100000]

        Account2 accounts[] = new Account2[2];
        accounts[0] = new Account2("111", "홍길동", 100000);
        accounts[1] = new Account2("222", "성춘향", 200000);

        for (Account2 account22 : accounts) {
            System.out.println(account22);
        }
        
    }
    
}
