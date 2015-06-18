package jp.ac.it_college.std.s14011.pdp.command;

import jp.ac.it_college.std.s14011.pdp.command.command.Command;
import jp.ac.it_college.std.s14011.pdp.command.command.MacroCommand;
import jp.ac.it_college.std.s14011.pdp.command.drawer.DrawCanvas;
import jp.ac.it_college.std.s14011.pdp.command.drawer.DrawCommand;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by s14011 on 15/06/18.
 */
public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener{
    private MacroCommand history = new MacroCommand();

    private DrawCanvas canvas = new DrawCanvas(400,400,history);

    private JButton clearButton = new JButton("Clear");

    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        }
    }
    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowActivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
