package wangyiran.extract.method;

/**
 * Created by wyr on 2015/5/14.
 */
public class NotExtractMethod {
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
