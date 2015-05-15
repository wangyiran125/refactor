package wangyiran.composing.method;

/**
 * Created by wyr on 2015/5/15.
 */
public class RemoveAssignmentToParameters {
    int discount(int inputVal,int quantity,int yearToDate){
        /*I make it final
        to ensure it is only set once,set more once means more responsibilities in one method*/
        final  int result = inputVal;
        if (result > 50) inputVal -= 2;
        return inputVal;
    }
}
