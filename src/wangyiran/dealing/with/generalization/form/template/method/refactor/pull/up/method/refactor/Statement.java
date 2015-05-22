package wangyiran.dealing.with.generalization.form.template.method.refactor.pull.up.method.refactor;

import java.util.Enumeration;

/**
 * Created by wyr on 2015/5/22.
 */

//Before I can use Form Template Method (345) I need to arrange things so that
//        the two methods are subclasses of some common superclass. I do this by using a
//        method object [Beck] to create a separate strategy hierarchy for printing the
//        statements (Figure 11.1)
public abstract  class Statement {

    public String value(Customer customer) {
        Enumeration rentals = customer.get_rentals().elements();
        String result = headerString(customer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
//show figures for this rental
            result += eachRentalString(each);
        }
//add footer lines
        result = footerString(customer);
        return result;
    }

    protected abstract String footerString(Customer customer);

    protected abstract String eachRentalString(Rental each);

    protected abstract String headerString(Customer customer);
}
