package wangyiran.dealing.with.generalization.form.template.method.refactor.pull.up.method.notrefactor;

import java.util.Enumeration;

/**
 * Created by wyr on 2015/5/22.
 */
public class TextStatement extends Statement{

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

    private String footerString(Customer customer) {
        String result = "";
        result += "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
        return result;
    }

    private String eachRentalString(Rental each) {
        return "\t" + each.getMovie().getTitle()+ "\t" +
                String.valueOf(each.getCharge()) + "\n";
    }

    private String headerString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

}
