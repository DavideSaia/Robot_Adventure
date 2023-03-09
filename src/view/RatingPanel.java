/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.awt.Color;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.LinkedList;
import javax.swing.JFrame;

/**
 *
 * @author Utente
 */
public class RatingPanel extends AbstractPanel{
    
    private PictureCreator pC;
    private StringCreator sC;
    private final int WINDOW_RATING_WIDTH_HEIGHT = 1000;
    private final int FLAG_WIDTH = 90;
    private final int FLAG_HEIGHT = 90;
    private final static String RATING_STRING = "RATING";
    private final static String GG_STRING = "GOOD GAME";
    private Font ratingFont;
    private Color ratingColor;
    private int playerCount;
    private int offsetFlag;
    private LinkedList<String[]> listP;
    private PlayerData playerList;
    private boolean isSet;
    
    
    public RatingPanel() {
        super();
        pC = new PictureCreator();
        sC = new StringCreator();
        playerList = new PlayerData();
        listP = new LinkedList<String[]>();
        
        setPlayerClassification();
        //setPlayerList();
    }
    
    @Override 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
            g.drawImage(super.backgroundImg, 0, 0, null);
            pC.imageDrawer((Graphics2D)g, super.windowRatingImg, WINDOW_RATING_WIDTH_HEIGHT, WINDOW_RATING_WIDTH_HEIGHT, 460, 0);
            setFlag((Graphics2D)g);
            applyString(g);
    };
    
    public void setFlag (Graphics2D g2d){
        offsetFlag = 150;
        playerCount=0;
        for(String [] pArray: playerList.asListOfStringArray()){
            if(playerCount == 1){
                offsetFlag = 320;
            }
            if(playerCount == 2){
                offsetFlag = 480;
            }
            if(playerCount == 3){
                offsetFlag = 650;
            }
        if(playerCount<4){
                if(pArray[1].equals("Argentina")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[0], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Argentina)
                if(pArray[1].equals("Australia")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[1], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Australia)
                if(pArray[1].equals("Brasile")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[2], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Brasile)
                if(pArray[1].equals("Canada")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[3], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Canada)
                if(pArray[1].equals("Cina")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[4], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (China)
                if(pArray[1].equals("Francia")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[5], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Francia)
                if(pArray[1].equals("Germania")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[6], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Germania)
                if(pArray[1].equals("India")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[7], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (India)
                if(pArray[1].equals("Indonesia")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[8], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Indonesia)
                if(pArray[1].equals("Italia")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[9], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Italia)
                if(pArray[1].equals("Giappone")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[10], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Japan)
                if(pArray[1].equals("Messico")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[11], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Mexico)
                if(pArray[1].equals("Polonia")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[12], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Polonia)
                if(pArray[1].equals("Russia")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[13], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Russia)
                if(pArray[1].equals("Arabia Saudita")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[14], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Saudi Arabia)
                if(pArray[1].equals("Sud Africa")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[15], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Sud Africa)
                if(pArray[1].equals("Sud Corea")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[16], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Sud Corea)
                if(pArray[1].equals("Spagna")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[17], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Spain)
                if(pArray[1].equals("Regno Unito")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[18], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Regno Unito)
                if(pArray[1].equals("Stati Uniti")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[19], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Stati Uniti)
                if(pArray[1].equals("Turchia")){
                    pC.imageDrawer(g2d, super.flagsArrayImg[20], FLAG_WIDTH, FLAG_HEIGHT, 550, offsetFlag);
                    playerCount++;
                }// end if (Turchia)
            }// end if(playerCount)
        }// end for cicle 
    };// end method setFlag()
    
    
    
    
    public void setPlayerClassification () {
        playerCount=0;
        
        try{
        listP = ReadCSV.getRows("classifica.csv", "UTF-8");}
        catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        
        
        for(String []sArr : listP){
            if(playerCount < 5){
            playerList.add(new Player(sArr[0],sArr[1],Integer.valueOf(sArr[2]))); 
                playerCount++;
            } // end if 
        } // end for cicle  
        
        try{
        WriteCSV.print("classifica.csv", "UTF-8", playerList.asListOfStringArray());}
        catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        
    }// end method setPlayerData()
    
    
    public void setPlayerList (Player p) {
        playerCount = 0;
        isSet = false; 
            for(String [] cArray : listP){
                if(isSet == false){
                    if(p.getScore() > Integer.valueOf(cArray[2])){
                        playerList.addToIndex(playerCount, p);
                        //System.out.print(playerCount);
                        isSet=true;
                    }//end if 
               }// if (isSet)
                playerCount++;
            }// end for cicle
    } // end method setPlayerList()
    
    
    
    
    
    
    
    
    
    
    
    public void applyString(Graphics g){
        
        playerCount = 0;
        int offsetNamePoint = 225;
        
        ratingFont = sC.applyFont(super.fontPDK, 72);
        ratingColor = sC.newColor(248, 248, 255);
            sC.stringDrawer(g,RATING_STRING, ratingFont, ratingColor, 800, 80);
        ratingFont = sC.applyFont(super.fontPDK, 100);
        ratingColor = sC.newColor(255, 215, 0);
            sC.stringDrawer(g, GG_STRING, ratingFont, ratingColor, 570, 900);
        ratingFont = sC.applyFont(super.fontPDK, 60);
        ratingColor = sC.newColor(248, 248, 255);
        
        
        for(String[] nPArray : playerList.asListOfStringArray()){
            if(playerCount == 1){
                offsetNamePoint = 385;
            }
            if(playerCount == 2){
                offsetNamePoint = 545;
            }
            if(playerCount == 3){
                offsetNamePoint = 710;
            }
            if(playerCount<4){
            sC.stringDrawer(g, nPArray[0], ratingFont, ratingColor, 700, offsetNamePoint);
            sC.stringDrawer(g, nPArray[2], ratingFont, ratingColor, 1150, offsetNamePoint);
            }// end if(playerCount)
            playerCount++;
        }// end for cicle
            repaint();
    }// method applyString()
    
    
    
    
    
   
    
    
    
}// end class
