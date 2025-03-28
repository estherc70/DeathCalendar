import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsPanel {
    private JButton startButton, btnDisclaimer, btnNext, infoButton, btnSuspects;
    private JPanel btnPanel;

    public ButtonsPanel(CardLayoutPanel2 cardLayoutPanel2) {
        //button panel
        btnPanel = new JPanel(new BorderLayout());

        //create the buttons
        startButton = new JButton(new ImageIcon("src/refactor2.0.png"));
        btnDisclaimer = new JButton(new ImageIcon("src/Disclaimer.png"));
        btnSuspects = new JButton(new ImageIcon("src/Suspects.png"));
        btnNext = new JButton("Next Panel");
        infoButton = new JButton("InfoPage");

        customizeButton(startButton);
        customizeButton(btnDisclaimer);
        customizeButton(btnSuspects);
//        customizeButton(btnReady);

        btnPanel.add(startButton);
        btnPanel.add(btnDisclaimer);
        btnPanel.add(btnSuspects);
        btnPanel.add(btnNext);
        btnPanel.add(infoButton);

        addActionListeners(cardLayoutPanel2);
    }

    private void addActionListeners(final CardLayoutPanel2 cardLayoutPanel2) {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPanel.add(btnNext, BorderLayout.EAST);
//                pane.add(btnPanel, BorderLayout.SOUTH);
                cardLayoutPanel2.showCard("Disclaimer");
            }
        });

        btnDisclaimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPanel.add(btnNext, BorderLayout.EAST);
//                pane.add(btnPanel, BorderLayout.SOUTH);
                cardLayoutPanel2.showCard("Info");
            }
        });

        btnSuspects.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPanel.add(btnNext, BorderLayout.EAST);
//                pane.add(btnPanel, BorderLayout.SOUTH);
                cardLayoutPanel2.showCard("Suspects");
            }
        });

        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (btnPanel.getLayout());
                cl.next(btnPanel);  // Switch to the next card
                btnPanel.add(infoButton, BorderLayout.WEST);
                infoButton.setVisible(true);
                btnNext.setVisible(true);
            }
        });

        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel2.showCard("Info");
                infoButton.setVisible(false);
                btnNext.setVisible(true);
            }
        });
    }

    // Method to create and return a panel that holds the buttons
    public JPanel getBtnPanel() {
        return btnPanel;
    }

    private void customizeButton(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }
}
