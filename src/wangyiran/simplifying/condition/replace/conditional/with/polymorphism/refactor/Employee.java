package wangyiran.simplifying.condition.replace.conditional.with.polymorphism.refactor;

import wangyiran.organizing.data.replace.type.code.with.stateOrstrategy.refactor.EmployeeType;

/**
 * Created by wyr on 2015/5/19.
 */
public class Employee {
    private wangyiran.simplifying.condition.replace.conditional.with.polymorphism.refactor.EmployeeType _type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    public int getType() {
        return _type.getTypeCode();
    }


    private int _monthlySalary;
    private int _commission;
    private int _bonus;


    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }


//    int payAmount(){
//        switch (getType()){
//            case EmployeeType.ENGINEER:
//                return _monthlySalary;
//            case EmployeeType.SALESMAN:
//                return _monthlySalary + _commission;
//            case EmployeeType.MANAGER:
//                return _monthlySalary + _bonus;
//            default:
//                throw new RuntimeException("incorrect Employee");
//        }
//    }

//    When this compiles, I change the payAmount method in Employee to delegate to
//    the new class:
    int payAmount(){
        return _type.payAmount(this);
    }
}
