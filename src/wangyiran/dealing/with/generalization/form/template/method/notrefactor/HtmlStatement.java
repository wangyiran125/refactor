package wangyiran.dealing.with.generalization.form.template.method.notrefactor;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by wyr on 2015/5/22.
 */
public class HtmlStatement {
    private Hashtable _rentals;
    private String name;
    private Integer totalCharge;
    private Integer totalFrequentRenterPoints;
    
    public String htmlStatement() {
        Enumeration rentals = _rentals.elements();
        String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
//show figures for each rental
            result += each.getMovie().getTitle()+ ": " +
                    String.valueOf(each.getCharge()) + "<BR>\n";
        }
//add footer lines
        result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                String.valueOf(getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
        return result;
    }

    public String getName() {
        return name;
    }

    public int getTotalCharge(){
        return totalCharge;
    }

    public Integer getTotalFrequentRenterPoints(){
        return totalFrequentRenterPoints;
    }
}
