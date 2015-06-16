package jp.ac.it_college.std.s14011.pdp.af.listfactory;

import jp.ac.it_college.std.s14011.pdp.af.factory.Item;
import jp.ac.it_college.std.s14011.pdp.af.factory.Tray;

import java.util.Iterator;

/**
 * Created by s14011 on 15/06/10.
 */
public class ListTray extends Tray {
    public ListTray(String caption){
        super(caption);
    }
    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("<ul>\n");
        buffer.append("<li>\n");

        return buffer.toString();
    }
}
