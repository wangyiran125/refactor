package wangyiran.dealing.with.generalization.pull.up.replace.constructor.with.factory.method.creating.subclass.with.string.refactor;

/**
 * Created by wyr on 2015/5/22.
 */
public class Employee {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALSEMAN = 1;
    static final int MANAGER = 2;

    //    I want to make subclasses of Employee to correspond to the type codes. So I
//    need to create a factory method:
    static Employee create(int type){
        switch (type){
            case ENGINEER:
                return new Engineer();
            case SALSEMAN:
                return new SalseMan();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("incorrect type code value");
        }
    }
//    The sad thing about this is that I have a switch. Should I add a new subclass, I
//    have to remember to update this switch statement, and I tend toward forgetfulness.
//    A good way around this is to use Class.forName

        static Employee create(String name){
            try {
                return (Employee) Class.forName(name).newInstance();
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to instantiate");
            }
        }
}
