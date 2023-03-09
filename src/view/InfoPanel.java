/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.Array;

/**
 *
 * @author Utente
 */
public class InfoPanel extends AbstractPanel{
        
    private PictureCreator pC;  
    private StringCreator sC; 
    private final int WINDOW_INFO_WIDTH = 1000;
    private final int WINDOW_INFO_HEIGHT = 1000;
    private final int HEAD_WIDTH_HEIGHT = 120;
    private final int WEAPON_HEIGHT_WIDTH=180;
    private final int BOMB_HEIGHT_WIDTH=130;
    private Font infoFont;
    private Color infoColor;
    private String[] infoDescription;
    private String infoTitle;
    private String tips;
    private int offsetInfo;
    private int offsetHead;
    private int offsetWeapon;
    private int offsetEffect;
    private BufferedImage [] iconArray;
    
    
    
    public InfoPanel(){
        super();
        pC = new PictureCreator();
        sC = new StringCreator();
        iconArray = new BufferedImage [] {super.zombieHeadImg,super.villainRobotHeadImg,super.armImg,
                super.shotIconImg};
    };
        
     @Override
     public void paintComponent(Graphics g){
         super.paintComponent(g);
            g.drawImage(super.backgroundImg, 0, 0, null);
            pC.imageDrawer((Graphics2D)g, super.windowImg, WINDOW_INFO_WIDTH, WINDOW_INFO_HEIGHT, 460, 0);
            this.applyImage(g);           
            this.applyString(g);
     };
            
      
    public void applyString(Graphics g){
        offsetInfo = 160;
        offsetEffect = 625;
        infoFont = sC.applyFont(super.fontSpaceAge, 45);
        infoColor = sC.newColor(248, 248, 255);
        infoDescription = new String[] {"Un nuovo robot è sbarcato","sulla Terra, aiutalo a","sconfiggere 2 temibili nemici:",
        "Zombie e il famigerato","Violet Robot, un suo simile", "che si è convertito al lato","oscuro.",
        };
        
    for(int i=0;i<Array.getLength(infoDescription);i++){
        sC.stringDrawer(g, infoDescription[i], infoFont, infoColor, 490, offsetInfo);
                offsetInfo +=50;
    }
        
        infoTitle = "INFO";
        tips = "TIPS";
        infoFont = sC.applyFont(super.fontPDK,72);
        sC.stringDrawer(g, infoTitle, infoFont, infoColor, 830, 80);
        infoFont = sC.applyFont(super.fontPDK, 60);
        sC.stringDrawer(g, tips, infoFont, infoColor, 850, 520);
        infoColor = sC.newColor(255, 215, 0);
        infoFont = sC.applyFont(super.fontSpaceAge, 100);
    
    for(int z=0;z<6;z++){
        if(z>1 && z<4){
            infoColor = sC.newColor(220, 20, 60);
            infoFont = sC.applyFont(super.fontSpaceAge, 120);
            sC.stringDrawer(g, ">", infoFont, infoColor, 935, offsetEffect);
        }
        if(z>3){
            infoColor = sC.newColor(153, 50, 204);
            infoFont = sC.applyFont(super.fontSpaceAge, 140);
            sC.stringDrawer(g, ">", infoFont, infoColor, 1010, offsetEffect);
        }
        if(z<2){
            sC.stringDrawer(g, ">", infoFont, infoColor, 860, offsetEffect);
        }
            offsetEffect += 290;
        if(z==1){
            offsetEffect = 630;
            }
        if(z==3){
            offsetEffect = 635;
            }
        }
    };
      
    public void applyImage(Graphics g){
        offsetHead = 525;
        offsetWeapon= 510;
            for(int j=0;j<Array.getLength(iconArray);j++){
                if(j<2){
                    pC.imageDrawer((Graphics2D)g, iconArray[j], HEAD_WIDTH_HEIGHT, HEAD_WIDTH_HEIGHT, 1170, offsetHead);
                            offsetHead +=310;
                       
                }
                else{
                    if(j>1 && j<4){
                        pC.imageDrawer((Graphics2D)g, iconArray[j], WEAPON_HEIGHT_WIDTH, WEAPON_HEIGHT_WIDTH, 590, offsetWeapon);
                        offsetWeapon += 290;
                                  }
                    }   
                } // end for cicle
    };// end method applyImage()
    
    
        
}//end class
