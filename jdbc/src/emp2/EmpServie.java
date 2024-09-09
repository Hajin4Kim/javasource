package emp2;

public class EmpServie {
    // EmpDAO 호출
    private EmpDAO empDAO;

    public EmpServie(EmpDAO empDAO) {
        this.empDAO = empDAO;
    }

    public boolean addEmp(EmpDTO dto){
        return empDAO.insert(dto);
    }


}
