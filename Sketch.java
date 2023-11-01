import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	
	/**
   * A program that draws an object in random locations and 
   * based on the location the drawing changes.
   * @author: L. Wong
   */
  
  public void settings() {
    // Size call 
    size(400, 400);
  }
   
  public void setup() {
    // Indicating background colour  
    background(96, 172, 235);
  }
  
    // Generating random numbers  
    Random randomA = new Random();
    Random randomB = new Random();
    float fltFaceX = randomA.nextInt(400);
    float fltFaceY = randomB.nextInt(400); 

    // Setting the face size
    float faceSize = (150);

  public void draw() {
   
    // Draw the circle for the head
    ellipse(fltFaceX, fltFaceY, faceSize, faceSize);
    
    // Draw the mouth
    fill(170, 0, 0);
    arc(fltFaceX, fltFaceY + 20, 80, 50, 0, PI);
    line(fltFaceX - 40, fltFaceY + 20, fltFaceX + 40, fltFaceY + 20);
   
    // Draw the white part of the eyes
    fill(255);      
    ellipse(fltFaceX - 30, fltFaceY - 20, 35, 30);
    ellipse(fltFaceX +30, fltFaceY - 20, 35, 30);

    // Draw the pupils
    fill(0);
    ellipse(fltFaceX - 30, fltFaceY - 20, 15, 12);
    ellipse(fltFaceX + 30, fltFaceY - 20, 15, 12); 

    // Showing the current time
    int intHour = hour();  
    int intMinute = minute();  

    fill(0);
    textSize(30);
    text(intHour, 10, 28); 
    text(intMinute, 10, 52);
    
    // Changing the colour of the face based on location
    if(fltFaceX < 200 && fltFaceY < 200){
      fill(170, 250, 0);
    }
    else if(fltFaceX > 200 && fltFaceY > 200){
      fill(240, 60, 10);
    }
    else if(fltFaceX > 200 && fltFaceY < 200){
      fill(0, 0, 170);
    }
    else{
      fill(245, 236, 66);
    }

    if((fltFaceX < 200 && fltFaceY < 200) || (fltFaceX > 200 && fltFaceY > 200)){
      arc(fltFaceX, fltFaceY + 20, 60, 30, 0, PI);
    }

    }   
}
    