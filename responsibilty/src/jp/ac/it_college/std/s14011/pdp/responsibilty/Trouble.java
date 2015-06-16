package jp.ac.it_college.std.s14011.pdp.responsibilty;

/**
 * Created by s14011 on 15/06/16.
 */
public class Trouble {
    private int number;
    public Trouble (int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public String toString() {
        return "[Trouble " + number + "] ";
    }
}
