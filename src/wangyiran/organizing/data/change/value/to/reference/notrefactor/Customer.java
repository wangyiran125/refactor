package wangyiran.organizing.data.change.value.to.reference.notrefactor;

/**
 * Created by wyr on 2015/5/18.
 */
public class Customer {
    private final String _name;

    public Customer(String _name) {
        this._name = _name;
    }

    public String get_name() {
        return _name;
    }
}
