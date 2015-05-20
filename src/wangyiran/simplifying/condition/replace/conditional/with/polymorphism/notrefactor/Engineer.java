package wangyiran.simplifying.condition.replace.conditional.with.polymorphism.notrefactor;

/**
 * Created by wyr on 2015/5/19.
 */

//I now create the subclasses:
public class Engineer extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.ENGINEER;
    }
}
