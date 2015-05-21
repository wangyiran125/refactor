package wangyiran.simplifying.condition.introduce.nullobject.refactor2;

/**
 * Created by wyr on 2015/5/21.
 */
public class Customer implements Nullable{
    private String name;
    private BillingPlan billingPlan;
    private PaymentHistory paymentHistory;
    public BillingPlan getPlan(){
        return billingPlan;
    }
    public String getName(){
        return name;
    }

    public PaymentHistory getHistory(){
        return paymentHistory;
    }

    public boolean isNull(){
        return false;
    }

    static Customer newNull(){
        return new NullCustomer();
    }

    public void setPlan(BillingPlan plan) {
        this.billingPlan = plan;
    }
}
