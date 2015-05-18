package wangyiran.organizing.data.replace.data.value.with.object.notrefactor;

/**
 * Created by wyr on 2015/5/18.
 */
public class Order {
/*    As development proceeds you realize that those
    simple items aren¡¯t so simple anymore. A telephone number may be represented as a
    string for a while, but later you realize that the telephone needs special behavior for
    formatting, extracting the area code, and the like. For one or two items you may put
    the methods in the owning object, but quickly the code smells of duplication and
    feature envy. When the smell begins, turn the data value into an object.*/
    public Order(String _customer) {
        this._customer = _customer;
    }

    public String get_customer() {
        return _customer;
    }

    public void set_customer(String _customer) {
        this._customer = _customer;
    }

    private String _customer;
}
