package wangyiran.simplifying.condition.replace.conditional.with.polymorphism.refactor;

/**
 * Created by wyr on 2015/5/19.
 */

//I now create the subclasses:
public class Engineer extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.ENGINEER;
    }

//    First I copy the Engineer leg of the case
//    statement onto the Engineer class
    int payAmount(Employee emp){
        return emp.getMonthlySalary();
    }
}
