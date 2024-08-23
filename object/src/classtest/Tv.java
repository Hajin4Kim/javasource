package classtest;

// 속상 = > 변수
public class Tv {
    private int channel;// 채널    :번호
    private boolean power;// 전원여부 / 켜진지 꺼진지) : trure(ob) / false(off*)
    private String company; // 제조사 ; 삼성, LG

    // 생성자
        // 클래스 이름() {}
        //TODO: 생성자 오버로딩 (하나의 클래스에 여러 개의 생성자가 존재)
    Tv(){ //TODO: default 생성자 => 중괄호 말고, 괄호 안에 아무것도 없는 생성자 
    }
    Tv(int channel, boolean power, String company){
        this.channel = channel;
        this.power = power;
        this.company = company;
    }

    
    // 전원 킨다, 끝다 
    void power() {
        this.power = !this.power;
    }
    // 채널 올린다 내린다
    // TODO: void => return 없음. "호출" 만 가능하다
    void channelUp(){
        this.channel++;
    }
    void channelDown(){
        this.channel--;
    }

    //TODO: getter 메소드 => get로 시작하는 메소드
    public int getChannel() {
        //TODO: channel 값 보낸다는 뜻
        return channel;
    }
    public String getCompany() {
        return company;
    }
    public boolean isPower() {
        return power;
    }

    //TODO: setter 메소드 => set로 시작하는 메소드
}
