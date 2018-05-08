package walkers;

import Lab9.ICustomizable;

import java.awt.*;

public class AdvancedWalker extends Walker implements ICustomizable{

    private Color walkerColor = Color.BLACK;
    private Color walkerShadow = Color.GRAY;

    public Color getWalkerColor() {
        return walkerColor;
    }

    public Color getWalkerShadow() {
        return walkerShadow;
    }

    @Override
    public void setColorToWalker(Color myColor) {
        walkerColor = myColor;
    }

    @Override
    public void setShadowToWalker(Color myColor) {
        walkerShadow = myColor;
    }

    @Override
    public void setStepSize(int myInt) {
        stepSize = myInt;
    }

    @Override
    public void enlarge(int myInt) {

    }
}
