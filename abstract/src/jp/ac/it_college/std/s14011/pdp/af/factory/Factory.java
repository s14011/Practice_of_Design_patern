package jp.ac.it_college.std.s14011.pdp.af.factory;

/**
 * Created by s14011 on 15/06/10.
 */
public abstract class Factory {
    public static Factory getFactory(Class ccls){
        Factory factory = null;
        try {
            factory = (Factory) ccls.newInstance();
        }catch (InstantiationException | IllegalAccessException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(1);
        }
        return factory;
    }
    public static Factory getFactory(String classname){
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        }catch (ClassNotFoundException e) {
            System.err.println("クラス" + classname + "が見つかりません");
        }catch (Exception e){
            e.printStackTrace();
        }
        return factory;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPaeg(String title, String author);
}
