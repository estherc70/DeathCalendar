import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutPanel extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JButton start, back, btnNext, btnFirstPanel;
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

        JPanel informationPage = new JPanel();
        JPanel calendar = new JPanel();

        informationPage.setBackground(Color.BLACK);

        // Create buttons
        start = new JButton(startButton);
        btnNext = new JButton("Next Panel");
        btnFirstPanel = new JButton("InfoPage");

        // Set layout for the startPage panel (use null layout for manual control)
        startPage.setLayout(null);  // Using null layout to manually control button position

        // Set button size (optional to adjust the button size)
        start.setBounds(300, 400, 250, 120);  // Adjust the position and size of the start button

        // Add the start button to the startPage panel
        startPage.add(start);

        // Add the "Back" button to the informationPage panel
        //informationPage.add(back);

        // Register panels in CardLayout
        mainPanel.add(startPage, "Start");
        mainPanel.add(informationPage, "Info");
        mainPanel.add(calendar, "Calendar");

        Container pane = getContentPane();
        pane.add(mainPanel, BorderLayout.CENTER);

        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(mainPanel.getLayout());
                cl.next(mainPanel);  // Switch to the next card
            }
        });

        btnFirstPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(mainPanel.getLayout());
                cl.show(mainPanel, "Info");  // Show the first panel
            }
        });


        // Panel for buttons, with layout to place buttons on left and right
        JPanel btnPanel = new JPanel(new BorderLayout());


        // Add the "First Panel" button to the left side of the panel
        btnPanel.add(btnFirstPanel, BorderLayout.WEST);


        // Add the "Next Panel" button to the right side of the panel
        btnPanel.add(btnNext, BorderLayout.EAST);


        // Add button panel to the frame
        pane.add(btnPanel, BorderLayout.SOUTH);



        // Action listeners for switching panels
        start.addActionListener(e -> cardLayout.show(mainPanel, "Info")); // Switch to Info panel
        //back.addActionListener(e -> cardLayout.show(mainPanel, "Start")); // Switch back to Start panel

        // Add main panel to frame
        add(mainPanel);

        start.setOpaque(false);
        start.setContentAreaFilled(false);
        start.setBorderPainted(false);

        // Frame settings
        setTitle("Card Layout Example");
        setSize(900, 700); // Set the size of the window
        setResizable(false); // Disable resizing the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);

    }
}