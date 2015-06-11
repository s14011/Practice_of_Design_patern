package jp.ac.it_college.std.s14011.pdp.visitor;

import java.util.Iterator;

/**
 * Created by s14011 on 15/06/11.
 */
public class ListVisitor extends Visitor{
    private String currentdir ="";
    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        //System.out.println(currentdir + "/" + file);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
