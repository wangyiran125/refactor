package wangyiran.move.features.between.objects.move.introduce.local.extension.refactor.use.subclass;

import java.util.Date;

/**
 * Created by wyr on 2015/5/18.
 */
public class MfDateSub extends Date{
    public MfDateSub(String s) {
        super(s);
    }

    public MfDateSub(Date date){
        super(date.getTime());
    }

    public Date nextDay(){
        return new Date(getYear(),getMonth(),getDate()+1);
    }
}
