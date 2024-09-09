package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class SelectEx3 {
    public static void main(String[] args) {
        // TODO: SelectEx ==> try-resource 형태로 변경
        // finally 자원 닫기 자동으로 처리

        // 2. 연결 문자열 작성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "TIGER";
        // 4. connection을 통해 실행하고자 하는 SQL 구문 전송
        String sql = "SELECT * FROM emp WHERE empno=7369";

        try (Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = con.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            // 3. connection 얻기
            System.out.println("연결되었습니다");
            // 5. 전송된 sql 구문 실행
            // 6. 결과값이 담긴 rs에서 하나씩 조회 (행단위로 담겨져있음 => col별로 꺼내기)
            if (rs.next()) { // 결과가 존재한다면
                // DB 내에서 number 인 경우 => .getInt() / varchar2 => getString() / date => getDate()
                // 괄호 안에는 컬럼 번호 or 컬럼명 가능
                System.out.println("empno : " + rs.getInt("empno"));
                System.out.println("ename : " + rs.getString(2));
                System.out.println("job : " + rs.getString(3));
                System.out.println("mgr : " + rs.getString(4));
                System.out.println("hiredate : " + rs.getDate(5));
                System.out.println("sal : " + rs.getInt(6));
                System.out.println("comm : " + rs.getInt(7));
                System.out.println("deptno : " + rs.getInt(8));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}