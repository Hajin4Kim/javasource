package emp2;

import java.util.List;

public class EmpServie {
    // EmpDAO 호출
    private EmpDAO empDAO;

    public EmpServie(EmpDAO empDAO) {
        this.empDAO = empDAO;
    }

    // 1. 사원 추가
    public boolean addEmp(EmpDTO dto) {
        return empDAO.insert(dto);
    }

    // 2. 부분조회
    // getEmp() 호출하는 메소드 - 결과 바로 return =>
    public EmpDTO getRow(int empno) {
        return empDAO.getEmp(empno);
    }

    // 3. 전체 조회
    // getList() 호출 메소드
    public List<EmpDTO> getRows() {
        return empDAO.getList();
    }

    // 4. 특정 사원 정보 수정
    public boolean updateEmpInfo(EmpDTO dto) {
        return empDAO.empUpdate(dto);
    }

    // 5. 특정 사원 삭제
    public boolean deleteEmpInfo(int empno){
        return empDAO.empDelete(empno);
    }

    
}
