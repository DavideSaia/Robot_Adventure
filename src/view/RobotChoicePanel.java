/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Utente
 */
public class RobotChoicePanel extends AbstractPanel{
        
    private JButton buttonRobot1;
    private JButton buttonRobot2;
    private static String choiceS = "CHOOSE ONE";
    private static Dimension ROBOT_BUTTON_DIMENSION = new Dimension (750,810);
    private Font choiceFont;
    private Color choiceColor;
    private PictureCreator pC;
    private StringCreator sC;
    private String choice;
    
    
        public RobotChoicePanel(){
            super();
            pC = new PictureCreator();
            sC = new StringCreator();
            choiceFont = sC.applyFont(super.fontPDK, 100);
            choiceColor = sC.newColor(248, 248, 255);
        };
    
        
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
            g.drawImage(super.backgroundImg, 0, 0, null); 
            sC.stringDrawer(g, choiceS, choiceFont, choiceColor, 550, 100);
    };// end method paintComponent()
    
    public JButton getButtonRobot1(){
            buttonRobot1 = pC.setButton(super.buttonRobot1Img, ROBOT_BUTTON_DIMENSION, 150, 175);
        return buttonRobot1;
    } // end method getButtonRobot1()
    
    public JButton getButtonRobot2(){
            buttonRobot2 = pC.setButton(super.buttonRobot2Img, ROBOT_BUTTON_DIMENSION,1000,175);
        return buttonRobot2;
    } // end method getButtonRobot1()
        
    
    public void setChoice(String c){
        this.choice = c;
    }
    
    public String getChoice(){
        return this.choice;
    }
    
} // end class 
