package wangyiran.move.features.between.objects.move.hide.delegate.notrefactor;

/**
 * Created by wyr on 2015/5/18.
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Department department = new Department(person);
/*        You can remove this dependency by placing a simple
        delegating method on the server, which hides the delegate (Figure 7.1). Changes
        become limited to the server and don¡¯t propagate to the client.*/
        Person manager = person.get_department().get_manger();
    }
}
