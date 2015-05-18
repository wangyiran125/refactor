package wangyiran.organizing.data.replace.data.value.with.object.notrefactor;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by wyr on 2015/5/18.
 */
public class Client {
    private static int numberOfOrdersFor(Collection orders,String customer){
        int result = 0;
        Iterator iter = orders.iterator();
        while (iter.hasNext()){
            Order each  = (Order) iter.next();
            if (each.get_customer().equals(customer))
                result++;
        }
        return result;
    }
}
