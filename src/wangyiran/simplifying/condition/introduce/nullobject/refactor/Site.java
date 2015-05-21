package wangyiran.simplifying.condition.introduce.nullobject.refactor;

/**
 * Created by wyr on 2015/5/21.
 */
public class Site {
    private Customer _customer;

    Customer getCustomer(){
        return (_customer == null ) ? Customer.newNull():_customer;
    }
}
