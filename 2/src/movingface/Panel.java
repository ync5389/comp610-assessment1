/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingface;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author xhu
 */
public class Panel extends JPanel implements KeyListener, MouseListener, ComponentListener {

    int width = 1000;
    int height = 1000;
    Face face = new Face();
    
    Image image;

    public Panel()
    {
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.addComponentListener(this);       
        this.setFocusable(true);
        image = new ImageIcon("emoji.jpg").getImage();
    }
    
    
    public void paint(Graphics g)
    {
        paintComponent(g);

        g.drawImage(image, face.x, face.y, this);
        g.drawString("Click on where you want me to move to.", face.x, face.y+100);
       
        repaint();
    }
      
    @Override
    public void keyTyped(KeyEvent ke) {
        

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(!face.isAlive())
        {
            face.start();
        }
        if(ke.getKeyCode() == KeyEvent.VK_UP)
        {
            face.y-=1; 
            face.vy = -1;
        }
        if(ke.getKeyCode() == KeyEvent.VK_DOWN)
        {
            face.y+=1;
            face.vy = 1;
        }
        if(ke.getKeyCode() == KeyEvent.VK_LEFT)
        {
            face.x-=1;
            face.vx = -1;
        }
        if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            face.x+=1;
            face.vx = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        face.vx = 0;
        face.vy = 0;
    }    

    @Override
    public void componentResized(ComponentEvent ce) {
        width = this.getWidth();
        height = this.getHeight();
    }

    @Override
    public void componentMoved(ComponentEvent ce) {

    }

    @Override
    public void componentShown(ComponentEvent ce) {
        
    }

    @Override
    public void componentHidden(ComponentEvent ce) {
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(!face.isAlive())
        {
            face.start();
        }
        face.destination_x = me.getX();
        face.destination_y = me.getY();
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
       
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
}
