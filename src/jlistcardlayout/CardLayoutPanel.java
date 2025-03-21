package jlistcardlayout;
import javax.swing.*;
import java.awt.*;


public class CardLayoutPanel extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JButton start, back;
    private ImageIcon startButton;


    public CardLayoutPanel() {
        // Initialize CardLayout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout); // Apply CardLayout to main panel

        // Initialize images
        startButton = new ImageIcon("path/to/your/KnifeStartButton.PNG");

        // Create panels
        JPanel startPage = new JPanel();
        JPanel informationPage = new JPanel();

        // Create buttons
        start = new JButton(startButton);
        back = new JButton("Back"); // Give the button a label so it is visible

        // Set panel backgrounds
        startPage.setBackground(Color.BLACK);
        informationPage.setBackground(Color.BLUE);

        // Add buttons to panels
        startPage.add(start);
        informationPage.add(back);

        // Register panels in CardLayout
        mainPanel.add(startPage, "Start");
        mainPanel.add(informationPage, "Info");

        // Action listeners for switching panels
        start.addActionListener(e -> cardLayout.show(mainPanel, "Info")); // Switch to Info panel
        back.addActionListener(e -> cardLayout.show(mainPanel, "Start")); // Switch back to Start panel

        // Add main panel to frame
        add(mainPanel);

        // Frame settings
        setSize(1000, 800);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


    }
}
