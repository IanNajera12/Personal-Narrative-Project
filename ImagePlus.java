import org.code.theater.*;
import org.code.media.*;

/*
 * Represents an image that can be modified with filters and effects
 */
public class ImagePlus extends Image {

  private Pixel[][] pixels;    // The 2D array of pixels
  private ImagePlus[][] variable;

  /*
   * Sets the superclass filename to the specified filename
   * and calls the getPixelsFromImage() method to initialize
   * the 2D array of Pixel objects that make up the image
   */
  public ImagePlus(String filename) {
    super(filename);   // Calls the Image class constructor


     
    // Initialize the pixels array by getting the pixels from the image
    pixels = getPixelsFromImage();
  }

  /*
   * Returns the 2D array of pixels
   */
  public Pixel[][] getImagePixels() {
    return pixels;
  }

  /*
   * Returns the pixels in the image as a 2D array of Pixel objects
   */
  public Pixel[][] getPixelsFromImage() {
    Pixel[][] tempPixels = new Pixel[getHeight()][getWidth()];
    
    for (int row = 0; row < tempPixels.length; row++) {
      for (int col = 0; col < tempPixels[0].length; col++) {
        tempPixels[row][col] = getPixel(col, row);
      }
    }

    return tempPixels;
  }
public void randomColor() {
    //gets the pixels from the image
Pixel[][] salik = getImagePixels();

  //Establishes a random integer value which will be relevant in updating the color of the image
  int value = (int) (Math.random() * 255);

  //Creates a for loop which iterates through each pixel of the image
       for(int row=0; row< salik.length;row++){
  for(int col=0;col<(salik[0].length);col++){
Pixel currentPixel=salik[row][col];


    /*
    If statement that determines which red, green, or blue value will be altered to the value of
    the previously created variable value.
    */
    if(value>175){
    currentPixel.setRed(value);
    }
   else if(value>90){
    currentPixel.setBlue(value);
    }
    else{
    currentPixel.setGreen(value);
    }
  }
} 
  }
   
  public void pixelate(int gridSize) {
   //gets pixels from image
    Pixel[][] pixels = getImagePixels();
   /*Iterates through the image skipping pixels by the given parameter
   */
    for (int row = 0; row < pixels.length; row += gridSize) {
      for (int col = 0; col < pixels[0].length; col += gridSize) {
        int endRow = Math.min(row + gridSize, pixels.length);
        int endCol = Math.min(col + gridSize, pixels[0].length);
        int avgRed = 0;
        int avgGreen = 0;
        int avgBlue = 0;
/*Inner double for loop which iterates through the small section that was created 
by skipping over multiple pixels in the main for loop. The average value of each pixel is
collected and divided by total pixels in the region giving the average color of the region
*/
        for (int regionRow = row; regionRow < endRow; regionRow++) {
          for (int regionCol = col; regionCol < endCol; regionCol++) {
            avgRed += pixels[regionRow][regionCol].getRed();
            avgGreen += pixels[regionRow][regionCol].getGreen();
            avgBlue += pixels[regionRow][regionCol].getBlue();
          }
        }

        int totalPixelsInRegion = (endRow - row) * (endCol - col);
        avgRed /= totalPixelsInRegion;
        avgGreen /= totalPixelsInRegion;
        avgBlue /= totalPixelsInRegion;

        //Sets the value of each pixel in the smaller section to the average value of the section
        for (int regionRow = row; regionRow < endRow; regionRow++) {
          for (int regionCol = col; regionCol < endCol; regionCol++) {
            pixels[regionRow][regionCol].setRed(avgRed);
            pixels[regionRow][regionCol].setGreen(avgGreen);
            pixels[regionRow][regionCol].setBlue(avgBlue);
          }
        }
      }
    }
  }

  public void mirrorVertical() {
 //gets the image pixels  
Pixel[][] salik = getImagePixels();
//For loop that iterates through the whole image
    for(int row=0; row< salik.length;row++){
  for(int col=0;col<(salik[0].length/2);col++){
  //Sets the value for two pixel variables, leftPixel and rightPixel
    Pixel leftPixel= salik[row][col];
    Pixel rightPixel= salik[row][salik[0].length-col-1];
//Gets the color of the right Pixel and sets it equal to variables red, green, and blue
  int red = rightPixel.getRed();
  int blue = rightPixel.getBlue();
  int green = rightPixel.getGreen();
//Sets the color of the Right Pixel, to the left PIxel
    leftPixel.setRed(red);
    leftPixel.setBlue(blue);
    leftPixel.setGreen(green);
  }
}

  }

  public void sharpen() {
   
// Get the pixel array of the image
Pixel[][] salik = getImagePixels();

/* 
 * Iterate over the image pixels, excluding the outermost border
 * This prevents accessing out-of-bounds pixels when checking neighbors
 */
for (int row = 1; row < salik.length - 1; row++) {
    for (int col = 1; col < salik[0].length - 1; col++) {
        
        // Get the current pixel and its top-left neighbor
        Pixel currentPixel = salik[row][col];
        Pixel topLeftPixel = salik[row - 1][col - 1];

        // Calculate the difference in color channels between the two pixels
        int red = currentPixel.getRed() - topLeftPixel.getRed();
        int green = currentPixel.getGreen() - topLeftPixel.getGreen();
        int blue = currentPixel.getBlue() - topLeftPixel.getBlue();

        // Compute the average color difference
        double averageDifference = (red + green + blue) / 3.0;

        /* 
         * Adjust the red, green, and blue values by adding the average difference
         * Ensure the values remain within the valid range [0, 255]
         */
        int newRed = currentPixel.getRed() + (int) averageDifference;
        if (newRed > 255) {
            newRed = 255; // Cap at max color value
        } else if (newRed < 0) {
            newRed = 0; // Cap at min color value
        }

        int newGreen = currentPixel.getGreen() + (int) averageDifference;
        if (newGreen > 255) {
            newGreen = 255;
        } else if (newGreen < 0) {
            newGreen = 0;
        }

        int newBlue = currentPixel.getBlue() + (int) averageDifference;
        if (newBlue > 255) {
            newBlue = 255;
        } else if (newBlue < 0) {
            newBlue = 0;
        }

        // Apply the new color values to the current pixel
        currentPixel.setRed(newRed);
        currentPixel.setGreen(newGreen);
        currentPixel.setBlue(newBlue);
    }
}

return;

}
}