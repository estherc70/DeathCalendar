import javax.swing.*;
import java.awt.*;

public class CardLayoutPanel2Testing extends JFrame {
    private CardPanelManagerTesting panelManager;
    private ButtonManagerTesting buttonManager;

    public CardLayoutPanel2Testing() {
        // Set up frame
        setTitle("Card Layout Example");
        setSize(900, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize panel and button managers
        panelManager = new CardPanelManagerTesting();
        buttonManager = new ButtonManagerTesting(panelManager.getCardLayout(), panelManager.getMainPanel(), getContentPane());

        // Add components to frame
        getContentPane().add(panelManager.getMainPanel(), BorderLayout.CENTER);

        // Add start button to start panel
        panelManager.getMainPanel().add(buttonManager.getStartButton(), "Start");

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CardLayoutPanel2Testing::new);
    }

}

