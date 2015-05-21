package wangyiran.simplifying.condition.replace.nested.conditional.with.guard.clauses.refactor;

/**
 * Created by wyr on 2015/5/20.
 */
public class Client {
    private boolean _isDead;
    private boolean _isSeparated;
    private boolean _isRetired;

//    Then the checking is masking the normal course of action behind the checking.
//    So instead it is clearer to use guard clauses. I can introduce these one at a time. I like
//    to start at the top:

//    These kinds of conditionals have different intentions, and these intentions
//    should come through in the code. If both are part of normal behavior, use a condition
//    with an if and an else leg. If the condition is an unusual condition, check the
//    condition and return if the condition is true. This kind of check is often called a
//    guard clause
//    double getPayAmount() {
//        double result;
//        if (_isDead) result = deadAmount();
//        if (_isSeparated)  result = separatedAmount();
//        else{
//            if (_isRetired) result = retiredAmount();
//            else result = normalPayAmount();
//        }
//        return result;
//    }

    double getPayAmount() {
        //        double result;
        if (_isDead) return deadAmount();
        if (_isSeparated) return separatedAmount();
        if (_isRetired) return retiredAmount();
        return normalPayAmount();
    }

    private double retiredAmount() {
        return 0;
    }

    private double normalPayAmount() {
        return 0;
    }

    private double separatedAmount() {
        return 0;
    }

    private double deadAmount() {
        return 0;
    }
}
