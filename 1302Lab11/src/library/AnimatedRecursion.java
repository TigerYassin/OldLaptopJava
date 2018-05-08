package library;

import library.AnimatedRecursion;

import java.awt.*;

public abstract class AnimatedRecursion {

    public static void init(){

        int xMax = 1000;
        int xMin = -1000;
        int yMax = 1000;
        int yMin = -1000;
        StdDraw.setXscale(xMin, xMax);
        StdDraw.setYscale(yMin, yMax);
        StdDraw.clear(StdDraw.WHITE);
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.line(0, xMin, 0, yMax);
        StdDraw.line(xMin, 0, yMax, 0);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.enableDoubleBuffering();
        StdDraw.setPenRadius(0.002);
        StdDraw.enableDoubleBuffering();

    }

    /**
     * This method uses the class StdDraw to recursively draw
     * H-like shapes, each of which are as large as a fraction
     * of the previous one.
     *
     * Usage:
     * 		AnimatedRecursion.init();
     *		AnimatedRecursion.draw1(8, 500, 500, 700);
     * @param n
     * @param x
     * @param y
     * @param size
     */
    public static void drawH(int n, double x, double y, double size) {
        if (n == 0) return;

        // compute the coordinates of the 4 tips of the H
        double x0 = x - size/2, x1 = x + size/2;
        double y0 = y - size/2, y1 = y + size/2;

        // draw the H, centered on (x, y) of the given side length
        StdDraw.line(x0,  y, x1,  y);
        StdDraw.line(x0, y0, x0, y1);
        StdDraw.line(x1, y0, x1, y1);
        StdDraw.show();
        StdDraw.pause(1000);


        drawH(n-1, x0, y0, size/2);   // lower left
        drawH(n-1, x0, y1, size/2);   // upper left
        drawH(n-1, x1, y0, size/2);   // lower right
        drawH(n-1, x1, y1, size/2);   // upper right
    }

    /**
     * This method uses the class StdDraw to [recursively] draw
     * rectangles inside one another, whose whole length
     * divided by the long part is equal to the Golden Ratio
     * which is Phi = (1 + sqrt(5)) / 2.
     *
     * @param n
     * @param x
     * @param y
     * @param width
     */
    public static int drawGoldenRatio_Recursive(int n, double x, double y, double width){
        double num = ((Math.sqrt(5) +1) / 2);  //gets the golden ratio number
        double hieght = width / num;


            StdDraw.rectangle2(0,0,width,hieght);
            width = hieght / (num);
            StdDraw.rectangle2(0,0, width, hieght);
            StdDraw.show();

        StdDraw.pause(1000);


        return drawGoldenRatio_Recursive(n--, x, y, width); //recursive
    }

    /**
     * This method uses the class StdDraw to [iteratively] draw
     * rectangles inside one another, whose whole length
     * divided by the long part is equal to the Golden Ratio
     * which is Phi = (1 + sqrt(5)) / 2.
     *
     * @param n
     * @param x
     * @param y
     * @param width
     */
    public static void drawGoldenRatio_Iterative(int n, double x, double y, double width){

        while (n > 0){
            double num = (Math.sqrt(5) +1) / 2;
            double hieght = width / num;
            StdDraw.rectangle2(0,0, width, hieght);
            StdDraw.show();
            StdDraw.pause(1000);

            width = hieght / (num);
            StdDraw.rectangle2(0,0, width, hieght);
            StdDraw.show();
            StdDraw.pause(1000);

            n--;

        }

    }


}
