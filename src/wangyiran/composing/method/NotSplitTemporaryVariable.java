package wangyiran.composing.method;

/**
 * Created by wyr on 2015/5/14.
 */
public class NotSplitTemporaryVariable {
    private double height;
    private double width;
    public void dealWith(){
       /* That they
        are set more than once is a sign that they have more than one responsibility within
        the method. Any variable with more than one responsibility should be replaced with
        a temp for each responsibility. Using a temp for two different things is very
        confusing for the reader.*/
        double temp = 2 *(height+width);
        System.out.println(temp);
        temp = height * width;
        System.out.println(temp);
    }
}
