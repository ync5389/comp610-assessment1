package Question_2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Inflater;

public class Phone extends Thread {
  int x = 0; 
  int y = 0;  
  int vx = 0; 
  int vy = 0;  
  int delay = 10;  
  int width;  
  int height;  
  int lifespan = 0;
  boolean infected;
  Panel panel;
  RepairShop repairShop;
  public Phone(int x, int y, Panel in) {
    this.x = x;
    this.y = y;
    this.vx = 1;
    this.vy = 1;
    this.lifespan = 500;
    this.panel = in;
  }

  public void add(){
    Random random = new Random();
    x = random.nextInt();
    y = random.nextInt();
}

  
  public void setRange(int width, int height) {
    this.width = width;
    this.height = height;

  }

  public void repairShop(){
    try {
      Thread.sleep(1000);
    } catch (Exception e) {

    }
  }
  
  public void run() {
      move();
  }

  public void draw(Graphics g){
    if(infected){
      g.getColor(Color.RED);
    } else {
      g.getColor(Color.GREEN);
    }
    g.fillOval(x,y, 30,30);
  }
   
  public void move() {

    List newPhone = new ArrayList(panel.getPhone());
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
