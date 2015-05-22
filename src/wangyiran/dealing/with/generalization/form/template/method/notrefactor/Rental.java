package wangyiran.dealing.with.generalization.form.template.method.notrefactor;

import javax.swing.*;

/**
 * Created by wyr on 2015/5/22.
 */
public class Rental {


    private String charge;

    public Movie getMovie() {
        return new  Movie();
    }

    public String getCharge() {
        return charge;
    }
}
