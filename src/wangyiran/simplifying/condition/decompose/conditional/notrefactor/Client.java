package wangyiran.simplifying.condition.decompose.conditional.notrefactor;

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

//    One of the most common areas of complexity in a program lies in complex
//    conditional logic.

//    With conditions you can receive further benefit by
//    doing this for the conditional part and each of the alternatives. This way you
//    highlight the condition and make it clearly what you are branching on. You also
//    highlight the reason for the branching.
    public void dealWith(){
        if (date.before(SUMMER_START) || date.after(SUMMER_END)){
            charge = quantity * _winterRate + _winterServiceCharge;
        }else charge =  quantity * _summerRate;
    }
}
