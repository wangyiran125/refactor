package wangyiran.simplifying.condition.consolidate.duplicate.conditional.fragments.refactor;

/**
 * Created by wyr on 2015/5/20.
 */
public class Client {
    private double total;
    private double price;

//    Sometimes you find the same code executed in all legs of a conditional. In that
//    case you should move the code to outside the conditional. This makes clearer what
//    varies and what stays the same.
    public void dealWith() {
        if (isSpecialDeal()) {
            total = price * 0.95;
        } else {
            total = price * 0.98;
        }
            send();
    }

    private void send() {
        //compute
    }

    public boolean isSpecialDeal() {
        return true;
    }
}
