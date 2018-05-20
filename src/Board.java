import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {

    private Timer timer;
    private int DELAY = 15;


    public Board() {
        initBoard();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Toolkit.getDefaultToolkit().sync();
    }

    public void initBoard() {
        setFocusable(true);
        setBackground(Color.BLACK);
        setDoubleBuffered(true);
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
