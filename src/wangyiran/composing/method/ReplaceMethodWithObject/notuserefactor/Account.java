package wangyiran.composing.method.ReplaceMethodWithObject.notuserefactor;

/**
 * Created by wyr on 2015/5/15.
 */
public class Account {
    public int gamma(int inputValue,int quantity,int yearToDate){
        /*The difficulty in decomposing a method lies in local variables. If they are
        rampant, decomposition can be difficult*/
        int importantValue1 = (inputValue * quantity ) + delta();
        int importantValue2 = (inputValue * yearToDate ) + 100;
        //this time is not easy to extract method
        if ((yearToDate - importantValue1) > 100){
            importantValue2 -= 20;
        }
        int importantValue3 = importantValue2 * 7;
        return importantValue3 -2 *importantValue1;
    }

    public int delta() {
        return 2;
    }
}
