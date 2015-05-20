package wangyiran.organizing.data.replace.type.code.with.stateOrstrategy.refactor;

/**
 * Created by wyr on 2015/5/19.
 */

//I now create the subclasses:
public class Engineer extends EmployeeType{
    @Override
    protected int getTypeCode() {
        return EmployeeType.ENGINEER;
    }
}
