package iterator.pdp.jp.ac.it_college.std.s14011.pdp.iterator;

import javafx.scene.text.TextBuilder;
import jp.ac.it_college.std.s14011.pdp.builder.Director;
import jp.ac.it_college.std.s14011.pdp.builder.HTMLBuilder;
import jp.ac.it_college.std.s14011.pdp.prototype.Manager;
import jp.ac.it_college.std.s14011.pdp.prototype.MessageBox;
import jp.ac.it_college.std.s14011.pdp.prototype.Product;
import jp.ac.it_college.std.s14011.pdp.prototype.UnderlinePen;
import jp.ac.it_college.std.s14011.pdp.singleton.Singleton;
import jp.ac.it_college.std.s14011.pdp.template.AbstractDisplay;
import jp.ac.it_college.std.s14011.pdp.template.CharDisplay;
import jp.ac.it_college.std.s14011.pdp.template.StringDisplay;

public class Main {

    public static void main(String[] args) {
	    builderMain();
    }

    public static void iteratorMain(){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderlla"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }


    public static void templateTest() {
        AbstractDisplay d1 = new CharDisplay('M');
        AbstractDisplay d2 = new StringDisplay("Hello World");
        AbstractDisplay d3 = new StringDisplay("こんにちは。");

        d1.display();
        d2.display();
        d3.display();
    }

    public static void singletonMain() {
        System.out.println("Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1とobj2は同じインスタンスです。");
        } else {
            System.out.println("obj1とobj2は同じインスタンスではありません。");
        }
        System.out.println("END.");
    }

    public static void prptotypeMain() {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("Strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);


        Product p1 = manager.create("strong message");
        p1.use("Hello, world");
        Product p2 = manager.create("warning box");
        p2.use("Hello world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }

    public static void builderMain() {
        /*if (args.length != 1){
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")){
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(TextBuilder);
            director.construct();
            String result = textbuilder.getResult();
            System.out.println(result);
        }else if (args[0].equals("html")) {
            HTMLBuilder htmlbuilder = new HTMLBuilder();
            Director director = new Director(htmlbuilder);
            director.construct();
            String filename = htmlbuilder.getResult();
            System.out.println(filename + "が作成されました。");
        }else {
            usage();
            System.exit(0);
        }
    }
    public static void usage() {
        System.out.println("Usage: java Main plain
        System.out.println("Usage: java Main html
        */
    }

}
