package wangyiran.organizing.data.self.encapsulate.field.notrefactor;

/**
 * Created by wyr on 2015/5/18.
 */
public class NotSelfEncapsulateField {
    private int _low;
    private int _high;
    public boolean includes(int arg){
        return arg >= _low && arg <= _high;
    }
}
