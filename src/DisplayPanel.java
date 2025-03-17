import javax.swing.*;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayPanel extends JPanel implements ActionListener {

    private JFrame enclosing;
    private JButton button;

    public DisplayPanel(JFrame enclosing) {
        this.enclosing = enclosing;
        button = new JButton("next screen");
        button.addActionListener(this);
        add(button);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        g.setColor(Color.BLACK);
        button.setLocation(100, 100);

        g.drawString("Death Calendar", 50, 30);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //enclosing.setVisible(false);

        JFrame frame = new JFrame("new frame");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        SecondPanel panel = new SecondPanel("5 was clicked");
        frame.add(panel);
        frame.setVisible(true);
    }
}
