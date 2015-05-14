package wangyiran.extract.method;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wyr on 2015/5/14.
 */
public class NotReassignLocalVariable1 {

    List<Double> _orders = new ArrayList<>();
    private String _name;
    public void printOwing(double amount){
        Iterator<Double> e = _orders.iterator();
        double outstanding = 0.0;
        printBanner();
        while (e.hasNext()){
            double each = e.next();
            outstanding += each;
        }
        printDetails(amount);
    }

    private void printDetails(double amount) {
        System.out.println("name:" + _name);
        System.out.println("amount:"+amount);
    }

    private void printBanner() {
        System.out.println("banner");
    }
}
