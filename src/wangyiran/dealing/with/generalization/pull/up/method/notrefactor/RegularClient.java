package wangyiran.dealing.with.generalization.pull.up.method.notrefactor;

import java.util.Date;

/**
 * Created by wyr on 2015/5/22.
 */
public class RegularClient {
    private Date lastBillDate;
    private Date charge;
//    Eliminating duplicate behavior is important. Although two duplicate methods
//    work fine as they are, they are nothing more than a breeding ground for bugs in the
//    future. Whenever there is duplication, you face the risk that an alteration to one will
//    not be made to the other. Usually it is difficult to find the duplicates.
//    The easiest case of using Pull Up Method occurs when the methods have the
//    same body, implying there¡¯s been a copy and paste.
    void createBill(Date date){
        Date lastBillDate = new Date();
        Date charge = new Date();
        double chargeAmount = chargeFor(lastBillDate,date);
        addBill(date,charge);
    }

    private void addBill(Date date, Date charge) {

    }

    private double chargeFor(Date lastBillDate, Date date) {
        return 0;
    }
}
