package inter;

public interface RemoteControl {
    // public static final 항상 붙어있는 상황: (생략가능해서안쓴거)
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute){
        if (mute) {
            System.out.println("무음처리");
        }else{
            System.out.println("무음해제");

        }
    }

    static void changeBattery(){
        System.out.println("건전지 교체");
    }


}
