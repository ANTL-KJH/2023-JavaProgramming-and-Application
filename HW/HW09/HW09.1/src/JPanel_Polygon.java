/**
 * Project Name : JavaProgramming and Application HW09.1
 * Program's purpose and basic function :
 * - class JPanel_Polygon
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

public class JPanel_Polygon extends JPanel {
    // data member
    int panel_width;
    int panel_height;
    int radius;
    int num_vert;
    Color color;
    // constructor
    JPanel_Polygon(int panel_width, int panel_height, int radius, int num_vert, Color color)
    {
        this.panel_width = panel_width;
        this.panel_height = panel_height;
        this.radius = radius;
        this.num_vert = num_vert;
        this.color = color;
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g2.setColor(this.color);
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        int[] xPoints = new int[this.num_vert];
        int[] yPoints = new int[this.num_vert];

        double startAngleRadians = Math.toRadians(90+ (double) 360 /this.num_vert/2);

        for (int i = 0; i < this.num_vert; i++) {
            double angle = startAngleRadians + 2 * Math.PI * i / this.num_vert;
            xPoints[i] = (int) (centerX + radius * Math.cos(angle));
            yPoints[i] = (int) (centerY + radius * Math.sin(angle));
        }

        g2.drawPolygon(xPoints, yPoints, this.num_vert);

    }
}
