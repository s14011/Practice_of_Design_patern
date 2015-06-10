package jp.ac.it_college.std.s14011.pdp.strategy;

/**
 * Created by s14011 on 15/06/10.
 */
public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
