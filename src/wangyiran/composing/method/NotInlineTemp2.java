package wangyiran.composing.method;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * Created by wyr on 2015/5/14.
 */
public class NotInlineTemp2 {
    private String _name;
    List<Double> _orders = new ArrayList<>();
    public void printOwing(double previousAmount){
        //temp tend to encourage longer method,because that's the only way you can reach the temp
        double outstanding = previousAmount * 1.2;
        printBanner();
        printBanner();
        //reassign a local variable
        outstanding = getOutStanding(outstanding);
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
