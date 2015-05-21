package wangyiran.simplifying.condition.introduce.nullobject.refactor;

/**
 * Created by wyr on 2015/5/21.
 */
public class BillingPlan {
    public static BillingPlan basic() {
        return new BillingPlan();
    }

    public static BillingPlan special() {
        return new NullBillingPlan();
    }
}
