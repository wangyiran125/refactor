package wangyiran.composing.method;

/**
 * Created by wyr on 2015/5/14.
 */
public class NotSubstituteAlgorithm {
    public String foundPeople(String[] people){
        for (int i = 0;i< people.length;i++){
            if (people[i].equals("Don")){
                return "Don";
            }
            if (people[i].equals("John")){
                return "John";
            }
        }
            return "";
    }
}
