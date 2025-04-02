import javax.swing.*;
import java.awt.*;

public class TESTPanelClass extends JPanel {

    private String fileName;
    private String message = "";

    // Constructor to accept the image file name
    public TESTPanelClass(String fileName) {
        this.fileName = fileName;
    }

    public TESTPanelClass() {

    }

    public void setMessage(String message) {
        this.message = message;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Ensure the panel is properly rendered
        // Load the background image
        ImageIcon backgroundIcon = new ImageIcon(fileName);
        Image backgroundImage = backgroundIcon.getImage();

        // Scale the image to fit the size of the panel
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        if (!message.isEmpty()) {
            g.setColor(Color.WHITE);  // Set text color (you can change the color)
            g.setFont(new Font("Arial", Font.BOLD, 20));  // Set the font and size
            g.drawString(message,50,500);
        }
    }

    public static JPanel createPanel(String fileName) {
        return new TESTPanelClass(fileName);
    }
}
