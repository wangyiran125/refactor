package wangyiran.organizing.data.change.value.to.reference.notrefactor;

/**
 * Created by wyr on 2015/5/18.
 */
public class Order {
    public Order(String customerName){
        this._customer = new Customer(customerName);
    }

    public void set_customer(String customerName) {
        _customer = new Customer(customerName);
    }

    public String getCustomerName(){
        return _customer.get_name();
    }
    private Customer _customer;
}
