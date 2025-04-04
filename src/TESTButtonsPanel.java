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
            interactKnife, interactDiary, interactHair,
            continueInfo, btnInventory;
    private JPanel btnPanel, megumiPage, joGoPage, goJoPage, nikkiPage;
    private TESTPanelClass displayPanel;
    private TESTCardLayoutPanel2 cardLayoutPanel2;
    private GogoDialogue goGo;
    private JoGoDiagolue joGo;
    private GojoDialogue gojo;
    private NikkiDialogue nikki;
    private Inventory inventory;


    public TESTButtonsPanel(TESTCardLayoutPanel2 cardLayoutPanel2) {
        inventory = new Inventory();

        // Create button panel ***
        displayPanel = new TESTPanelClass();
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

        // Set button size (optional to adjust the button size)
        startButton.setBounds(300, 400, 250, 120);  // Adjust the position and size of the start button
        btnDisclaimer.setBounds(278, 445, 335, 93); // Adjust the position and size of the disclaimer button
        btnSuspects.setBounds(640, 275, 175, 125);
        btnReady.setBounds(279, 430, 325, 90);

        interactKnife.setBounds(500,285,120,35);
        interactDiary.setBounds(750,300,120,35);
        interactHair.setBounds(735,405,120,35);
        continueInfo.setBounds(650,550,200,53);

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

        btnInventory.setBounds(650, 430, 160, 160);


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
                btnNext.setVisible(true);
                btnPanel.add(btnNext, BorderLayout.EAST);
                cardLayoutPanel2.showCard("Info");
            }
        });

        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(cardLayoutPanel2.getMainPanel().getLayout());
                cl.show(cardLayoutPanel2.getMainPanel(), "Info");  // Show the first panel
                infoButton.setVisible(false);
                btnNext.setVisible(true);
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
            }
        });

        continueInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (cardLayoutPanel2.getMainPanel().getLayout());
                cl.next(cardLayoutPanel2.getMainPanel());  // Switch to the next card
            }
        });

        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (cardLayoutPanel2.getMainPanel().getLayout());
                cl.next(cardLayoutPanel2.getMainPanel());  // Switch to the next card
                btnPanel.add(infoButton, BorderLayout.WEST);
                infoButton.setVisible(true);
                btnNext.setVisible(true);
            }
        });

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

    }

    private void customizeButton(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
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
}

