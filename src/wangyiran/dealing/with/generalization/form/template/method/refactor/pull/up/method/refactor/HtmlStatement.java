package wangyiran.dealing.with.generalization.form.template.method.refactor.pull.up.method.refactor;

/**
 * Created by wyr on 2015/5/22.
 */
public class HtmlStatement extends Statement {

    //    A common case is two methods that seem to carry out broadly similar steps in
//    the same sequence, but the steps are not the same. In this case we can move the
//    sequence to the superclass and allow polymorphism to play its role in ensuring the
//    different steps do their things differently. This kind of method is called a template
//    method [Gang of Four].

    protected String footerString(Customer customer) {
        String result = "";
        result += "<P>You owe <EM>" + String.valueOf(customer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                String.valueOf(customer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
        return result;
    }

    protected String eachRentalString(Rental each) {
        return each.getMovie().getTitle()+ ": " +
                String.valueOf(each.getCharge()) + "<BR>\n";
    }

    protected String headerString(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }

}
