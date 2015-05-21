package wangyiran.simplifying.condition.remove.control.flag.notrefactor;

/**
 * Created by wyr on 2015/5/20.
 */
public class Client {
//    but the one exit point
//    rule leads you to very convoluted conditionals with these awkward flags in the code.
//    This is why languages have break and continue statements to get out of a complex
//    conditional. It is often surprising what you can do when you get rid of a control flag.
//    The real purpose of the conditional becomes so much more clear
    public void checkSecurity(String[] people ){
        boolean found = false;
        for (int i = 0; i < people.length ; i++) {
            if (!found){
                if (people[i].equals("Don")){
                    sendAlert();
                    found = true;
                }
                if (people[i].equals("John")){
                    sendAlert();
                    found = true;
                }
            }
        }
    }

    private void sendAlert() {

    }
}
