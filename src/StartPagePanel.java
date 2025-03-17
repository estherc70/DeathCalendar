import javax.swing.*;
import java.awt.*;

public class StartPagePanel extends JPanel {
    JTextField nameText;
    public StartPagePanel() {

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        g.setColor(Color.BLACK);

    }
}