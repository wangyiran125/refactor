package wangyiran.dealing.with.generalization.replace.delegation.with.inheritance.notrefactor;

/**
 * Created by wyr on 2015/5/25.
 */
public class Person {
    private String _name;
    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getLastName(){
        return _name.substring(_name.indexOf(" ")+1);
    }
}
