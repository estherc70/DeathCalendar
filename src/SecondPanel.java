import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SecondPanel extends JPanel implements ActionListener {
    private String msg;
    private JButton button;

    public SecondPanel(String msg) {
        this.msg = msg;
        button = new JButton();
        button.addActionListener(this);
        add(button);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        g.setColor(Color.BLACK);

        g.drawString(msg, 100, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
