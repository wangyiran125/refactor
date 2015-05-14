package wangyiran.composing.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wyr on 2015/5/14.
 */
public class SubstituteAlgorithm {
    public String foundPeople(String[] people){
      /*  If you find a clearer way to double
            something, you should replace the complicated way with the clearer way.*/
        List candidates = Arrays.asList(new String[]{"Don","John"});
        for (int i = 0;i< people.length;i++){
            if (candidates.contains(people[i])){
                return people[i];
            }
        }
            return "";
    }
}
