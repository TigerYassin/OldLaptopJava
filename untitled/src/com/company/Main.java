package com.company;

import util.Util;
/**
 *
 * Friday 26-Jan-2018
 *
 * This is what we practiced in our third lab.
 *
 *
 * @author aahmadzadeh1 - https://grid.cs.gsu.edu/~aahmadzadeh1/
 *
 */
/**
 * In this class, we try to work on several different methods that manipulate
 * the 2D matrices extracted from images. We use the class "Util", as a blackbox,
 * only to read/load an image and convert it to a 2D array of int, and to
 * write/save a 2D array of int as an image.
 * <br><br>
 * <b>Purpose:</b> More practice on methods, 2D arrays, and using other classes that
 * you do not necessarily need to know anything about their implementation.
 * <br><br>
 * <b>Source:</b> This code is available in my repository,
 * <a href="https://bitbucket.org/java_1302/java_01_basics_arrays2">here</a>
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        /** Example: How to read an image, manipulate and write **/

        String dir = "image";
        int[][] img = Util.readImageToMatrix(dir);
//      for (int row = 0; row < img.length; row++) {
//          for (int col = 0; col < img[0].length; col++) {
//              img[row][col] = (img[row][col] - 2);
//              img[row][col] = (img[row][col] > 255) ? 255 : img[row][col];
//          }
//      }
        Util.writeMatrixAsImage(img, "image_00");


        /** CHECKPOINT 1: getImageHeight() **/
        System.out.println("Image Height " + getImageHeight(img));
        /** CHECKPOINT 2: getImageWidth() **/
        System.out.println("Image Width " + getImageWidth(img));


        /** CHECKPOINT 3: brightenImage() **/
//      System.out.println(brightenImage(img,5));
        Util.writeMatrixAsImage(brightenImage(img,2), "bright");
        /** CHECKPOINT 4: darkenImage() **/
//      System.out.println(darkenImage(img,5));
        Util.writeMatrixAsImage(darkenImage(img,2), "dark");

        /** CHECKPOINT 5: changeContrast() **/
        // TODO: Test your method here
        Util.writeMatrixAsImage(changeContrast(img, 2), "Contrast");
        /** CHECKPOINT 6: flipHorizontally() **/
        // TODO: Test your method here
        System.out.println(img[1000][1600]);
        Util.writeMatrixAsImage(flipHorizontally(img), "Horizontal");


        /** CHECKPOINT 7: flipVertically() **/
        // TODO: Test your method here
        Util.writeMatrixAsImage(flipVertically(img), " Vertical");




        /** CHECKPOINT 8: blurImage() **/
        Util.writeMatrixAsImage(blurImage(img), "Blur");
        /** CHECKPOINT 9: changeContrastByPatch() **/
        // TODO: Test your method here

        Util.writeMatrixAsImage(changeContrastByPatch(img, 30), "Patch");
    }
    /**
     * This method gets the height of the image based on the given 2D array.
     *
     * @param img
     *            the given image in the form of a 2D array
     *
     * @return the height of the given image
     *
     */
    public static int getImageHeight(int[][] img) {

        return img[0].length;
    }
    /**
     * This method gets the width of the image based on the given 2D array.
     *
     * @param img
     *            the given image in the form of a 2D array
     *
     * @return the width of the given image
     */
    public static int getImageWidth(int[][] img) {

        return img.length;
    }
    /**
     * This method brightens the given image by
     *
     * @param img the given image in the form of a 2D array.
     * @param shift a value by which the value of each pixel will be
     * shifted.
     * @return the brighten image in the form of a 2D array.
     */
    public static int[][] brightenImage(int[][] img, int shift) {

        for (int row = 0; row < img.length; row++) {
            for (int col = 0; col < img[0].length; col++) {
                img[row][col] = (img[row][col] - shift);
                img[row][col] = (img[row][col] > 255) ? 255 : img[row][col];
            }
        }

        return img;
    }
    /**
     * This method darkens the given image by
     *
     * @param img the given image in the form of a 2D array.
     * @param shift shift a value by which the value of each pixel will be
     * shifted.
     * @return the darkened image in the form of a 2D array.
     */
    public static int[][] darkenImage(int[][] img, int shift) {
        for (int row = 0; row < img.length; row++) {
            for (int col = 0; col < img[0].length; col++) {
                img[row][col] = (img[row][col] + shift);
                img[row][col] = (img[row][col] > 255) ? 255 : img[row][col];
            }
        }
        return img;
    }
    /**
     * This method increases or decreases the contrast of the given image
     * by applying the following procedure:
     * <br>
     * <ol>
     *      <li> Calculate the factor: f = [259 * (scale +_255)]/[255 * (259 - scale)]
     *      <li> For each pixel:
     *      <ol type = "a">
     *          <li> newValue = (f * (oldValue - 128)) + 128
     *          <li> Take care of the values outside the interval [0,255]
     *      </ol>
     * </ol>
     * <br> http://www.dfstudios.co.uk/articles/programming/image-programming-algorithms/image-processing-algorithms-part-5-contrast-adjustment/
     * <br>
     * @param img the given image in the form of a 2D array.
     * @param scale the contrast scale. This is a number between -255 to +255.
     * @return a 2D image whose contrast is adjusted.
     */
    public static int[][] changeContrast(int[][] img, double scale){

        for (int row =0; row < img.length; row++){
            for (int col = 0; col < img[0].length; col++){
            double f = (259 * (scale + 255))/ (255 * (259 - scale));
            img[row][col] = (int) (f *(img[row][col] - 128)+128);

            }
        }

        return img;
    }

    /**
     * This method flips the image horizontally. That is, while it reads
     * the image from the first column to the last, it writes it to another
     * array starting from the last column to the first.
     * @param img
     * @return a 2D array representing a horizontally flipped version
     * of the given image.
     */



    public static int[][] flipHorizontally(int[][] img) {


        for (int row = 0; row<img.length; row++){

            for(int col = 0; col<img.length; col++){

                int num = img[row][(img[0].length) - col - 1];
                img[row][img[0].length - col - 1] = img[row][col];
                img[row][col] = num;



            }
        }

        return img;





    }
    /**
     * This method flips the image vertically. That is, while it reads
     * the image from the first row to the last, it writes it to another
     * array starting from the last row to the first.
     *
     * @param img the given image the form of a 2D array.
     * @return a 2D array representing a vertically flipped version
     * of the given image.
     */
    public static int[][] flipVertically(int[][] img) {


        int[] num = new int[img.length];
        for (int row = 0; row<img.length; row++) {
            num = img[(img.length) - row - 1];
            img[img.length - row - 1] = img[row];
            img[row] = num;
        }



        return img;
    }
    /**
     * This method takes an image (2D array), applies the blur filter
     * to it and returns results in the form of a 2D array. The filter
     * procedure is as follows:
     * <br>
     * For each pixel:
     * <ol>
     *      <li> Get the average of the 8 neighboring pixels.
     *      <li> Replace the value of this pixel with the average.
     * </ol>
     *
     * @param img the source image to which the filter will be applied.
     * @return a 2D array representing the filtered image.
     */
    public static int[][] blurImage(int[][] img) {

        int num;
        for (int row = 0; row < img.length; row++){
            for (int col = 0; col < img.length; col++){

                if(row < 1030) {
                    if (col < 1870) {
                        num = img[row][col] + img[row + 1][col] + img[row + 2][col] + img[row + 3][col] + img[row + 4][col] + img[row][col + 1] +
                                img[row][col + 2] + img[row][col + 3] + img[row][col + 4];

                        img[row][col] = num /8;
                    }
                }
            }
        }

        return img;
    }

    /**
     * This method applies the function 'changeContrast' that you already
     * implemented, on patches of the image. The difference is that as it
     * iterates over the patches, the contrast scale will increase.
     * <br>
     * Procedure:<br>
     * <ol>
     *      <li> For each patch:
     *      <ol>
     *          <li> call the function 'changeContrast'
     *          <li> copy the result to the corresponding patch of the output matrix.
     *          <li> increment the contrast scale. 
     *      </ol>
     * </ol>
     * @param img
     * @return
     */
    public static int[][] changeContrastByPatch(int[][] img, int patchSize){

        for (int row =0; row < img.length; row++){
            for (int col = 0; col < img[0].length; col++){
                double f = (259 * (patchSize + 255))/ (255 * (259 - patchSize));
                img[row][col] = (int) (f *(img[row][col] - 128)+128);

            }
        }

        return img;
    }
}