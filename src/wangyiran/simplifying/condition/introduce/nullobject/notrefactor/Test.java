package wangyiran.simplifying.condition.introduce.nullobject.notrefactor;

/**
 * Created by wyr on 2015/5/21.
 */
public class Test {
    private Site site = new Site();
    public void dealWith(){
       Customer customer = site.getCustomer();
        BillingPlan plan;
        if (customer == null){
            plan = BillingPlan.basic();
        }else
            plan = customer.getPlan();
        String customerName;
        if (customer == null)
            customerName = "occupant";
        else
            customerName = customer.getName();
        int weekDelinquent;
        if (customer == null) weekDelinquent = 6;
        else weekDelinquent = customer.getHistory().getWeekInLastYear();
    }
}
