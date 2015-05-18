package wangyiran.organizing.data.data.self.encapsulate.field.refactor;

/**
 * Created by wyr on 2015/5/18.
 */
public class NotSelfEncapsulateField {
    private int _low;
    private int _high;

    //encapsulate field
    public boolean includes(int arg){
        return arg >= get_low() && arg <= get_high();
    }

    public int get_low() {
        return _low;
    }

    public void set_low(int _low) {
        this._low = _low;
    }

    public int get_high() {
        return _high;
    }

    public void set_high(int _high) {
        this._high = _high;
    }
}
