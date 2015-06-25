package jp.ac.it_college.std.s14011.pdp.template;

/**
 * Created by s14011 on 15/06/04.
 */
public class StringDisplay extends AbstractDisplay{

    private String string;
    private int width;
    public StringDisplay(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }
    public void open() {
        printLine();
    }
    public void print() {
        System.out.println("|" + string + "|");
    }
    public void close() {
        printLine();
    }
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++){
            System.out.println("-");
        }
        System.out.println("+");
    }
}
