package jp.ac.it_college.std.s14011.factory.framework.framework;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

/**
 * Created by s14011 on 15/06/04.
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);

    public static JoniRegExp.Factory getFactory(String arg) {


        return null;
    }
}
