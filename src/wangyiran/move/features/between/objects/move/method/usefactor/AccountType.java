package wangyiran.move.features.between.objects.move.method.usefactor;

/**
 * Created by wyr on 2015/5/15.
 */
public class AccountType {
    boolean premium;
    public boolean isPremium() {
        return premium;
    }
    double overdraftCharge(double daysOverdrawn){//if you want parameter more one,you should passAccount
        if (isPremium()){//method overdraftCharge reference another object more than the Account class
            double result = 10;
            if (daysOverdrawn > 7)
                result += (daysOverdrawn - 7 ) * 0.85;
            return  result;
        }
        else
            return daysOverdrawn *1.75;
    }

    double overdraftCharge(Account account){//if you want parameter more one,you should passAccount
        if (isPremium()){//method overdraftCharge reference another object more than the Account class
            double result = 10;
            if (account.get_daysOverdrawn() > 7)
                result += (account.get_daysOverdrawn() - 7 ) * 0.85;
            return  result;
        }
        else
            return account.get_daysOverdrawn() *1.75;
    }
}
