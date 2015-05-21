package wangyiran.simplifying.condition.remove.control.flag.refactor;

/**
 * Created by wyr on 2015/5/20.
 */
public class Client {
//    In a case like this, it is easy to see the control flag. It¡¯s the piece that sets the
//    found variable to true. I can introduce the breaks one at a time
    public void checkSecurity(String[] people ) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
            }
            if (people[i].equals("John")) {
                sendAlert();
            }
        }
    }
    private void sendAlert() {
    }
}
