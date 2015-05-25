package wangyiran.dealing.with.generalization.extract.interfaces.refactor;

/**
 * Created by wyr on 2015/5/25.
 */

//Such a gain would
//        not be worthwhile for one method, but if several classes were to use the billable
//interface on person, that would be useful. The big gain appears when I want to bill
//        computers too. To make them billable I know that all I have to do is implement the
//        billable interface and I can put computers on timesheets
public interface Billable {
    public int getRate();
    public boolean hasSpecialSkill();
}
