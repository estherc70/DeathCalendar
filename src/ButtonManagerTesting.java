import javax.swing.*;
import java.awt.*;

public class ButtonManagerTesting {
    private JButton start, btnDisclaimer, btnSuspects, btnReady, btnNext, btnPrev;
    private JPanel btnPanel;

    public ButtonManagerTesting(CardLayout cardLayout, JPanel mainPanel, Container pane) {
        btnPanel = new JPanel(new BorderLayout());

        // Load button icons
        start = createImageButton("src/refactor2.0.png");
        btnDisclaimer = createImageButton("src/Disclaimer.png");
        btnSuspects = createImageButton("src/Suspects.png");
        btnReady = createImageButton("src/Ready.png");
        btnNext = new JButton("Next");
        btnPrev = new JButton("Back");

        // Button Panel Setup
        btnPanel.add(btnPrev, BorderLayout.WEST);
        btnPanel.add(btnNext, BorderLayout.EAST);
        pane.add(btnPanel, BorderLayout.SOUTH);
        btnPrev.setVisible(false);

        // Add button actions
        start.addActionListener(e -> switchPanel(cardLayout, mainPanel, "Disclaimer"));
        btnDisclaimer.addActionListener(e -> switchPanel(cardLayout, mainPanel, "Info"));
        btnSuspects.addActionListener(e -> switchPanel(cardLayout, mainPanel, "Suspects"));
        btnReady.addActionListener(e -> switchPanel(cardLayout, mainPanel, "Pick the Murderer"));

        btnNext.addActionListener(e -> {
            cardLayout.next(mainPanel);
            btnPrev.setVisible(true);
        });

        btnPrev.addActionListener(e -> {
            cardLayout.show(mainPanel, "Info");
            btnPrev.setVisible(false);
        });
    }

    private JButton createImageButton(String imagePath) {
        JButton button = new JButton(new ImageIcon(imagePath));
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        return button;
    }

    private void switchPanel(CardLayout layout, JPanel panel, String panelName) {
        layout.show(panel, panelName);
    }

    public JPanel getButtonPanel() {
        return btnPanel;
    }

    public JButton getStartButton() {
        return start;
    }

    public JButton getDisclaimerButton() {
        return btnDisclaimer;
    }

    public JButton getSuspectsButton() {
        return btnSuspects;
    }

    public JButton getReadyButton() {
        return btnReady;
    }
}

