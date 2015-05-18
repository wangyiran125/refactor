package wangyiran.organizing.data.change.value.to.reference.refactor;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by wyr on 2015/5/18.
 */
public class Customer {
    private static Dictionary _instances = new Hashtable();

    private String name;
    public Customer(String name) {
        this.name = name;
    }

    static  void loadCustomers(){
        new Customer("lemon car hire").store();
    }

    public String getName() {
        return name;
    }

    private void store() {
        _instances.put(this.getName(),this);
    }
    public static Customer getNamed(String name){
        return (Customer)_instances.get(name);
    }
}
