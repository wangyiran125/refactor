package wangyiran.organizing.data.encapsulate.collection.notrefactor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by wyr on 2015/5/19.
 */
public class Test {
    public static void main(String[] args) {
        Person kent = new Person();
        Set<Course> s = new HashSet<>();
        s.add(new Course("smalltalk", false));
        s.add(new Course("application", true));
        kent.getCourses().add(s);
        Course refact = new Course("refactoring",true);
        kent.getCourses().add(refact);
        kent.getCourses().add(new Course("brutal", false));
        kent.getCourses().remove(refact);

        Iterator<Course> courseIterator = kent.getCourses().iterator();
        int count = 0;
        while (courseIterator.hasNext()){
           Course each =  courseIterator.next();
            if (each.isAdvanced()) count++;
        }
    }
}
