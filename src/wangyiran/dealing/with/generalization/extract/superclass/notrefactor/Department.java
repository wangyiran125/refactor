package wangyiran.dealing.with.generalization.extract.superclass.notrefactor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * Created by wyr on 2015/5/25.
 */
public class Department {
//    First, both employees and
//    departments have names. Second, they both have annual costs, although the methods
//    for calculating them are slightly different. I extract a superclass for both of these
//    features.
    public Department(String _name) {
        this._name = _name;
    }

    public int getTotalAnnualCost(){
        Enumeration e = getStaff();
        int result = 0;
        while (e.hasMoreElements()) {
            Employee each = (Employee) e.nextElement();
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
