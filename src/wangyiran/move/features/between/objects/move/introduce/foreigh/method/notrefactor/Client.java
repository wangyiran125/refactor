package wangyiran.move.features.between.objects.move.introduce.foreigh.method.notrefactor;

import java.util.Date;

/**
 * Created by wyr on 2015/5/18.
 */
public class Client {
    private static  Date previousEnd;
    /*If you can change the source, you
    can add in the method. If you can¡¯t change the source, you have to code around the
    lack of the method in the client*/

  /*  If you use the
    method several times, however, you have to repeat this coding around. Because
    repetition is the root of all
    software evil, this repetitive code should be factored into
    a single method. When you do this refactoring, you can clearly signal that this
    method is really a method that should be on the original by making it a foreign
    method.*/
    public static void main(String[] args) {
        Date newStart = new Date(previousEnd.getYear(),previousEnd.getMonth(),previousEnd.getDate()+1);
    }
}
