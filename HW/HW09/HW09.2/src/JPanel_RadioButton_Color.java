/**
 * Project Name : JavaProgramming and Application HW09.2
 * Program's purpose and basic function :
 * - class JPanel_RadioButton_Color
 * Program First Author : JH KIM
 * Date of First Write : 2023.11.13
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.11.13			v1.00			First Write
 */

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class JPanel_RadioButton_Color extends JPanel {
    // data member
    JRadioButton[] rb_color = new JRadioButton[3];
    JPanel_BouncingBall jp_bouncingBall;
    JPanel_RadioButton_Color(JPanel_BouncingBall
                                     jp_bouncingBall) {
        this.jp_bouncingBall = jp_bouncingBall;
        String[] color_str = {"red", "green", "blue"};
        ButtonGroup bgrp_color = new ButtonGroup();
        for (int i=0; i<rb_color.length; i++) {
            rb_color[i] = new JRadioButton(color_str[i]);   // gen JRadioButton
            rb_color[i].addItemListener(new RB_Color_ItemListener());
            bgrp_color.add(rb_color[i]);
            add(rb_color[i]);
        }
        rb_color[0].setSelected(true);
    }
    class RB_Color_ItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.DESELECTED)
                return;
            if (rb_color[0].isSelected()) {
                jp_bouncingBall.ball_color = Color.red;
                System.out.print("BallColor changed to RED\n");
            } else if (rb_color[1].isSelected()) {
                jp_bouncingBall.ball_color = Color.GREEN;
                System.out.print("BallColor changed to GREEN\n");
            } else if (rb_color[2].isSelected()) {
                jp_bouncingBall.ball_color = Color.BLUE;
                System.out.print("BallColor changed to BLUE\n");
            }
        }
    }
}
