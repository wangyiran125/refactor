package wangyiran.organizing.data.replace.type.code.with.stateOrstrategy.refactor;

/**
 * Created by wyr on 2015/5/19.
 */
public class Employee {
    private EmployeeType _type;

//    My first step, as ever, is to self-encapsulate the type code:
    public int getType() {
        return _type.getTypeCode();
    }


  /*  Now
    I actually hook the subclasses into the employee by modifying the accessors for the
    type code:*/

//    This means I now have a switch statement here. Once I¡¯m finished refactoring,
//    it will be the only one anywhere in the code, and it will be executed only when the
//    type is changed
//    public void setType(int type){
//        switch (type){
//            case ENGINEER:
//                _type = new Engineer();
//                break;
//            case SALESMAN:
//                _type = new Salseman();
//                break;
//            case MANAGER:
//                _type = new Manager();
//                break;
//            default:
//                throw new IllegalArgumentException("incorrect Employee code");
//
//        }
//    }

    private int _monthlySalary;
    private int _commission;
    private int _bonus;

//    Then I remove the type code definitions from the employee and replace them
//    with references to the employee type:
    int payAmount(){
        switch (getType()){
            case EmployeeType.ENGINEER:
                return _monthlySalary;
            case EmployeeType.SALESMAN:
                return _monthlySalary + _commission;
            case EmployeeType.MANAGER:
                return _monthlySalary + _bonus;
            default:
                throw new RuntimeException("incorrect Employee");
        }
    }
}
