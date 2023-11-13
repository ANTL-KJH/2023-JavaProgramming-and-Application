/**
 * Project Name : JavaProgramming and Application HW09.1
 * Program's purpose and basic function :
 * - class JPanel_Star
 * Program First Author : JH KIM
 * Date of First Write : 2023.11.13
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.11.13			v1.00			First Write
 */
import javax.swing.*;
import java.awt.*;

public class JPanel_Star extends JPanel {
    // data member
    int panel_width;
    int panel_height;
    int radius;
    Color color;
    // constructor
    JPanel_Star(int panel_width, int panel_height, int radius, Color color)
    {
        this.panel_width = panel_width;
        this.panel_height = panel_height;
        this.radius = radius;
        this.color=color;
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        double radius = 100;
        double x, y, cx = panel_width/2, cy = panel_height/2;
        double theta_rad = 0;
        final double PI = 3.141592;
        int px[] = new int[5];
        int py[] = new int[5];
        for (int i=0; i<5; i++) {
            theta_rad = (3.0 * PI) / 2.0 + i * (2.0 * PI) / 5.0;
            px[i] = (int)(cx + radius * Math.cos(theta_rad));
            py[i] = (int)(cy + radius * Math.sin(theta_rad));
        }
        g2.setStroke(new BasicStroke(5));
        g2.setColor(this.color);
        g2.drawLine(px[0], py[0], px[2], py[2]);
        g2.drawLine(px[2], py[2], px[4], py[4]);
        g2.drawLine(px[4], py[4], px[1], py[1]);
        g2.drawLine(px[1], py[1], px[3], py[3]);
        g2.drawLine(px[3], py[3], px[0], py[0]);
    }

}
