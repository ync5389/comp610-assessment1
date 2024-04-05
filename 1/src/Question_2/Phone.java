package Question_2;

import java.awt.Graphics;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Phone extends Thread {
  int x = 100; 
  int y = 100;  
  int vx = 2; 
  int vy = 2;  
  int delay = 1;  

  int width;  
  int height;  
  int lifespan = 0;
  boolean infected;
  Panel panel;
  RepairShop repairShop;
  public Phone() {
            Random random = new Random();
        int x = random.nextInt(Math.max(2, 1000));
        int y = random.nextInt(Math.max(2, 1000));
        this.x = x;
        this.y = y;
    this.lifespan = 500;
  }
  @Override
  public void run() {
    move();
}


    public synchronized void transmitVirus(List<Phone> phones) {
        if (infected) {
            for (Phone p : phones) {
                if (p != this && distanceTo(p) <= 20) {
                    p.setInfected(true);
                }
            }
        }
    }
    public double distanceTo(Phone p) {
        int dx = p.x - this.x;
        int dy = p.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public void setInfected(boolean in){
      infected = in;
    }
    public int getLifeSpan(){
      return lifespan;
    }
  public void setRange(int width, int height) {
    this.width = width;
    this.height = height;
  }
  public void repairShop(Phone p){
    if (infected && x <= 500 && y <= 500) { 
      try {
        // Thread.sleep(1000);
        p.setInfected(false);
      } catch (Exception e) {
        
      }
    }
  }
  public void draw(Graphics g){

  }

  public void move() {
    //     x += vx;
    //     y += vy;
    //     if (x + 20 > width || x - 20 < 0) {
    //         vx = -vx; // Reverse horizontal velocity
    //     }
    //     if (y + 20 > height || y - 20 < 0) {
    //         vy = -vy; // Reverse vertical velocity
    //     }

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
