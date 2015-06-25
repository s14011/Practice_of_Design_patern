

package iterator.pdp.jp.ac.it_college.std.s14011.pdp.iterator;

import javafx.scene.text.TextBuilder;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import jp.ac.it_college.std.s14011.factory.framework.framework.Factory;
import jp.ac.it_college.std.s14011.pdp.af.factory.Page;
import jp.ac.it_college.std.s14011.pdp.af.factory.Tray;
import jp.ac.it_college.std.s14011.pdp.bridge.CountDisplay;
import jp.ac.it_college.std.s14011.pdp.bridge.Display;
import jp.ac.it_college.std.s14011.pdp.bridge.StringDisplayImpl;
import jp.ac.it_college.std.s14011.pdp.builder.Director;
import jp.ac.it_college.std.s14011.pdp.builder.HTMLBuilder;
import jp.ac.it_college.std.s14011.pdp.prototype.Manager;
import jp.ac.it_college.std.s14011.pdp.prototype.MessageBox;
import jp.ac.it_college.std.s14011.pdp.prototype.Product;
import jp.ac.it_college.std.s14011.pdp.prototype.UnderlinePen;
import jp.ac.it_college.std.s14011.pdp.singleton.Singleton;
import jp.ac.it_college.std.s14011.pdp.strategy.Hand;
import jp.ac.it_college.std.s14011.pdp.strategy.Player;
import jp.ac.it_college.std.s14011.pdp.strategy.ProdStrategy;
import jp.ac.it_college.std.s14011.pdp.strategy.WinningStrategy;
import jp.ac.it_college.std.s14011.pdp.template.AbstractDisplay;
import jp.ac.it_college.std.s14011.pdp.template.CharDisplay;
import jp.ac.it_college.std.s14011.pdp.template.StringDisplay;
import sun.plugin.javascript.navig.Link;

import javax.xml.parsers.FactoryConfigurationError;

public class Main {
    public static void main(String[] args) {
        jp.ac.it_college.std.s14011.pdp.decorator.Main.main(args);

    }



    private static void strategyMain(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main randomseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[2]);
        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        Player player2 = new Player("Hana", new ProdStrategy(seed2));

        for (int i = 0; i < 10000; i++){
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            }else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            }else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }

    private static void bridgeMain() {
        Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }

    private static void abstractMain(String[] args){
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }
        JoniRegExp.Factory factory = Factory.getFactory(args[0]);

     //   Link asahi = factory.createLink("朝日新聞", "http://www.sahi.com/");
       // Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");

        //Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");

       // Link jp_yahoo = factorycreateLink("Yahoo!Japan", "http://www/yahoo.co.jp/");
        //Link excite = factorycreateLink("Excite", "http://www.excite.com/");
        //Link google = factorycreateLink("Google", "http://www.google.com/");

        //Tray trayyahoo = factory.createTray("Yahoo!");
        //trayyahoo.add(us_yahoo);
        //trayyahoo.add(jp_yahoo);

//        Tray trayserch = factory.createTray("サーチエンジン");
  //      trayserch.add(trayyahoo);
    //    trayserch.add(excite);
      //  trayserch.add(google);

//        Page page = factory.createPage("LinkPage", "結城 浩");
  //      page.add(traynews);
    //    page.add(trayserch);
      //  page.output();
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
