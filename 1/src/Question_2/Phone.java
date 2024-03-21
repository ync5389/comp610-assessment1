package Question_2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Phone {
  int x = 0; 
  int y = 0;  
  int vx = 0; 
  int vy = 0;  
  int delay = 10;  
  int width;  
  int height;  
  
  RepairShop repairShop;
  
  public Phone() {

    x = 0;
    y = 0;
    vx = 1;
    vy = 1;

  }
  
  public void setRange(int width, int height) {
    this.width = width;
    this.height = height;
  }
  
  public void run() {
      move();
  }
   
  public void move() {
    if (x > width || x < 0)
      vx *= -1; 
    if (y > height || y < 0)
      vy *= -1; 
    
    try {
            Thread.sleep(delay);
        } catch (InterruptedException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    x += vx;
    y += vy;
  }  
}
