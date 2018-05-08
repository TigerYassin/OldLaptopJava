package walkers;

import java.awt.*;

public class SimpleWalker extends Walker{

    private Color walkerColor = Color.BLACK;
    private Color walkerShadow = Color.GRAY;

    public Color getWalkerColor() {
        return walkerColor;
    }

    public Color getWalkerShadow() {
        return walkerShadow;
    }


    @Override
    public void moveRight(){
        this.walker_x = this.walker_x + this.stepSize;
    }

    @Override
    public void moveLeft(){

        this.walker_x = this.walker_x - this.stepSize;

    }

    @Override
    public void moveUp(){
        this.intial_Y = this.intial_Y - this.stepSize;

    }

    @Override
    public void moveDown() {
        this.walker_y = this.walker_y + this.stepSize;

    }


}
