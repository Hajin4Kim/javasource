package classtest;

public class StudentEx {
    public static void main(String[] args) {

        // new Student(); default 생성자 호출
        Student student1 = new Student(); // 다 null //TODO:생성자가 없을 떄만 활성화됨
        Student student2 = new Student("s12345678"); // studentID 빼고 다 null
        Student student3 = new Student("s12345678", "홍길동");
        Student student4 = new Student("s12345676", "성춘향", "서울시 종로구");
        Student student5 = new Student("s12345675", "이승기", "서울시 구로구", "010-4567-3569");

        // 객체 배열 생성
        Student[] students = {student1, student2, student3, student4, student5};

        System.out.println("3번 학생의 이름은 " + students[2].getName() + "입니다.");
        System.out.println("4번 학생의 이름은 " + students[3].getName() + "입니다.");



        // 이름 조회
        // method 호출
        // 1) 리턴타입이 있는 경우 : 변수에 담거나 출력문에서 호출
        String name = student3.getName();
        System.out.println("3번 학생의 이름은 " + name + " 입니다.");
        System.out.println("4번 학생의 이름은 " + student4.getName() + " 입니다."); // 어지간하면 이 방법은 안쓰는게 좋음

    }
}
