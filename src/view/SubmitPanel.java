/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;


/**
 *
 * @author Utente
 */
public class SubmitPanel extends AbstractPanel{
    
    private final int WINDOW_WIDTH_HEIGHT = 1000;
    private String [] stringArray;
    private PictureCreator pC;
    private StringCreator sC;   
    private Font submitFont;
    private Color submitColor;
    
    

    
    
    public SubmitPanel(){
        super();
        this.initSubmitPanel();
    };// end Constructor ()
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
            g.drawImage(super.backgroundImg, 0, 0, null); 
            pC.imageDrawer((Graphics2D)g, super.windowImg, WINDOW_WIDTH_HEIGHT, WINDOW_WIDTH_HEIGHT, 460, 0);
            this.applyString(stringArray, g);
    };
    
    
    public void initSubmitPanel(){
       pC = new PictureCreator();
       sC = new StringCreator();
       submitFont = sC.applyFont(super.fontSpaceAge,36);
       stringArray = new String[]{"SIGNING UP","NICKNAME","NATIONALITY"};      
    };// end method initSubmitPanel()
    
    
    public void applyString (String[] s,Graphics gSubmit){
        submitFont = sC.applyFont(super.fontPDK,72);
        submitColor = sC.newColor(248, 248, 255);
        sC.stringDrawer(gSubmit,s[0], submitFont, submitColor, 660, 75);  
        submitFont = sC.applyFont(super.fontPDK,48);
        sC.stringDrawer(gSubmit, s[1], submitFont, submitColor, 550, 325);
        sC.stringDrawer(gSubmit, s[2], submitFont, submitColor, 550, 600);
    };
    
   
    
    
}//end class
