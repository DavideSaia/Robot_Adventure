/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
/**
 *
 * @author Utente
 */
public class PictureCreator {
    
    
    public PictureCreator(){};
    
    
    
    public BufferedImage[] loadImageArray (String[] s){
        BufferedImage [] bimg= new BufferedImage [Array.getLength(s)];
        
        for(int i=0;i < Array.getLength(bimg);i++){
        
        try{
               bimg[i] = ImageIO.read(new File((getClass().getResource(s[i])).toURI()));
            }
            catch (IOException e) {
                System.out.print("Immagine non trovata");
            }
            catch(URISyntaxException uri){
                System.out.print("Argomento errato");
            }
        }
        return bimg;
    
    };//end method loadImageArray()
    
    
    public Image [] setImageArray (BufferedImage[] bI,int[] scaleWidth,int[] scaleHeight){
        Image [] scaleImageArray= new Image[Array.getLength(bI)];
    for(int i=0;i<Array.getLength(scaleImageArray);i++){
          scaleImageArray[i]=  bI[i].getScaledInstance(scaleWidth[i], scaleHeight[i], Image.SCALE_SMOOTH);
    }
        return scaleImageArray;
    };// end method setImageArray()
    
    
    
    
    public void imageArrayDrawer(Graphics2D g2D,BufferedImage [] sBIM,int [] w, int [] h, int [] posX,int [] posY){
        Image nIM;
        PictureCreator pC = new PictureCreator();
     
        
        for(int i=0;i<Array.getLength(sBIM);i++){
            nIM = pC.setImage(sBIM[i], w[i], h[i]);
            g2D.drawImage(nIM, posX[i], posY[i], null);
        }
    }// end method imageArrayDrawer()
    
    
    
    
    public BufferedImage loadImage (String s){
        BufferedImage bimg=null;
            try{
                bimg = ImageIO.read(new File((getClass().getResource(s)).toURI()));
            }
            catch (IOException e) {
                System.out.print("Immagine non trovata");
            }
            catch(URISyntaxException uri){
                System.out.print("Argomento errato");
            }
        return bimg;
    
    };//end method loadImage()
    
    
    private Image setImage(BufferedImage bI,int scaleWidth,int scaleHeight){
        Image scaleImage=null;
          scaleImage=  bI.getScaledInstance(scaleWidth, scaleHeight, Image.SCALE_SMOOTH);
        return scaleImage;
    };// end method setImage()
    
    
    
    public void imageDrawer(Graphics2D g2D,BufferedImage sBIM,int w, int h, int posX,int posY){
        Image nIM;
        PictureCreator pC = new PictureCreator();
            nIM = pC.setImage(sBIM, w, h);
            g2D.drawImage(nIM, posX, posY, null);
        }// end method imageDrawer()
    
    
    /*public void drawBackground(Graphics g,BufferedImage bIM){
        Graphics2D g2D = (Graphics2D) g;
                g2D.drawImage(bIM,0, 0, null);
    };//end method drawBackground()*/
    
    public ImageIcon setPreferredIcon (BufferedImage bIM,Dimension d){
        ImageIcon imgIC;
        PictureCreator pC = new PictureCreator();
        imgIC = new ImageIcon(pC.setImage(bIM, (int) d.getWidth(),(int) d.getHeight()));      
        return imgIC;
    };
    
    
    public JButton setButtonIcon (BufferedImage bIM,Dimension d){
        ImageIcon imgIC;
        JButton jB;
        PictureCreator pC = new PictureCreator();
    int bWidth = (int)(((int)d.getWidth()) -(1920 - Toolkit.getDefaultToolkit().getScreenSize().getWidth()));
    int bHeight = (int)(((int)d.getHeight())-(1080 - Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
    Dimension newD = new Dimension(bWidth,bHeight);
            imgIC = new ImageIcon(pC.setImage(bIM, bWidth,bHeight));
            jB = new JButton(imgIC);
            jB.setPressedIcon(imgIC);
            jB.setSize(newD);
            jB.setOpaque(false);
            jB.setContentAreaFilled(false);
            jB.setBorderPainted(false);
            jB.setMargin(new Insets(0,0,0,0));
        return jB;
    };
    
    
    public JButton setButton (BufferedImage bIM,Dimension d,int posX,int posY){
        ImageIcon imgIC;
        JButton jB;
        PictureCreator pC = new PictureCreator();
    int bWidth = (int)d.getWidth();
    int bHeight = (int)d.getHeight();
            imgIC = new ImageIcon(pC.setImage(bIM, bWidth,bHeight));
            jB = new JButton(imgIC);
            jB.setPressedIcon(imgIC);
            jB.setOpaque(false);
            jB.setContentAreaFilled(false);
            jB.setBorderPainted(false);
            jB.setMargin(new Insets(0,0,0,0));
            jB.setBounds(posX, posY, imgIC.getIconWidth(), imgIC.getIconHeight());
        return jB;
    };
    
   
    
    
    public static int getImageWidth(BufferedImage i){
        return ((int)Math.round(i.getWidth()+0.5));
    };
    
    public static int getImageHeight(BufferedImage i){
        return ((int)Math.round(i.getHeight()+0.5));
    };
    
    public Rectangle getBoundBox (BufferedImage i){
        Rectangle r=null;
        Graphics2D g2D = i.createGraphics();
           return g2D.getClipBounds(r);
    };
    
   
    
  
    

   
   
    
    
}//end class
