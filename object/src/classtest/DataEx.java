package classtest;

public class DataEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        // change(d.x); // 값 복사 ;1회성 ; 영구적으로 값이 바뀌지 않음
        change(d); // 이렇게 해야 영구적으로 d 값이 변경됨
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
        
        
        
        
    }
    //TODO: 값 복사; 1회성 ; 영구적으로 값이 바뀌지 않음
    // static void change(int x){
    //     x = 10000;
    //     System.out.println("change(): x = " + x);
    // }
    
    // 이렇게 해야 영구적으로 d 값이 변경됨
    static void change(Data d){
        d.x = 10000;
        System.out.println("change(): x = " + d.x);
    }
}
