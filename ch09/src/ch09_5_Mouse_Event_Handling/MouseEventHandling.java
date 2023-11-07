package ch09_5_Mouse_Event_Handling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseEventHandling extends JFrame {
    JPanel contentPane = new JPanel();
    JLabel la;
    MouseEventHandling() {
        setTitle("MouseEventHandling (FrameSize: 300 x 200");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(contentPane);
        contentPane.addMouseListener(new MyMouseListener());
        la = new JLabel("No Mouse Event, yet");
        contentPane.add(la);
        setSize(500, 400);
        setVisible(true);
    }
    class MyMouseListener implements MouseListener, MouseMotionListener {
        public void mousePressed(MouseEvent e) {
            la.setText("MousePressed ("+e.getX() +", "+e.getY()+")");
        }
        public void mouseReleased(MouseEvent e) {
            la.setText("MouseReleased ("+e.getX() +", "+e.getY()+")");
        }
        public void mouseClicked(MouseEvent e) {
            la.setText("MouseClicked ("+e.getX() +", "+e.getY()+")");
        }
        public void mouseEntered(MouseEvent e) {
            JPanel p = (JPanel)e.getSource();
            la.setText("MouseEntered ("+e.getX() +", "+e.getY()+")");
            p.setBackground(Color.CYAN);
        }
        public void mouseExited(MouseEvent e) {
            JPanel p = (JPanel)e.getSource();
            la.setText("MouseExited ("+e.getX() +", "+e.getY()+")");
            p.setBackground(Color.YELLOW);
        }
        public void mouseDragged(MouseEvent e) {
            la.setText("MouseDragged ("+e.getX() +", "+e.getY()+")");
        }
        public void mouseMoved(MouseEvent e) {
            la.setText("MouseMoved ("+e.getX() +", "+e.getY()+")");
        }
    } // end class MyMouseListener()
    public static void main(String[] args) {
        new MouseEventHandling();
    }
}
