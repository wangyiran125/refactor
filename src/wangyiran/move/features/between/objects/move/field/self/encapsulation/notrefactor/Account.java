package wangyiran.move.features.between.objects.move.field.self.encapsulation.notrefactor;

/**
 * Created by wyr on 2015/5/15.
 */
public class Account {
    private AccountType _type;
   /* I consider moving a field if I see more methods on another class using the field
            than the class itself.*/
   /*If a lot of methods use the interest rate field, I might start by using Self
    Encapsulate Field (171):*/
    private double _interestRate;

    double interestForAmount_days(double amount,int days){
        return _interestRate * amount * days /365;
    }

    double interestForAmount_hours(double amount,int days){
        return _interestRate * amount * days /365*24;
    }

    double interestForAmount_minute(double amount,int days){
        return _interestRate * amount * days /365*24*60;
    }
}
