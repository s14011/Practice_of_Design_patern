package jp.ac.it_college.std.s14011.pdp.template;

/**
 * Created by s14011 on 15/06/04.
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;
    public CharDisplay(char ch) {
        this.ch = ch;
    }
    public void open() {
        System.out.print("<<");
    }
    public void print() {
        System.out.print(ch);
    }
    public void close() {
        System.out.print(">>");
    }
}
