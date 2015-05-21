package wangyiran.simplifying.condition.replace.nested.conditional.with.guard.clauses.notrefactor;

/**
 * Created by wyr on 2015/5/20.
 */
public class Client {
    private boolean _isDead;
    private boolean _isSeparated;
    private boolean _isRetired;

//    I often find I use Replace Nested Conditional with Guard Clauses when I¡¯m
//    working with a programmer who has been taught to have only one entry point and
//    one exit point from a method. One entry point is enforced by modern languages, and
//    one exit point is really not a useful rule. Clarity is the key principle: if the method is
//    clearer with one exit point, use one exit point; otherwise don¡¯t.
    double getPayAmount() {
        double result;
        if (_isDead) result = deadAmount();
        else {
            if (_isSeparated) result = separatedAmount();
            else {
                if (_isRetired) result = retiredAmount();
                else result = normalPayAmount();
            }
        }
        return result; //only one exist point
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
