package wangyiran.simplifying.condition.replace.conditional.with.polymorphism.refactor;

/**
 * Created by wyr on 2015/5/19.
 */
public class Manager extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.MANAGER;
    }

    int payAmount(Employee emp){
        return emp.getMonthlySalary()+emp.getBonus();
    }
}
