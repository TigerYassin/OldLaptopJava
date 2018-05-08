package walkers;

public abstract class Walker {

    protected int intial_X = 100;
    protected int intial_Y = 100;
    protected int walker_x = intial_X;
    protected int walker_y = intial_Y;
    protected int wHeight = 5;
    protected int wWidth = 5;
    protected int stepSize = 8;


    public void moveRight(){
        intial_X +=10;
    }

    public void moveLeft(){
        intial_X -=10;

    }

    public void moveUp(){
        intial_Y +=10;

    }

    public void moveDown() {
        intial_Y -=10;

    }


    public int getIntial_X() {
        return intial_X;
    }

    public void setIntial_X(int intial_X) {
        this.intial_X = intial_X;
    }

    public int getIntial_Y() {
        return intial_Y;
    }

    public void setIntial_Y(int intial_Y) {
        this.intial_Y = intial_Y;
    }

    public int getWalker_x() {
        return walker_x;
    }

    public void setWalker_x(int walker_x) {
        this.walker_x = walker_x;
    }

    public int getWalker_y() {
        return walker_y;
    }

    public void setWalker_y(int walker_y) {
        this.walker_y = walker_y;
    }

    public int getwHeight() {
        return wHeight;
    }

    public void setwHeight(int wHeight) {
        this.wHeight = wHeight;
    }

    public int getwWidth() {
        return wWidth;
    }

    public void setwWidth(int wWidth) {
        this.wWidth = wWidth;
    }
}
