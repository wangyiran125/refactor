package wangyiran.move.features.between.objects.move.introduce.foreign.method.refactor;

import java.util.Date;

/**
 * Created by wyr on 2015/5/18.
 */
public class Client {
    private static  Date previousEnd;
    public static void main(String[] args) {
        Date newStart = nextDate();
    }

    private static Date nextDate() {
        return new Date(previousEnd.getYear(),previousEnd.getMonth(),previousEnd.getDate()+1);
    }
}
