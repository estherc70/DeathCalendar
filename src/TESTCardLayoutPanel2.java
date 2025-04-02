import javax.swing.*;
import java.awt.*;


public class TESTCardLayoutPanel2 extends JFrame{
    private JPanel mainPanel;
    private TESTButtonsPanel buttonsPanel;
    //private TESTButtonsPanel buttonsPanel1;
    private CardLayout cardLayout;
    //private JPanel megumiPage;

    public TESTCardLayoutPanel2() {
        // Initialize CardLayout
        Calendar calendarPanel = new Calendar(this);
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Set up the ButtonPanel
        buttonsPanel = new TESTButtonsPanel(this);
        //buttonsPanel1 = new TESTButtonsPanel(this, megumiPage);

        JPanel startPage = TESTPanelClass.createPanel("src/images/StartBackground.PNG");
        JPanel disclaimerPage = TESTPanelClass.createPanel("src/images/Disclaimer.png");
        JPanel informationPage = new JPanel();
        informationPage.setBackground(Color.BLACK);
        //JPanel calendarPage = TESTPanelClass.createPanel("src/images/Calendar.png");
        JPanel suspectPage = TESTPanelClass.createPanel("src/images/Suspects.png");

        JPanel gojoPage = TESTPanelClass.createPanel("src/images/Gojo.png");
        JPanel joGoPage = TESTPanelClass.createPanel("src/images/JoGo.png");
        JPanel nikkiPage = TESTPanelClass.createPanel("src/images/nikki.png");
        JPanel megumiPage = TESTPanelClass.createPanel("src/images/megumi.png");

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

        gojoPage.setLayout(null);
        joGoPage.setLayout(null);
        nikkiPage.setLayout(null);
        megumiPage.setLayout(null);

        murdererPage.setLayout(null);

        // Add specific buttons for specific card panels
        startPage.add(buttonsPanel.getStartButton());
        disclaimerPage.add(buttonsPanel.getBtnDisclaimer());
        calendarPanel.calendarPage.add(buttonsPanel.getBtnSuspects());
        suspectPage.add(buttonsPanel.getBtnReady());

        suspectPage.add(buttonsPanel.geteGojo());
        gojoPage.add(buttonsPanel.getBtnReturn());
        gojoPage.add(buttonsPanel.getIntroduce3());
        gojoPage.add(buttonsPanel.getTalk3());

        suspectPage.add(buttonsPanel.geteNikki());
        nikkiPage.add(buttonsPanel.getBtnReturn2());
        nikkiPage.add(buttonsPanel.getIntroduce4());
        nikkiPage.add(buttonsPanel.getTalk4());

        suspectPage.add(buttonsPanel.geteGogo());
        megumiPage.add(buttonsPanel.getBtnReturn3());
        megumiPage.add(buttonsPanel.getIntroduce1());
        megumiPage.add(buttonsPanel.getTalk1());

        suspectPage.add(buttonsPanel.geteJoGo());
        joGoPage.add(buttonsPanel.getBtnReturn4());
        joGoPage.add(buttonsPanel.getIntroduce2());
        joGoPage.add(buttonsPanel.getTalk2());
        //murdererPage.add(buttonsPanel.getBtnGojo());

        murdererPage.add(buttonsPanel.getBtnGojo());
        murdererPage.add(buttonsPanel.getBtnJoGo());
        murdererPage.add(buttonsPanel.getBtnGogo());
        murdererPage.add(buttonsPanel.getBtnNikki());


        mainPanel.add(startPage, "Start");
        mainPanel.add(disclaimerPage, "Disclaimer");
        mainPanel.add(informationPage, "Info");
        mainPanel.add(calendarPanel.calendarPage, "Calendar");
        mainPanel.add(suspectPage, "Suspects");
        mainPanel.add(gojoPage,"Gojo");
        mainPanel.add(nikkiPage,"Nikki");
        mainPanel.add(joGoPage,"JoGo");
        mainPanel.add(megumiPage,"Gogo");
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
