/**
 * The following code is copied from:
 * http://beginwithjava.blogspot.com/2010/09/interactive-keyboard-input-in-java.html.
 * We modify this to practice class inheritance and interfaces.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TempGround extends JPanel implements KeyListener {

    public TempGround() {
        super();
        pointX = 0;
        pointY = 0;
        oldX = 0;
        oldY = 0;
        addKeyListener(this);
    }

    int pointX, pointY, oldX, oldY;
    boolean erase;

    public void paintComponent(Graphics g) {
        if (erase) {
            g.clearRect(0, 0, getBounds().width, getBounds().height);
            erase = false; // We're done, turn off this flag now.
        }

        g.setColor(Color.pink);
        g.fillRect(oldX - 2, oldY - 2, 8, 8);
        g.setColor(Color.black);
        g.fillRect(pointX - 2, pointY - 2, 4, 4);
    }

    public void keyPressed(KeyEvent key) {

        oldX = pointX;
        oldY = pointY;
        if (key.getKeyCode() == key.VK_DOWN) {
            pointY = pointY + 5;
            if (pointY > getBounds().height) {
                pointY = getBounds().height;
            }
        }
        if (key.getKeyCode() == key.VK_UP) {
            pointY = pointY - 5;
            if (pointY < 0) {
                pointY = 0;
            }
        }
        if (key.getKeyCode() == key.VK_LEFT) {
            pointX = pointX - 5;
            if (pointX < 0) {
                pointX = 0;
            }
        }
        if (key.getKeyCode() == key.VK_RIGHT) {
            pointX = pointX + 5;
            if (pointX > getBounds().width) {
                pointX = getBounds().width;
            }
        }

        if (key.getKeyCode() == key.VK_SPACE) {
            erase = true;
        }
        repaint();
    }

    public void keyTyped(KeyEvent key) {
    }

    public void keyReleased(KeyEvent key) {
    }

    public static void main(String arg[]) {
        JFrame frame = new JFrame("Use Arrows to Draw, Space to Erase.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        TempGround panel = new TempGround();
        frame.setContentPane(panel);
        frame.setVisible(true);

        panel.setFocusable(true);

        panel.oldX = panel.getBounds().width / 2;
        panel.oldY = panel.getBounds().height / 2;
        panel.pointX = panel.oldX;
        panel.pointY = panel.oldY;

        frame.setBackground(Color.blue);

    }
}