package wangyiran.dealing.with.generalization.pull.up.replace.constructor.with.factory.method.notrefactor;

/**
 * Created by wyr on 2015/5/22.
 */
public class Employee {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALSEMAN = 1;
    static final int MANAGER = 2;

//    The most obvious motivation for Replace Constructor with Factory Method
//    comes with replacing a type code with subclassing. You have an object that often is
//    created with a type code but now needs subclasses. The exact subclass is based on
//    the type code. However, constructors can only return an instance of the object that is
//    asked for. So you need to replace the constructor with a factory method [Gang of
//    Four].
    public Employee(int _type) {
        this._type = _type;
    }
}
