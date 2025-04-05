import javax.swing.*;
import java.awt.*;


public class TESTCardLayoutPanel2 extends JFrame{
    private JPanel mainPanel;
    private TESTButtonsPanel buttonsPanel;
    private CardLayout cardLayout;
    private ImageIcon knifeIcon, diaryIcon, hairIcon;
    private JLabel knife, diary, hair;
    //private JPanel megumiPage;

    public TESTCardLayoutPanel2() {
        // Initialize CardLayout
        Calendar calendarPanel = new Calendar(this);
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Set up the ButtonPanel
        buttonsPanel = new TESTButtonsPanel(this);
        //buttonsPanel1 = new TESTButtonsPanel(this, megumiPage);

        knifeIcon = new ImageIcon("src/images/itemKnife.png");
        knife = new JLabel(knifeIcon);
        knife.setBounds(690, 130, knifeIcon.getIconWidth(), knifeIcon.getIconHeight());
        knife.setVisible(false);

        diaryIcon = new ImageIcon("src/images/itemDiary.png");
        diary = new JLabel(diaryIcon);
        diary.setBounds(685, 125, diaryIcon.getIconWidth(), diaryIcon.getIconHeight());
        diary.setVisible(false);

        hairIcon = new ImageIcon("src/images/itemHair.png");
        hair = new JLabel(hairIcon);
        hair.setBounds(685, 140, hairIcon.getIconWidth(), hairIcon.getIconHeight());
        hair.setVisible(false);


        JPanel startPage = TESTPanelClass.createPanel("src/images/StartBackground.PNG");
        JPanel disclaimerPage = TESTPanelClass.createPanel("src/images/Disclaimer.png");
        JPanel informationPage = TESTPanelClass.createPanel("src/images/InfoPage.png");
        //JPanel calendarPage = TESTPanelClass.createPanel("src/images/Calendar.png");
        JPanel suspectPage = TESTPanelClass.createPanel("src/images/Suspects.png");
        JPanel inventoryPage = TESTPanelClass.createPanel("src/images/InventoryNothing.png");

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
        informationPage.setLayout(null);
        calendarPanel.getCalendarPage().setLayout(null);
        suspectPage.setLayout(null);
        inventoryPage.setLayout(null);

        gojoPage.setLayout(null);
        joGoPage.setLayout(null);
        nikkiPage.setLayout(null);
        megumiPage.setLayout(null);

        murdererPage.setLayout(null);

        // Add specific buttons for specific card panels
        startPage.add(buttonsPanel.getStartButton());
        disclaimerPage.add(buttonsPanel.getBtnDisclaimer());

        informationPage.add(buttonsPanel.getInteractKnife());
        informationPage.add(buttonsPanel.getInteractDiary());
        informationPage.add(buttonsPanel.getInteractHair());
        informationPage.add(buttonsPanel.getContinueInfo());


        calendarPanel.calendarPage.add(buttonsPanel.getBtnSuspects());
        calendarPanel.calendarPage.add(buttonsPanel.getBtnInventory());

        inventoryPage.add(buttonsPanel.getBtnHair());
        inventoryPage.add(buttonsPanel.getBtnDiary());
        inventoryPage.add(buttonsPanel.getBtnKnife());

        suspectPage.add(buttonsPanel.getBtnReady());

        suspectPage.add(buttonsPanel.geteGogo());
        megumiPage.add(buttonsPanel.getBtnReturn3());
        megumiPage.add(buttonsPanel.getIntroduce1());
        megumiPage.add(buttonsPanel.getTalk1());
        megumiPage.add(buttonsPanel.getSpecialTalk1());

        suspectPage.add(buttonsPanel.geteJoGo());
        joGoPage.add(buttonsPanel.getBtnReturn4());
        joGoPage.add(buttonsPanel.getIntroduce2());
        joGoPage.add(buttonsPanel.getTalk2());
        joGoPage.add(buttonsPanel.getSpecialTalk2());
        //murdererPage.add(buttonsPanel.getBtnGojo());

        suspectPage.add(buttonsPanel.geteGojo());
        gojoPage.add(buttonsPanel.getBtnReturn());
        gojoPage.add(buttonsPanel.getIntroduce3());
        gojoPage.add(buttonsPanel.getTalk3());
        gojoPage.add(buttonsPanel.getSpecialTalk3());

        suspectPage.add(buttonsPanel.geteNikki());
        nikkiPage.add(buttonsPanel.getBtnReturn2());
        nikkiPage.add(buttonsPanel.getIntroduce4());
        nikkiPage.add(buttonsPanel.getTalk4());
        nikkiPage.add(buttonsPanel.getSpecialTalk4());


        murdererPage.add(buttonsPanel.getBtnGojo());
        murdererPage.add(buttonsPanel.getBtnJoGo());
        murdererPage.add(buttonsPanel.getBtnGogo());
        murdererPage.add(buttonsPanel.getBtnNikki());

        calendarPanel.calendarPage.add(knife);
        calendarPanel.calendarPage.add(diary);
        calendarPanel.calendarPage.add(hair);

        mainPanel.add(startPage, "Start");
        mainPanel.add(disclaimerPage, "Disclaimer");
        mainPanel.add(informationPage, "Info");
        mainPanel.add(calendarPanel.calendarPage, "Calendar");
        mainPanel.add(inventoryPage,"Inventory");
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

    public JLabel getKnife() {
        return knife;
    }

    public JLabel getDiary() {
        return diary;
    }

    public JLabel getHair() {
        return hair;
    }

    public static void main(String[] args) {
        // Create and display the main frame
        new TESTCardLayoutPanel2();
        SoundHandler.RunMusic("src/sound.wav");
    }
}
