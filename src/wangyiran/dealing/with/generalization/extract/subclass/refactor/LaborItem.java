package wangyiran.dealing.with.generalization.extract.subclass.refactor;

/**
 * Created by wyr on 2015/5/25.
 */
public class LaborItem extends JobItem{
//    public LaborItem(int _unitPrice, int _quantity, boolean _isLabor, Employee _employee) {
//        super(_unitPrice, _quantity, _isLabor, _employee);
//    }

    public LaborItem(int _unitPrice, int _quantity, boolean _isLabor, Employee employee) {
        super(_unitPrice,_quantity);
        _employee = employee;
    }

//    I extract a LaborItem subclass from this class because some of the behavior and
//            data are needed only in that case.

//    Now I can start pushing down the features of the job item. I begin with the
//    methods. I start with using Push Down Method (328) on getEmployee:

    public Employee getEmployee() {
        return _employee;
    }

    @Override
    protected boolean isLabor() {
        return true;
    }


    protected Employee _employee;

    @Override
    public int getUnitPrice() {
        return _employee.getRate();
    }
}
