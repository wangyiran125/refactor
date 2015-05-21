package wangyiran.making.method.calls.simpler.preserve.whole.object.refactor;

/**
 * Created by wyr on 2015/5/21.
 */
public class HeatingPlan {
    boolean withinRange(TempRange roomRange){
        return (roomRange.getLow() >= _range.getLow() && roomRange.getHigh() <= _range.getHigh());
    }
    private TempRange _range;
}
