package classtest;

import java.util.Arrays;
import java.util.Scanner;

public class AccountEx2 {
    //TODO: 멤버 변수
    static Account[] accounts = new Account[100]; // 지금은 100개의 null 만 있는 상태
    static Scanner sc = new Scanner(System.in); // 멤버변수로 선언하지 않는다면, 유효범위 때문에 매번 Scanner 를 추가해야 한다.


    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("=============================================================");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("=============================================================");
            System.out.println("메뉴 선택 >> ");

        // int menu = sc.nextInt(); //TODO: 메뉴선택시, 1 과 enter를 쳤는데 buffer 엔 1만 저장됨 -> 이후 enter 가 남아있어서 계좌번호 enter 이름 이 되어버림 => 넘어가버리는 문제
        int menu = Integer.parseInt(sc.nextLine());
        switch (menu) {
            case 1:
                // 계좌생성 메소드 호출
                createAccount();
                break;
            case 2:
                // 계좌 목록 조회 메소드 호출
                accountList();
                break;
            case 3:
                // 예금
                deposit();
                break;
            case 4:
                // 출금
                withdraw();
                break;
            case 5:
                run = false;
                System.out.println("프로그램 종료");
                break;
        
            default:
                System.out.println("메뉴 번호를 확인하시오");
                break;
        }
        }
        
    }

    static void createAccount(){
        // 계좌생성 담당 메소드
        // 계좌와 관련된 정보 입력받기 (계좌번호, 이름, 금액)
        System.out.println("계좌번호 >> ");
        String accountNo = sc.nextLine();
        System.out.println("이름 >> ");
        String owner = sc.nextLine();
        System.out.println("금액 >> ");
        int balance = Integer.parseInt(sc.nextLine());

        //TODO: accounts[특정 인덱스] = new Account("111-12-222", "성춘향", 10000);
            //배열 요소에서 빈 공간 찾아 채우기
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accountNo, owner, balance);
                System.out.println("계좌 생성이 완료되었습니다. \n");
                break;
            }
        }

    }
    static void accountList(){
        // 현재 생성된 계좌 목록 출력
        // accounts 배열 출력
        System.out.println("=======================================");
        System.out.println("계좌              이름        잔액");
        System.out.println("=======================================");
        
        //TODO: 방법1 복습하기♣♣♣♣ => Arrays.toString() 하면 "주소" 출력됨
        for (Account account : accounts){
            if (account != null) {
                    // System.out.println("계좌 번호 : " + account.getAccountNo() + "계좌주 : " + account.getOwner() + "금액 : " + account.getBalance());
                    System.out.printf("%s\t%s\t%d\n", account.getAccountNo(), account.getOwner(), account.getBalance());
                    System.out.println("계좌 조회가 완료되었습니다. \n");
                }
                break;
            }
        //TODO: 방법2 복습하기♣♣♣♣ => Arrays.toString() 하면 "주소" 출력됨
        // for (int i = 0; i < accounts.length; i++) {
        //     if (accounts[i] !=null) {
        //         System.out.println(accounts[i].getAccountNo());
        //         System.out.println(accounts[i].getOwner());
        //         System.out.println(accounts[i].getBalance());
        //     }
        // }
    }
    static void deposit(){
        // 예금하기
            // 계좌번호 와 예금액 입력받기
        System.out.println("계좌번호 >> ");
        String accountNo = sc.nextLine();
        System.out.println("예금액 >> ");
        int amount = Integer.parseInt(sc.nextLine());

        Account account = findAccount(accountNo);
        if (account != null) {
            account.deposit(amount);
            System.out.println("예금 완료되었습니다. 조회는 2번 버튼을 통해 하세요");
        }

        // ♣♣♣내 코드 (틀린거 위주로 복습하기)♣♣♣
        // for (Account account : accounts){
        //     if (account != null) {
        //         if (account.getAccountNo() == accountNo) { //TODO: String의 비교는 equals 쓰자♣♣♣
        //             System.out.println("계좌번호가 일치합니다");
        //             account.setBalance(amount);
        //             System.out.println(amount);
        //             break;
        //         }
        //     }
        // }
    }
    static void withdraw(){
        // 출금하기
            // 계좌번호 와 출금액 입력받기
        System.out.println("계좌번호 >> ");
        String accountNo = sc.nextLine();
        System.out.println("출금액 >> ");
        int amount = Integer.parseInt(sc.nextLine());

        Account account = findAccount(accountNo);
        if (account != null) {
            account.withdraw(amount);
            System.out.println("출금 완료되었습니다. 조회는 2번 버튼을 통해 하세요");
        }

    }

    static Account findAccount(String accountNo){
        // 배열요소에서 일치하는 계좌번호 찾기
        //일치하는 account 리턴
        for (Account account : accounts) {
            if (account != null) {
                if (accountNo.equals(account.getAccountNo())) { //TODO: String의 비교는 equals 쓰자♣♣♣
                    return account;
                }
                System.out.println("계좌번호가 일치하지 않습니다.");
            }
        }
        return null;
    }

}
