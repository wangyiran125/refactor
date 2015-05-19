package wangyiran.organizing.data.encapsulate.collection.refactor;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by wyr on 2015/5/19.
 */
public class Person {
/*    The getter should not return the collection object itself, because that
    allows clients to manipulate the contents of the collection without the owning class¡¯s
    knowing what is going on. It also reveals too much to clients about the object¡¯s
    internal data structures. A getter for a multivalued attribute should return something
    that prevents manipulation of the collection and hides unnecessary details about its
    structure. How you do this varies depending on the version of Java you are using*/
    public Set getCourses(){
        return Collections.unmodifiableSet(_courses);
    }

/*    In addition there should not be a setter for collection: rather there should be
    operations to add and remove elements. This gives the owning object control over
    adding and removing elements from the collection.
            With this protocol the collection is properly encapsulated, which reduces the
    coupling of the owning class to its clients.*/
    public void setCourses(Set courses){
        _courses = courses;
    }
    private Set _courses = new HashSet();

    public void addCourse(Course course){
        _courses.add(course);
    }
    public void removeCourse(Course course){
        _courses.remove(course);
    }

   /* public void initializedCourses(Set<Course> arg){
       Iterator<Course> iter = arg.iterator();
        while (iter.hasNext()){
            addCourse(iter.next());
        }
    }*/

 /*   If I know that I don¡¯t have any additional behavior when adding elements as I
    initialize, I can remove the loop and use addAll.*/
    public void initializedCourses(Set<Course> arg){
        _courses.addAll(arg);
    }

    public int numberOfAdvancedCourses(Person kent) {
            Iterator<Course> courseIterator = kent.getCourses().iterator();
            int count = 0;
            while (courseIterator.hasNext()){
                Course each =  courseIterator.next();
                if (each.isAdvanced()) count++;
            }
            return count;
    }
}
