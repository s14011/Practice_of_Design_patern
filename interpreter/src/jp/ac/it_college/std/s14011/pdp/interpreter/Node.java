package jp.ac.it_college.std.s14011.pdp.interpreter;


/**
 * Created by s14011 on 15/06/18.
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
