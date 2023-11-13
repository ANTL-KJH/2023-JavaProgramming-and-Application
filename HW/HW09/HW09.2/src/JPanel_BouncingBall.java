/**
 * Project Name : JavaProgramming and Application HW09.2
 * Program's purpose and basic function :
 * - class JPanel_BouncingBall
 * Program First Author : JH KIM
 * Date of First Write : 2023.11.13
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.11.13			v1.00			First Write
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
public class JPanel_BouncingBall extends JPanel
        implements ActionListener {
    // data member
    Timer timer = new Timer(5, this); // this as ActionListener
    int pos_x = 0, pos_y = 0;
    int dx = 1, dy = 1;
    int ball_diameter;
    int fr_width, fr_height;
    int fr_x_margin, fr_y_margin;
    int border_thickness;
    double ballSpeed = 1.0; // controlled by JSlider (0.0 ~ 10.0)
    Color ball_color = Color.red;
    // Constructor
    JPanel_BouncingBall(int ball_diameter, int fr_width, int fr_height,
                        int x_margin, int y_margin, int border_thickness) {
        this.ball_diameter = ball_diameter;
        this.fr_width = fr_width;
        this.fr_height = fr_height;
        this.fr_x_margin = x_margin;
        this.fr_y_margin = y_margin;
        this.border_thickness = border_thickness;
    }
    public void paintComponent(Graphics g) // paintComponent
    {
        super.paintComponent(g);
        g.setColor(this.ball_color);
        g.fillOval(pos_x, pos_y, ball_diameter, ball_diameter);
        timer.start();
    }
    public void actionPerformed(ActionEvent e) // bouncing ball against the Frame
    {
        if (pos_x < 0 || pos_x > (fr_width - ball_diameter - fr_x_margin))  // x pos check
            dx = -dx;
        if (pos_y < 0 || pos_y > (fr_height - ball_diameter - fr_y_margin)) // y pos check
            dy = -dy;
        pos_x += (int)(dx*ballSpeed); pos_y += (int)(dy*ballSpeed);
        System.out.printf("Ball speed(%5.2f), position(%3d, %3d)\n", ballSpeed, pos_x, pos_y);
        repaint(); // repaint JPanel
    }
}
