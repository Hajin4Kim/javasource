package emp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    // 사원 추가 기능 (boolean)
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

    // TODO: 특정 사원 조회 기능 (EmpDTO)
    public EmpDTO getEmp(int empno) {

        EmpDTO dto = null;
        try {
            con = getConnection();
            String sql = "SELECT * FROM emp_temp WHERE empno=?";
            pstmt = con.prepareStatement(sql);
            // ? 해결
            pstmt.setInt(1, empno);
            rs = pstmt.executeQuery(); // TODO: rs를 끝내야 하므로 DTO 에 담아서 옮기기

            if (rs.next()) {
                dto = new EmpDTO();
                dto.setEmpno(rs.getInt("empno"));
                dto.setEname(rs.getString("ename"));
                dto.setJob(rs.getString("job"));
                dto.setMgr(rs.getInt("mgr"));
                dto.setHireDate(rs.getString("hiredate"));
                dto.setSal(rs.getInt("sal"));
                dto.setComm(rs.getInt("comm"));
                dto.setDeptno(rs.getInt("deptno"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return dto;
    }

    // TODO: 전체 사원 조회 기능
    public List<EmpDTO> getList() {
        List<EmpDTO> list = new ArrayList<>();
        try {
            con = getConnection();

            String sql = "SELECT * FROM emp_temp";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                // TODO: 레코드 => dto 로 생성 후 => list 에 추가
                EmpDTO dto = new EmpDTO();
                dto = new EmpDTO();
                dto.setEmpno(rs.getInt("empno"));
                dto.setEname(rs.getString("ename"));
                dto.setJob(rs.getString("job"));
                dto.setMgr(rs.getInt("mgr"));
                dto.setHireDate(rs.getString("hiredate"));
                dto.setSal(rs.getInt("sal"));
                dto.setComm(rs.getInt("comm"));
                dto.setDeptno(rs.getInt("deptno"));

                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    // TODO: 특정 사원 정보 수정 기능 (boolean)
    public boolean empUpdate(EmpDTO dto) {
        boolean flag = false;
        try {
            con = getConnection();

            String sql = "UPDATE emp_temp SET COMM=?, SAL=? WHERE EMPNO=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, dto.getComm());
            pstmt.setInt(2, dto.getSal());
            pstmt.setInt(3, dto.getEmpno());

            int result = pstmt.executeUpdate();
            if (result > 0) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt); // TODO: select구문만 rs까지 사용하므로 rs 닫을 필요없음
        }
        return flag;
    }

    // TODO: 특정 사원 정보 삭제 기능
    public boolean empDelete(int empno) { // 여러 개 가져올 땐 DTO 사용, 하나 가져올땐 매개변수에 직접
        boolean flag = false;
        try {
            con = getConnection();
            String sql = "delete from emp_temp where empno=?";

            // 4-2. sql 구문 전송
            pstmt = con.prepareStatement(sql);
            // ? 해결
            pstmt.setInt(1, empno);
            // 4-3. 전송한 sql 구문 실행 후 결과 받기
            int result = pstmt.executeUpdate();
            if (result > 0) {
                flag = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return flag;
    }

}
