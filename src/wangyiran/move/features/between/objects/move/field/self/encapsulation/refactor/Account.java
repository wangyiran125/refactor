package wangyiran.move.features.between.objects.move.field.self.encapsulation.refactor;

/**
 * Created by wyr on 2015/5/15.
 */
public class Account {
    private AccountType _type;
   /* I consider moving a field if I see more methods on another class using the field
            than the class itself.*/
   /*If a lot of methods use the interest rate field, I might start by using Self
    Encapsulate Field (171):*/
//use encapsulation field
    double interestForAmount_days(double amount,int days){
        return get_interestRate() * amount * days /365;
    }

    double interestForAmount_hours(double amount,int days){
        return get_interestRate() * amount * days /365*24;
    }

    double interestForAmount_minute(double amount,int days){
        return get_interestRate() * amount * days /365*24*60;
    }

    public double get_interestRate() {
        return _type.get_interestRate();
    }
}
