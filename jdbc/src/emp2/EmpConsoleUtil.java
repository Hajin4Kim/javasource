package emp2;

import java.util.List;
import java.util.Scanner;

public class EmpConsoleUtil {

    public EmpDTO insertEmp(Scanner sc) {
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

        return new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
    }

    public int getEmpNo(Scanner sc) {
        // 사번 입력받은 후 리턴
        System.out.print("조회할 사번을 입력하시오 >> ");
        // int empno = sc.nextInt();
        // return empno;
        return Integer.parseInt(sc.nextLine()); // TODO: 코드줄이기
    }

    // TODO: 2. 특정 사원 조회
    public void printEmp(EmpDTO dto) {
        // dto 내용 출력
        System.out.println(dto.getEname() + " 사원");
        System.out.println("=================");
        System.out.println("사번 : " + dto.getEmpno());
        System.out.println("직무 : " + dto.getJob());
        System.out.println("입사일 : " + dto.getHireDate());
        System.out.println("급여 : " + dto.getSal());
        System.out.println("수당 : " + dto.getComm());
        System.out.println("부서번호 : " + dto.getDeptno());
        System.out.println();
    }

    // TODO: 3. 전체 사원 조회
    public void printListEmp(List<EmpDTO> list) {
        // list에 들어있는 emp 출력
        System.out.println("======================================================================");
        System.out.println("empno   ename   job     mgr     hiredate    sal     comm     deptno");
        System.out.println("======================================================================");

        for (EmpDTO empDTO : list) {
            System.out.print(empDTO.getEmpno() + "\t" + empDTO.getEname() + "\t" + empDTO.getJob() + "\t"
                    + empDTO.getMgr() + "\t" + empDTO.getHireDate() + "\t" + empDTO.getSal() + "\t" + empDTO.getComm()
                    + "\t" + empDTO.getDeptno() + "\n");
        }
    }

    // TODO: 4. 특정 사원 정보 수정
    public EmpDTO updateInfo(Scanner sc) {
        // 수정할 정보 입력받기 => 입력받은 EmpDTO 담은(담는건 항상 new) 후 return
        System.out.print("수정할 사번을 입력하시오 >> ");
        int empno = Integer.parseInt(sc.nextLine());
        System.out.print("수정할 수당을 입력하시오 >> ");
        int comm = Integer.parseInt(sc.nextLine());
        System.out.print("수정할 급여를 입력하시오 >> ");
        int sal = Integer.parseInt(sc.nextLine());

        // TODO: TODO: 기존 DTO 를 new 해서 담는 법
        EmpDTO dto = new EmpDTO();
        dto.setEmpno(empno);
        dto.setSal(sal);
        dto.setComm(comm);
        return dto;
        // new EmpDTO(empno, null, null, 0, null, sal, comm, 0);
        // new EmpDTO(empno, sal, comm); //TODO: 또는 EmpDTO.java 에 세가지 선택한 생성자 따로 생성하여 사용
    }

    // TODO: 5. 특정 사원 삭제
    public int deleteEmpNo(Scanner sc){
        // 삭제할 empno 받은 후 리턴
        System.out.print("삭제할 사원의 사번을 입력하시오 >> ");
        int empno = Integer.parseInt(sc.nextLine());
        return empno;
    }


}
