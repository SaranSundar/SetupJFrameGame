import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    public Application() {
        initUI();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame ex = new Application();
                ex.setVisible(true);
            }
        });
    }

    public static int getScreenWidth() {
        return 500;
    }

    public static int getScreenHeight() {
        return 500;
    }

    public void initUI() {
        add(new Board());
        setSize(getScreenWidth(), getScreenHeight());
        setResizable(false);
        setTitle("Space Avoider");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
