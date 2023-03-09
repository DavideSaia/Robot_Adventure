/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import soundtrack.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Utente
 */
public class ScorePanel extends AbstractPanel implements ActionListener{
    
    private PictureCreator pC;
    private StringCreator sC;
    private final static int WINDOW_WIDTH_HEIGHT = 1000;
    private final static int STAR_WIDTH_HEIGHT = 200;
    private final static String SCORE_STRING = "SCORE";
    private int count = 0;
    public  int score = 0;
    private String scoreScript="";
    private String playerName ="";
    private final static int SCORE_DELAY = 750;
    private boolean isShowedStar1 = false;
    private boolean isShowedStar2 = false;
    private Timer scoreTimer;
    private Font scoreFont;
    private Color scoreColor;
    private AudioClip aC;
    private boolean isOpen=false;
    
    
    public ScorePanel(){
        super();
        pC = new PictureCreator();
        sC = new StringCreator();
        scoreTimer = new Timer (SCORE_DELAY,this);
        aC = new AudioClip();
    }// end constructor
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawImage(super.backgroundImg,0,0,null);
        pC.imageDrawer((Graphics2D)g, super.windowImg, WINDOW_WIDTH_HEIGHT, WINDOW_WIDTH_HEIGHT, 460, 0);
        
        if(count == 2 || isShowedStar1 == true ){
            if(score == 0){
                pC.imageDrawer((Graphics2D)g, this.star1Img, STAR_WIDTH_HEIGHT, STAR_WIDTH_HEIGHT, 550, 250);
                this.repaint();
            }
            if(score > 0 && score<= 500){
                pC.imageDrawer((Graphics2D)g, this.star2Img, STAR_WIDTH_HEIGHT, STAR_WIDTH_HEIGHT, 550, 250);
                this.repaint();
            }
            if(score > 500){
                pC.imageDrawer((Graphics2D)g, this.star3Img, STAR_WIDTH_HEIGHT, STAR_WIDTH_HEIGHT, 550, 250);
                this.repaint();
            }
            isShowedStar1=true;
        }// end if first star 
        
        if(count == 4 || isShowedStar2 == true){
            if(score<=500){
                pC.imageDrawer((Graphics2D)g, this.star1Img, STAR_WIDTH_HEIGHT, STAR_WIDTH_HEIGHT, 875, 150);
                this.repaint();
            }
            if(score>500 && score <1000){
                pC.imageDrawer((Graphics2D)g, this.star2Img, STAR_WIDTH_HEIGHT, STAR_WIDTH_HEIGHT, 875, 150);
                this.repaint();
            }
            if(score>1000){
                pC.imageDrawer((Graphics2D)g, this.star3Img, STAR_WIDTH_HEIGHT, STAR_WIDTH_HEIGHT, 875, 150);
                this.repaint();
            }
            isShowedStar2=true;
        }// end if second star
        if(count == 6){
            if(score<1000){
                pC.imageDrawer((Graphics2D)g, this.star1Img, STAR_WIDTH_HEIGHT, STAR_WIDTH_HEIGHT, 1175, 250);
                this.repaint();
            }
             if(score>1000 && score<=2000){
                pC.imageDrawer((Graphics2D)g, this.star2Img, STAR_WIDTH_HEIGHT, STAR_WIDTH_HEIGHT, 1175, 250);
                this.repaint();
            }
            if(score>2000){
                pC.imageDrawer((Graphics2D)g, this.star3Img, STAR_WIDTH_HEIGHT, STAR_WIDTH_HEIGHT, 1175, 250);
                this.repaint();
            }
        }// end if thirdStar
        

        applyString(g);
    }// end method paintComponent
        
        
    
    
    public void applyString (Graphics g){
        scoreFont = sC.applyFont(this.fontPDK, 72);
        scoreColor = sC.newColor(248, 248, 255);
        sC.stringDrawer(g, SCORE_STRING, scoreFont, scoreColor, 830, 80);
        scoreFont = sC.applyFont(fontPDK, 72);
        scoreColor = sC.newColor(255, 0, 0);
        sC.stringDrawer(g, playerName , scoreFont, scoreColor, 510, 650);
        scoreFont = sC.applyFont(this.fontSpaceAge,72);
        scoreColor = sC.newColor(248, 248, 255);
        sC.stringDrawer(g, "RECORD:", scoreFont, scoreColor, 1000, 650);
        scoreFont = sC.applyFont(fontPDK, 150);
        scoreColor = sC.newColor(255, 215, 0);
        sC.stringDrawer(g, scoreScript , scoreFont, scoreColor, 750, 800);
    }// end method applyString()
    
    @Override
    public void actionPerformed (ActionEvent evt){
        this.repaint();
        count++;
        //--------------------
        try{
            if(isOpen==false){
                aC.getVictoryClip().open(aC.getVictoryAudio());
                aC.getVictoryClip().start();
                isOpen=true;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //--------------------------
        scoreScript = String.valueOf(score);
        if(count == 6){
            //------------------------
            aC.getVictoryClip().close();
            
            try{
                aC.getVictoryAudio().close();
            }
            catch(IOException ioe){
                ioe.printStackTrace();
            }
            //-----------------------
            this.scoreTimer.stop();
        }

    }// end method actionPerformed
    
    public void setScore(int s){
        this.score = s;
    }// end method setScore()
    
    public void setPlayerName(String n){
        this.playerName = n;
    }// end setPlayerName()
    
    
    public Timer getScoreTimer(){
        return this.scoreTimer;
    }// end getScoreTimer()
    
    
    public void setCountZero(){
        this.count=0;
        this.isShowedStar1 = false;
        this.isShowedStar2 = false;
    }
    
}// end class
