package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] scores = {79, 88, 91, 33, 100, 55, 95};
        // 배열 요소 중 가장 큰 값과 가장 작은 값 구하기
        int max = scores[0];
        int min = scores[0];

        // 선생님 답1
        // for (int i = 1; i < scores.length; i++) {
        //     if (scores[i] > max) {
        //         max = scores[i];
        //     }
        //     if (scores[i] < min) {
        //         min = scores[i];
        //     }
        // }
        // System.out.println("최대값: " + max);
        // System.out.println("최소값: " + min);
        
        // 선생님 답
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        // 내 답
        // for (int i : scores) {
        //     // System.out.printf("%d\t", i);
        //     for (int j = 0; j < scores.length; j++) {
        //         if (max < scores[i]) {
        //             max = scores[i];
        //         }
        //         if (min > scores[i]) {
        //             min = scores[i];
        //         }
        //     }
        // System.out.printf("max 값은 : %d, min 값은 : %d 이다.",max, min);
        // }
        // System.out.println();

    }
}
