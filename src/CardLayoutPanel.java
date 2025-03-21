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
        startButton = new ImageIcon("src/refactor2.0.png");

        // Create panels
        JPanel startPage = new JPanel() {
            // Override paintComponent method to paint the background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Ensure the panel is properly rendered
                // Load the background image
                ImageIcon backgroundIcon = new ImageIcon("src/Startbackgroundrefactored.png");
                Image backgroundImage = backgroundIcon.getImage();

                // Scale the image to fit the size of the panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        JPanel informationPage = new JPanel();

        // Create buttons
        start = new JButton(startButton);
        back = new JButton("Back");

        // Set layout for the startPage panel (use null layout for manual control)
        startPage.setLayout(null);  // Using null layout to manually control button position

        // Set button size (optional to adjust the button size)
        start.setBounds(300, 400, 250, 120);  // Adjust the position and size of the start button

        // Add the start button to the startPage panel
        startPage.add(start);

        // Add the "Back" button to the informationPage panel
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
        setTitle("Card Layout Example");
        setSize(900, 700); // Set the size of the window
        setResizable(false); // Disable resizing the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);
    }
}