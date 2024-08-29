package inter;

public class Audio implements RemoteControl {
// TODO: 무조건 오버라이드! 안하면 에러

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio 를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = (RemoteControl.MAX_VOLUME);
        }else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = (RemoteControl.MIN_VOLUME);
        }else{
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + volume);
    }

}
