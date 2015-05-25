package wangyiran.dealing.with.generalization.extract.superclass.refactor;

/**
 * Created by wyr on 2015/5/25.
 */
public class Employee extends Party{
//    Duplicate code is one of the principal bad things in systems. If you say things in
//    multiple places, then when it comes time to change what you say, you have more
//    things to change than you should.
//    One form of duplicate code is two classes that do similar things in the same
//    way or similar things in different ways. Objects provide a built-in mechanism to
//    simplify this situation with inheritance. However, you often don¡¯t notice the
//    commonalities until you have created some classes, in which case you need to create
//    the inheritance structure later.

    public Employee(int _annualCost, String _id, String _name) {
        super(_name);
        this._annualCost = _annualCost;
        this._id = _id;
    }

    public int getAnnualCost() {
        return _annualCost;
    }

    public String getId() {
        return _id;
    }


    private int _annualCost;
    private String _id;
}
