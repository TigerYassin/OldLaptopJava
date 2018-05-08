//import java.awt.Graphics;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//
//import javax.swing.JPanel;
//
//import walkers.*;
//
//
//public class Ground extends JPanel implements KeyListener{
//
//
//
//    private static final long serialVersionUID = -7448787436741899683L;
//    protected Walker walker;
//    protected int wLoc_x;
//    protected int wLoc_y;
//    protected boolean erase = true;
//
//    public Ground(Walker w){
//
//        super();
//        this.walker = w;
//        this.wLoc_x = this.walker.getInitial_X();
//        this.wLoc_y = this.walker.getInitial_Y();
//        addKeyListener(this);
//    }
//
//
//    public void paintComponent(Graphics g){
//        // Erase the board if it's been requested.
//        if (erase) {
//            g.clearRect(0, 0 , getBounds().width, getBounds().height);
//            erase = false; // We're done, turn off this flag now.
//        }
//
//
//        //Draw the walkers's shadow
//        if(this.walker.getClass().getSimpleName().equalsIgnoreCase("SimpleWalker")){
//            g.setColor(((SimpleWalker)this.walker).getShadowColor());
//        } else if(this.walker.getClass().getSimpleName().equalsIgnoreCase("AdvancedWalker")){
//            g.setColor(((AdvancedWalker)this.walker).getShadowColor());
//        }
//        g.fillRect(this.wLoc_x - 3,
//                this.wLoc_y - 3,
//                this.walker.getwWidth(),
//                this.walker.getwHeigh());
//
//        //Draw the walkers
//        if(this.walker.getClass().getSimpleName().equalsIgnoreCase("SimpleWalker")){
//            g.setColor(((SimpleWalker)this.walker).getWalkerColor());
//        } else if(this.walker.getClass().getSimpleName().equalsIgnoreCase("AdvancedWalker")){
//            g.setColor(((AdvancedWalker)this.walker).getWalkerColor());
//        }
//        g.fillRect(this.walker.getWalker_x() - 3,
//                this.walker.getWalker_y() - 3,
//                this.walker.getwWidth(),
//                this.walker.getwHeigh());
//    }
//
//    public void keyPressed(KeyEvent key){
//
//        // Copy the last clicked location into the 'old' variables.
//        this.wLoc_x = this.walker.getWalker_x();
//        this.wLoc_y = this.walker.getWalker_y();
//        // Move the current point depending on which key was pressed.
//        if (key.getKeyCode() == KeyEvent.VK_DOWN){
//            this.walker.moveDown();
//            if (this.walker.getWalker_y() > getBounds().height){
//                this.walker.setWalker_y(getBounds().height);
//            }
//        }
//        if (key.getKeyCode() == KeyEvent.VK_UP){
//            this.walker.moveUp();
//            if (this.walker.getWalker_x() > getBounds().width){
//                this.walker.setWalker_x(getBounds().width);
//            }
//        }
//        if (key.getKeyCode() == KeyEvent.VK_LEFT){
//
//            this.walker.moveLeft();
//            if (this.walker.getWalker_x() < 0){
//                this.walker.setWalker_x(0);
//            }
//        }
//
//        if (key.getKeyCode() == KeyEvent.VK_RIGHT){
//
//            this.walker.moveRight();
//            if (this.walker.getWalker_x() > getBounds().width){
//                this.walker.setWalker_x(getBounds().width);
//            }
//        }
//
//        // Set a flag to erase the screen if Space is pressed.
//        if (key.getKeyCode() == KeyEvent.VK_SPACE){
//            erase = true;
//        }
//
//        // Tell the panel that we need to redraw things.
//        repaint();
//    }
//
//    /* The following methods have to be here to comply
//       with the MouseListener interface, but we don't
//       use them, so their code blocks are empty. */
//    public void keyTyped(KeyEvent key){ }
//    public void keyReleased(KeyEvent key){ }
//
//}