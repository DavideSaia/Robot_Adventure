/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import view.AbstractPanel;
import view.CoverPanel;
import view.PictureCreator;
import view.RobotGUI;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;


/**
 *
 * @author Utente
 */
public class RobotAdventure extends JFrame{
      
    private RobotGUI rGUI;
   
    public RobotAdventure(String title){
   
       super(title);
        try{
        this.setIconImage(ImageIO.read(new File((getClass().getResource("/Icon/Icona_app_transparent.png")).toURI())));
        }
         catch (IOException e) {
             System.out.print("Immagine non trovata");
        }
        catch(URISyntaxException uri){
            System.out.print("Argomento errato");
        }
        
        rGUI = new RobotGUI(this);
        //this.addKeyListener(rGUI.getKeyListener());
        
        
   };//end Constructor()
   
   
    
   public static void main (String[] args){
       
       
       javax.swing.SwingUtilities.invokeLater(() -> {
           new RobotAdventure("Robot Adventure").setVisible(true);
       });   
       
   }//end methond main
   
   
   
    
    /**
     * @param args the command line arguments
     */

}// end class
    

