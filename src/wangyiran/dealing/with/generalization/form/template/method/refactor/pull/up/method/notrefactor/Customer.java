package wangyiran.dealing.with.generalization.form.template.method.refactor.pull.up.method.notrefactor;

import java.util.Hashtable;

public class Customer {

    Hashtable _rentals;
    String name;
    Integer totalCharge;
    int totalFrequentRenterPoints;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public Integer getTotalCharge() {
        return totalCharge;
    }

    public String statement(){
        return new TextStatement().value(this);
    }

    public String htmlStatement(){
        return new HtmlStatement().value(this);
    }

    public Integer getTotalFrequentRenterPoints() {
        return totalFrequentRenterPoints;
    }

    public Hashtable get_rentals() {
        return _rentals;
    }
}