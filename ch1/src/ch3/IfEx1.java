package ch3;

public class IfEx1 {
    // 조건문
    //  ~~ 가 참이라면 ~~ 를 해주세요
    // 조건1 이 True 라면 문장1 수행, 조건2 가 참이라면 문장2 수행
    public static void main(String[] args) {
        
        int num = 50;
        
        // 100 보다 크다 or 100 보다 작다 둘 중 하나 출력
        if (num > 100) {
            System.out.println("100보다 크다");
        }else{
            System.out.println("100보다 작다");
        }
        
        //조건에 따른 등급 매기기
        int score = 75;
        if (score >= 90) {
            System.out.println("등급은 A 입니다.");
        }else if(score >= 80){
            System.out.println("등급은 B 입니다.");
        }else if(score >= 70){
            System.out.println("등급은 C 입니다.");
        }else if(score >= 60){
            System.out.println("등급은 D 입니다.");
        }else {
            System.out.println("등급은 F 입니다.");
        }

        






    }
}
