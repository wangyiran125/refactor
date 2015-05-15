package wangyiran.composing.method.ReplaceMethodWithObject.usefactor;

/**
 * Created by wyr on 2015/5/15.
 */
public class Gamma {
        private int inputValue;
        private int quantity;
        private int yearToDate;
        private Account _account;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    public Gamma(Account account, int inputValue, int quantity, int yearToDate) {
            this.inputValue = inputValue;
            this.quantity = quantity;
            this.yearToDate = yearToDate;
        }

        public int compute() {
            //ctrl+alt+f extract field
            importantValue1 = (inputValue * quantity ) + _account.delta();
            importantValue2 = (inputValue * yearToDate ) + 100;
            //this time is easy to extract method
            importantThing();
            importantValue3 = importantValue2 * 7;
            return importantValue3 -2 * importantValue1;
        }

    private void importantThing() {
        if ((yearToDate - importantValue1) > 100){
            importantValue2 -= 20;
        }
    }
}
