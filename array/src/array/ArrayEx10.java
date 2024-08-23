package array;

import java.util.Scanner;

public class ArrayEx10 {
    public static void main(String[] args) {
        // 원래의 단어 맞추기
        String[] words = {"television", "computer", "mouse", "phone"};
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < words.length; i++) {
            // 문제 출제
            char[] question= words[i].toCharArray();


            for (int j = 0; j < question.length; j++) {
                int position = (int)(Math.random() * question.length); // 배열의 길이 : 3 만큼 곱
                // 배열 길이 내에서 랜덤으로 섞기
                char temp = question[j];
                question[j] = question[position];
                question[position] = temp;
            }
            System.out.printf("Q%d) %s의 원래 단어는 무엇일까요? ", i+1, new String(question));
            
            // 답변 입력
            // 사용자의 답변과 해답과 일치하는지 확인 후 정답입니다 or 틀려습니다 출력
            System.out.println("답변을 입력하시오 >> ");
            String userAnswer = sc.nextLine();
            if (userAnswer.equals(words[i]) ) {  //TODO: String의 비교는 equals로 해야 한다.
                System.out.println("정답입니다.");
            }else{
                System.out.println("오답입니다. 다시 도전하세요.");

            }

        }






    }
}
