package wangyiran.dealing.with.generalization.extract.superclass.refactor;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by wyr on 2015/5/25.
 */
public class Department extends Party{
//    First, both employees and
//    departments have names. Second, they both have annual costs, although the methods
//    for calculating them are slightly different. I extract a superclass for both of these
//    features.
    public Department(String _name) {
        super(_name);
    }

//    The methods Department.getTotalAnnualCost and Employee.getAnnualCost, do carry out the
//    same intention, so they should have the same name. I first use Rename Method (273)
//    to get them to the same name:
    public int getAnnualCost(){
        Enumeration e = getStaff();
        int result = 0;
        while (e.hasMoreElements()) {
//            Once I¡¯ve made the obvious changes, I look at the clients of the two classes to
//            see whether I can change any of them to use the new superclass
            Party each = (Party) e.nextElement();
            result += each.getAnnualCost();
        }
        return result;
    }
    public int getHeadCount() {
        return _staff.size();
    }
    public Enumeration getStaff() {
        return _staff.elements();
    }
    public void addStaff(Employee arg) {
        _staff.addElement(arg);
    }
    public String getName() {
        return _name;
    }
    private String _name;
    private Vector _staff = new Vector();
}
