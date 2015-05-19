package wangyiran.organizing.data.replace.type.code.with.subclass.notrefactor;

/**
 * Created by wyr on 2015/5/19.
 */
public class Employee {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    private double account;
    private double month;
    private int day;

    public Employee(int _type) {
        this._type = _type;
    }

/*    If you have a type code that does not affect behavior, you can use Replace Type
    Code with Class (218). However, if the type code affects behavior, the best thing to
    do is to use polymorphism to handle the variant behavior.*/

/*    Such conditionals need to be refactored with Replace Conditional with
    Polymorphism (255). For this refactoring to work, the type code has to be replaced
    with an inheritance structure that will host the polymorphic behavior. Such an
    inheritance structure has a class with subclasses for each type code*/

    public double payMount(int type){
        switch (type){
            case ENGINEER:
                return getAccount()*9.256-getMonth();
            case SALESMAN:
                return 42*getDay()-65;
            case MANAGER:
                return getMonth()-getDay()*32;
        }
        return 0;
    }

    public double getAccount() {
        return account;
    }

    public double getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
