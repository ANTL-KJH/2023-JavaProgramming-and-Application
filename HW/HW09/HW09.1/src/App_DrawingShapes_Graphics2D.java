/**
 * Project Name : JavaProgramming and Application HW09.1
 * Program's purpose and basic function :
 * - App Drawing Shapes Graphics2D
 * Program First Author : JH KIM
 * Date of First Write : 2023.11.13
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.11.13			v1.00			First Write
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
public class App_DrawingShapes_Graphics2D extends JFrame{
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Drawing_Shapes");
        jframe.setSize(600, 600);   // set frame size
        Container contentPane = jframe.getContentPane();
        contentPane.setLayout(new GridLayout(2, 2));    // grid layout
        JPanel_Circle jpanel_circle = new JPanel_Circle(300, 300, 100, Color.BLACK);
        jpanel_circle.setSize(300, 300);
        contentPane.add(jpanel_circle); // add circle
        JPanel_Rectangle jpanel_rect = new JPanel_Rectangle(300, 300, 200, 150, Color.RED);
        jpanel_rect.setSize(300, 300);
        contentPane.add(jpanel_rect);   // add rect
        JPanel_Star jpanel_star = new JPanel_Star(300, 300, 100, Color.GREEN);
        jpanel_star.setSize(300, 300);
        contentPane.add(jpanel_star);   // add star
        JPanel_Polygon jpanel_polygon = new JPanel_Polygon(300, 300, 80, 7, Color.BLUE);
        jpanel_polygon.setSize(300, 300);
        contentPane.add(jpanel_polygon);    // add polygon
        jframe.setVisible(true);
    }
}
