package wangyiran.move.features.between.objects.move.field.notrefactor;

/**
 * Created by wyr on 2015/5/15.
 */
public class Account {
    private AccountType _type;
   /* I consider moving a field if I see more methods on another class using the field
            than the class itself.*/
    private double _interestRate;

    double interestForAmount_days(double amount,int days){
        return _interestRate * amount * days /365;
    }
}
