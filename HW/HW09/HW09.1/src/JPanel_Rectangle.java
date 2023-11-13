/**
 * Project Name : JavaProgramming and Application HW09.1
 * Program's purpose and basic function :
 * - class JPanel_Rectangle
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

public class JPanel_Rectangle extends JPanel {
    // data member
    int panel_width;
    int panel_height;
    int rect_width;
    int rect_length;
    Color color;
    // constructor
    JPanel_Rectangle(int panel_width, int panel_height, int rect_width, int rect_length, Color color) {
        this.panel_width = panel_width;
        this.panel_height = panel_height;
        this.rect_width = rect_width;
        this.rect_length = rect_length;
        this.color = color;
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g2.setColor(this.color);

        g.drawRect(panel_width/2-rect_width/2 ,panel_height/2-rect_length/2,this.rect_width,this.rect_length);
    }
}
