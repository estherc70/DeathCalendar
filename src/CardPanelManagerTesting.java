import javax.swing.*;
import java.awt.*;

public class CardPanelManagerTesting {
    private JPanel mainPanel;
    private CardLayout cardLayout;

    public CardPanelManagerTesting() {
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Add all panels
        mainPanel.add(createImagePanel("src/StartBackground.PNG"), "Start");
        mainPanel.add(createImagePanel("src/Disclaimer.png"), "Disclaimer");
        mainPanel.add(createColorPanel(Color.BLACK), "Info");
        mainPanel.add(createImagePanel("src/Calendar.png"), "Calendar");
        mainPanel.add(createImagePanel("src/Suspects.png"), "Suspects");
        mainPanel.add(createImagePanel("src/PickTheMurderer.png"), "Pick the Murderer");
        mainPanel.add(createImagePanel("src/GoodEnding.png"), "Good Ending");
        mainPanel.add(createImagePanel("src/BadEnding.png"), "Bad Ending");
    }

    private JPanel createImagePanel(String imagePath) {
        return new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundIcon = new ImageIcon(imagePath);
                g.drawImage(backgroundIcon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
    }

    private JPanel createColorPanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        return panel;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }
}
