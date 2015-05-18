package wangyiran.move.features.between.objects.move.extract.refactor;

/**
 * Created by wyr on 2015/5/18.
 */
public class Person {
    /*    A class that is
                too big to understand easily. You need to consider where it can be split, and you split
        it.*/
    private String _name;
    private String _officeAreaCode;
    private String _officeNumber;

    private TelephoneNumber _officeTelephone = new TelephoneNumber();

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_officeAreaCode() {
        return _officeTelephone.get_areaCode();
    }

    public void set_officeAreaCode(String _officeAreaCode) {
        _officeTelephone.setAreaCode(_officeAreaCode);
    }


/*    public String get_officeNumber() {
        return _officeNumber;
    }

    public void set_officeNumber(String _officeNumber) {
        this._officeNumber = _officeNumber;
    }*/

/*    In this case I can separate the telephone number behavior into its own class. I
    start by defining a telephone number class:*/
/*public String getTelephoneNumber(){
    return ("("+get_officeAreaCode()+")"+_officeNumber);
}*/

    public String getTelephoneNumber(){
        return _officeTelephone.getTelephoneNumber();
    }
}
