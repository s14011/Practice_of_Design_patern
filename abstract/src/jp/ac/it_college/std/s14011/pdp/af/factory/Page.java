package jp.ac.it_college.std.s14011.pdp.af.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * Created by s14011 on 15/06/10.
 */
public abstract class Page {
    protected String title;
    private String author;
    private ArrayList<Item> content = new ArrayList<>();
    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void add(Item item) {
        content.add(item);
    }
    public void output() {
        try {
            String filename = title = ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + "を作成しました");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public abstract String makeHTML();
}
