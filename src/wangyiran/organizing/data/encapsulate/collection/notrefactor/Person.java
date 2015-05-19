package wangyiran.organizing.data.encapsulate.collection.notrefactor;

import java.util.Set;

/**
 * Created by wyr on 2015/5/19.
 */
public class Person {
    public Set getCourses(){
        return _courses;
    }

    public void setCourses(Set courses){
        _courses = courses;
    }
    private Set _courses;
}
