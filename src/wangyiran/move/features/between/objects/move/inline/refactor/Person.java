package wangyiran.move.features.between.objects.move.inline.refactor;

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
    public String get_areaCode() {
        return _officeTelephone.get_areaCode();
    }

    public String get_number() {
        return _officeTelephone.get_number();
    }

    public void set_number(String _number) {
        _officeTelephone.set_number(_number);
    }

    public void set_areaCode(String _areaCode) {
        _officeTelephone.set_areaCode(_areaCode);
    }

}
