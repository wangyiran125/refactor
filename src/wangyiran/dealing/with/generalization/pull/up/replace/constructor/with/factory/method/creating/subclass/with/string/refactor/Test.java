package wangyiran.dealing.with.generalization.pull.up.replace.constructor.with.factory.method.creating.subclass.with.string.refactor;

/**
 * Created by wyr on 2015/5/22.
 */
public class Test {
    public static void main(String[] args) {
        Employee employee = Employee.create(Employee.ENGINEER);
        Employee employee1 = Employee.create("Engineer");
    }
}
