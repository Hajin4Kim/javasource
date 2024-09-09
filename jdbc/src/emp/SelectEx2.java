package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class SelectEx2 {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // TODO: 무조건 select 구문할때만 사용하는 객체

        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";
            // 3. connection 얻기
            con = DriverManager.getConnection(url, user, password);
            System.out.println("연결되었습니다");

            // 4. connection을 통해 실행하고자 하는 SQL 구문 전송
            String sql = "SELECT * FROM emp";
            pstmt = con.prepareStatement(sql);

            // 5. 전송된 sql 구문 실행
            rs = pstmt.executeQuery();

            // 6. 결과값이 담긴 rs에서 하나씩 조회 (행단위로 담겨져있음 => col별로 꺼내기)
            System.out.println("======================================================================");
            System.out.println("empno   ename   job     mgr     hiredate    sal     comm     deptno");
            System.out.println("======================================================================");

            while (rs.next()) { // 결과가 존재한다면
                // DB 내에서 number 인 경우 => .getInt() / varchar2 => getString() / date => getDate()
                // 괄호 안에는 컬럼 번호 or 컬럼명 가능
                System.out.print(rs.getInt("empno") + "\t");
                System.out.print(rs.getString("ename") + "\t");
                System.out.print(rs.getString("job") + "\t");
                System.out.print(rs.getString("mgr") + "\t");
                System.out.print(rs.getDate("hiredate") + "\t");
                System.out.print(rs.getInt("sal") + "\t");
                System.out.print(rs.getInt("comm") + "\t");
                System.out.println(rs.getInt("deptno") + "\t");
                System.out.println("========");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
