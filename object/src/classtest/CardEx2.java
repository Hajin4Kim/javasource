package classtest;

import java.util.Arrays;

public class CardEx2 {
    public static void main(String[] args) {
        // Card  인스턴스를 10 개 생성해야 한다면?
        //Card card1 = new Card("spade", 1); // 이렇게 10개 만드는건 무리

        // 일반 배열
        // int arr [] = new int[10];
        // System.out.println(Arrays.toString(arr));
        // arr[0] = 15;
        // arr[1] = 20;
        // arr[2] = 30;
        // System.out.println(Arrays.toString(arr));
        int arr[] = { 15, 20, 30};
        System.out.println(Arrays.toString(arr));
        
        //TODO:객체 배열
        // Card cards[] = new Card[3];
        // 초기화 안했을때 null 값으로 나옴
        // System.out.println(Arrays.toString(cards));
        // cards[0] = new Card("spade" , 1);
        // cards[1] = new Card("heart" , 1);
        // cards[2] = new Card("diamond" , 1);
        // System.out.println(Arrays.toString(cards));

        //TODO: 객체는 무조건 new 로 담아야함 배열에 : 이 폼 쓰던가1
        // Card card1 = new Card("spade", 1);
        // Card card2 = new Card("heart", 1);
        // Card card3 = new Card("diamond", 1);

        //TODO: 객체는 무조건 new 로 담아야함 배열에: 이 폼 쓰던가2
        Card cards[] = {
            new Card("spade", 1),
            new Card("heart", 1),
            new Card("diamond", 1),
        };

        for (Card card : cards) {
            System.out.println("kind : " + card.getKind() + ", number : " + card.getNumber());
        }
        
        
        
        
        
        
    }
}
