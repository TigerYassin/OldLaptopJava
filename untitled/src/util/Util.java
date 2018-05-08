package util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Util {


    public static int[][] readImageToMatrix(String dir){

        BufferedImage bi = null;
        if(dir.isEmpty()){
            throw new IllegalArgumentException("A proper directory to where your image is stored should be provided.");
        }

        try {
            bi = ImageIO.read(new File(dir));
        } catch (IOException e) {
            System.out.println("Make sure your image is in the right directory.");
            e.printStackTrace();
        }

        return(Util.get2DArrayFromImage(bi));
    }

    private static int[][] get2DArrayFromImage(BufferedImage bImage) {

        if (bImage == null) {
            throw new IllegalArgumentException("The BufferedImage is null.");
        }

        int imageW = bImage.getWidth();
        int imageH = bImage.getHeight();
        int color = 0;
        int intensity = 0;
        int[][] image2DArray = new int[imageH][imageW];
        for (int row = 0; row < imageH; row++) {
            for (int col = 0; col < imageW; col++) {
                color = bImage.getRGB(col, row);
                intensity = (color >> 8) & 0xff;
                image2DArray[row][col] = intensity;
            }
        }
        return image2DArray;
    }



    public static void writeMatrixAsImage(int[][] image, String fileName){

        BufferedImage bi = getBufferedImage(image);

        try {
            File outputfile = new File(fileName + ".jpg");
            ImageIO.write(bi, "jpg", outputfile);
        } catch (IOException e) {
            System.out.println("There should be something wrong with your file name.");
            e.printStackTrace();
        }
    }

    public static BufferedImage getBufferedImage(int[][] matrix){

        if (matrix == null || matrix[0] == null)
            throw new IllegalArgumentException("There is something wrong with your matrix!");

        int nRows = matrix.length;
        int nCols = matrix[0].length;

        BufferedImage bImage = new BufferedImage(nCols, nRows, BufferedImage.TYPE_BYTE_GRAY);

        int color, value = 0;
        for(int row = 0; row < nRows; row++){
            for(int col = 0; col < nCols; col++){
                color = (int) matrix[row][col];
                value = 0xFF000000 | color << 16 | color << 8 | color;
                bImage.setRGB(col, row, value);
            }
        }
        return bImage;
    }


}