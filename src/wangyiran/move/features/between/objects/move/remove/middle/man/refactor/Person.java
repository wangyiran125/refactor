package wangyiran.move.features.between.objects.move.remove.middle.man.refactor;

/**
 * Created by wyr on 2015/5/18.
 */
public class Person {
    private Department _department;
/*    The price is that
    every time the client wants to use a new feature of the delegate, you have to add a
    simple delegating method to the server. After adding features for a while, it becomes
    painful.*/
//    public Person getManager(){
//        return  _department.get_manager();
//    }

    public Department get_department() {
        return _department;
    }
}
