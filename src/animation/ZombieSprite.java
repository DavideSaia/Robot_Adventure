/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animation;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;

/**
 *
 * @author Utente
 */
public class ZombieSprite {
    
    
    private final static String [] GREEN_ZOMBIE_PATH = new String [] {"/Icon/Personaggi/Zombie/Run6.png",
    "/Icon/Personaggi/Zombie/Run8.png","/Icon/Personaggi/Zombie/Run10.png",
    "/Icon/Personaggi/Zombie/Attack1.png","/Icon/Personaggi/Zombie/Attack3.png",
    "/Icon/Personaggi/Zombie/Hurt2.png","/Icon/Personaggi/Zombie/Hurt4.png",
    "/Icon/Personaggi/Zombie/Dead3.png","/Icon/Personaggi/Zombie/Dead5.png","/Icon/Personaggi/Zombie/Dead8.png"}; 
    
    private final static String [] BROWN_ZOMBIE_PATH = new String [] {"/Icon/Personaggi/Zombie/Run6_Z1.png",
    "/Icon/Personaggi/Zombie/Run8_Z1.png","/Icon/Personaggi/Zombie/Run10_Z1.png",
    "/Icon/Personaggi/Zombie/Attack1_Z1.png","/Icon/Personaggi/Zombie/Attack3_Z1.png",
    "/Icon/Personaggi/Zombie/Hurt2_Z1.png","/Icon/Personaggi/Zombie/Hurt4_Z1.png",
    
    "/Icon/Personaggi/Zombie/Dead3_Z1.png","/Icon/Personaggi/Zombie/Dead5_Z1.png","/Icon/Personaggi/Zombie/Dead8_Z1.png"}; 
    
    private final static String [] PIRATE_ZOMBIE_PATH = new String [] {"/Icon/Personaggi/Zombie/Run6_Z2.png",
    "/Icon/Personaggi/Zombie/Run8_Z2.png","/Icon/Personaggi/Zombie/Run10_Z2.png",
    "/Icon/Personaggi/Zombie/Attack1_Z2.png","/Icon/Personaggi/Zombie/Attack3_Z2.png",
    "/Icon/Personaggi/Zombie/Hurt2_Z2.png","/Icon/Personaggi/Zombie/Hurt4_Z2.png",
    
    "/Icon/Personaggi/Zombie/Dead3_Z2.png","/Icon/Personaggi/Zombie/Dead5_Z2.png","/Icon/Personaggi/Zombie/Dead8_Z2.png"}; 
    
    private final static String [] FEMALE_ZOMBIE_PATH = new String [] {"/Icon/Personaggi/Zombie/Run6_Z3.png",
    "/Icon/Personaggi/Zombie/Run8_Z3.png","/Icon/Personaggi/Zombie/Run10_Z3.png",
    "/Icon/Personaggi/Zombie/Attack1_Z3.png","/Icon/Personaggi/Zombie/Attack3_Z3.png",
    "/Icon/Personaggi/Zombie/Hurt2_Z3.png","/Icon/Personaggi/Zombie/Hurt4_Z3.png",
    
    "/Icon/Personaggi/Zombie/Dead3_Z3.png","/Icon/Personaggi/Zombie/Dead5_Z3.png","/Icon/Personaggi/Zombie/Dead8_Z3.png"}; 
    
    private BufferedImage [] greenZombieImg;
    private BufferedImage [] brownZombieImg;
    private BufferedImage [] pirateZombieImg;
    private BufferedImage [] femaleZombieImg;
    private BufferedImage [] squadZombieImg;
    protected int standardWidth = (int)(1920 - Toolkit.getDefaultToolkit().getScreenSize().getWidth());
    protected int standardHeight = (int)(1080 - Toolkit.getDefaultToolkit().getScreenSize().getHeight());
    private int j=0;
    
        public ZombieSprite(){
            greenZombieImg = new BufferedImage[GREEN_ZOMBIE_PATH.length];
            brownZombieImg = new BufferedImage[BROWN_ZOMBIE_PATH.length];
            pirateZombieImg = new BufferedImage[PIRATE_ZOMBIE_PATH.length];
            femaleZombieImg = new BufferedImage[FEMALE_ZOMBIE_PATH.length];
            squadZombieImg = new BufferedImage [GREEN_ZOMBIE_PATH.length+BROWN_ZOMBIE_PATH.length+PIRATE_ZOMBIE_PATH.length+FEMALE_ZOMBIE_PATH.length];
        
            
            try{
                for(int i=0;i<greenZombieImg.length;i++){
                    greenZombieImg[i]=ImageIO.read(new File(getClass().getResource(GREEN_ZOMBIE_PATH[i]).toURI()));
                }
                for(int i=0;i<brownZombieImg.length;i++){
                    brownZombieImg[i]=ImageIO.read(new File(getClass().getResource(BROWN_ZOMBIE_PATH[i]).toURI()));
                }
                for(int i=0;i<pirateZombieImg.length;i++){
                    pirateZombieImg[i]=ImageIO.read(new File(getClass().getResource(PIRATE_ZOMBIE_PATH[i]).toURI()));
                }
                for(int i=0;i<femaleZombieImg.length;i++){
                    femaleZombieImg[i]=ImageIO.read(new File(getClass().getResource(FEMALE_ZOMBIE_PATH[i]).toURI()));
                }
            }// end try
            catch(IOException ioe) {
                ioe.printStackTrace();
            }
            catch(URISyntaxException uriSE) {
                uriSE.printStackTrace();
            }
           
        }// end constructor
    
        
        public Image[] getGreenZombieSprite(){
            Image [] greenFrame = new Image [greenZombieImg.length];
                    for(int i=0;i<greenZombieImg.length;i++){
                        if(i>2 && i<5){
                            greenFrame[i] = greenZombieImg[i].getScaledInstance(250, 350, Image.SCALE_SMOOTH);
                        }
                        if(i==5){
                            greenFrame[i] = greenZombieImg[i].getScaledInstance(250, 400, Image.SCALE_SMOOTH);
                        }
                        if(i==6){
                            greenFrame[i] = greenZombieImg[i].getScaledInstance(225, 400, Image.SCALE_SMOOTH);
                        }
                        if(i==7){
                            greenFrame[i] = greenZombieImg[i].getScaledInstance(350, 350, Image.SCALE_SMOOTH);
                        }
                        if(i==8){
                            greenFrame[i] = greenZombieImg[i].getScaledInstance(350, 250, Image.SCALE_SMOOTH);
                        }
                        if(i==9){
                            greenFrame[i] = greenZombieImg[i].getScaledInstance(400, 200, Image.SCALE_SMOOTH);
                        }
                        if(i<3){
                            greenFrame[i] = greenZombieImg[i].getScaledInstance(300, 400, Image.SCALE_SMOOTH);
                        }
                    }// end for cicle
            return greenFrame;
        
        }// end method getGreenZombieSprite
        
        
        public Image[] getBrownZombieSprite(){
            Image [] zombieFrame = new Image [brownZombieImg.length];
                   for(int i=0;i<brownZombieImg.length;i++){
                        if(i>2 && i<5){
                            zombieFrame[i] = brownZombieImg[i].getScaledInstance(250, 350, Image.SCALE_SMOOTH);
                        }
                        if(i==5){
                            zombieFrame[i] = brownZombieImg[i].getScaledInstance(250, 400, Image.SCALE_SMOOTH);
                        }
                        if(i==6){
                            zombieFrame[i] = brownZombieImg[i].getScaledInstance(225, 400, Image.SCALE_SMOOTH);
                        }
                        if(i==7){
                            zombieFrame[i] = brownZombieImg[i].getScaledInstance(350, 350, Image.SCALE_SMOOTH);
                        }
                        if(i==8){
                            zombieFrame[i] = brownZombieImg[i].getScaledInstance(350, 250, Image.SCALE_SMOOTH);
                        }
                        if(i==9){
                            zombieFrame[i] = brownZombieImg[i].getScaledInstance(400, 200, Image.SCALE_SMOOTH);
                        }
                        if(i<3){
                            zombieFrame[i] = brownZombieImg[i].getScaledInstance(300, 400, Image.SCALE_SMOOTH);
                        }
                    }// end for cicle
            return zombieFrame;
        }// end method getBrownZombieSprite
        
        public Image[] getPirateZombieSprite(){
            Image [] zombieFrame = new Image [pirateZombieImg.length];
                   for(int i=0;i<pirateZombieImg.length;i++){
                        if(i>2 && i<5){
                            zombieFrame[i] = pirateZombieImg[i].getScaledInstance(250, 350, Image.SCALE_SMOOTH);
                        }
                        if(i==5){
                            zombieFrame[i] = pirateZombieImg[i].getScaledInstance(250, 400, Image.SCALE_SMOOTH);
                        }
                        if(i==6){
                            zombieFrame[i] = pirateZombieImg[i].getScaledInstance(225, 375, Image.SCALE_SMOOTH);
                        }
                        if(i==7){
                            zombieFrame[i] = pirateZombieImg[i].getScaledInstance(350, 350, Image.SCALE_SMOOTH);
                        }
                        if(i==8){
                            zombieFrame[i] = pirateZombieImg[i].getScaledInstance(350, 250, Image.SCALE_SMOOTH);
                        }
                        if(i==9){
                            zombieFrame[i] = pirateZombieImg[i].getScaledInstance(400, 200, Image.SCALE_SMOOTH);
                        }
                        if(i<3){
                            zombieFrame[i] = pirateZombieImg[i].getScaledInstance(300, 400, Image.SCALE_SMOOTH);
                        }
                    }// end for cicle
            return zombieFrame;
        }// end method getPirateZombieSprite
        
        
         public Image[] getFemaleZombieSprite(){
            Image [] zombieFrame = new Image [femaleZombieImg.length];
                    for(int i=0;i<femaleZombieImg.length;i++){
                        if(i>2 && i<5){
                            zombieFrame[i] = femaleZombieImg[i].getScaledInstance(250, 350, Image.SCALE_SMOOTH);
                        }
                        if(i==5){
                            zombieFrame[i] = femaleZombieImg[i].getScaledInstance(250, 400, Image.SCALE_SMOOTH);
                        }
                        if(i==6){
                            zombieFrame[i] = femaleZombieImg[i].getScaledInstance(225, 400, Image.SCALE_SMOOTH);
                        }
                        if(i==7){
                            zombieFrame[i] = femaleZombieImg[i].getScaledInstance(350, 350, Image.SCALE_SMOOTH);
                        }
                        if(i==8){
                            zombieFrame[i] = femaleZombieImg[i].getScaledInstance(350, 250, Image.SCALE_SMOOTH);
                        }
                        if(i==9){
                            zombieFrame[i] = femaleZombieImg[i].getScaledInstance(400, 200, Image.SCALE_SMOOTH);
                        }
                        if(i<3){
                            zombieFrame[i] = femaleZombieImg[i].getScaledInstance(300, 400, Image.SCALE_SMOOTH);
                        }
                    }// end for cicle
            return zombieFrame;
        }// end method getFemaleZombieSprite
        
        
        public Image[] getSquadZombieSprite(){
            Image[] squadZombieFrame = new Image[greenZombieImg.length+brownZombieImg.length+pirateZombieImg.length+femaleZombieImg.length];
                
                for(Image img: getGreenZombieSprite()){
                    squadZombieFrame [j] = img;
                    j++;
                }
                for(Image img: getBrownZombieSprite()){
                    squadZombieFrame [j] = img;
                    j++;
                }
                for(Image img: getPirateZombieSprite()){
                    squadZombieFrame [j] = img;
                    j++;
                }
                for(Image img: getFemaleZombieSprite()){
                    squadZombieFrame [j] = img;
                    j++;
                }
            return squadZombieFrame;
        }// end method getSquadZombieSprite
    

}// end class
