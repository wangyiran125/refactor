package wangyiran.dealing.with.generalization.extract.subclass.refactor;

/**
 * Created by wyr on 2015/5/25.
 */
public class JobItem {

//    The main trigger for use of Extract Subclass is the realization that a class has
//            behavior used for some instances of the class and not for others.

//    protected JobItem(int _unitPrice, int _quantity,boolean _isLabor,Employee _employee) {
//        this._unitPrice = _unitPrice;
//        this._quantity = _quantity;
//        this._employee = _employee;
//        this._isLabor = _isLabor;
//    }
//Once the employee field is protected, I can clean up the constructors so that
//    employee is set only in the subclass into which it is being pushed down:

//    The field _isLabor is used to indicate information that is now inherent in the
//    hierarchy. So I can remove the field. The best way to do this is to first use Self
//    Encapsulate Field (171) and then change the accessor to use a polymorphic constant
//    method. A polymorphic constant method is one whereby each implementation
//    returns a (different) fixed value
//    protected JobItem(int unitPrice,int quantity,boolean isLabor){
//        _unitPrice = unitPrice;
//        _quantity = quantity;
//        _isLabor = isLabor;
//    }
//    Then I can get rid of the isLabor field.
//private boolean _isLabor;
protected JobItem(int unitPrice,int quantity){
    _unitPrice = unitPrice;
    _quantity = quantity;
}
//    Now is a good time to clean up the constructor parameter lists. I use Rename
//                                                                          Method (273) on each of them. I work with the superclass first. I create the new
//    constructor and make the old one protected (the subclass still needs it):
//    public JobItem (int unitPrice,int _quantity){
//        this(unitPrice,_quantity,false,null);
//    }

    public Employee getEmployee() {
        return _employee;
    }

    public int getTotalPrice() {
        return getUnitPrice() * _quantity;
    }

    public int getQuantity(){
        return _quantity;
    }
    private int _unitPrice;
    private int _quantity;
    private Employee _employee;
    private boolean _isLabor;

    protected boolean isLabor(){
        return false;
    }
//    These should be refactored with
//    Replace Conditional with Polymorphism (255).
//    public int getUnitPrice() {
//       return
//         (isLabor()) ?
//            _employee.getRate():_unitPrice;
//    }
    public int getUnitPrice() {
       return _unitPrice;
    }
}
