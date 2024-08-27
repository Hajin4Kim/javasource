package extendstest;

public class CaptionTv extends Tv {
//2) Tv상속 + 추가된 기능 정의
    private boolean caption;
    void displayCaption(String text){
        if (caption) {
            System.out.println(text);
        }
    }

    public boolean isCaption(){
        return caption;
    }
    public void setCaption(boolean cpation){
    this.caption = caption;
        
    }
    
}


