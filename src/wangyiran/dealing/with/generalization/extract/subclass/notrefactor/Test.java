package wangyiran.dealing.with.generalization.extract.subclass.notrefactor;

/**
 * Created by wyr on 2015/5/25.
 */
public class Test {
    public static void main(String[] args) {
        Employee kent = new Employee(4);
        JobItem jobItem = new JobItem(0,5,true,kent);
    }
}
