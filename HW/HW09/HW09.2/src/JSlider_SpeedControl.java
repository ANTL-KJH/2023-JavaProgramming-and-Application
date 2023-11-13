/**
 * Project Name : JavaProgramming and Application HW09.2
 * Program's purpose and basic function :
 * - class JSlider_Speed_Control
 * Program First Author : JH KIM
 * Date of First Write : 2023.11.13
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.11.13			v1.00			First Write
 */
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class JSlider_SpeedControl extends JPanel {
    // data member
    JSlider jslider_SpeedControl;
    Container contentPane;
    double ballSpeed;
    int fr_width, fr_height;
    int fr_x_margin, fr_y_margin;
    int border_thickness;
    final int JSlider_MAX = 100;
    JPanel_BouncingBall jp_bouncingBall;
    // constructor
    JSlider_SpeedControl(JPanel_BouncingBall jp_bouncingBall, int fr_width,
                         int fr_height, int x_margin, int y_margin, int border_thickness)
    {
        this.fr_width = fr_width;       // frame width
        this.fr_height = fr_height;     // frame height
        this.fr_x_margin = x_margin;    // x margin
        this.fr_y_margin = y_margin;    // y margin
        this.border_thickness = border_thickness;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jslider_SpeedControl = new JSlider(JSlider.HORIZONTAL, 0, JSlider_MAX, 50);
        jslider_SpeedControl.addChangeListener(new ChangeSliderListener());
        add(jslider_SpeedControl);
        this.jp_bouncingBall = jp_bouncingBall;
        this.jp_bouncingBall.ballSpeed =
                (double)jslider_SpeedControl.getValue() * 10.0 / JSlider_MAX;
        setVisible(true);
    }
    private void setDefaultCloseOperation(int exitOnClose) {
        // TODO Auto-generated method stub
    }
    class ChangeSliderListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            ballSpeed = (double)jslider_SpeedControl.getValue() * 10.0 / JSlider_MAX;   // ball speed
            jp_bouncingBall.ballSpeed = ballSpeed;
            System.out.printf("BallSpeed changed : %.2f\n", ballSpeed);
        }
    }
}