package wangyiran.organizing.data.replace.type.code.with.subclass.refactor;

/**
 * Created by wyr on 2015/5/19.
 */
public class Engineer extends Employee{

    @Override
    public int getType() {
        return Employee.ENGINEER;
    }
}
