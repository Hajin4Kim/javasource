package extendstest;

public class Point { //= x y 좌표 클래스
    int x, y;

    public Point() { //default 생성자
        this(0,0);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getXY(){
        return "("+ x +", "+ y +")";
    }


}
