package wangyiran.simplifying.condition.introduce.nullobject.refactor2;

/**
 * Created by wyr on 2015/5/21.
 */
public class NullCustomer extends Customer implements Nullable{
    public boolean isNull(){
        return true;
    }

    @Override
    public String getName() {
        return "occupant";
    }

    @Override
    public PaymentHistory getHistory() {
        return new NullPaymentHistory();
    }
}
