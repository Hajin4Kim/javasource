package emp2;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;

        EmpConsoleUtil util = new EmpConsoleUtil();
        EmpServie servie = new EmpServie(new EmpDAO());

        while (run) {

            System.out.println("===============================");
            System.out.println("1. 사원 정보 입력");
            System.out.println("2. 특정 사원 조회");
            System.out.println("3. 전체 사원 조회");
            System.out.println("4. 사원 정보 수정");
            System.out.println("5. 사원 정보 삭제");
            System.out.println("6. 프로그램 종료");
            System.out.println("===============================");
            System.out.println();
            System.out.print("메뉴 번호 입력 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    EmpDTO dto = util.insertEmp(sc);
                    boolean result = servie.addEmp(dto);
                    System.out.println(result ? "입력성공" : "입력실패");
                    break;
                case 2:
                    // getEmpNo() 호출
                    int empno = util.getEmpNo(sc);
                    // service 의 getRow() 호출
                    dto = servie.getRow(empno);
                    // util.printEmp() 호출
                    util.printEmp(dto);
                    break;
                case 3:
                    //TODO: service 의 getRows() 호출
                    List<EmpDTO> list = servie.getRows();
                    // util 의 printListEmp() 호출
                    util.printListEmp(list);
                    break;
                case 4:
                    // updateInfo() 호출
                    dto = util.updateInfo(sc);
                    // updateEmpInfo() 호출 후 결과 받아서 결과 출력
                    // System.out.println(servie.updateEmpInfo(dto) ? "수정성공" : "수정실패");
                    
                    // 수정성공 시 수정된 상황의 정보를 다시 출력하기
                    if (servie.updateEmpInfo(dto)) {
                        dto = servie.getRow(dto.getEmpno()); //TODO: util.updateInfo의 dto에 있음
                        util.printEmp(dto);
                        // System.out.println(dto.getEmpno() + dto.getComm() + dto.getSal());
                    }else{
                        System.out.println("수정 실패");
                    }
                    break;
                case 5:
                    // deleteEmpNo 호출 후 empno 받기
                    int deleteEmpNo = util.deleteEmpNo(sc);
                    // service deleteEmpInfo() 호출 후 결과 출력
                    boolean res = servie.deleteEmpInfo(deleteEmpNo);
                    System.out.println(res ? "삭제성공" : "삭제실패");
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    System.out.println("메뉴 번호를 확인해 주세요");
                    break;
            }
        }

    }
}
