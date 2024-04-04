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
    // Phone[] head = new Phone[20];
    // Phone one = new Phone(20,20);
    // Phone two = new Phone(50,50);
    // Phone test = new Phone();

    public Panel(JFrame frame){
        this.frame = frame;
        this.addKeyListener(this);
        this.addComponentListener(this);
        this.setFocusable(true);
        
        // example.setRange(frame.getWidth(), frame.getHeight()); 
        // head[0] = new Phone(20,20);
        // head[0].setRange(frame.getWidth(), frame.getHeight()); 
        // one.setRange(frame.getWidth(), frame.getHeight()); 
        // two.setRange(frame.getWidth(), frame.getHeight()); 
        // test.setRange(frame.getWidth(), frame.getHeight()); 

        addPhone();
        drawPhone();

    }
    
    public void paint(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        // g.drawString("O", example.x, example.y);
        // g.drawString("O", test.x, test.y);

        
        //currently we call run() method here. After Phone class is implemented as thread
        //you are going to remove the following code "example.run()".
        // example.run(); 
        // head.run(); 
        // for(int i=0;i < head.length;i++) {
        //     if(head[i] != null){
        //         head[i].run(); 
        //         System.out.println("run>>>>");
        //     }
        // }
        // System.out.println("head.length"+ head.length);
        // one.start();
        // two.start();
        // test.run(); 

        
    }

    public void addPhone(){
        Random random = new Random();
        int x = random.nextInt(Math.max(1, getWidth() -50));
        int y = random.nextInt(Math.max(1, getHeight() -50));
        Phone phone = new Phone(x, y, this);
        phones.add(phone);
        System.out.println("sizeee" + phones.size());

        Thread thread = new Thread();
        thread.start();

    }

    public void drawPhone(){
        if(phones.size()){

            while(Phone p: phones){
                p.draw();
            }
        }
    }

    public List<Phone> getPhone(){
        return phones; 
    }


    @Override
    public void keyTyped(KeyEvent ke) {
         char typedChar = ke.getKeyChar();
         System.out.println("Key typed: " + typedChar);

        //  if(ke.getKeyChar()== KeyEvent.VK_UP){
        //     addPhone();
        //     repaint();
        //  } else if(ke.getKeyChar()== KeyEvent.VK_V){
        //     repaint();
        //  }
        addPhone();
        repaint();
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
        // for(int i=0;i<head.length;i++) {
        //         head[i] = new Phone(20, 20);
        // }
    
    }    

    @Override
    public void componentResized(ComponentEvent ce) {
        // example.setRange(frame.getWidth(), frame.getHeight());
        // head[0].setRange(frame.getWidth(), frame.getHeight());
        // one.setRange(frame.getWidth(), frame.getHeight());
        // test.setRange(frame.getWidth(), frame.getHeight());



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
