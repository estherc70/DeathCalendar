import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CardLayoutPanel extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JButton start, btnDisclaimer, btnNext, btnPrev, btnSuspects, btnReady, btnGojo;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15,
            btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28;
    //test for list
    private JButton[][] calendarButtons;
    private ImageIcon startButton;

    public CardLayoutPanel() {
        // Initialize CardLayout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout); // Apply CardLayout to main panel

        // Initialize images
        startButton = new ImageIcon("src/images/refactor2.0.png");

        // Create panels
        JPanel startPage = new JPanel() {
            // Override paintComponent method to paint the background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Ensure the panel is properly rendered
                // Load the background image
                ImageIcon backgroundIcon = new ImageIcon("src/images/StartBackground.PNG");
                Image backgroundImage = backgroundIcon.getImage();

                // Scale the image to fit the size of the panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        JPanel disclaimerPage = new JPanel() {
            // Override paintComponent method to paint the background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Ensure the panel is properly rendered
                // Load the background image
                ImageIcon backgroundIcon = new ImageIcon("src/images/Disclaimer.png");
                Image backgroundImage = backgroundIcon.getImage();

                // Scale the image to fit the size of the panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        JPanel informationPage = new JPanel();
        informationPage.setBackground(Color.BLACK);

        //JPanel calendar = new JPanel();
        JPanel calendarPage = new JPanel() {
            // Override paintComponent method to paint the background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Ensure the panel is properly rendered
                // Load the background image
                ImageIcon backgroundIcon = new ImageIcon("src/images/Calendar.png");
                Image backgroundImage = backgroundIcon.getImage();

                // Scale the image to fit the size of the panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        JPanel suspectPage = new JPanel() {
            // Override paintComponent method to paint the background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Ensure the panel is properly rendered
                // Load the background image
                ImageIcon backgroundIcon = new ImageIcon("src/images/Suspects.png");
                Image backgroundImage = backgroundIcon.getImage();

                // Scale the image to fit the size of the panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        JPanel murdererPage = new JPanel() {
            // Override paintComponent method to paint the background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Ensure the panel is properly rendered
                // Load the background image
                ImageIcon backgroundIcon = new ImageIcon("src/images/PickTheMurderer.png");
                Image backgroundImage = backgroundIcon.getImage();

                // Scale the image to fit the size of the panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        JPanel goodEnding = new JPanel();
        ImageIcon good = new ImageIcon("src/images/GoodEnding.png");
        JPanel badEnding = new JPanel();
        ImageIcon bad = new ImageIcon("src/images/BadEnding.png");

//        JPanel suspectPage = new JPanel();
//        ImageIcon suspect = new ImageIcon("src/images/Suspects.png");

        //JPanel disclaimer = new JPanel();
        ImageIcon disclaimerImage = new ImageIcon();
        ImageIcon suspectsImage = new ImageIcon();
        ImageIcon readyImage = new ImageIcon();
        ImageIcon gojoImage = new ImageIcon();

        // Create buttons
        start = new JButton(startButton);
        btnDisclaimer = new JButton(disclaimerImage);
        btnSuspects = new JButton(suspectsImage);
        btnReady = new JButton(readyImage);
        btnGojo = new JButton(gojoImage);
        btnNext = new JButton("Next Panel");
        btnPrev = new JButton("InfoPage");


        // Set layout for the startPage panel (use null layout for manual control)
        startPage.setLayout(null);  // Using null layout to manually control button position

        // Set button size (optional to adjust the button size)
        start.setBounds(300, 400, 250, 120);  //// Adjust the position and size of the start button

        disclaimerPage.setLayout(null);

        btnDisclaimer.setBounds(280, 425, 325, 90); // Adjust the position and size of the disclaimer button

        calendarPage.setLayout(null);

        btnSuspects.setBounds(640, 275, 175, 125);

        suspectPage.setLayout(null);

        btnReady.setBounds(279, 430, 325, 90);

        murdererPage.setLayout(null);

        btnGojo.setBounds(300, 400, 250, 120);

        // Add the start button to the startPage panel
        startPage.add(start);

        disclaimerPage.add(btnDisclaimer);

        calendarPage.add(btnSuspects);

        suspectPage.add(btnReady);

        murdererPage.add(btnGojo);

        // Add the disclaimer button to the disclaimer panel
        //disclaimer.add(btnDisclaimer);

        // Add the "Back" button to the informationPage panel
        //informationPage.add(back);

        JLabel label1 = new JLabel(good);
        JLabel label2 = new JLabel(bad);
        //JLabel label3 = new JLabel(suspect);

        goodEnding.add(label1);
        badEnding.add(label2);
        //suspectPage.add(label3);

        // Register panels in CardLayout
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

        JPanel btnPanel = new JPanel(new BorderLayout());

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPanel.add(btnNext, BorderLayout.EAST);
                pane.add(btnPanel, BorderLayout.SOUTH);
                cardLayout.show(mainPanel, "Disclaimer");
            }
        });

        btnDisclaimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPanel.add(btnNext, BorderLayout.EAST);
                pane.add(btnPanel, BorderLayout.SOUTH);
                cardLayout.show(mainPanel, "Info");
            }
        });

        btnSuspects.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPanel.add(btnNext, BorderLayout.EAST);
                pane.add(btnPanel, BorderLayout.SOUTH);
                cardLayout.show(mainPanel, "Suspects");
            }
        });

        btnReady.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPanel.add(btnNext, BorderLayout.EAST);
                pane.add(btnPanel, BorderLayout.SOUTH);
                cardLayout.show(mainPanel, "Pick the Murderer");
            }
        });

        btnGojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPanel.add(btnNext, BorderLayout.EAST);
                pane.add(btnPanel, BorderLayout.SOUTH);
                cardLayout.show(mainPanel, "Good Ending");
            }
        });

        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.next(mainPanel);  // Switch to the next card
                btnPanel.add(btnPrev, BorderLayout.WEST);
                btnPrev.setVisible(true);
                btnNext.setVisible(true);
            }
        });

        btnPrev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Info");  // Show the first panel
                btnPrev.setVisible(false);
                btnNext.setVisible(true);
            }
        });


        // Panel for buttons, with layout to place buttons on left and right
//        JPanel btnPanel = new JPanel(new BorderLayout());


        // Add the "First Panel" button to the left side of the panel
//        btnPanel.add(btnPrev, BorderLayout.WEST);


        // Add the "Next Panel" button to the right side of the panel
//        btnPanel.add(btnNext, BorderLayout.EAST);


        // Add button panel to the frame
//        pane.add(btnPanel, BorderLayout.SOUTH);


        // Action listeners for switching panels
//        start.addActionListener(e -> cardLayout.show(mainPanel, "Info")); // Switch to Info panel
        //back.addActionListener(e -> cardLayout.show(mainPanel, "Start")); // Switch back to Start panel

        // Add main panel to frame
        add(mainPanel);

        start.setOpaque(false);
        start.setContentAreaFilled(false);
        start.setBorderPainted(false);

        btnDisclaimer.setOpaque(false);
        btnDisclaimer.setContentAreaFilled(false);
        btnDisclaimer.setBorderPainted(false);

        btnSuspects.setOpaque(false);
        btnSuspects.setContentAreaFilled(false);
        btnSuspects.setBorderPainted(false);

        btnReady.setOpaque(false);
        btnReady.setContentAreaFilled(false);
        btnReady.setBorderPainted(false);

        btnGojo.setOpaque(true);
        btnGojo.setContentAreaFilled(true);
        btnGojo.setBorderPainted(true);

        // Frame settings
        setTitle("Card Layout Example");
        setSize(900, 700); // Set the size of the window
        setResizable(false); // Disable resizing the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);

    }

}