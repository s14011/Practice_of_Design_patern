package jp.ac.it_college.std.s14011.pdp.decorator;

/**
 * Created by s14011 on 15/06/11.
 */
public abstract class Border extends Display {
    protected Display display;
    protected Border(Display display) {
        this.display = display;
    }
}
