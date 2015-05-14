package wangyiran.composing.method;

/**
 * Created by wyr on 2015/5/14.
 */
public class NotReplaceTempWithQuery {
    private double itemPrice;
    private int quantity;
    public double price(){
        //temp tend to encourage longer method,because that's the only way you can reach the temp
        double basePrice = quantity * itemPrice;
        if (basePrice >1000){
            return basePrice *0.95;
        }else
            return basePrice * 0.98;
    }

}
