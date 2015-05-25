package wangyiran.dealing.with.generalization.extract.subclass.refactor;


/**
 * Created by wyr on 2015/5/25.
 */
public class Test {
    public static void main(String[] args) {
       Employee kent = new Employee(4);
       LaborItem jobItem = new LaborItem(0,5,kent);
    }
}
