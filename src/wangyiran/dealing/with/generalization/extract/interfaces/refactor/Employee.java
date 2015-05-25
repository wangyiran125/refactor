package wangyiran.dealing.with.generalization.extract.interfaces.refactor;


/**
 * Created by wyr on 2015/5/25.
 */

//Employee has many other aspects to it than the charge rate and the special skill
//        information, but those are the only pieces that this application needs.
public class Employee implements Billable{
    private int rate;

    public int getRate() {
        return rate;
    }


    public boolean hasSpecialSkill() {
        return true;
    }
}
