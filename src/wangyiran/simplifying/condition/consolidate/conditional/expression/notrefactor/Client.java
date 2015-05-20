package wangyiran.simplifying.condition.consolidate.conditional.expression.notrefactor;

/**
 * Created by wyr on 2015/5/20.
 */
public class Client {
    private int _seniority;
    private int _monthsDisabled;
    private boolean _isPartTime;

  /*  Consolidating the conditional code is important for two reasons. First, it makes
    the check clearer by showing that you are really making a single check that¡¯s oring
    the other checks together.
    The
    second reason for this refactoring is that it often sets you up for Extract Method
            (110). Extracting a condition is one of the most useful things you can do to clarify
    your code. It replaces a statement of what you are doing with why you are doing it*/
    double disabilityAmount(){
        if (_seniority < 2) return 0;
        if (_monthsDisabled > 12) return 0;
        if (_isPartTime) return 0;
        //compute
        return 21.4;
    }
}
