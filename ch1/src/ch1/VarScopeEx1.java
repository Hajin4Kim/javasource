package ch1;

public class VarScopeEx1 {
    public static void main(String[] args) {
        //변수 유효 범위 local(지역변수) = public / private
        //변수를 선언한 블록 내에서만 유효함
        int a  = 25;
        int c;
        // int d;

        {
            int b = 35;
            System.out.println(b);
            c = b+50;
        }
        System.out.println("print a >>> " + a);
        System.out.println("print c >>> " +c);
        // TODO: 로컬변수는 사용하기 전, 반드시 초기화
        // System.out.println(d); //ERROR: local variable is not initialized
    }
}
