package wangyiran.move.features.between.objects.move.field.refactor;

/**
 * Created by wyr on 2015/5/15.
 */
public class Account {
    private AccountType _type;

    double interestForAmount_days(double amount,int days){
        return _type.get_interestRate() * amount * days /365;
    }
}
