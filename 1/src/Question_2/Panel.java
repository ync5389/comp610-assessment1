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
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author xhu
 */

public class Panel extends JPanel implements KeyListener, ComponentListener {
    //"example" is just an example to show you how the animation can be done
    //You need to remove the "example" before you submit your code.
    // Phone example = new Phone();
    JFrame frame;

    List<Phone> phones = new ArrayList<>();
    
    public Panel(JFrame frame){
        this.frame = frame;
        this.addKeyListener(this);
        this.addComponentListener(this);
        this.setFocusable(true);
        // for(Phone p: phones){
        //     p.start();
        // }

        // addPhone();

    }
    @Override
    public void paint(Graphics g){
        super.paintComponent(g);
        
        
        if(!phones.isEmpty()){

    
            for(Phone p: phones){
                // p.draw(g);
                // g.drawString("iterator", p.x, p.y);

                g.fillOval(p.x, p.y, 20, 20);
                g.drawOval(p.x, p.y, 20, 20);
                p.setRange(frame.getWidth(), frame.getHeight()); 
                if(p.infected){
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.BLUE);
                }
                p.run();
                
                p.transmitVirus(phones);
                p.repairShop(p);
                // new Thread(p).start();
                
            }
        }        
        repaint();
    }


w
    public void addPhone(){
        Phone phone = new Phone();
        phone.start();
        phones.add(phone);
    }

public void startPhone(){

}




    public List<Phone> getPhone(){
        return phones; 
    }

    @Override
    public void keyTyped(KeyEvent ke) {
         char typedChar = ke.getKeyChar();
         System.out.println("Key typed: " + typedChar);
    }

    @Override
    public void keyPressed(KeyEvent ke) {
         int keyCode = ke.getKeyCode();
         System.out.println("Key pressed: " + KeyEvent.getKeyText(keyCode));
    }
    @Override
    public void keyReleased(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        System.out.println("Key released: " + KeyEvent.getKeyText(keyCode));

        if(ke.getKeyCode()== KeyEvent.VK_UP){
            addPhone();
         } else if(ke.getKeyCode()== KeyEvent.VK_V){
            Random random = new Random();
            int num = random.nextInt(Math.max(1, phones.size() - 1));
            phones.get(num).infected = true;
         }
        // addPhone();
    
    }    

    @Override
    public void componentResized(ComponentEvent ce) {
        for(Phone p: phones){
            p.setRange(frame.getWidth(), frame.getHeight());
        }
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
