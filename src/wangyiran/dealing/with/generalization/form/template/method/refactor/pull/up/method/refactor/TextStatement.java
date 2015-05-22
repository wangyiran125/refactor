package wangyiran.dealing.with.generalization.form.template.method.refactor.pull.up.method.refactor;

/**
 * Created by wyr on 2015/5/22.
 */
public class TextStatement extends Statement {


    protected String footerString(Customer customer) {
        String result = "";
        result += "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
        return result;
    }

    protected String eachRentalString(Rental each) {
        return "\t" + each.getMovie().getTitle()+ "\t" +
                String.valueOf(each.getCharge()) + "\n";
    }

    protected String headerString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

}
