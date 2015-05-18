package wangyiran.move.features.between.objects.move.introduce.local.extension.refactor.use.wrapper;

import java.util.Date;

/**
 * Created by wyr on 2015/5/18.
 */
public class MfDateWrap {
    private Date _original;

    public MfDateWrap(Date _original) {
        this._original = _original;
    }

    public int getYear(){
       return  _original.getYear();
    }

    public int getMonth(){
      return   _original.getMonth();
    }

    public int getDate(){
        return _original.getDate();
    }

    Date nextDay(){
        return new Date(getYear(),getMonth(),getDate()+1);
    }
}
