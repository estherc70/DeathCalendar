import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutPanel extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JButton start, btnDisclaimer, btnNext, btnPrev;
    private ImageIcon startButton;

    public CardLayoutPanel() {
        // Initialize CardLayout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout); // Apply CardLayout to main panel

        // Initialize images
        startButton = new ImageIcon("src/refactor2.0.png");

        // Create panels
        JPanel startPage = new JPanel() {
            // Override paintComponent method to paint the background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Ensure the panel is properly rendered
                // Load the background image
                ImageIcon backgroundIcon = new ImageIcon("src/StartBackground.PNG");
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
                ImageIcon backgroundIcon = new ImageIcon("src/Disclaimer.png");
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
                ImageIcon backgroundIcon = new ImageIcon("src/Calendar.png");
                Image backgroundImage = backgroundIcon.getImage();

                // Scale the image to fit the size of the panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        JPanel goodEnding = new JPanel();
        ImageIcon good = new ImageIcon("src/GoodEnding.png");
        JPanel badEnding = new JPanel();
        ImageIcon bad = new ImageIcon("src/BadEnding.png");

        JPanel suspectPage = new JPanel();
        ImageIcon suspect = new ImageIcon("src/Suspects.png");

        //JPanel disclaimer = new JPanel();
        ImageIcon disclaimerImage = new ImageIcon();

        // Create buttons
        start = new JButton(startButton);
        btnDisclaimer = new JButton(disclaimerImage);
        btnNext = new JButton("Next Panel");
        btnPrev = new JButton("InfoPage");

        // Set layout for the startPage panel (use null layout for manual control)
        startPage.setLayout(null);  // Using null layout to manually control button position

        // Set button size (optional to adjust the button size)
        start.setBounds(300, 400, 250, 120);  //// Adjust the position and size of the start button

        disclaimerPage.setLayout(null);

        btnDisclaimer.setBounds(280, 425, 325, 90); // Adjust the position and size of the disclaimer button

        calendarPage.setLayout(null);

        // Add the start button to the startPage panel
        startPage.add(start);

        disclaimerPage.add(btnDisclaimer);

        // Add the disclaimer button to the disclaimer panel
        //disclaimer.add(btnDisclaimer);

        // Add the "Back" button to the informationPage panel
        //informationPage.add(back);

        JLabel label1 = new JLabel(good);
        JLabel label2 = new JLabel(bad);
        JLabel label3 = new JLabel(suspect);

        goodEnding.add(label1);
        badEnding.add(label2);
        suspectPage.add(label3);

        // Register panels in CardLayout
        mainPanel.add(startPage, "Start");
        mainPanel.add(disclaimerPage,"Disclaimer");
        mainPanel.add(informationPage, "Info");
        mainPanel.add(calendarPage, "Calendar");
        mainPanel.add(suspectPage,"Suspects");
        mainPanel.add(goodEnding,"Good Ending");
        mainPanel.add(badEnding,"Bad Ending");

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

        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(mainPanel.getLayout());
                cl.next(mainPanel);  // Switch to the next card
                btnPanel.add(btnPrev, BorderLayout.WEST);
                btnPrev.setVisible(true);
                btnNext.setVisible(true);
            }
        });

        btnPrev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(mainPanel.getLayout());
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

        // Frame settings
        setTitle("Card Layout Example");
        setSize(900, 700); // Set the size of the window
        setResizable(false); // Disable resizing the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);

    }
}