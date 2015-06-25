package jp.ac.it_college.std.s14011.adapter;

/**
 * Created by s14011 on 15/06/25.
 */
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string) {
        super(string);
    }
    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
