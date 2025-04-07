import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class TESTButtonsPanel {
    private JButton startButton, btnDisclaimer, btnNext,
            infoButton, btnSuspects, btnReady,
            btnGojo, btnJoGo, btnGogo,
            btnNikki, eGojo, eJoGo,
            eNikki, eGogo, btnReturn,
            btnReturn2, btnReturn3, btnReturn4,
            introduce1, introduce2, introduce3, introduce4,
            talk1, talk2, talk3, talk4,
            specialTalk1, specialTalk2, specialTalk3, specialTalk4,
            interactKnife, interactDiary, interactHair,
            continueInfo, btnInventory, btnKnife,
            btnDiary, btnHair, btnObjection,
            btnLost;
    private JPanel btnPanel, megumiPage, joGoPage, goJoPage, nikkiPage;
    private TESTCardLayoutPanel2 cardLayoutPanel2;
    private GogoDialogue goGo;
    private JoGoDiagolue joGo;
    private GojoDialogue gojo;
    private NikkiDialogue nikki;
    private Inventory inventory;
    private String nothing;


    public TESTButtonsPanel(TESTCardLayoutPanel2 cardLayoutPanel2) {
        inventory = new Inventory();
        nothing = "You aren't holding an item...";

        // Create button panel ***
        btnPanel = new JPanel(new BorderLayout());
        this.cardLayoutPanel2 = cardLayoutPanel2;
        goGo = new GogoDialogue("Gogo",12,"step-son");
        joGo = new JoGoDiagolue("JoGo",28,"her friend");
        gojo = new GojoDialogue("Gojo",28,"husband");
        nikki = new NikkiDialogue("Nikki",25,"the co-worker");

        // Create the buttons
        startButton = new JButton(new ImageIcon("src/images/refactor2.0.png"));
        btnDisclaimer = new JButton();
        btnSuspects = new JButton();

        btnInventory = new JButton();

        interactKnife = new JButton();
        interactDiary = new JButton();
        interactHair = new JButton();
        continueInfo = new JButton();

        btnReady = new JButton();
        btnGojo = new JButton();
        btnJoGo = new JButton();
        btnGogo = new JButton();
        btnNikki = new JButton();

        eGojo = new JButton();
        eGogo = new JButton();
        eNikki = new JButton();
        eJoGo = new JButton();

        btnReturn = new JButton();
        btnReturn2 = new JButton();
        btnReturn3 = new JButton();
        btnReturn4 = new JButton();

        introduce1 = new JButton();
        introduce2 = new JButton();
        introduce3 = new JButton();
        introduce4 = new JButton();

        talk1 = new JButton();
        talk2 = new JButton();
        talk3 = new JButton();
        talk4 = new JButton();

        specialTalk1 = new JButton();
        specialTalk2 = new JButton();
        specialTalk3 = new JButton();
        specialTalk4 = new JButton();

        btnHair = new JButton();
        btnDiary = new JButton();
        btnKnife = new JButton();

        btnObjection = new JButton();
        btnLost = new JButton();

        btnNext = new JButton("Next Panel");
        infoButton = new JButton("InfoPage");

        // Set the opaque
        customizeButton(startButton);
        customizeButton(btnDisclaimer);
        customizeButton(interactKnife);
        customizeButton(interactDiary);
        customizeButton(interactHair);
        customizeButton(continueInfo);
        customizeButton(btnSuspects);
        customizeButton(btnInventory);
        customizeButton(btnReady);
        customizeButton(btnGojo);
        customizeButton(btnJoGo);
        customizeButton(btnGogo);
        customizeButton(btnNikki);
        customizeButton(eGojo);
        customizeButton(eGogo);
        customizeButton(eNikki);
        customizeButton(eJoGo);
        customizeButton(btnReturn);
        customizeButton(btnReturn2);
        customizeButton(btnReturn3);
        customizeButton(btnReturn4);
        customizeButton(introduce1);
        customizeButton(introduce2);
        customizeButton(introduce3);
        customizeButton(introduce4);
        customizeButton(talk1);
        customizeButton(talk2);
        customizeButton(talk3);
        customizeButton(talk4);
        customizeButton(specialTalk1);
        customizeButton(specialTalk2);
        customizeButton(specialTalk3);
        customizeButton(specialTalk4);
        customizeButton(btnKnife);
        customizeButton(btnHair);
        customizeButton(btnDiary);
        customizeButton(btnObjection);
        customizeButton(btnLost);

        // Set button size (optional to adjust the button size)
        startButton.setBounds(300, 400, 250, 120);  // Adjust the position and size of the start button
        btnDisclaimer.setBounds(278, 445, 335, 93); // Adjust the position and size of the disclaimer button
        btnSuspects.setBounds(640, 275, 175, 125);
        btnReady.setBounds(279, 430, 325, 90);

        interactKnife.setBounds(500,305,120,35);
        interactDiary.setBounds(750,320,120,35);
        interactHair.setBounds(735,435,120,35);
        continueInfo.setBounds(650,580,200,53);

        btnGojo.setBounds(140, 410, 300, 80);
        btnJoGo.setBounds(445, 410, 300, 80);
        btnGogo.setBounds(140, 495, 300, 80);
        btnNikki.setBounds(445, 495, 300, 80);

        eGogo.setBounds(75,180,80,40);
        eJoGo.setBounds(310,200,80,40);
        eGojo.setBounds(530,170,70,40);
        eNikki.setBounds(750,170,70,40);
        btnReturn.setBounds(693,545,160,60);
        btnReturn2.setBounds(693,545,160,60);
        btnReturn3.setBounds(693,545,160,60);
        btnReturn4.setBounds(693,545,160,60);

        introduce1.setBounds(515,90,250,70);
        introduce2.setBounds(515,90,250,70);
        introduce3.setBounds(515,90,250,70);
        introduce4.setBounds(515,90,250,70);

        talk1.setBounds(515,195,250,70);
        talk2.setBounds(515,195,250,70);
        talk3.setBounds(515,195,250,70);
        talk4.setBounds(515,195,250,70);

        specialTalk1.setBounds(515,300,250,70);
        specialTalk2.setBounds(515,300,250,70);
        specialTalk3.setBounds(515,300,250,70);
        specialTalk4.setBounds(515,300,250,70);

        btnKnife.setBounds(180,230,178,50);
        btnDiary.setBounds(565,250,178,50);
        btnHair.setBounds(355,392,178,50);

        btnInventory.setBounds(650, 430, 160, 160);

        btnObjection.setBounds(595,560,250,70);
        btnLost.setBounds(127, 522, 200, 55);

        btnPanel.add(startButton);
        btnPanel.add(btnDisclaimer);
        btnPanel.add(btnSuspects);
        //btnPanel.add(btnGojo);
        btnNext.setVisible(false);
        btnPanel.add(btnNext);
        btnPanel.add(introduce1, BorderLayout.CENTER);
        btnPanel.add(introduce2, BorderLayout.CENTER);
        btnPanel.add(introduce3, BorderLayout.CENTER);
        btnPanel.add(introduce4, BorderLayout.CENTER);

        addActionListeners(cardLayoutPanel2);
        addActionListeners();
    }

    private void addActionListeners() {
        // When the introduce1 button is clicked, repaint the megumiPage
        introduce1.addActionListener(e -> {
            // Find the "Megumi" card by name
            megumiPage = (JPanel) cardLayoutPanel2.getMainPanel().getComponent(9); // Get Megumi card by index
            // or access it using `cardLayoutPanel2.getMainPanel().getComponent("Megumi");` - Update method, get it by card name!
            if (megumiPage != null && megumiPage instanceof TESTPanelClass) {
                ((TESTPanelClass) megumiPage).setMessage(goGo.introduce());  // Set message and repaint
                megumiPage.repaint();  // Force repaint after setting message
            }
        });

        introduce2.addActionListener(e -> {
            // Find the "Megumi" card by name
            joGoPage = (JPanel) cardLayoutPanel2.getMainPanel().getComponent(8); // Get Megumi card by index
            // or access it using `cardLayoutPanel2.getMainPanel().getComponent("Megumi");` - Update method, get it by card name!
            if (joGoPage != null && joGoPage instanceof TESTPanelClass) {
                ((TESTPanelClass) joGoPage).setMessage(joGo.introduce());  // Set message and repaint
                joGoPage.repaint();  // Force repaint after setting message
            }
        });

        introduce3.addActionListener(e -> {
            // Find the "Megumi" card by name
            goJoPage = (JPanel) cardLayoutPanel2.getMainPanel().getComponent(6); // Get Megumi card by index
            // or access it using `cardLayoutPanel2.getMainPanel().getComponent("Megumi");` - Update method, get it by card name!
            if (goJoPage != null && goJoPage instanceof TESTPanelClass) {
                ((TESTPanelClass) goJoPage).setMessage(gojo.introduce());  // Set message and repaint
                goJoPage.repaint();  // Force repaint after setting message
            }
        });

        introduce4.addActionListener(e -> {
            // Find the "Megumi" card by name
            nikkiPage = (JPanel) cardLayoutPanel2.getMainPanel().getComponent(7); // Get Megumi card by index
            // or access it using `cardLayoutPanel2.getMainPanel().getComponent("Megumi");` - Update method, get it by card name!
            if (nikkiPage != null && nikkiPage instanceof TESTPanelClass) {
                ((TESTPanelClass) nikkiPage).setMessage(nikki.introduce());  // Set message and repaint
                nikkiPage.repaint();  // Force repaint after setting message
            }
        });

        talk1.addActionListener(e -> {
            // Find the "Megumi" card by name
            megumiPage = (JPanel) cardLayoutPanel2.getMainPanel().getComponent(9); // Get Megumi card by index
            // or access it using `cardLayoutPanel2.getMainPanel().getComponent("Megumi");` - Update method, get it by card name!
            if (megumiPage != null && megumiPage instanceof TESTPanelClass) {
                ((TESTPanelClass) megumiPage).setMessage(goGo.talk());  // Set message and repaint
                megumiPage.repaint();  // Force repaint after setting message
            }
        });

        talk2.addActionListener(e -> {
            // Find the "Megumi" card by name
            joGoPage = (JPanel) cardLayoutPanel2.getMainPanel().getComponent(8); // Get Megumi card by index
            // or access it using `cardLayoutPanel2.getMainPanel().getComponent("Megumi");` - Update method, get it by card name!
            if (joGoPage != null && joGoPage instanceof TESTPanelClass) {
                ((TESTPanelClass) joGoPage).setMessage(joGo.talk());  // Set message and repaint
                joGoPage.repaint();  // Force repaint after setting message
            }
        });

        talk3.addActionListener(e -> {
            // Find the "Megumi" card by name
            goJoPage = (JPanel) cardLayoutPanel2.getMainPanel().getComponent(6); // Get Megumi card by index
            // or access it using `cardLayoutPanel2.getMainPanel().getComponent("Megumi");` - Update method, get it by card name!
            if (goJoPage != null && goJoPage instanceof TESTPanelClass) {
                ((TESTPanelClass) goJoPage).setMessage(gojo.talk());  // Set message and repaint
                goJoPage.repaint();  // Force repaint after setting message
            }
        });

        talk4.addActionListener(e -> {
            // Find the "Megumi" card by name
            nikkiPage = (JPanel) cardLayoutPanel2.getMainPanel().getComponent(7); // Get Megumi card by index
            // or access it using `cardLayoutPanel2.getMainPanel().getComponent("Megumi");` - Update method, get it by card name!
            if (nikkiPage != null && nikkiPage instanceof TESTPanelClass) {
                ((TESTPanelClass) nikkiPage).setMessage(nikki.talk());  // Set message and repaint
                nikkiPage.repaint();  // Force repaint after setting message
            }
        });

        specialTalk1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                megumiPage = (JPanel) cardLayoutPanel2.getMainPanel().getComponent(9); // Get Megumi card by index
                // or access it using `cardLayoutPanel2.getMainPanel().getComponent("Megumi");` - Update method, get it by card name!
                if (megumiPage != null && megumiPage instanceof TESTPanelClass) {
                    if (inventory.getHoldingKnife()) {
                        // special talk knife
                        ((TESTPanelClass) megumiPage).setMessage(goGo.specialTalkKnife());  // Set message and repaint
                        megumiPage.repaint();  // Force repaint after setting message
                    } else if (inventory.getHoldingDiary()) {
                        // special talk diary
                        ((TESTPanelClass) megumiPage).setMessage(goGo.specialTalkDiary());  // Set message and repaint
                        megumiPage.repaint();  // Force repaint after setting message
                    } else if (inventory.getHoldingHair()) {
                        //special talk hair
                        ((TESTPanelClass) megumiPage).setMessage(goGo.specialTalkHair());  // Set message and repaint
                        megumiPage.repaint();  // Force repaint after setting message
                    } else {
                        ((TESTPanelClass) megumiPage).setMessage(nothing);  // Set message and repaint
                        megumiPage.repaint();  // Force repaint after setting message
                    }
                }
            }
        });

        specialTalk2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                joGoPage = (JPanel) cardLayoutPanel2.getMainPanel().getComponent(8); // Get Megumi card by index
                // or access it using `cardLayoutPanel2.getMainPanel().getComponent("Megumi");` - Update method, get it by card name!
                if (joGoPage != null && joGoPage instanceof TESTPanelClass) {
                    if (inventory.getHoldingKnife()) {
                        // special talk knife
                        ((TESTPanelClass) joGoPage).setMessage(joGo.specialTalkKnife());  // Set message and repaint
                        joGoPage.repaint();  // Force repaint after setting message
                    } else if (inventory.getHoldingDiary()) {
                        // special talk diary
                        ((TESTPanelClass) joGoPage).setMessage(joGo.specialTalkDiary());  // Set message and repaint
                        joGoPage.repaint();  // Force repaint after setting message
                    } else if (inventory.getHoldingHair()) {
                        //special talk hair
                        ((TESTPanelClass) joGoPage).setMessage(joGo.specialTalkHair());  // Set message and repaint
                        joGoPage.repaint();  // Force repaint after setting message
                    } else {
                        ((TESTPanelClass) joGoPage).setMessage(nothing);  // Set message and repaint
                        joGoPage.repaint();  // Force repaint after setting message
                    }
                }
            }
        });

        specialTalk3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goJoPage = (JPanel) cardLayoutPanel2.getMainPanel().getComponent(6); // Get Megumi card by index
                // or access it using `cardLayoutPanel2.getMainPanel().getComponent("Megumi");` - Update method, get it by card name!
                if (goJoPage != null && goJoPage instanceof TESTPanelClass) {
                    if (inventory.getHoldingKnife()) {
                        // special talk knife
                        ((TESTPanelClass) goJoPage).setMessage(gojo.specialTalkKnife());  // Set message and repaint
                        goJoPage.repaint();  // Force repaint after setting message
                    } else if (inventory.getHoldingDiary()) {
                        // special talk diary
                        ((TESTPanelClass) goJoPage).setMessage(gojo.specialTalkDiary());  // Set message and repaint
                        goJoPage.repaint();  // Force repaint after setting message
                    } else if (inventory.getHoldingHair()) {
                        //special talk hair
                        ((TESTPanelClass) goJoPage).setMessage(gojo.specialTalkHair());  // Set message and repaint
                        goJoPage.repaint();  // Force repaint after setting message
                    } else {
                        ((TESTPanelClass) goJoPage).setMessage(nothing);  // Set message and repaint
                        goJoPage.repaint();  // Force repaint after setting message
                    }
                }
            }
        });

        specialTalk4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nikkiPage = (JPanel) cardLayoutPanel2.getMainPanel().getComponent(7); // Get Megumi card by index
                // or access it using `cardLayoutPanel2.getMainPanel().getComponent("Megumi");` - Update method, get it by card name!
                if (nikkiPage != null && nikkiPage instanceof TESTPanelClass) {
                    if (inventory.getHoldingKnife()) {
                        // special talk knife
                        ((TESTPanelClass) nikkiPage).setMessage(nikki.specialTalkKnife());  // Set message and repaint
                        nikkiPage.repaint();  // Force repaint after setting message
                    } else if (inventory.getHoldingDiary()) {
                        // special talk diary
                        ((TESTPanelClass) nikkiPage).setMessage(nikki.specialTalkDiary());  // Set message and repaint
                        nikkiPage.repaint();  // Force repaint after setting message
                    } else if (inventory.getHoldingHair()) {
                        //special talk hair
                        ((TESTPanelClass) nikkiPage).setMessage(nikki.specialTalkHair());  // Set message and repaint
                        nikkiPage.repaint();  // Force repaint after setting message
                    } else {
                        ((TESTPanelClass) nikkiPage).setMessage(nothing);  // Set message and repaint
                        nikkiPage.repaint();  // Force repaint after setting message
                    }
                }
            }
        });
    }

    private void addActionListeners(final TESTCardLayoutPanel2 cardLayoutPanel2) {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel2.showCard("Disclaimer");
            }
        });

        btnDisclaimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                btnNext.setVisible(true);
//                btnPanel.add(btnNext, BorderLayout.EAST);
                cardLayoutPanel2.showCard("Info");
//                infoButton.setVisible(true);
            }
        });

        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(cardLayoutPanel2.getMainPanel().getLayout());
                cl.show(cardLayoutPanel2.getMainPanel(), "Info");  // Show the first panel
                infoButton.setVisible(false);
//                btnNext.setVisible(true);
            }
        });

        interactKnife.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 JFrame newWindow = new JFrame("Inventory");
                 newWindow.setSize(500, 500);  // Set the size of the new window
                 newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Close when clicked on X
                 newWindow.setLayout(null);
                 newWindow.setLocationRelativeTo(null); // Center the window on the screen

                 // add image as background
                 JLabel contentPane = new JLabel();
                 ImageIcon imageIcon = new ImageIcon("src/images/knife.png");
                 contentPane.setIcon(imageIcon);
                 contentPane.setLayout( new BorderLayout() );
                 newWindow.setContentPane( contentPane );

                 // Make the new window visible
                 newWindow.setVisible(true);
                 inventory.setKnife(true);
                 newWindow.setResizable(false); // Disable resizing the window
             }
         });

        interactDiary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newWindow = new JFrame("Inventory");
                newWindow.setSize(500, 500);  // Set the size of the new window
                newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Close when clicked on X
                newWindow.setLayout(null);
                newWindow.setLocationRelativeTo(null); // Center the window on the screen

                // add image as background
                JLabel contentPane = new JLabel();
                ImageIcon imageIcon = new ImageIcon("src/images/diary.png");
                contentPane.setIcon(imageIcon);
                contentPane.setLayout( new BorderLayout() );
                newWindow.setContentPane( contentPane );

                // Make the new window visible
                newWindow.setVisible(true);
                inventory.setDiary(true);
                newWindow.setResizable(false); // Disable resizing the window
            }
        });

        interactHair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newWindow = new JFrame("Inventory");
                newWindow.setSize(500, 500);  // Set the size of the new window
                newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Close when clicked on X
                newWindow.setLayout(null);
                newWindow.setLocationRelativeTo(null); // Center the window on the screen


                // add image as background
                JLabel contentPane = new JLabel();
                ImageIcon imageIcon = new ImageIcon("src/images/hair.png");
                contentPane.setIcon(imageIcon);
                contentPane.setLayout( new BorderLayout() );
                newWindow.setContentPane( contentPane );

                // Make the new window visible
                newWindow.setVisible(true);
                inventory.setHair(true);
                newWindow.setResizable(false); // Disable resizing the window
            }
        });

        continueInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (cardLayoutPanel2.getMainPanel().getLayout());
                cl.next(cardLayoutPanel2.getMainPanel());  // Switch to the next card
                btnPanel.add(infoButton, BorderLayout.WEST);
                infoButton.setVisible(true);
            }
        });

//        btnNext.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                CardLayout cl = (CardLayout) (cardLayoutPanel2.getMainPanel().getLayout());
//                cl.next(cardLayoutPanel2.getMainPanel());  // Switch to the next card
//                btnPanel.add(infoButton, BorderLayout.WEST);
//                infoButton.setVisible(true);
//                btnNext.setVisible(true);
//            }
//        });

        btnSuspects.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPanel.add(btnNext, BorderLayout.EAST);
                cardLayoutPanel2.showCard("Suspects");
            }
        });

        btnReady.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPanel.add(btnNext, BorderLayout.EAST);
                cardLayoutPanel2.showCard("Pick the Murderer");
            }
        });

        btnGojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoButton.setVisible(false);
                btnNext.setVisible(false);
                cardLayoutPanel2.showCard("Good Ending");
            }
        });

        btnJoGo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoButton.setVisible(false);
                btnNext.setVisible(false);
                cardLayoutPanel2.showCard("Objection");
            }
        });

        btnGogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoButton.setVisible(false);
                btnNext.setVisible(false);
                cardLayoutPanel2.showCard("Objection");
            }
        });

        btnNikki.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoButton.setVisible(false);
                btnNext.setVisible(false);
                cardLayoutPanel2.showCard("Objection");
            }
        });

        eNikki.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel2.showCard("Nikki");
            }
        });

        eGojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel2.showCard("Gojo");
            }
        });

        eJoGo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel2.showCard("JoGo");
            }
        });

        eGogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel2.showCard("Gogo");
            }
        });

        btnReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel2.showCard("Suspects");
            }
        });

        btnReturn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel2.showCard("Suspects");
            }
        });

        btnReturn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel2.showCard("Suspects");
            }
        });

        btnReturn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel2.showCard("Suspects");
            }
        });

        btnInventory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel2.showCard("Inventory");
            }
        });

        btnObjection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel2.showCard("Why");
            }
        });

        btnKnife.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newWindow = new JFrame("Equipping Item");
                newWindow.setSize(500, 500);  // Set the size of the new window
                newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Close when clicked on X
                newWindow.setLayout(null);
                newWindow.setLocationRelativeTo(null); // Center the window on the screen

                // add image as background
                JLabel contentPane = new JLabel();
                ImageIcon imageIcon;

                if (inventory.getKnife()) {
                    imageIcon = new ImageIcon("src/images/ItemEquipped.png");
                    cardLayoutPanel2.getKnife().setVisible(true);
                    cardLayoutPanel2.showCard("Calendar");
                    cardLayoutPanel2.getHair().setVisible(false);
                    cardLayoutPanel2.getDiary().setVisible(false);
                    inventory.setHoldingKnife(true);
                    inventory.setHoldingHair(false);
                    inventory.setHoldingDiary(false);
                } else {
                    imageIcon = new ImageIcon("src/images/ItemWarning.png");
                    cardLayoutPanel2.getKnife().setVisible(false);
                }

                contentPane.setIcon(imageIcon);
                contentPane.setLayout( new BorderLayout() );
                newWindow.setContentPane( contentPane );

                // Make the new window visible
                newWindow.setVisible(true);
                newWindow.setResizable(false); // Disable resizing the window
            }
        });

        btnDiary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newWindow = new JFrame("Equipping Item");
                newWindow.setSize(500, 500);  // Set the size of the new window
                newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Close when clicked on X
                newWindow.setLayout(null);
                newWindow.setLocationRelativeTo(null); // Center the window on the screen

                // add image as background
                JLabel contentPane = new JLabel();
                ImageIcon imageIcon;

                if (inventory.getDiary()) {
                    imageIcon = new ImageIcon("src/images/ItemEquipped.png");
                    cardLayoutPanel2.getDiary().setVisible(true);
                    cardLayoutPanel2.showCard("Calendar");
                    cardLayoutPanel2.getKnife().setVisible(false);
                    cardLayoutPanel2.getHair().setVisible(false);
                    inventory.setHoldingDiary(true);
                    inventory.setHoldingKnife(false);
                    inventory.setHoldingHair(false);
                } else {
                    imageIcon = new ImageIcon("src/images/ItemWarning.png");
                    cardLayoutPanel2.getDiary().setVisible(false);
                }

                contentPane.setIcon(imageIcon);
                contentPane.setLayout( new BorderLayout() );
                newWindow.setContentPane( contentPane );

                // Make the new window visible
                newWindow.setVisible(true);
                newWindow.setResizable(false); // Disable resizing the window
            }
        });

        btnHair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newWindow = new JFrame("Equipping Item");
                newWindow.setSize(500, 500);  // Set the size of the new window
                newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Close when clicked on X
                newWindow.setLayout(null);
                newWindow.setLocationRelativeTo(null); // Center the window on the screen

                // add image as background
                JLabel contentPane = new JLabel();
                ImageIcon imageIcon;

                if (inventory.getHair()) {
                    imageIcon = new ImageIcon("src/images/ItemEquipped.png");
                    cardLayoutPanel2.getHair().setVisible(true);
                    cardLayoutPanel2.showCard("Calendar");
                    cardLayoutPanel2.getKnife().setVisible(false);
                    cardLayoutPanel2.getDiary().setVisible(false);
                    inventory.setHoldingHair(true);
                    inventory.setHoldingKnife(false);
                    inventory.setHoldingDiary(false);
                } else {
                    imageIcon = new ImageIcon("src/images/ItemWarning.png");
                    cardLayoutPanel2.getHair().setVisible(false);
                }

                contentPane.setIcon(imageIcon);
                contentPane.setLayout( new BorderLayout() );
                newWindow.setContentPane( contentPane );

                // Make the new window visible
                newWindow.setVisible(true);
                newWindow.setResizable(false); // Disable resizing the window
            }
        });

        btnLost.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoButton.setVisible(false);
                btnNext.setVisible(false);
                cardLayoutPanel2.showCard("Bad Ending");
            }
        });
    }

    private void customizeButton(JButton button) {
        button.setOpaque(true);
        button.setContentAreaFilled(true);
        button.setBorderPainted(true);
    }

    // Method to create and return a panel that holds the buttons
    public JPanel getBtnPanel() {
        return btnPanel;
    }

    public JButton getStartButton() {
        return startButton;
    }

    public JButton getBtnDisclaimer() {
        return btnDisclaimer;
    }

    public JButton getInteractKnife() {
        return interactKnife;
    }

    public JButton getInteractDiary() {
        return interactDiary;
    }

    public JButton getInteractHair() {
        return interactHair;
    }

    public JButton getContinueInfo() {
        return continueInfo;
    }

    public JButton getBtnReady() {
        return btnReady;
    }

    public JButton getBtnSuspects() {
        return btnSuspects;
    }

    public JButton getBtnGojo() {
        return btnGojo;
    }

    public JButton getBtnJoGo() {
        return btnJoGo;
    }

    public JButton getBtnGogo() {
        return btnGogo;
    }

    public JButton getBtnNikki() {
        return btnNikki;
    }

    public JButton geteGogo() {
        return eGogo;
    }

    public JButton geteJoGo() {
        return eJoGo;
    }

    public JButton geteNikki() {
        return eNikki;
    }

    public JButton geteGojo() {
        return eGojo;
    }

    public JButton getBtnReturn() {
        return btnReturn;
    }

    public JButton getBtnReturn2() {
        return btnReturn2;
    }

    public JButton getBtnReturn3() {
        return btnReturn3;
    }

    public JButton getBtnReturn4() {
        return btnReturn4;
    }

    public JButton getIntroduce1() {
        return introduce1;
    }

    public JButton getIntroduce2() {
        return introduce2;
    }

    public JButton getIntroduce3() {
        return introduce3;
    }

    public JButton getIntroduce4() {
        return introduce4;
    }

    public JButton getTalk1() {
        return talk1;
    }

    public JButton getTalk2() {
        return talk2;
    }

    public JButton getTalk3() {
        return talk3;
    }

    public JButton getTalk4() {
        return talk4;
    }

    public JButton getBtnInventory() {
        return btnInventory;
    }

    public JButton getBtnHair() {
        return btnHair;
    }

    public JButton getBtnDiary() {
        return btnDiary;
    }

    public JButton getBtnKnife() {
        return btnKnife;
    }

    public JButton getSpecialTalk1() {
        return specialTalk1;
    }

    public JButton getSpecialTalk2() {
        return specialTalk2;
    }

    public JButton getSpecialTalk3() {
        return specialTalk3;
    }

    public JButton getSpecialTalk4() {
        return specialTalk4;
    }

    public JButton getBtnObjection() {
        return btnObjection;
    }

    public JButton getBtnLost() {
        return btnLost;
    }
}

