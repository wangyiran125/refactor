package wangyiran.making.method.calls.simpler.preserve.whole.object.notrefactor;

/**
 * Created by wyr on 2015/5/21.
 */
public class Room {
    boolean withPlan(HeatingPlan plan) {
        int low = daysTempRange().getLow();
        int high = daysTempRange().getHigh();
       return plan.withinRange(low,high);
    }

    private TempRange daysTempRange() {
        return  new TempRange();
    }
}
