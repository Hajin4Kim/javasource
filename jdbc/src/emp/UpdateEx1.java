package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateEx1 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            // 1. oracle 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";
            // 3. connection 얻기
            con = DriverManager.getConnection(url, user, password);

            // TODO: 자바에서 autocommit 상태 기본 true 임
            con.setAutoCommit(false);

            // 4. Update 작업
            // 4-1. sql 구문 작업
            String sql = "UPDATE emp_temp SET COMM = 200 WHERE EMPNO=7369";
            pstmt = con.prepareStatement(sql);
            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("성공");
                con.commit(); // TODO: 수동 commit
            } else {
                con.rollback(); // TODO: 수동 rollback
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
