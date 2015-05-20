package wangyiran.simplifying.condition.replace.conditional.with.polymorphism.notrefactor;

import wangyiran.organizing.data.replace.type.code.with.stateOrstrategy.refactor.EmployeeType;

/**
 * Created by wyr on 2015/5/19.
 */
public class Employee {
    private wangyiran.simplifying.condition.replace.conditional.with.polymorphism.notrefactor.EmployeeType _type;

    public int getType() {
        return _type.getTypeCode();
    }


    private int _monthlySalary;
    private int _commission;
    private int _bonus;

    int payAmount(){
        switch (getType()){
            case EmployeeType.ENGINEER:
                return _monthlySalary;
            case EmployeeType.SALESMAN:
                return _monthlySalary + _commission;
            case EmployeeType.MANAGER:
                return _monthlySalary + _bonus;
            default:
                throw new RuntimeException("incorrect Employee");
        }
    }
}
