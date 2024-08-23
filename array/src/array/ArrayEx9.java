package array;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        // 문자열 배열 섞기
        String[] names = { "Kim", "Park", "Yi" };

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+"\t");
            System.out.println();

            char[] chArr = names[i].toCharArray();

            // System.out.println(Arrays.toString(chArr)); //배열에 문자열을 문자 하나하나 쪼개서 넣어줌
            for (int j = 0; j < chArr.length; j++) {
                int position = (int)(Math.random() * chArr.length); // 배열의 길이 : 3 만큼 곱
                // 배열 길이 내에서 랜덤으로 섞기
                char temp = chArr[j];
                chArr[j] = chArr[position];
                chArr[position] = temp;
            }
            System.out.println(new String(chArr));
        }
        
        
    }
}
