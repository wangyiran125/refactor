package wangyiran.extract.method;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * Created by wyr on 2015/5/14.
 */
public class InlineTemp2 {
    private String _name;
    List<Double> _orders = new ArrayList<>();
    public void printOwing(double previousAmount){
        printBanner();
        printBanner();
        double outstanding = getOutStanding(previousAmount * 1.2);//ctrl + alt + n
        printDetails(previousAmount);
    }

    private double getOutStanding(double initialValue) {
        double result = initialValue;
        Iterator<Double> e = _orders.iterator();
        while (e.hasNext()){
            double each = e.next();
            result += each;
        }
        return result;
    }

    private void printDetails(double amount) {
        System.out.println("name:" + _name);
        System.out.println("amount:"+amount);
    }

    private void printBanner() {
        System.out.println("banner");
    }
}
