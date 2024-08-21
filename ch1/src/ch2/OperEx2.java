package ch2;

public class OperEx2 {
    public static void main(String[] args) {
        // 1) 단항 연산자 : -, + (음수, 양수)
        // 2) 증감 연산자 : ++, -- (증감)
            //  증감연산자가 앞쪽에 오는 경우, 연산이 먼저 실행되고 대입이 됨
            //  증감연산자가 뒤쪽에 오는 경우,  대입이 먼저 되고 연산이 나중에 실행됨
            //TODO: 단독의 경우 전위나 후위나 동일한 결과
        // 3) 논리 부정 연산자 : !
                // true, false 를 반대로 바꿈


        int  x = 10;
    // x = x+1;
        //x++;  //후행
        // ++x; //선행
        // System.out.println("x = " + x);
        // System.out.println("x = " + (++x)); // 먼저 x+1를 처리하고, 이후에 출력해
        System.out.println("x = " + (x++)); // 일단 출력해 이후에 x+1를 처리

// x = x-1;
        // x--; //후행
        // --x; //선행
        // System.out.println("x = " + x);
        // System.out.println("x = " + (--x)); // 먼저 x-1를 처리하고, 이후에 출력해
        System.out.println("x = " + (x--)); // 일단 출력해 이후에 x-1을 처리

        boolean play = true;
        System.out.println(!play);

    }
}
