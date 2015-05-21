package wangyiran.simplifying.condition.introduce.nullobject.refactor;

/**
 * Created by wyr on 2015/5/21.
 */
public class Test {
    private Site site = new Site();
    public void dealWith(){
       Customer customer = site.getCustomer();
        BillingPlan plan;
        if (customer.isNull()){
            customer.setPlan(BillingPlan.special());
        }else
            plan = customer.getPlan();
        String customerName = customer.getName();
        int weekDelinquent;
        if (customer.isNull()) weekDelinquent = 6;
        else weekDelinquent = customer.getHistory().getWeekInLastYear();
    }
}
