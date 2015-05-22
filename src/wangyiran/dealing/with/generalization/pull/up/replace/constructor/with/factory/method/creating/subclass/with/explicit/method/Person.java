package wangyiran.dealing.with.generalization.pull.up.replace.constructor.with.factory.method.creating.subclass.with.explicit.method;

/**
 * Created by wyr on 2015/5/22.
 */
public class Person {
//    This leaves the superclass knowing about the subclasses. If you want to avoid
//    this, you need a more complex scheme, such as a product trader [B?umer and
//    Riehle]. Most of the time, however, that complexity isn¡¯t needed, and this approach
//    works nicely.
    static Person createMale(){
        return new Male();
    }

    static Person createFemale(){
        return new Female();
    }
}
