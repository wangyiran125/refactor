package wangyiran.simplifying.condition.decompose.conditional.refactor;

import java.util.Date;

/**
 * Created by wyr on 2015/5/20.
 */
public class Client {
    private static final Date SUMMER_START = new Date();
    private static final Date SUMMER_END = new Date();
    private Date date = new Date();
    private double charge;
    private double quantity;
    private double _winterRate;
    private double _summerRate;
    private double _winterServiceCharge;


//    I extract the conditional and each leg as follows:
    public void dealWith(){
        if (notSummer()){
            charge = winterCharge();
        }else charge = summerCharge();
    }

    private double summerCharge() {
        return quantity * _summerRate;
    }

    private double winterCharge() {
        return quantity * _winterRate + _winterServiceCharge;
    }

    private boolean notSummer() {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }
}
