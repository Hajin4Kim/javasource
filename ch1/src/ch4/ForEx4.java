package ch4;

public class ForEx4 {
    public static void main(String[] args) {
        // 중첩 for
        // for문 안에 또 다른 for 문 포함 (중첩횟수제한은없음)

        /*
            **********
            **********
            **********
         */
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 11; j++) {
                // col 에서 반복되는 코드
                System.out.print("*");
                
            }
            System.out.println();
        }

        /*
            *
            **
            ***
            ****
            *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // for 동작 단계
        // ① int i = 0; 실행
        // ② i<2; 실행
        // ③ for 내부진입
        // ④ int j = 0; 실행
        // ⑤ j < 2; 조건 검사
        // ⑥ 안쪽 for 구문 실행
        // ⑦ j++; j < 2; true 라면 다시 안쪽 for 구문 실행
        // ⑧ j = 2 가 되면서 false 상태일 때 안쪽 for 구문 종료
        // ⑨ i++; => i < 2 true 라면 다시 안쪽 for 구문 실행
        // ⑩ ④~⑧ 반복
        // ⑪ i = 2 가 되면 이중for문은 종료

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                
            }
        }
        
        
    }
}
