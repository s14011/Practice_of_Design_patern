package jp.ac.it_college.std.s14011.pdp.mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * Created by s14011 on 15/06/16.
 */
public class ColleagueTextFiled extends TextField implements TextListener, Colleague{
    private Mediator mediator;
    public ColleagueTextFiled(String text, int columns) {
        super(text, columns);
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
