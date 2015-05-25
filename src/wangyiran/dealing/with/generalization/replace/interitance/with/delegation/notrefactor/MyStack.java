package wangyiran.dealing.with.generalization.replace.interitance.with.delegation.notrefactor;

import java.util.Vector;

/**
 * Created by wyr on 2015/5/25.
 */

//Often you
//        start inheriting from a class but then find that many of the superclass operations
//        aren¡¯t really true of the subclass. In this case you have an interface that¡¯s not a true
//        reflection of what the class does.

//By using delegation instead, you make it clear that you are making only partial
//        use of the delegated class

//Looking at the users of the class, I realize that clients do only four things with
//        stack: push, pop, size, and isEmpty. The latter two are inherited from Vector.
//        I begin the delegation by creating a field for the delegated vector. I link this
//        field to this so that I can mix delegation and inheritance while I carry out the
//        refactoring:
public class MyStack extends Vector{
    public void push(Object element) {
        insertElementAt(element,0);
    }
    public Object pop() {
        Object result = firstElement();
        removeElementAt(0);
        return result;
    }
}
