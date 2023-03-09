/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Utente
 */
public class LevelOverviewPanel extends AbstractPanel{
    
    private JButton firstLevelButton;
    private JButton secondLevelButton;
    private JButton thirdLevelButton;
    private final static String OVERVIEW_STRING = "LEVEL OVERVIEW";
    private PictureCreator pC;
    private Dimension LEVEL_BUTTON_DIMENSION = new Dimension (905,705);
    
    private StringCreator sC;
    private Font overviewFont;
    private Color overviewColor;
    
    public LevelOverviewPanel(){
        super();
        pC = new PictureCreator();
        sC = new StringCreator();
        overviewFont = sC.applyFont(super.fontPDK, 100);
        overviewColor = sC.newColor(248, 248, 255);
    }// end constructor
    
    public JButton getFirstLevelButton (){
        firstLevelButton = pC.setButton(this.firstLevelBtImg, LEVEL_BUTTON_DIMENSION, 30, 180);
        return firstLevelButton;
    }
    
    public JButton getSecondLevelButton (){
        secondLevelButton = pC.setButton(this.secondLevelBtImg, LEVEL_BUTTON_DIMENSION, 985, 180);
        return secondLevelButton;
    }
    
    /*public JButton getThridLevelButton(){
        thirdLevelButton = pC.setButton(this.firstLevelBtImg, LEVEL_BUTTON_DIMENSION, 1310, 325);
        return thirdLevelButton;
    }*/
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
            g.drawImage(super.backgroundImg, 0, 0, null);
            sC.stringDrawer(g, OVERVIEW_STRING, overviewFont, overviewColor, 450,100);
    }// end method paintComponent
    
    
    
    
}// end class
