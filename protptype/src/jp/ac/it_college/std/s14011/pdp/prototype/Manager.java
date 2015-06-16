package jp.ac.it_college.std.s14011.pdp.prototype;

import java.util.HashMap;

/**
 * Created by s14011 on 15/06/04.
 */
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }
    public Product create(String protoname) {
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
