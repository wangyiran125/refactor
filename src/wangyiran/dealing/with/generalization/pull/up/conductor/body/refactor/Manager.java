package wangyiran.dealing.with.generalization.pull.up.conductor.body.refactor;

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
        _name = name;
        _id = id;
        _grade = grade;
        if (isPriviliged()) assignCar(); //every subclass does it
    }

    private void assignCar() {
        //assign car
    }

    public boolean isPriviliged() {
        return _grade > 4;
    }
}
