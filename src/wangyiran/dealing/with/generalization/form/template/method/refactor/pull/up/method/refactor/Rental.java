package wangyiran.dealing.with.generalization.form.template.method.refactor.pull.up.method.refactor;

/**
 * Created by wyr on 2015/5/22.
 */
public class Rental {


    private String charge;

    public Movie getMovie() {
        return new Movie();
    }

    public String getCharge() {
        return charge;
    }
}
