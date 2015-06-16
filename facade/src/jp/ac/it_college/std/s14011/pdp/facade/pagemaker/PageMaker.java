package jp.ac.it_college.std.s14011.pdp.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by s14011 on 15/06/16.
 */
public class PageMaker {
    private PageMaker() {
    }
    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to" + username + "'s page!");
            writer.paragraph(username + "のページへようこそ");
            writer.paragraph("メール待っていますね。");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + "is created for" + mailaddr + "(" + username + ")");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
