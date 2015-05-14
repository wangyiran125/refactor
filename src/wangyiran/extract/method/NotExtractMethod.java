package wangyiran.extract.method;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wyr on 2015/5/14.
 */
public class NotExtractMethod {

    List<Double> _orders = new ArrayList<>();
    private String _name;
    public void printOwing(double amount){
        printBanner();
        System.out.println("name:" + _name);
        System.out.println("amount:"+amount);
    }

    private void printBanner() {
        System.out.println("banner");
    }
}
