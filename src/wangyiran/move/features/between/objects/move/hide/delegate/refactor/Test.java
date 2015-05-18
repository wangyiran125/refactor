package wangyiran.move.features.between.objects.move.hide.delegate.refactor;

/**
 * Created by wyr on 2015/5/18.
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Department department = new Department(person);
        Person manager = person.get_department().get_manger();
    }
}
