package wangyiran.move.features.between.objects.move.remove.middle.man.refactor;

/**
 * Created by wyr on 2015/5/18.
 */
public class Department {
    private Person _manager;

    public Department(Person _manager) {
        this._manager = _manager;
    }

    public Person get_manager() {
        return _manager;
    }
}
