package wangyiran.dealing.with.generalization.extract.superclass.refactor;

/**
 * Created by wyr on 2015/5/25.
 */
//The first step is to create the new superclass and define the existing
//        superclasses to be subclasses of this superclass:
public abstract class Party {
//    Now I begin to pull up features to the superclass. It is usually easier to use Pull
//    Up Field (320) first:
//    protected String _name;
//I like to make the field private. To do this I need to use Pull Up Constructor
//                                                                   Body (325) to assign the name

//    Their bodies are still different, so I cannot use Pull Up Method (322); however,
//    I can declare an abstract method on the superclass:
    abstract public int getAnnualCost();
    public String getName() {
        return _name;
    }

    private String _name;
    protected Party(String _name) {
        this._name = _name;
    }
}
