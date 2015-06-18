package jp.ac.it_college.std.s14011.pdp.command.drawer;

import jp.ac.it_college.std.s14011.pdp.command.command.Command;

import java.awt.*;

/**
 * Created by s14011 on 15/06/18.
 */
public class DrawCommand implements Command{

    protected Drawable drawable;

    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
