package api;

public class StringEx2 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
    }

    static int count(String src, String target){
        // src 에서 target 의 문자열이 몇 번 나오는지 카운트 한 후 리턴
        int count = 0;
        int position =  0; // 찾을 위치

        // position = src.indexOf(target, position); // 5
        // if (position != 1) count += 1;
        
        // // 시작위치가 7 로 바뀜
        // position += target.length();
        // position = src.indexOf(target, position); // 9
        // if (position != 1) count += 1;
        
        // position += target.length();
        // position = src.indexOf(target, position); // 11
        // if (position != 1) count += 1;

        while ((position = src.indexOf(target, position)) != -1) {
            count += 1;
            position += target.length();
        }
        return count;
    }
}
