package wangyiran.dealing.with.generalization.pull.up.method.refactor;

import java.util.Date;

/**
 * Created by wyr on 2015/5/22.
 */
public abstract class Customer {
    //    I can¡¯t move the method up into the superclass, because chargeFor is different on
//    each subclass. First I have to declare it on the superclass as abstract:
    abstract double chargeFor(Date start, Date end);

    //    Then I can copy createBill from one of the subclasses. I compile with that in
//    place and then remove the createBill method from one of the subclasses, compile, and
//    test. I then remove it from the other, compile, and test:
    void createBill(Date date) {
        Date lastBillDate = new Date();
        Date charge = new Date();
        double chargeAmount = chargeFor(lastBillDate, date);
        addBill(date, charge);
    }

    public void addBill(Date date, Date charge) {

    }
}
