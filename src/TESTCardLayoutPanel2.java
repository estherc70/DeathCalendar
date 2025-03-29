import javax.swing.*;
import java.awt.*;


public class TESTCardLayoutPanel2 extends JFrame{
    private JPanel mainPanel;
    private TESTButtonsPanel buttonsPanel;
    private CardLayout cardLayout;

    public TESTCardLayoutPanel2() {
        // Initialize CardLayout
        Calendar calendarPanel = new Calendar();
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Set up the ButtonPanel
        buttonsPanel = new TESTButtonsPanel(this);

        JPanel startPage = TESTPanelClass.createPanel("src/images/StartBackground.PNG");
        JPanel disclaimerPage = TESTPanelClass.createPanel("src/images/Disclaimer.png");
        JPanel informationPage = new JPanel();
        informationPage.setBackground(Color.BLACK);
        //JPanel calendarPage = TESTPanelClass.createPanel("src/images/Calendar.png");
        JPanel suspectPage = TESTPanelClass.createPanel("src/images/Suspects.png");
        JPanel murdererPage = TESTPanelClass.createPanel("src/images/PickTheMurderer.png");
        JPanel goodEndingPage = TESTPanelClass.createPanel("src/images/GoodEnding.png");
        JPanel objectionPage = TESTPanelClass.createPanel("src/images/Objection.png");
        JPanel badEndingPage = TESTPanelClass.createPanel("src/images/BadEnding.png");
//        JPanel goodEnding = new JPanel();
//        ImageIcon good = new ImageIcon("src/images/GoodEnding.png");
//        JPanel badEnding = new JPanel();
//        ImageIcon bad = new ImageIcon("src/images/BadEnding.png");

        // Set layout for each panel (use null layout for manual control)
        startPage.setLayout(null);  // Using null layout to manually control button position
        disclaimerPage.setLayout(null);
        calendarPanel.getCalendarPage().setLayout(null);
        suspectPage.setLayout(null);
        murdererPage.setLayout(null);

        // Add specific buttons for specific card panels
        startPage.add(buttonsPanel.getStartButton());
        disclaimerPage.add(buttonsPanel.getBtnDisclaimer());
        calendarPanel.calendarPage.add(buttonsPanel.getBtnSuspects());
        suspectPage.add(buttonsPanel.getBtnReady());

        murdererPage.add(buttonsPanel.getBtnGojo());
        murdererPage.add(buttonsPanel.getBtnJoGo());
        murdererPage.add(buttonsPanel.getBtnGogo());
        murdererPage.add(buttonsPanel.getBtnNikki());


        mainPanel.add(startPage, "Start");
        mainPanel.add(disclaimerPage, "Disclaimer");
        mainPanel.add(informationPage, "Info");
        mainPanel.add(calendarPanel.calendarPage, "Calendar");
        mainPanel.add(suspectPage, "Suspects");
        mainPanel.add(murdererPage, "Pick the Murderer");
        mainPanel.add(goodEndingPage, "Good Ending");
        mainPanel.add(objectionPage,"Objection");
        mainPanel.add(badEndingPage, "Bad Ending");

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
