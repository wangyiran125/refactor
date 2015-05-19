package wangyiran.organizing.data.replace.magic.number.with.symbolic.constant.refactor;

/**
 * Created by wyr on 2015/5/19.
 */
public class Energy {
    public static final double AREA = 9.81;

    double potentialEnergy(double mass,double height){
        return mass * AREA * height;
    }
}
