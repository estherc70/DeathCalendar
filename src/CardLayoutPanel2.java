import javax.swing.*;
import java.awt.*;


public class CardLayoutPanel2 extends JFrame{
    private JPanel mainPanel;
    private ButtonsPanel buttonsPanel;
    private CardLayout cardLayout;

    public CardLayoutPanel2() {
        // Initialize CardLayout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        JPanel startPage = new JPanel() {
            // Override paintComponent method to paint the background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Ensure the panel is properly rendered
                // Load the background image
                ImageIcon backgroundIcon = new ImageIcon("src/StartBackground.PNG");
                Image backgroundImage = backgroundIcon.getImage();

                // Scale the image to fit the size of the panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Set layout for the startPage panel (use null layout for manual control)
        startPage.setLayout(null);  // Using null layout to manually control button position

        JPanel disclaimerPage = new JPanel() {
            // Override paintComponent method to paint the background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Ensure the panel is properly rendered
                // Load the background image
                ImageIcon backgroundIcon = new ImageIcon("src/Disclaimer.png");
                Image backgroundImage = backgroundIcon.getImage();

                // Scale the image to fit the size of the panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        disclaimerPage.setLayout(null);

        JPanel informationPage = new JPanel();
        informationPage.setBackground(Color.BLACK);

        JPanel calendarPage = new JPanel() {
            // Override paintComponent method to paint the background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Ensure the panel is properly rendered
                // Load the background image
                ImageIcon backgroundIcon = new ImageIcon("src/Calendar.png");
                Image backgroundImage = backgroundIcon.getImage();

                // Scale the image to fit the size of the panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        calendarPage.setLayout(null);

        JPanel suspectPage = new JPanel() {
            // Override paintComponent method to paint the background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Ensure the panel is properly rendered
                // Load the background image
                ImageIcon backgroundIcon = new ImageIcon("src/Suspects.png");
                Image backgroundImage = backgroundIcon.getImage();

                // Scale the image to fit the size of the panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        suspectPage.setLayout(null);

        JPanel murdererPage = new JPanel() {
            // Override paintComponent method to paint the background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Ensure the panel is properly rendered
                // Load the background image
                ImageIcon backgroundIcon = new ImageIcon("src/PickTheMurderer.png");
                Image backgroundImage = backgroundIcon.getImage();

                // Scale the image to fit the size of the panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        murdererPage.setLayout(null);

        JPanel goodEnding = new JPanel();
        ImageIcon good = new ImageIcon("src/GoodEnding.png");
        JPanel badEnding = new JPanel();
        ImageIcon bad = new ImageIcon("src/BadEnding.png");

        mainPanel.add(startPage, "Start");
        mainPanel.add(disclaimerPage, "Disclaimer");
        mainPanel.add(informationPage, "Info");
        mainPanel.add(calendarPage, "Calendar");
        mainPanel.add(suspectPage, "Suspects");
        mainPanel.add(murdererPage, "Pick the Murderer");
        mainPanel.add(goodEnding, "Good Ending");
        mainPanel.add(badEnding, "Bad Ending");

        // Set up the ButtonPanel
        buttonsPanel = new ButtonsPanel(this);

        Container pane = getContentPane();
        pane.add(mainPanel, BorderLayout.CENTER);
        pane.add(buttonsPanel.getBtnPanel(), BorderLayout.SOUTH);

        // Frame settings
        setTitle("Card Layout Example");
        setSize(900, 700); // Set the size of the window
        setResizable(false); // Disable resizing the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    // Method to switch to a specified card
    public void showCard(String cardName) {
        cardLayout.show(mainPanel, cardName);
    }

    public static void main(String[] args) {
        // Create and display the main frame
        new CardLayoutPanel();
    }
}
