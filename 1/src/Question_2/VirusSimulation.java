/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_2;

import javax.swing.JFrame;

/**
 *
 * @author xhu
 */
public class VirusSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Mobile Phone Virus Simulation");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel panel = new Panel(frame);
        
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    
}
