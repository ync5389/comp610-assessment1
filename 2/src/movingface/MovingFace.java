/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingface;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author xhu
 */
public class MovingFace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Moving Balls");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel panel = new Panel();
        
        frame.getContentPane().add(panel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }
    
}
