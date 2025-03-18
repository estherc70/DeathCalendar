import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPanel extends JPanel implements ActionListener {
    private JTextField nameEnter;
    private JButton button;

    public FirstPanel() {
        nameEnter = new JTextField(10);


    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        g.setColor(Color.BLACK);
        nameEnter.setLocation(50, 50);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}