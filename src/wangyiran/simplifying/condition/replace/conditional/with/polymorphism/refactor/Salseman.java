package wangyiran.simplifying.condition.replace.conditional.with.polymorphism.refactor;


/**
 * Created by wyr on 2015/5/19.
 */
public class Salseman extends EmployeeType {
    @Override
    protected int getTypeCode() {
        return EmployeeType.SALESMAN;
    }

    int payAmount(Employee emp){
        return emp.getMonthlySalary()+emp.getCommission();
    }
}
