package extendstest;

public class CaptionEx {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();

        // 채널, 색상, 전원여부
        cTv.setChannel(11);
        cTv.setColor("Black");
        cTv.power();

        cTv.channelUP();
        System.out.println("현재 채널 + " + cTv.getChannel());
        cTv.displayCaption("안녕하세요");

    }
}
