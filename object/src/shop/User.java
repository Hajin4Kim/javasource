package shop;

public class User {
    // 이름, 지불방법(CARD, CASH)
    private String name;
    private PayType payType; // PayType enum 에 정해놓은대로

    public User(String name, PayType payType) {
        this.name = name;
        this.payType = payType;
    }

    public String getName() {
        return name;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

}
