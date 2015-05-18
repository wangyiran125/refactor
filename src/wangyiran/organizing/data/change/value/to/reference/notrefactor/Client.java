package wangyiran.organizing.data.change.value.to.reference.notrefactor;

import wangyiran.organizing.data.replace.data.value.with.object.notrefactor.Order;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by wyr on 2015/5/18.
 */
public class Client {
    private static int numberOfOrdersFor(Collection orders,String customer){
        int result = 0;
        Iterator iter = orders.iterator();
  /*      I want to change this so that if we have
        several orders for the same conceptual customer, they share a single customer
        object. For this case this means that there should be only one customer object for
        each customer name.*/
        while (iter.hasNext()){
            wangyiran.organizing.data.replace.data.value.with.object.notrefactor.Order each  = (Order) iter.next();
            if (each.get_customer().equals(customer))
                result++;
        }
        return result;
    }
}
