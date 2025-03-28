import javax.swing.*;
import java.awt.*;


public class TESTCardLayoutPanel2 extends JFrame{
    private JPanel mainPanel;
    private TESTButtonsPanel buttonsPanel;
    private CardLayout cardLayout;

    public TESTCardLayoutPanel2() {
        // Initialize CardLayout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Set up the ButtonPanel
        buttonsPanel = new TESTButtonsPanel(this);

        JPanel startPage = PanelClass.createPanel("src/images/StartBackground.PNG");
        JPanel disclaimerPage = PanelClass.createPanel("src/images/Disclaimer.png");
        JPanel informationPage = new JPanel();
        informationPage.setBackground(Color.BLACK);
        JPanel calendarPage = PanelClass.createPanel("src/images/Calendar.png");
        JPanel suspectPage = PanelClass.createPanel("src/images/Suspects.png");
        JPanel murdererPage = PanelClass.createPanel("src/images/PickTheMurderer.png");
        JPanel goodEnding = new JPanel();
        ImageIcon good = new ImageIcon("src/images/GoodEnding.png");
        JPanel badEnding = new JPanel();
        ImageIcon bad = new ImageIcon("src/images/BadEnding.png");

        // Set layout for each panel (use null layout for manual control)
        startPage.setLayout(null);  // Using null layout to manually control button position
        disclaimerPage.setLayout(null);
        calendarPage.setLayout(null);
        suspectPage.setLayout(null);
        murdererPage.setLayout(null);

        // Add specific buttons for specific card panels
        startPage.add(buttonsPanel.getStartButton());
        disclaimerPage.add(buttonsPanel.getBtnDisclaimer());
        suspectPage.add(buttonsPanel.getBtnReady());

        mainPanel.add(startPage, "Start");
        mainPanel.add(disclaimerPage, "Disclaimer");
        mainPanel.add(informationPage, "Info");
        mainPanel.add(calendarPage, "Calendar");
        mainPanel.add(suspectPage, "Suspects");
        mainPanel.add(murdererPage, "Pick the Murderer");
        mainPanel.add(goodEnding, "Good Ending");
        mainPanel.add(badEnding, "Bad Ending");

        Container pane = getContentPane();
        pane.add(mainPanel, BorderLayout.CENTER);
        pane.add(buttonsPanel.getBtnPanel(), BorderLayout.SOUTH);

        // Frame settings
        setTitle("CardLayoutOrganized");
        setSize(900, 700); // Set the size of the window
        setResizable(false); // Disable resizing the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    // Method to switch to a specified card (used in ButtonPanel for ActionListeners)
    public void showCard(String cardName) {
        cardLayout.show(mainPanel, cardName);
    }

    public static void main(String[] args) {
        // Create and display the main frame
        new TESTCardLayoutPanel2();
    }
}
