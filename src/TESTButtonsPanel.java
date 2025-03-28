import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TESTButtonsPanel {
    private JButton startButton, btnDisclaimer, btnNext, infoButton, btnSuspects, btnReady, btnGojo;
    private JPanel btnPanel;

    public TESTButtonsPanel(TESTCardLayoutPanel2 cardLayoutPanel2) {
        //button panel
        btnPanel = new JPanel(new BorderLayout());

        //create the buttons
        startButton = new JButton(new ImageIcon("src/images/refactor2.0.png"));
        btnDisclaimer = new JButton(new ImageIcon());
        btnSuspects = new JButton(new ImageIcon("src/images/Suspects.png"));
        btnNext = new JButton("Next Panel");
        infoButton = new JButton("InfoPage");

        customizeButton(startButton);
        customizeButton(btnDisclaimer);
        customizeButton(btnSuspects);
//        customizeButton(btnReady);

        // Set button size (optional to adjust the button size)
        startButton.setBounds(300, 400, 250, 120);  //// Adjust the position and size of the start button
        btnDisclaimer.setBounds(280, 425, 325, 90); // Adjust the position and size of the disclaimer button
        btnSuspects.setBounds(640, 275, 175, 125);
//        btnReady.setBounds(279, 430, 325, 90);
//        btnGojo.setBounds(300, 400, 250, 120);

        btnPanel.add(startButton);
        btnPanel.add(btnDisclaimer);
        btnPanel.add(btnSuspects);

        btnNext.setVisible(false);
        btnPanel.add(btnNext);

        addActionListeners(cardLayoutPanel2);
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

        btnSuspects.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPanel.add(btnNext, BorderLayout.EAST);
                cardLayoutPanel2.showCard("Suspects");
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

        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(cardLayoutPanel2.getMainPanel().getLayout());
                cl.show(cardLayoutPanel2.getMainPanel(), "Info");  // Show the first panel
                infoButton.setVisible(false);
                btnNext.setVisible(true);
            }
        });

//        btnReady.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                btnPanel.add(btnNext, BorderLayout.EAST);
//                cardLayoutPanel2.showCard("Pick the Murderer");
//            }
//        });
//
//        btnGojo.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                btnPanel.add(btnNext, BorderLayout.EAST);
//                cardLayoutPanel2.showCard("Good Ending");
//            }
//        });

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
}

