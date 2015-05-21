package wangyiran.making.method.calls.simpler.preserve.whole.object.notrefactor;

/**
 * Created by wyr on 2015/5/21.
 */
public class HeatingPlan {
//    This type of situation arises when an object passes several data values from a
//    single object as parameters in a method call. The problem with this is that if the
//    called object needs new data values later, you have to find and change all the calls to
//    this method. You can avoid this by passing in the whole object from which the data
//    came. The called object then can ask for whatever it wants from the whole object.
    boolean withinRange(int low,int high){
        return (low >= _range.getLow() && high <= _range.getHigh());
    }
    private TempRange _range;
}
