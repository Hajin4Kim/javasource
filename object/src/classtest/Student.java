package classtest;

public class Student {
    // 속성;
    private String studentID; // 학번 : s12345678
    private String name; // 이름 : 홍길동
    private String address; // 주소 : 서울시 종로구
    private String mobile; // 핸드폰 : 010-1234-1234



    // 생성자
    // 클래스 이름() {}
    // 생성자를 명시하지 않는다면 컴파일러가 default 생성자를 자동으로 생성함
    // TODO: 생성자를 여러 개 만들 수 있지만, ()안의 내용이 같은 경우, 오류 발생
    // 생성자 목적: 인스턴스 초기화 메서드

    // 생성자 오버로딩
    
    //TODO: vscode > 마우스 우클릭 > source actions > generate constructors
    
    public Student() {
    }

    public Student(String studentID) {
        this.studentID = studentID;
    }

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }
    
    public Student(String studentID, String name, String address) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
    }
    
    public Student(String studentID, String name, String address, String mobile) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }

    // 메소드
        // 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
        //TODO: 만드는 이유: 재사용성, 중복코드 제거, 프로그램 구조 구조화
    // 메소드 구조: 리턴타입 메소드명(){}    
        // 올 수 있는 타입 : 정수, 실수, 논리, 문자, 배열, void 형
        public String getName() {
            return name;
        }

}
