import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calendar extends JButton {
    ImageIcon image = new ImageIcon();
    private JButton[][] calendarButtons;
    private TESTButtonsPanel testButtonsPanel;
    private JButton[] allDays;
    //buttons for days 1-28

    public Calendar(TESTCardLayoutPanel2 cardLayoutPanel2) {
        testButtonsPanel = new TESTButtonsPanel(cardLayoutPanel2);
        allDays = new JButton[28];
        calendarButtons = new JButton[5][7];

        // create buttons
        for (int i = 0; i < allDays.length; i++) {
            allDays[i] = new JButton();
            allDays[i].setOpaque(false);
            allDays[i].setContentAreaFilled(false);
            allDays[i].setBorderPainted(false);

            int dayNumber = i + 1;
            allDays[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    openNewWindow(dayNumber);
                }
            });
        }

        // initialize the buttons in calendarButtons
        int index = 1;
        calendarButtons[0][6] = allDays[0];
        for (int r = 1; r < calendarButtons.length; r++) {
            for (int c = 0; c < calendarButtons[1].length; c++) {
                if (index < allDays.length) {
                    calendarButtons[r][c] = allDays[index];
                    index++;
                }
            }
        }

        // add buttons onto the calenderPanel
       addButtons();

    }

    public JButton findButton(int row, int column) {
        return calendarButtons[row][column];
    }

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

    public void addButtons() {
        int counter = 502;
        int y = 200;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (calendarButtons[i][j] != null) {
                    calendarPage.add(calendarButtons[i][j]);
                    calendarButtons[i][j].setBounds(counter, y, 65, 65);
                    counter += 80;
                }
            }
            if (i == 0) {
                y += 80;
            }
            else if (i == 1) {
                y += 75;
            }
            else if (i == 3){
                y += 65;
            }
            else {
                y += 60;
            }
            counter = 23;
        }
    }

    // Method to open a new window
    private void openNewWindow(int calenderDay) {
        // Create the new window (JFrame)
        JFrame newWindow = new JFrame("Day " + calenderDay);
        newWindow.setSize(500, 700);  // Set the size of the new window
        newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Close when clicked on X
        newWindow.setLocationRelativeTo(null); // Center the window on the screen
        //setting panels with the png

        // add image as background
        String diaryDay = "src/journal/" + calenderDay + ".png";
        JLabel contentPane = new JLabel();
        ImageIcon imageIcon = new ImageIcon(diaryDay);
        contentPane.setIcon(imageIcon);
        contentPane.setLayout( new BorderLayout() );
        newWindow.setContentPane( contentPane );

        // Make the new window visible
        newWindow.setVisible(true);
        newWindow.setResizable(false); // Disable resizing the window
    }

    public JPanel getCalendarPage() {
        return calendarPage;
    }
}
