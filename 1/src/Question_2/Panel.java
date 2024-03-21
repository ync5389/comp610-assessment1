/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author xhu
 */
public class Panel extends JPanel implements KeyListener, ComponentListener {

    //"example" is just an example to show you how the animation can be done
    //You need to remove the "example" before you submit your code.
    Phone example = new Phone();
    
    JFrame frame;
    public Panel(JFrame frame)
    {
        this.frame = frame;
        example.setRange(frame.getWidth(), frame.getHeight()); 

        this.addKeyListener(this);
        this.addComponentListener(this);
        this.setFocusable(true);
    }
    

    
    public void paint(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.BLUE);
        g.drawString("This is an example", example.x, example.y);
        
        //currently we call run() method here. After Phone class is implemented as thread
        //you are going to remove the following code "example.run()".
        example.run();  
        
        repaint();
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {

    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }    

    @Override
    public void componentResized(ComponentEvent ce) {
        example.setRange(frame.getWidth(), frame.getHeight());
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
}
