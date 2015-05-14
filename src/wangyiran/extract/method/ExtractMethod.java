package wangyiran.extract.method;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wyr on 2015/5/14.
 */
public class ExtractMethod {
    private String _name;
    List<Double> _orders = new ArrayList<>();
    public void printOwing(double amount){
        Iterator<Double> e = _orders.iterator();
        printBanner();
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
