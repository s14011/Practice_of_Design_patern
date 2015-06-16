package jp.ac.it_college.std.s14011.pdp.prototype;

/**
 * Created by s14011 on 15/06/04.
 */
public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();
}
