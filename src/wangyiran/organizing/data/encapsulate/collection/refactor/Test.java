package wangyiran.organizing.data.encapsulate.collection.refactor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by wyr on 2015/5/19.
 */
public class Test {
    public static void main(String[] args) {
        Person kent = new Person();
        kent.addCourse(new Course("smalltalk", false));
        kent.addCourse(new Course("application", true));
        Course refact = new Course("refactoring",true);
        kent.addCourse(refact);
        kent.addCourse(new Course("brutal", false));
        kent.removeCourse(refact);

        Iterator<Course> courseIterator = kent.getCourses().iterator();
        int count = 0;
        while (courseIterator.hasNext()){
           Course each =  courseIterator.next();
            if (each.isAdvanced()) count++;
        }
    }
}
