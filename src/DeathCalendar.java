import jlistcardlayout.CardLayoutPanel;

import javax.swing.JFrame;
public class DeathCalendar {

    public DeathCalendar() {
        // creates a JFrame (a window)
        JFrame frame = new JFrame("Death Calendar");

        // apply setting to that clicking X in top right of window will close window and end program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set frame to have 300 width, 200 height
        frame.setSize(900, 700);

        // auto-center the frame on the screen
        frame.setLocationRelativeTo(null);

        // create a DisplayPanel object
        CardLayoutPanel panel = new CardLayoutPanel();

        // add it to the frame



        // display the frame (window)
        frame.setVisible(true);


    }
}
