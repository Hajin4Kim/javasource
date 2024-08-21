package ch3;

public class IfEx2 {
    public static void main(String[] args) {
        //임의로 1 ~ 6 사이의 숫자 생성 //그냥 Math.random 결과는 double, 고로 앞에 (int) 해주고, 바뀐 값에 
        // System.out.println((int)Math.random()*6);

        int random = (int)(Math.random() * 6) + 1;
        System.out.println(random);

        if (random == 1) {
            System.out.println("주사위 눈 1 나옴");
        } else if (random == 2) {
            System.out.println("주사위 눈 2 나옴");
        }else if (random == 3) {
            System.out.println("주사위 눈 3 나옴");
        }else if (random == 4) {
            System.out.println("주사위 눈 4 나옴");
        }else if (random == 5) {
            System.out.println("주사위 눈 5 나옴");
        }else if (random == 6) {
            System.out.println("주사위 눈 6 나옴");
        }
    }
}
