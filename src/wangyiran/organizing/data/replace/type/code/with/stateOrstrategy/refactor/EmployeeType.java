package wangyiran.organizing.data.replace.type.code.with.stateOrstrategy.refactor;

/**
 * Created by wyr on 2015/5/19.
 */

/*Now I declare the state class. I declare this as an abstract class and provide an
abstract method for returning the type code:*/
public abstract class EmployeeType {
    abstract int getTypeCode();

    //    I like to finish Replace Type Code with State/Strategy (227) by moving all
//    knowledge of the type codes and subclasses over to the new class. First I copy the
//    type code definitions into the employee type, create a factory method for employee
//    types, and adjust the setting method on employee
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

    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;
}
