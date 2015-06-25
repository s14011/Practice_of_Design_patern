package jp.ac.it_college.std.s14011.pdp.builder;

/**
 * Created by s14011 on 15/06/09.
 */
public abstract class Builder {
    public abstract Builder makeTitle(String title);
    public abstract Builder makeString(String str);
    public abstract Builder makeItems(String[] items);
    public abstract void close();
}
