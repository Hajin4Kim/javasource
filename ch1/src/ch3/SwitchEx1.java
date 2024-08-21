package ch3;

public class SwitchEx1 {
    public static void main(String[] args) {

        // switch (char or String or int) { // if~else if ~ else 구문 대체
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }

        int random = (int)(Math.random()*6 ) + 1;
        switch (random) {
            case 1:// random == 1
                System.out.println("주사위 1입니다");
                break;
            case 2:
                System.out.println("주사위 2입니다");
                break;
            case 3:
                System.out.println("주사위 3입니다");
                break; 
            case 4:
                System.out.println("주사위 4입니다");  
                break;  
            case 5:
                System.out.println("주사위 5입니다");
                break;
            case 6:
                System.out.println("주사위 6입니다");
                break;

            default:
                break;
        }
    }
}
