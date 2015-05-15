package wangyiran.composing.method;

/**
 * Created by wyr on 2015/5/15.
 */
public class NotRemoveAssignmentToParameters {
    int discount(int inputVal,int quantity,int yearToDate){
/*        i have no problems with
        doing something to the object that was passed in; I do that all the time. I just object
        to changing foo to refer to another object entirely:*/
        if (inputVal > 50) inputVal -= 2;
        return inputVal;
    }
}
