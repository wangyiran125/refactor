package wangyiran.dealing.with.generalization.extract.interfaces.notrefactor;

/**
 * Created by wyr on 2015/5/25.
 */
public class Client {
//    For the second two cases it is often useful to make the subset of responsibilities
//    a thing in its own right, so that it can be made clear in the use of the system. That
//    way it is easier to see how the responsibilities divide.

//    Interfaces are good to use whenever a class has distinct roles in different
//            situations. Use Extract Interface (341) for each role.

    double charge(Employee emp, int days) {
        int base = emp.getRate() * days;
        if (emp.hasSpecialSkill())
            return base * 1.05;
        else return base;
    }
}
