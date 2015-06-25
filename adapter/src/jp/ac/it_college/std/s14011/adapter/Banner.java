package jp.ac.it_college.std.s14011.adapter;

/**
 * Created by s14011 on 15/06/25.
 */
public class Banner {
    private String string;
    public Banner(String string) {
        this.string  = string;
    }
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
