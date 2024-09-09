package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;

public class SelectEx4 {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "TIGER";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 job 입력 : ");
        String job = sc.nextLine();
        System.out.print("조회할 empno 입력 : ");
        int empno = sc.nextInt();

        // empno 동적 처리
        // String sql = "SELECT * FROM emp WHERE empno="+empno;
        // String sql = "SELECT * FROM emp WHERE empno=?"; //TODO: ?로 받기
        String sql = "SELECT * FROM emp WHERE empno=? OR job=?"; // TODO: ?로 받기

        try (Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            Class.forName("oracle.jdbc.OracleDriver");

            // ? 처리
            pstmt.setInt(1, empno); // TODO: empno 동적처리
            pstmt.setString(2, job);
            ResultSet rs = pstmt.executeQuery();

            System.out.println("연결되었습니다");

            while (rs.next()) { // 결과가 존재한다면
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