package extendstest;

public class CaptionTv2 extends Tv2 {
//TODO:생성자: 묵시적(Implicit) => default / 명시적 (Explicit) 

    private boolean caption;
    //Implicit super constructor Tv2() is undefined for default constructor. 
    //Must define an explicit constructor

    // public CaptionTv2(){
    //     super(); //TODO: 부모의 default 생성자 호출
    // }

    public CaptionTv2(String color, int channel, boolean power, boolean caption) {
        super(color, channel, power); //부모 생성자
        this.caption = caption; //자식나자신 생성자
    }

    void displayCaption(String text){
        if (caption) {
            System.out.println(text);
        }
    }

    public boolean isCaption(){
        return caption;
    }
    public void setCaption(boolean caption){
        this.caption = caption;
        
    }
    
}

