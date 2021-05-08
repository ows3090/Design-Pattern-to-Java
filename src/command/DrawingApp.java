package command;

import memento.Memento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DrawingApp extends JFrame {
    MacroCommand history = new MacroCommand();
    MacroCommand line = new MacroCommand();
    Memento memento = new Memento(history);

    public DrawingApp(String title){
        super(title);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        Box mainBox = new Box(BoxLayout.Y_AXIS);

        JButton undoButton = new JButton("undo");
        JButton clearButton = new JButton("clear");
        JButton saveButton = new JButton("save");
        JButton loadButton = new JButton("load");

        DrawCanvas canvas = new DrawCanvas(400,400,history);

        buttonBox.add(undoButton);
        buttonBox.add(clearButton);
        buttonBox.add(saveButton);
        buttonBox.add(loadButton);

        mainBox.add(buttonBox);
        mainBox.add(canvas);

        getContentPane().add(mainBox);

        pack();
        setVisible(true);

        canvas.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                DrawCommand command = new DrawCommand(canvas, e.getPoint());
                line.add(command);
                command.execute();
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        canvas.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            // start
            @Override
            public void mousePressed(MouseEvent e) {
                line = new MacroCommand();
            }

            // end
            @Override
            public void mouseReleased(MouseEvent e) {
                history.add(line);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        undoButton.addActionListener(e -> {
            history.undo();
            canvas.repaint();
        });

        clearButton.addActionListener(e -> {
            history.clear();
            canvas.repaint();
        });

        saveButton.addActionListener(e -> {
            memento = saveState();
        });

        loadButton.addActionListener(e -> {
            restoreState(memento);
            canvas.setHistory(history);
            canvas.repaint();
        });
    }

    private Memento saveState(){
        return new Memento(history);
    }

    private void restoreState(Memento memento){
        history = memento.getSavedState();
    }
}
