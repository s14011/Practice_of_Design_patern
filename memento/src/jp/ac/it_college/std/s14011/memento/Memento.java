package jp.ac.it_college.std.s14011.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by s14011 on 15/06/25.
 */
public class Memento {
    int money;
    ArrayList fruits;
    public int getMoney() {
        return money;
    }
    Memento (int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }
    void addFruit(String fruit) {
        fruits.add(fruit);
    }
    List getFruits() {
        return (List)fruits.clone();
    }
}
