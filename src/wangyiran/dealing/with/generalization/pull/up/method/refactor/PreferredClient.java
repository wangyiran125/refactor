package wangyiran.dealing.with.generalization.pull.up.method.refactor;

import java.util.Date;

/**
 * Created by wyr on 2015/5/22.
 */
public class PreferredClient extends Customer {

    double chargeFor(Date lastBillDate, Date date) {
        return 4;
    }
}
