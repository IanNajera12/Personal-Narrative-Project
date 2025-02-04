import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

  // Instance Variables
  private String[][] variable1;
  private ImagePlus[][] variable2;
  
  // Constructor
  public MyStory(String[][] variable1, ImagePlus[][] variable2) {
    this.variable1 = variable1;
    this.variable2 = variable2;
  }

  public void drawScene() {
    forLoopScene();
  }

 

  public void forLoopScene() {
   //Goes through all elements of the 2d array and does so to not mess up the visualization
    for(int row=0; row<variable1.length; row++){
     for(int col=0; col<variable1[0].length-1; col++){

       /*
       Clears the screen to a red color, pauses, sets the characteristics of the text, 
       draws the specified indexes of images and text, if on row 0(the first screen) the images are pixelated,
       Depending on the row which is being iterated a different image filter will be executed
       */
       clear("red");
pause(0.5);
setTextHeight(20);
setTextColor("black");
drawText(variable1[row][col],18,60);
    drawImage(variable2[row][col], 30, 75, 150);
    drawImage(variable2[row][col+1], 210, 75, 150);
  drawText(variable1[row][col+1],18,330);
      
       if(row==0){
    variable2[row][col].pixelate(10);
    variable2[row][col+1].pixelate(10);
  }

       if(row==1){
    variable2[row][col].randomColor();
    variable2[row][col+1].randomColor();
  }

       if(row==2){
    variable2[row][col].mirrorVertical();
    variable2[row][col+1].mirrorVertical();
  }

       if(row==3){
    variable2[row][col].sharpen();
    variable2[row][col+1].sharpen();
  }

    
pause(1);
  
    drawImage(variable2[row][col], 30, 75, 150);
    drawImage(variable2[row][col+1], 210, 75, 150);
pause(0.5);
playSound("letsGo.wav");
    pause(2.5);
      } 
    }
  }

  
  
}