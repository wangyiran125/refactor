package wangyiran.dealing.with.generalization.replace.delegation.with.inheritance.notrefactor;

/**
 * Created by wyr on 2015/5/25.
 */
public class Employee {
//    If you aren¡¯t using all the
//    methods of the class to which you are delegating, you shouldn¡¯t use Replace
//    Delegation with Inheritance, because a subclass should always follow the interface
//            of the superclass.
    Person _person = new Person();
    public String getName(){
        return  _person.getName();
    }

    public void setName(String name){
        _person.setName(name);
    }

    @Override
    public String toString() {
        return "Emp: "+_person.getName();
    }
}
