package api;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx2 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "dog", "lion", "tiger"};

        //TODO: T, E, K, V  = 객체로 들어가야 함 이라는 뜻
        Arrays.sort(strArr, Comparator.reverseOrder());

        int arr[] = {37,21,56,99,88,58,62,15,39,78};
        // 오름차순
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 내림차순
        //TODO: int => Integer, char => Character, float => Float
        // T[] 또는 Object[] 형태로 와야, Comparator.reverseOrder() 가 가능해짐
        Integer arr1[] = {37,21,56,99,88,58,62,15,39,78};
        Arrays.sort(arr1, Comparator.reverseOrder()); //The method sort(int[]) in the type Arrays is not applicable for the arguments (int[], Comparator.reverseOrder())
        System.out.println(Arrays.toString(arr1));

        


    }
}
