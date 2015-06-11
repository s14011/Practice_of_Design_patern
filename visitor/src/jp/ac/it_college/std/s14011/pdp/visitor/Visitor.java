package jp.ac.it_college.std.s14011.pdp.visitor;

/**
 * Created by s14011 on 15/06/11.
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
