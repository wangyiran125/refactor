package wangyiran.organizing.data.moving.behavior.into.theclass.notrefactor;

import wangyiran.organizing.data.encapsulate.collection.refactor.Course;
import wangyiran.organizing.data.encapsulate.collection.refactor.Person;

import java.util.Iterator;

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

 /*       Now I like to look at the users of the getter to find code
        that ought to be on person.*/
        Iterator<Course> courseIterator = kent.getCourses().iterator();
        int count = 0;
        while (courseIterator.hasNext()){
           Course each =  courseIterator.next();
            if (each.isAdvanced()) count++;
        }
    }
}
