package wangyiran.organizing.data.replace.type.code.with.subclass.refactor;

/**
 * Created by wyr on 2015/5/19.
 */
public class Employee {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    public Employee(int _type) {
        this._type = _type;
    }

    public Employee() {
        super();
    }

    //    Because the employee¡¯s constructor uses a type code as a parameter, I need to
//    replace it with a factory method:

    public int getType() {
        return _type;
    }

/*    Of course this is the kind of switch statement I would prefer to avoid. But there
    is only one, and it is only used at creation.
    Naturally once you have created the subclasses you should use Push Down
    Method (328) and Push Down Field (329) on any methods and fields that are
    relevant only for particular types of employee.*/
    static  Employee create(int type){
        switch (type){
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salseman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("incorrect type code value");
        }

    }
}
