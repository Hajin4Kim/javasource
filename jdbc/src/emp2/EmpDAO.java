package emp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
    // TODO: DB CRUD 작업을 위한 메소드 작성
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // TODO: static 블럭 : 클래스가 로드되면 인스턴스 생성 여부와 상관없이 바로 실행
    static {
        try {
            // 1. oracle 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        // 2. 연결 문자열 작성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "TIGER";
        // 3. connection 얻기
        return DriverManager.getConnection(url, user, password);
    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // CRUD 메소드 작성
    public boolean insert(EmpDTO dto) {
        boolean flag = false;
        try {
            con = getConnection();
            // 4-1. 실행할 sql 구문 작성
            String sql = "INSERT INTO emp_temp(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            // 4-2. sql 구문 전송
            pstmt = con.prepareStatement(sql);
            // TODO: ? 해결
            pstmt.setInt(1, dto.getEmpno());
            pstmt.setString(2, dto.getEname());
            pstmt.setString(3, dto.getJob());
            pstmt.setInt(4, dto.getMgr());
            pstmt.setString(5, dto.getHireDate());
            pstmt.setInt(6, dto.getSal());
            pstmt.setInt(7, dto.getComm());
            pstmt.setInt(8, dto.getDeptno());

            // 4-3. sql 구문 실행 후 결과 받기
            int result = pstmt.executeUpdate(); // TODO: insert,delete,update는 .executeUpdate()
            if (result > 0)
                flag = true;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return flag;

    }

}
