package classtest;

public class Time {
    // 속성: 시(int), 분(int), 초 (float)
    private int hour;
    private int minute;
    private float second;
    

    // 생성자 constructor
    // public Time(int hour, int minute, float second) {
    //     this.hour = hour;
    //     this.minute = minute;
    //     this.second = second;
    // }

    // getter 메소드
    public int getHour() {
        return hour;
    }
    public int getminute() {
        return minute;
    }
    public float getsecond() {
        return second;
    }

    // setter 메소드
    public void setHour(int hour) {
        if (hour < 0  || hour > 23) {
            return;
        }
        this.hour = hour;
    }
    public void setminute(int minute) {
        if (minute < 0  || minute > 59) {
            return;
        }
        this.minute = minute;
    }
    public void setsecond(float second) {
        if (second < 0  || second > 59) {
            return;
        }
        this.second = second;
    }
    @Override
    public String toString() {
        return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
    }
    

}
