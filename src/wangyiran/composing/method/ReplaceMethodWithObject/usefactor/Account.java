package wangyiran.composing.method.ReplaceMethodWithObject.usefactor;

/**
 * Created by wyr on 2015/5/15.
 */
public class Account {
    public int gamma(int inputValue,int quantity,int yearToDate){
        /*The difficulty in decomposing a method lies in local variables. If they are
        rampant, decomposition can be difficult*/
        return new Gamma(this,inputValue, quantity, yearToDate).compute();
    }

    public int delta() {
        return 2;
    }


}
