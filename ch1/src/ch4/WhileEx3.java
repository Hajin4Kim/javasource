package ch4;

public class WhileEx3 {
    public static void main(String[] args) {
        
        
        while (true) {
            // 주사위 2 개를 굴려 두개의 합이 5와 같으면 반복문 종료
            int dice1 = (int)(Math.random() * 6 )+ 1;
            int dice2 = (int)(Math.random() * 6 )+ 1;
            
            if (dice1 + dice2 == 5) {
                System.out.printf("주사위1의 값: %d + 주사위2의 값: %d = %d\n", dice1, dice2, (dice1 + dice2));
                System.out.println("주사위 합이 5 이므로 굴리기를 멈춥니다.\n");
                break;
            }
            System.out.printf("주사위1의 값: %d + 주사위2의 값: %d = %d\n", dice1, dice2, (dice1 + dice2));
            
        }
    }
}
