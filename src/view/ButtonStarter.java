/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;
import javax.swing.event.MouseInputListener;

/**
 *
 * @author Utente
 */
public class ButtonStarter extends AbstractPanel{
    
    protected JButton startButton;
    protected JButton infoButton;
    protected JButton ratingButton;
    private final static Dimension BUTTON_DIMENSION = new Dimension(500,150);
    private final static Dimension INFO_RATING_BUTTON_DIMENSION = new Dimension(100,100);
    
    
    public ButtonStarter (){
        super();
        //this.setInitButton();
        
    };
        
    public void AddMouseListenerToButton(MouseListener e){
            startButton.addMouseListener(e);
            infoButton.addMouseListener(e);
            ratingButton.addMouseListener(e);
    };// end method AddListenerToButton()
    
    public void AddMouseMotionListenerToButton(MouseMotionListener evt){
            startButton.addMouseMotionListener(evt);
            infoButton.addMouseMotionListener(evt);
            ratingButton.addMouseMotionListener(evt);
    };// end method AddListenerToButton()
    
        
    /*public void setInitButton(){
        startButton = this.setButton(super.nextButtonImg, BUTTON_DIMENSION, 0, 0);
        infoButton = this.setButton(super.infoButtonImg, INFO_RATING_BUTTON_DIMENSION, 1795, 150);
        ratingButton = this.setButton(super.ratingImg, BUTTON_DIMENSION, 1795, 270);
    };// setInitButton()*/
    
    
    /*public JButton setButton (BufferedImage bIM,Dimension d,int posX,int posY){
        ImageIcon imgIC;
        JButton jB;
        PictureCreator pC = new PictureCreator();
        int bWidth;
        int bHeight;
        int nX;
        int nY; 
            bWidth = (int)(((int)d.getWidth()) -(1920 - Toolkit.getDefaultToolkit().getScreenSize().getWidth()));
            bHeight = (int)(((int)d.getHeight())-(1080 - Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
            nX = (int)(posX -(1920 - Toolkit.getDefaultToolkit().getScreenSize().getWidth()));
            nY = (int)(posY -(1080 - Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
                imgIC = new ImageIcon(pC.setImage(bIM, bWidth,bHeight));
                jB = new JButton(imgIC);
                jB.setPressedIcon(imgIC);
                jB.setOpaque(false);
                jB.setContentAreaFilled(false);
                jB.setBorderPainted(false);
                jB.setMargin(new Insets(0,0,0,0));
                jB.setBounds(nX, nY, imgIC.getIconWidth(), imgIC.getIconHeight());
        return jB;
    };*/
    
    
    
    
    
}//end class ButtonStarter
