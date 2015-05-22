package wangyiran.dealing.with.generalization.form.template.method.notrefactor;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by wyr on 2015/5/22.
 */
public class TextStatement {
    private Hashtable _rentals;
    private String name;
    private Integer totalCharge;
    private int totalFrequentRenterPoints;

    public String statement() {
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
//show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }
//add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) +
                " frequent renter points";
        return result;
    }

    public String getName() {
        return name;
    }

    public Integer getTotalCharge() {
        return totalCharge;
    }

    public Integer getTotalFrequentRenterPoints(){
        return totalFrequentRenterPoints;
    }
}
