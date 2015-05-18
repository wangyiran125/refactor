package wangyiran.move.features.between.objects.move.hide.delegate.refactor;

/**
 * Created by wyr on 2015/5/18.
 */
public class Person {
    Department _department;

    public Department get_department() {
        return _department;
    }

    public void set_department(Department _department) {
        this._department = _department;
    }

    public Person getManager(){
      return   _department.get_manger();
    }
}
