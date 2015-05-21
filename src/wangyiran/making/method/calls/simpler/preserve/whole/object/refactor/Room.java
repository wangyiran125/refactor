package wangyiran.making.method.calls.simpler.preserve.whole.object.refactor;

/**
 * Created by wyr on 2015/5/21.
 */
public class Room {
    boolean withPlan(HeatingPlan plan) {
       return plan.withinRange(daysTempRange());
    }

    private TempRange daysTempRange() {
        return  new TempRange();
    }
}
