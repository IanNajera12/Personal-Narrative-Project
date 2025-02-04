import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

 String[][] storyText = {
            {"Welcome to my Personal Narrative Project", "Ian's Summer in Spain!!!"},
            {"I immersed myself into Spanish culture", "And made many different friends abroad."},
            {"The food was incredible!", "The Messi Burger was really good."},
            {"Exploring historical sites was unforgettable.", "A truly unforgettable experience."}
        };
        
        ImagePlus[][] storyImages = {
            {new ImagePlus("mapOfSpain.png"), new ImagePlus("spain.png")},
            {new ImagePlus("Screenshot-2025-01-29-203703.png"), new ImagePlus("Screenshot-2025-02-03-213245.png")},
            {new ImagePlus("Screenshot-2025-01-29-203645.png"), new ImagePlus("Screenshot-2025-01-29-203639.png")},
            {new ImagePlus("Screenshot-2025-01-29-203629.png"), new ImagePlus("Screenshot-2025-01-29-203621.png")}
        };

    
MyStory Ian = new MyStory(storyText, storyImages);
Ian.drawScene();

        Theater.playScenes(Ian);


    
    
  }
}