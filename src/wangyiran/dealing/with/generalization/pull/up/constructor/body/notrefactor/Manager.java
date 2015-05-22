package wangyiran.dealing.with.generalization.pull.up.constructor.body.notrefactor;

/**
 * Created by wyr on 2015/5/22.
 */
public class Manager extends Employee {

    private final int _grade;

//    If you see subclass methods with common behavior, your first thought is to
//    extract the common behavior into a method and pull it up into the superclass. With a
//    constructor, however, the common behavior is often the construction. In this case
//    you need a superclass constructor that is called by subclasses
    public Manager(String name, String id, int grade) {
        super(name,id);
        _grade = grade;
        initialize(); //every subclass does it
    }

    @Override
    protected void assignCar() {
        //assign car
    }

    @Override
    public boolean isPriviliged() {
        return _grade > 4;
    }
}
