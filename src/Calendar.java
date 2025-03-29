import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calendar extends JButton {
    ImageIcon image = new ImageIcon();
    private JButton[][] calendarButtons;
    private TESTButtonsPanel testButtonsPanel;
    private JButton[] allDays; //buttons for days 1-28
    private String[] dialogue = {"Day 1: Sun\n Dear Dairy, \n I just married Gojo today but I hate his son Gogo. Very happy but sad at the same time. At least Gojo loves me.\n",
    "Day 2: Mon\n Dear Dairy,\n My first day at work today and I met Nikki. We get along very well, I hope it stays this way. Gojo didn't come home early today.\n",
    "Day 3: Tue\n Dear Dairy, \n Nikki and I went out to eat together at the new cafe across the street! I got an egg waffle and she ordered some pancakes.\n",
    "Day 4: Wed\n Dear Dairy, \n I made a mistake at work today. I accidentally deleted a file that Nikki needed for her presentation. I tried apologizing but she hasn't answered me.\n",
    "Day 5: Thur\n No Entry today\n", "Day 6: Friday\n No Entry today\n",
    "Day 7: Sat\n Dear Dairy,\n I haven't had much time to write in my diary due to my work piling up. I worked overtime today to finish it all. Maybe I should search for a hobby online with the free time I have.\n",
    "Day 8: Sun\n Dear Dairy, \n I'm so bored at home and have started being on social media more often. I met this guy named JoGo and he seems like a really nice guy. I'm going to meet up with him this Friday.\n",
    "Day 9: Mon\n Dear Dairy, \n I've been texting JoGo more often. He's so fun to talk to and we have the same interests! I learned that he had a brother and he's a businessman.\n",
    "Day 10: Tue\n No Entry today\n", "Day 11: Wed\n Dear Dairy,\n I tried talking to Nikki again today. I bought her a cup of coffee but she didn't say anything so I left the coffee on her desk and continued with my work.\n",
    "Day 11: Wed\n Dear Dairy,\n I tried talking to Nikki again today. I bought her a cup of coffee but she didn't say anything so I left the coffee on her desk and continued with my work.\n",
    "Day 12: Thur\n Dear Dairy,\n Today is Thursday! I'm meeting JoGo tomorrow and I'm so excited to see him. We had a call last night and he also expressed his excitement about meeting up. We're thinking about going to a cafe.\n",
    "Day 13: Friday\n Dear Dairy, \n I went off work early today to meet up with JoGo. I didn't tell anymore about this, I hope Gojo doesn't find out. He shouldn't get mad at me since he cant stay with me then someone else could fill in the gap. He asked me out too.\n",
    "Day 14: Sat\n Dear Dairy,\n Went out with JoGo today, but it was late since Gojo was home today. Had to lie for him to not get suspicious of me. Came home late today, and I saw Gogo on the couch. It seems like he's been waiting for me since 10. Is he going to get suspicious too?\n",
    "Day 15: Sun\n Dear Dairy,\n Spent time with Gojo today, he doesn't seem to be in the mood? He said something about coming home early but I was on my phone texting JoGo. JoGo is so funny, I like him so much. But I think Gogo saw my phone screen with messages? I should ask.\n",
    "Day 16: Mon\n Dear Dairy,\n I tried talking to Gogo this morning, but I can't seem to get him alone with me. I should try asking another time.\n",
    "Day 17: Tue\n Dear Dairy, \n I had a terrible day today. I thought Nikki decided she would accept my apology and move on when she came up to me, but instead she threw hot scalding coffee on me. I ran to the bathroom to wipe it all off andI think I got burnt. Maybe it was an accident but she didn't seem sorry. I don't think she likes me very much…\n",
    "Day 18: Wed\n Dear Diary,\n Something happened at work again. Nikki and her friends, Myrnista and Estherina, were gossiping loudly about me. \n",
    "Day 19: Thur\n No Entry today\n", "Day 20: Friday\n Dear Dairy,\n After work, Gojo came home early today. We cooked, talked and went to sleep. I made sure he went to sleep first and took out my phone to text JoGo, he is telling me to leave Gojo. I can't, Gojo is rich and handsome, also I love them both equally. So scary, I thought he woke up at night, he sleeps without noise.\n",
    "Day 20: Friday\n Dear Dairy,\n After work, Gojo came home early today. We cooked, talked and went to sleep. I made sure he went to sleep first and took out my phone to text JoGo, he is telling me to leave Gojo. I can't, Gojo is rich and handsome, also I love them both equally. So scary, I thought he woke up at night, he sleeps without noise.\n",
    "Day 21: Sat\n Dear Dairy,\n Me and Gojo talked for hours about our married life and what's been going on lately in each other's life. He told me how much he's been missing out in our relationship and wants to make a change. Gojo said he's going to start coming home earlier, but I secretly don't want that, he's going to find out. HE GOING TO FIND OUT.\n",
    "Day 22: Sun\n Dear Dairy, \n After that small incident yesterday I have gotten more cautious and looked more around my surroundings. There might be a big chance Gojo might have already known about me and JoGo, he might ask for a divorce!!! That would also mean no money would be given to me… What should I do…\n",
    "Day 23: Mon\n No Entry today\n",
    // not finished "Day 24: Tue\n Dear Dairy,\n", "Day 25 : Wed\n Dear Dairy,\n", "Day 26: Thur\n Dear Dairy,\n",
    "Day 27: Friday\n Dear Dairy,\n Gojo picked me up from work today and we stayed in the parking lot talking. HE KNEW yet he didn't speak of it until now. WHAT SHOULD I DO??? I married him because he is rich and looks good. I can't bear to lose him. Wait, he just–\n",
    "Day 28: Sun \n No dairy entry since she died that day.\n"
    };

    public Calendar(TESTCardLayoutPanel2 cardLayoutPanel2) {
        testButtonsPanel = new TESTButtonsPanel(cardLayoutPanel2);
        allDays = new JButton[28];
        calendarButtons = new JButton[5][7];

        // create buttons
        for (int i = 0; i < allDays.length; i++) {
            allDays[i] = new JButton();

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
        newWindow.setLocationRelativeTo(null);  // Center the window on screen

        // Add some content to the new window
        JLabel label = new JLabel("This day " + calenderDay + " of her diary");
//        JLabel label = new JLabel(dialogue[calenderDay]);
        newWindow.add(label);

        // Make the new window visible
        newWindow.setVisible(true);
    }

    public JPanel getCalendarPage() {
        return calendarPage;
    }
}
