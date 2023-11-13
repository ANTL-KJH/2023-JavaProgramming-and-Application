/**
 * Project Name : JavaProgramming and Application HW09.1
 * Program's purpose and basic function :
 * - class JPanel_Circle
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

public class JPanel_Circle extends JPanel {
    // data member
    int panel_width;
    int panel_height;
    int radius;
    Color color;
    // constructor
    JPanel_Circle(int panel_width, int panel_height, int radius, Color color)
    {
        this.panel_width = panel_width;
        this.panel_height = panel_height;
        this.radius = radius;
        this.color=color;
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5)); // set stroke width
        g2.setColor(this.color);    // set color
        g2.drawOval(panel_width/2-radius, panel_height/2-radius, radius*2, radius*2);

    }
}
