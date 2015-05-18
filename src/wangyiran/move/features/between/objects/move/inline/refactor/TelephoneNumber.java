package wangyiran.move.features.between.objects.move.inline.refactor;

/**
 * Created by wyr on 2015/5/18.
 */
public class TelephoneNumber {

    public String getTelephoneNumber(){
        return ("("+_areaCode+")"+_number);
    }

    public String get_areaCode() {
        return _areaCode;
    }

    public String get_number() {
        return _number;
    }

    public void set_number(String _number) {
        this._number = _number;
    }

    public void set_areaCode(String _areaCode) {
        this._areaCode = _areaCode;
    }

    private String _number;
    private String _areaCode;
}
