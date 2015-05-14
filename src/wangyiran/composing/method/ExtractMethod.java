package wangyiran.composing.method;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyr on 2015/5/14.
 */
public class ExtractMethod {

    List<Double> _orders = new ArrayList<>();
    private String _name;
    public void printOwing(double amount){
        printBanner();
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
