package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 배열(array) : 같은 타입의 여러 변수를 하나의 묶음으로 다루기
        // 배열 선언 int[] mathScore;
        // 배열 생성 new int[10];
        // 배열 초기화 mathScore[0] = 88;

        // 10명의 수학 점수를 관리하는 프로그램
        
        int[] mathScore = new int[10];
        mathScore[0] = 88;
        mathScore[1]=78;
        mathScore[2] = 66;
        
        System.out.println("학생 1번의 수학 점수 : " + mathScore[0]);
        System.out.println("학생 2번의 수학 점수 : " + mathScore[1]);
        System.out.println("학생 3번의 수학 점수 : " + mathScore[2]);
        
    }
}
