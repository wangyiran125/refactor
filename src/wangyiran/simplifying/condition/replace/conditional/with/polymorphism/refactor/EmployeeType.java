package wangyiran.simplifying.condition.replace.conditional.with.polymorphism.refactor;


/**
 * Created by wyr on 2015/5/19.
 */

public abstract class EmployeeType {
    abstract int getTypeCode();
//    then declare the superclass method abstract:
    abstract int payAmount(Employee emp);
    static EmployeeType newType(int code) {
        switch (code) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salseman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("incorrect Employee code");
        }
    }
//    I
//    do need to move it into the employee type, because that is the class that is being
//            subclassed

//    Because I need data from the employee, I need to pass in the employee as an
//            argument
//    int payAmount(Employee emp){
//        switch (getTypeCode()){
//            case ENGINEER:
//                return emp.getMonthlySalary();
//            case SALESMAN:
//                return emp.getMonthlySalary()+emp.getCommission();
//            case MANAGER:
//                return emp.getMonthlySalary()+emp.getBonus();
//            default:
//                throw new RuntimeException("incorrect employee");
//        }
//    }
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;
}
