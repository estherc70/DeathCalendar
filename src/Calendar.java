import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calendar {
    ImageIcon image = new ImageIcon();
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15,
            btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28;
    //test for list
    private JButton[][] calendarButtons;

    public Calendar() {
        calendarButtons = new JButton[5][7];
       btn1 = new JButton(image);
       btn2 = new JButton(image);
       btn3 = new JButton(image);
       btn4 = new JButton(image);
       btn5 = new JButton(image);
       btn6 = new JButton(image);
       btn7 = new JButton(image);
       btn8 = new JButton(image);
       btn9 = new JButton(image);
       btn10 = new JButton(image);
       btn11 = new JButton(image);
       btn12 = new JButton(image);
       btn13 = new JButton(image);
       btn14 = new JButton(image);
       btn15 = new JButton(image);
       btn16 = new JButton(image);
       btn17 = new JButton(image);
       btn18 = new JButton(image);
       btn19 = new JButton(image);
       btn20 = new JButton(image);
       btn21 = new JButton(image);
       btn22 = new JButton(image);
       btn23 = new JButton(image);
       btn24 = new JButton(image);
       btn25 = new JButton(image);
       btn26 = new JButton(image);
       btn27 = new JButton(image);
       btn28 = new JButton(image);

       calendarButtons[0][6] = btn1;
       calendarButtons[1][0] = btn2;
       calendarButtons[1][1] = btn3;
       calendarButtons[1][2] = btn4;
       calendarButtons[1][3] = btn5;
       calendarButtons[1][4] = btn6;
       calendarButtons[1][5] = btn7;
       calendarButtons[1][6] = btn8;
       calendarButtons[2][0] = btn9;
       calendarButtons[2][1] = btn10;
       calendarButtons[2][2] = btn11;
       calendarButtons[2][3] = btn12;
       calendarButtons[2][4] = btn13;
       calendarButtons[2][5] = btn14;
       calendarButtons[2][6] = btn15;
       calendarButtons[3][0] = btn16;
       calendarButtons[3][1] = btn17;
       calendarButtons[3][2] = btn18;
       calendarButtons[3][3] = btn19;
       calendarButtons[3][4] = btn20;
       calendarButtons[3][5] = btn21;
       calendarButtons[3][6] = btn22;
       calendarButtons[4][0] = btn23;
       calendarButtons[4][1] = btn24;
       calendarButtons[4][2] = btn25;
       calendarButtons[4][3] = btn26;
       calendarButtons[4][4] = btn27;
       calendarButtons[4][5] = btn28;

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

    public JPanel getCalendarPage() {
        return calendarPage;
    }

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
}
