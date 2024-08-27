package extendstest;

public class Tv {
//     캡션기능이추가된Tv클래스 정의
// 1) CaptionTv 새롭게 정의: Tv+Caption
// 2) Tv상속 + 추가된 기능 정의
    private String color; 
    private int channel;
    private boolean power;

    public void power() {
        this.power = !this.power;
    }

    public void channelUP() {
        this.channel++;
    }
    public void channelDown() {
        this.channel--;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel < 0 || channel > 100) {
            return;
        }
        
        this.channel = channel;
    }

    public boolean isPower() {
        // boolean 타입인 경우는 get쓰지 않고 is 사용
        return power;
    }

    
}
