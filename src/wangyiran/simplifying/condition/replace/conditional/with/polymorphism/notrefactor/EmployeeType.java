package wangyiran.simplifying.condition.replace.conditional.with.polymorphism.notrefactor;


/**
 * Created by wyr on 2015/5/19.
 */

public abstract class EmployeeType {
    abstract int getTypeCode();

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
