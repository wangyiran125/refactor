package wangyiran.dealing.with.generalization.extract.subclass.notrefactor;

/**
 * Created by wyr on 2015/5/25.
 */
public class JobItem {
    public JobItem(int _unitPrice, int _quantity, boolean _isLabor, Employee _employee) {
        this._unitPrice = _unitPrice;
        this._quantity = _quantity;
        this._employee = _employee;
        this._isLabor = _isLabor;
    }


    //    The main trigger for use of Extract Subclass is the realization that a class has
//            behavior used for some instances of the class and not for others.



    public Employee getEmployee() {
        return _employee;
    }

    public int getTotalPrice() {
        return getUnitPrice() * _quantity;
    }

    public int get_quantity() {
        return _quantity;
    }

    public int getQuantity(){
        return _quantity;
    }
    private int _unitPrice;
    private int _quantity;
    private Employee _employee;
    private boolean _isLabor;

    public int getUnitPrice() {
       return
         (_isLabor) ?
            _employee.getRate():_unitPrice;
    }
}
