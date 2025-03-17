import javax.swing.*;
import java.awt.*;

public class SecondPanel extends JPanel {
    private String msg;

    public SecondPanel(String msg) {
        this.msg = msg;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        g.setColor(Color.BLACK);

        g.drawString(msg, 50, 30);
    }
}
