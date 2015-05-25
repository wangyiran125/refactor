package wangyiran.dealing.with.generalization.replace.delegation.with.inheritance.refactor;

/**
 * Created by wyr on 2015/5/25.
 */
public class Employee extends Person{
//    If you aren¡¯t using all the
//    methods of the class to which you are delegating, you shouldn¡¯t use Replace
//    Delegation with Inheritance, because a subclass should always follow the interface
//            of the superclass.
    Person _person = new Person();

    @Override
    public String toString() {
        return "Emp: "+getLastName();
    }
}
