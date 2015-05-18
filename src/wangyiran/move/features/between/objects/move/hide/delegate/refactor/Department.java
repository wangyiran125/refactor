package wangyiran.move.features.between.objects.move.hide.delegate.refactor;

/**
 * Created by wyr on 2015/5/18.
 */
public class Department {
    private String _chargeCode;
    private Person _manger;

    public Department(Person _manger) {
        this._manger = _manger;
    }

    public Person get_manger() {
        return _manger;
    }


}
