package wangyiran.move.features.between.objects.move.introduce.local.extension.notrefactor;

import java.util.Date;

/**
 * Created by wyr on 2015/5/18.
 */
public class Client {
    private static  Date previousEnd;
    /*If you need one or two
    methods, you can use Introduce Foreign Method (162). Once you get beyond a
    couple of these methods, however, they get out of hand. So you need to group the
    methods together in a sensible place for them. The standard object-oriented
    techniques of subclassing and wrapping are an obvious way to do this. In these
    circumstances I call the subclass or wrapper a local extension*/
    public static void main(String[] args) {
        Date newStart = new Date(previousEnd.getYear(),previousEnd.getMonth(),previousEnd.getDate()+1);
    }
}
