package wangyiran.simplifying.condition.introduce.nullobject.refactor2;

/**
 * Created by wyr on 2015/5/21.
 */
public class NullPaymentHistory extends PaymentHistory {
    @Override
    public int getWeekInLastYear() {
        return 0;
    }
}
