package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
// import java.sql.ResultSet;
import java.util.Scanner;

public class InsertEx2 {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        // ResultSet rs = null; //TODO: select구문에만 사용
        // TODO: insert 구문 동적 처리
        Scanner sc = new Scanner(System.in);

        try {
            // 1. oracle 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";
            // 3. connection 얻기
            con = DriverManager.getConnection(url, user, password);

            // TODO: 입력 데이터 동적 처리
            System.out.println("=============데이터 입력=============");
            System.out.print("사번 : ");
            int empno = Integer.parseInt(sc.nextLine());
            System.out.print("이름 : ");
            String ename = sc.nextLine();
            System.out.print("직무 : ");
            String job = sc.nextLine();
            System.out.print("매니저번호 : ");
            int mgr = Integer.parseInt(sc.nextLine());
            System.out.print("입사일 : ");
            String hiredate = sc.nextLine();
            System.out.print("급여 : ");
            int sal = Integer.parseInt(sc.nextLine());
            System.out.print("수당 : ");
            int comm = Integer.parseInt(sc.nextLine());
            System.out.print("부서번호 : ");
            int deptno = Integer.parseInt(sc.nextLine());

            // 4. insert 작업
            // 4-1. 실행할 sql 구문 작성
            String sql = "INSERT INTO emp_temp(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            // 4-2. sql 구문 전송
            pstmt = con.prepareStatement(sql);
            // TODO: ? 해결
            pstmt.setInt(1, empno);
            pstmt.setString(2, ename);
            pstmt.setString(3, job);
            pstmt.setInt(4, mgr);
            pstmt.setString(5, hiredate);
            pstmt.setInt(6, sal);
            pstmt.setInt(7, comm);
            //java.sql.SQLException: 인덱스에서 누락된 IN 또는 OUT 매개변수:: 8
            pstmt.setInt(8, deptno); 

            // 4-3. sql 구문 실행 후 결과 받기
            int result = pstmt.executeUpdate(); // TODO: insert,delete,update는 .executeUpdate()
            // TODO: select 만 executeQuery()

            if (result > 0) {
                System.out.println("입력 성공");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                sc.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
