package wangyiran.composing.method;

/**
 * Created by wyr on 2015/5/14.
 */
public class ReplaceTempWithQuery {
    private double itemPrice;
    private int quantity;
    public double price(){
        //extract expression to a method
        //through replace the temp with a query method,any method in the class can get at the information
        if (basePrice() >1000){
            return basePrice() *0.95;
        }else
            return basePrice() * 0.98;
    }

    private double basePrice() {
        return quantity * itemPrice;
    }

}
