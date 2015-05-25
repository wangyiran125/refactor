package wangyiran.dealing.with.generalization.replace.interitance.with.delegation.refactor;

import java.util.Vector;

/**
 * Created by wyr on 2015/5/25.
 */

public class MyStack {
    private Vector _vector = new Vector();
    public void push(Object element){
        _vector.insertElementAt(element,0);
    }

    public Object pop(){
        Object result = _vector.firstElement();
        _vector.removeElementAt(0);
        return result;
    }

//    I then add simple delegating methods for superclass methods used by clients
    public int size(){
        return _vector.size();
    }
    public boolean isEmpty(){
        return _vector.isEmpty();
    }
}

