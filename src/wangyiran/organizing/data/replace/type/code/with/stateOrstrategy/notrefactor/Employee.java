package wangyiran.organizing.data.replace.type.code.with.stateOrstrategy.notrefactor;

/**
 * Created by wyr on 2015/5/19.
 */
public class Employee {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    private int _monthlySalary;
    private int _commission;
    private int _bonus;

    public Employee(int _type) {
        this._type = _type;
    }

/*    This is similar to Replace Type Code with Subclasses (223), but can be used if the
    type code changes during the life of the object or if another reason prevents
    subclassing. It uses either the state or strategy pattern*/

    int payAmount(int type){
        switch (type){
            case ENGINEER:
                return _monthlySalary;
            case SALESMAN:
                return _monthlySalary + _commission;
            case MANAGER:
                return _monthlySalary + _bonus;
            default:
                throw new RuntimeException("incorrect Employee");
        }
    }
}
