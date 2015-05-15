package wangyiran.move.features.between.objects.move.method.usefactor;

/**
 * Created by wyr on 2015/5/15.
 */
public class Account {
  /*  I move methods when
    classes have too much behavior or when classes are collaborating too much and are
    too highly coupled.
    I usually look through the methods on a class to find a method that seems to
            reference another object more than the object it lives on.*/

    double overdraftCharge(){
        return _type.overdraftCharge(_daysOverdrawn);
    }

    double bankCharge(){
        double result = 4.5;
        if (_daysOverdrawn > 0)
            result += overdraftCharge();
        return result;
    }

    private AccountType _type;
    private int _daysOverdrawn;

    public int get_daysOverdrawn() {
        return _daysOverdrawn;
    }
}
