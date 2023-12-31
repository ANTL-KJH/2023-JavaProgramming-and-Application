/**
 * Project Name : JavaProgramming and Application HW09.2
 * Program's purpose and basic function :
 * - App Bouncing Ball
 * Program First Author : JH KIM
 * Date of First Write : 2023.11.13
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.11.13			v1.00			First Write
 */
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.*;
public class Animation_BouncingBall {
    //static int pos_x = 0, pos_y = 0, dx = 1, dy = 1;
    static int ball_diameter = 100;
    static int fr_width = 400, fr_height = 300;
    static int fr_x_margin = 10, fr_y_margin = 10;
    static int fr_y_colorControl = 60;
    static int fr_y_speedControl = 60;
    static int border_thickness = 5;
    public static void main(String[] args) {
        JFrame jf = new JFrame();   // JFrame
        jf.setTitle("Bouncing Ball with Speed Control");    // setTitle
        jf.setLayout(new BorderLayout());   // set Layout
        JPanel_BouncingBall jp_bouncingBall = new
                JPanel_BouncingBall(ball_diameter, fr_width, fr_height, fr_x_margin, fr_y_margin, border_thickness);
        jp_bouncingBall.setVisible(true);
        jf.add(jp_bouncingBall, BorderLayout.CENTER);
        JPanel_RadioButton_Color jp_RB_Color = new JPanel_RadioButton_Color(jp_bouncingBall);
        jp_RB_Color.setVisible(true);   // set visible
        jp_RB_Color.setSize(fr_width, fr_y_colorControl);
        jp_RB_Color.setBorder(BorderFactory.createMatteBorder(border_thickness, border_thickness, border_thickness, border_thickness, Color.lightGray));
        jf.add(jp_RB_Color, BorderLayout.NORTH);
        JSlider_SpeedControl jslider_SpeedControl = new JSlider_SpeedControl(jp_bouncingBall, fr_width, fr_height,fr_x_margin, fr_y_margin, border_thickness);
        jslider_SpeedControl.setBorder(BorderFactory.createMatteBorder(border_thickness, border_thickness, border_thickness, border_thickness, Color.lightGray));
        jslider_SpeedControl.setVisible(true);
        jf.add(jslider_SpeedControl, BorderLayout.SOUTH);
        jf.setSize(fr_width + fr_x_margin + border_thickness,fr_height + fr_y_colorControl + fr_y_speedControl +
                        fr_y_margin + border_thickness);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getRootPane().setBorder(BorderFactory
                .createMatteBorder(border_thickness, border_thickness, border_thickness, border_thickness, Color.BLUE));
        jf.setVisible(true);
    }
}