import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;

public class DisplayPanel extends JPanel {

    public DisplayPanel() {}
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        g.setColor(Color.BLACK);

        g.drawString("Death Calendar", 50, 30);

    }




}
