package wangyiran.move.features.between.objects.move.inline.notrefactor;

import wangyiran.move.features.between.objects.move.extract.refactor.TelephoneNumber;

/**
 * Created by wyr on 2015/5/18.
 */
public class Person {
    private String _name;
    private TelephoneNumber _officeTelephone = new TelephoneNumber();

   public String getTelephoneNumber(){
      return  _officeTelephone.getTelephoneNumber();
   }

    public TelephoneNumber get_officeTelephone() {
        return _officeTelephone;
    }

    public String get_name() {
        return _name;
    }
}
