package classtest;

import javax.swing.plaf.TreeUI;

public class TvEx {
    public static void main(String[] args) {
        Tv tv = new Tv(); //초기화 상태
        
        //TODO: private 키워드가 붙은 경우, 외부에서 직접 호출 불가.
        // System.out.println("현재 채널 : " + tv.channel); // 세팅 전 기본값 : 0
        // System.out.println("현재 전원상태 : " + tv.power); // 세팅 전 기본값 : false
        // System.out.println("제조사 : " + tv.company); // 세팅 전 기본값 : null

        Tv tv2 = new Tv(7, true, "삼성"); // 순서대로 넘어감
        
        //TODO: 메소드 호출
        int channel = tv2.getChannel();
        System.out.println("현재 채널 : " + channel);
        
        tv2.channelUp();
        System.out.println("++현재 채널 : " + tv2.getChannel());

        // tv 전원 종료
        tv2.power();
        System.out.println("현재 파워 상태 : " + tv2.isPower());
        
        
                
    }






}
