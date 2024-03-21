/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingface;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xhu
 */
public class Face extends Thread{
    
    int x;
    int y;
    int vx;
    int vy;
    int destination_x;
    int destination_y;
    
    public Face()
    {
        x = 0;
        y = 0;
        vx = 0;
        vy = 0;
    }
    
    public void run()
    {
        while(true)
        {
            moveToDestination(destination_x, destination_y);
            x+=vx;
            y+=vy;
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Face.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void moveToDestination(int destination_x, int destination_y)
    {
        if(x<destination_x)
        {
            vx = 1;
        }
        else if(x>destination_x)
        {
            vx = -1;
        }
        else
        {
            vx = 0;
        }
        
        if(y<destination_y)
        {
            vy = 1;
        }
        else if(y>destination_y)
        {
            vy = -1;
        }
        else
        {
            vy = 0;
        }
    }
}
