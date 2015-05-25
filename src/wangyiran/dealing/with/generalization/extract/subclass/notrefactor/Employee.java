package wangyiran.dealing.with.generalization.extract.subclass.notrefactor;

/**
 * Created by wyr on 2015/5/25.
 */
public class Employee {
    public Employee(int _rate) {
        this._rate = _rate;
    }

    public int getRate() {
        return _rate;
    }

    private int _rate;
}
