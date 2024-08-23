package classtest;

public class Method {
    //method 작성
    // 리턴타입 메소드명(){}
    // 정수형 (byte, int, long), 실수형(float, double), 논리형(boolean), 문자형(char, String),
    // 배열타입([]타입), void 
    
    int method1(){ //TODO:void 가 아닌 이상, return 키워드 필수
        return 0;
    }
    double method2(){
        return 12.4;
    }
    char method3(){
        return 'a';
    }
    String method4(){
        return "abc";
    }
    int[] method5(){
        return new int[2];
    }
    void method6(){
        return;
    }
    
}
