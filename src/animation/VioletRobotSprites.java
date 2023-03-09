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
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;

/**
 *
 * @author Utente
 */
public class VioletRobotSprites {
    
    private final static String [] VIOLET_ROBOT_RUN_PATH = new String[] {
    "/Icon/Personaggi/Violet_Robot/10_Run/Run_000.png","/Icon/Personaggi/Violet_Robot/10_Run/Run_006.png"};
    
    private final static String [] VIOLET_ROBOT_JUMP_PATH = new String [] {
    "/Icon/Personaggi/Violet_Robot/05_Jump/Jump_001.png","/Icon/Personaggi/Violet_Robot/05_Jump/Jump_005.png",
    "/Icon/Personaggi/Violet_Robot/05_Jump/Jump_011.png"};
    
    private final static String [] VIOLET_ROBOT_ATTACK_PATH = new String [] {
    "/Icon/Personaggi/Violet_Robot/06_Attack/Attack_005.png" ,"/Icon/Personaggi/Violet_Robot/06_Attack/Attack_013.png"};
    
    private final static String[] VIOLET_ROBOT_SHOT_PATH = new String [] {
    "/Icon/Personaggi/Violet_Robot/07_Shot/Shot_007.png","/Icon/Personaggi/Violet_Robot/07_Shot/Shot_010.png",
    "/Icon/Personaggi/Violet_Robot/07_Shot/Shot_005.png"
    };
    
    private final static String[] VIOLET_ROBOT_DEATH_PATH = new String[] {
    "/Icon/Personaggi/Violet_Robot/13_Death/Death_003.png","/Icon/Personaggi/Violet_Robot/13_Death/Death_006.png",
    "/Icon/Personaggi/Violet_Robot/13_Death/Death_013.png"};
    
    
    private BufferedImage [] violetRobotRunImg;
    private BufferedImage [] violetRobotJumpImg;
    private BufferedImage [] violetRobotAttackImg;
    private BufferedImage [] violetRobotShotImg;
    private BufferedImage [] violetRobotDeathImg;
    protected BufferedImage hpBoss1;
    protected BufferedImage hpBoss2;
    protected BufferedImage hpBoss3;
    protected BufferedImage bossHead;
    protected int standardWidth = (int)(1920 - Toolkit.getDefaultToolkit().getScreenSize().getWidth());
    protected int standardHeight = (int)(1080 - Toolkit.getDefaultToolkit().getScreenSize().getHeight());
    private int z=0;
    
    
    
    public VioletRobotSprites(){
        violetRobotRunImg = new BufferedImage[Array.getLength(VIOLET_ROBOT_RUN_PATH)];
        violetRobotJumpImg = new BufferedImage[Array.getLength(VIOLET_ROBOT_JUMP_PATH)];
        violetRobotAttackImg = new BufferedImage[Array.getLength(VIOLET_ROBOT_ATTACK_PATH)];
        violetRobotShotImg = new BufferedImage[Array.getLength(VIOLET_ROBOT_SHOT_PATH)];
        violetRobotDeathImg = new BufferedImage[Array.getLength(VIOLET_ROBOT_DEATH_PATH)];
    
        
        try{
            for(int i=0;i<Array.getLength(violetRobotRunImg);i++){
                violetRobotRunImg[i] = ImageIO.read(new File(getClass().getResource(VIOLET_ROBOT_RUN_PATH[i]).toURI()));
            }// end for Robot RUN
            for(int i=0;i<Array.getLength(violetRobotJumpImg);i++){
                violetRobotJumpImg[i] = ImageIO.read(new File(getClass().getResource(VIOLET_ROBOT_JUMP_PATH[i]).toURI()));
            }// end for Robot JUMP
            for(int i=0;i<Array.getLength(violetRobotAttackImg);i++){
                violetRobotAttackImg[i] = ImageIO.read(new File(getClass().getResource(VIOLET_ROBOT_ATTACK_PATH[i]).toURI()));
            }// end for Robot ATTACK
            for(int i=0;i<Array.getLength(violetRobotShotImg);i++){
                violetRobotShotImg[i] = ImageIO.read(new File(getClass().getResource(VIOLET_ROBOT_SHOT_PATH[i]).toURI()));
            }// end for Robot SHOT
            for(int i=0;i<Array.getLength(violetRobotDeathImg);i++){
                violetRobotDeathImg[i] = ImageIO.read(new File(getClass().getResource(VIOLET_ROBOT_DEATH_PATH[i]).toURI()));
            }// end for Robot DEATH
            
            hpBoss1 = ImageIO.read(new File((getClass().getResource("/Icon/Livelli/Boss_HP_Bar_1.png")).toURI()));
            hpBoss2 = ImageIO.read(new File((getClass().getResource("/Icon/Livelli/Boss_HP_Bar_2.png")).toURI()));
            hpBoss3 = ImageIO.read(new File((getClass().getResource("/Icon/Livelli/Boss_HP_Bar_3.png")).toURI()));
            bossHead = ImageIO.read(new File((getClass().getResource("/Icon/villain_robot_head.png")).toURI()));
            
        }// end try
        catch (IOException ioe){
            ioe.printStackTrace();
        }// end catch
        catch(URISyntaxException uriSe){
            uriSe.printStackTrace();
        }
    }// end constructor 
    
    
    
    public Image[] getVioletRobotRunSprites(){
        Image[] violetRobotRunFrame = new Image[Array.getLength(violetRobotRunImg)];
            for(int j=0;j<Array.getLength(violetRobotRunImg);j++){ 
                violetRobotRunFrame[j] = violetRobotRunImg[j].getScaledInstance(450, 450, Image.SCALE_SMOOTH);
            }// end getVioletRobotRunSprites ()            
        return violetRobotRunFrame;
    }// end method getVioletRobotRunSprites()
    
    
    public Image[] getVioletRobotJumpSprites(){
       Image[] violetRobotJumpFrame = new Image[Array.getLength(violetRobotJumpImg)];
           for(int j=0;j<Array.getLength(violetRobotJumpImg);j++){
               if(j<1){
                   violetRobotJumpFrame[j] = violetRobotJumpImg[j].getScaledInstance(385, 425, Image.SCALE_SMOOTH);
               }
               if(j==1){
                   violetRobotJumpFrame[j] = violetRobotJumpImg[j].getScaledInstance(400, 500, Image.SCALE_SMOOTH);
               }
               if(j==2){
                   violetRobotJumpFrame[j] = violetRobotJumpImg[j].getScaledInstance(600, 400, Image.SCALE_SMOOTH);
               }
           }// end for getVioletRobotJumpSprites ()            
       return violetRobotJumpFrame;
    }// end method getVioletRobotJumpSprites()
    
    
    
    
    public Image[] getVioletRobotAttackSprites(){
        Image[] violetRobotAttackFrame = new Image[Array.getLength(violetRobotAttackImg)];
            for(int j=0;j<Array.getLength(violetRobotAttackImg);j++){ 
                violetRobotAttackFrame[j] = violetRobotAttackImg[j].getScaledInstance(460, 460, Image.SCALE_SMOOTH);
            }// end getVioletRobotAttackSprites ()            
        return violetRobotAttackFrame;
    }// end method getVioletRobotAttackSprites()
    
    
    public Image[] getVioletRobotShotSprites(){
        Image[] violetRobotShotFrame = new Image[Array.getLength(violetRobotShotImg)];
            for(int j=0;j<Array.getLength(violetRobotShotImg);j++){
                if(j==1) {
                    violetRobotShotFrame[j] = violetRobotShotImg[j].getScaledInstance(1075, 475, Image.SCALE_SMOOTH);
                }
                else{
                    violetRobotShotFrame[j] = violetRobotShotImg[j].getScaledInstance(475, 475, Image.SCALE_SMOOTH);
                }
                
            }// end for getVioletRobotShotSprites ()            
        return violetRobotShotFrame;
    }// end method getVioletRobotShotSprites()
    
    
    public Image[] getVioletRobotDeathSprites(){
        Image[] violetRobotDeathFrame = new Image[Array.getLength(violetRobotDeathImg)];
            for(int j=0;j<Array.getLength(violetRobotDeathImg);j++){
                if(j<1){
                    violetRobotDeathFrame[j] = violetRobotDeathImg[j].getScaledInstance(450, 450, Image.SCALE_SMOOTH);
                }
                if(j==1){
                    violetRobotDeathFrame[j] = violetRobotDeathImg[j].getScaledInstance(500, 400, Image.SCALE_SMOOTH);
                }
                if(j==2){
                    violetRobotDeathFrame[j] = violetRobotDeathImg[j].getScaledInstance(650, 200, Image.SCALE_SMOOTH);
                }
            }// end for getVioletRobotDeathSprites ()            
        return violetRobotDeathFrame;
    }// end method getVioletRobotDeathSprites()
    
    
    
    public Image [] getVioletRobotSprites(){
        Image[] violetRobotFrame = new Image [Array.getLength(violetRobotRunImg)+Array.getLength(violetRobotJumpImg)+
                                              Array.getLength(violetRobotAttackImg)+Array.getLength(violetRobotShotImg)+
                                              Array.getLength(violetRobotDeathImg)];
        
            for(Image IArr: this.getVioletRobotRunSprites()){
                violetRobotFrame[z] = IArr;
                    z++;
            }// end for RunSprites
            for(Image IArr: this.getVioletRobotJumpSprites()){
                violetRobotFrame[z] = IArr;
                    z++;
            }// end for JumpSprites
            for(Image IArr: this.getVioletRobotAttackSprites()){
                violetRobotFrame[z] = IArr;
                    z++;
            }// end for AttackSprites
            for(Image IArr: this.getVioletRobotShotSprites()){
                violetRobotFrame[z] = IArr;
                    z++;
            }// end for ShotSprites
            for(Image IArr: this.getVioletRobotDeathSprites()){
                violetRobotFrame[z] = IArr;
                    z++;
            }// end for DeathSprites

        return violetRobotFrame;
    }// end method getVioletRobotSprites()
    
    
    
    
    
}// end class
