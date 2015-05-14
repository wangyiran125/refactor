package wangyiran.composing.method;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * Created by wyr on 2015/5/14.
 */
public class ReassignLocalVariable1 {
    private String _name;
    List<Double> _orders = new ArrayList<>();
    public void printOwing(double amount){
        printBanner();
        printBanner();
        //reassign a local variable
        double outstanding = getOutStanding();
        printDetails(amount);
    }

    private double getOutStanding() {
        double outstanding = 0.0;
        Iterator<Double> e = _orders.iterator();
        while (e.hasNext()){
            double each = e.next();
            outstanding += each;
        }
        return outstanding;
    }

    private void printDetails(double amount) {
        System.out.println("name:" + _name);
        System.out.println("amount:"+amount);
    }

    private void printBanner() {
        System.out.println("banner");
    }
}
