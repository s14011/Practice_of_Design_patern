package jp.ac.it_college.std.s14011.pdp.observer;

/**
 * Created by s14011 on 15/06/16.
 */
public class DigitObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        }catch (InterruptedException e) {

        }
    }
}
