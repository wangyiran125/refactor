package wangyiran.dealing.with.generalization.pull.up.constructor.body.notrefactor;

/**
 * Created by wyr on 2015/5/22.
 */
public abstract class Employee {
    protected String _name;
    protected String _id;

    public Employee(String name, String id) {
        _name = name;
        _id = id;
    }

    void initialize(){
        if (isPriviliged()) assignCar();
    }
    protected abstract void assignCar();

    protected abstract boolean isPriviliged();
}
