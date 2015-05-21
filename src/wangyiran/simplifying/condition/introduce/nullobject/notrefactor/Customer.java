package wangyiran.simplifying.condition.introduce.nullobject.notrefactor;

/**
 * Created by wyr on 2015/5/21.
 */
public class Customer {
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
}
