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
public class MainRobotSprites {
    
    
    public final static String[] MAIN_ROBOT_IDLE_PATH = new String[] {"/Icon/Personaggi/Main_Robot/01_Idle/Idle_003.png",
    "/Icon/Personaggi/Main_Robot/01_Idle/Idle_008.png"};
    
    public final static String[] GOLD_ROBOT_IDLE_PATH = new String[] {"/Icon/Personaggi/Gold_Robot/01_Idle/Idle_003.png",
    "/Icon/Personaggi/Gold_Robot/01_Idle/Idle_008.png"};
    
    
    
    
    
    private final static String[] MAIN_ROBOT_WALK_PATH = new String []{"/Icon/Personaggi/Main_Robot/03_Walk/Walk_006.png",
    "/Icon/Personaggi/Main_Robot/03_Walk/Walk_011.png","/Icon/Personaggi/Main_Robot/03_Walk/Walk_000.png"};
    
    private final static String[] GOLD_ROBOT_WALK_PATH = new String []{"/Icon/Personaggi/Gold_Robot/03_Walk/Walk_006.png",
    "/Icon/Personaggi/Gold_Robot/03_Walk/Walk_011.png","/Icon/Personaggi/Gold_Robot/03_Walk/Walk_000.png"};
    
    
    
    
    private final static String[] MAIN_ROBOT_REVERSE_WALK_PATH = new String []{"/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_006.png",
    "/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_011.png","/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_000.png"
    };    
    
    private final static String[] GOLD_ROBOT_REVERSE_WALK_PATH = new String []{"/Icon/Personaggi/Gold_Robot/04_Reverse_Walk/Walk_006.png",
    "/Icon/Personaggi/Gold_Robot/04_Reverse_Walk/Walk_011.png","/Icon/Personaggi/Gold_Robot/04_Reverse_Walk/Walk_000.png"
    };    
    
    
    
    
    
    private final static String [] MAIN_ROBOT_JUMP_PATH = new String [] {
    "/Icon/Personaggi/Main_Robot/05_Jump/Jump_001.png","/Icon/Personaggi/Main_Robot/05_Jump/Jump_005.png",
    "/Icon/Personaggi/Main_Robot/05_Jump/Jump_011.png"};
    
    private final static String [] GOLD_ROBOT_JUMP_PATH = new String [] {
    "/Icon/Personaggi/Gold_Robot/05_Jump/Jump_001.png","/Icon/Personaggi/Gold_Robot/05_Jump/Jump_005.png",
    "/Icon/Personaggi/Gold_Robot/05_Jump/Jump_011.png"};
    
    
    
    private final static String [] MAIN_ROBOT_ATTACK_PATH = new String [] {
    "/Icon/Personaggi/Main_Robot/06_Attack/Attack_005.png" ,"/Icon/Personaggi/Main_Robot/06_Attack/Attack_013.png"};
    
    private final static String [] GOLD_ROBOT_ATTACK_PATH = new String [] {
    "/Icon/Personaggi/Gold_Robot/06_Attack/Attack_005.png" ,"/Icon/Personaggi/Gold_Robot/06_Attack/Attack_013.png"};
    
    
    private final static String[] MAIN_ROBOT_SHOT_PATH = new String [] {
    "/Icon/Personaggi/Main_Robot/07_Shot/Shot_007.png","/Icon/Personaggi/Main_Robot/07_Shot/Shot_010.png",
    "/Icon/Personaggi/Main_Robot/07_Shot/Shot_005.png"
    };
    
    private final static String[] GOLD_ROBOT_SHOT_PATH = new String [] {
    "/Icon/Personaggi/Gold_Robot/07_Shot/Shot_007.png","/Icon/Personaggi/Gold_Robot/07_Shot/Shot_010.png",
    "/Icon/Personaggi/Gold_Robot/07_Shot/Shot_005.png"
    };
    
    
    private final static String[] MAIN_ROBOT_BOMB_PATH = new String[] {
    "/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_000.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_001.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_002.png",
    "/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_003.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_004.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_005.png",
    "/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_006.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_007.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_008.png",
    "/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_009.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_010.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_011.png",
    "/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_012.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_013.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_014.png",
    "/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_015.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_016.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_017.png",
    "/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_018.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_019.png"};
            
    
    private final static String[] MAIN_ROBOT_DEATH_PATH = new String[] {
    "/Icon/Personaggi/Main_Robot/13_Death/Death_003.png","/Icon/Personaggi/Main_Robot/13_Death/Death_006.png",
    "/Icon/Personaggi/Main_Robot/13_Death/Death_013.png"};
    
    private final static String[] GOLD_ROBOT_DEATH_PATH = new String[] {
    "/Icon/Personaggi/Gold_Robot/13_Death/Death_003.png","/Icon/Personaggi/Gold_Robot/13_Death/Death_006.png",
    "/Icon/Personaggi/Gold_Robot/13_Death/Death_013.png"};
    
    
    
    private BufferedImage [] mainRobotIdleImg;
    protected BufferedImage [] mainRobotWalkImg;
    private BufferedImage [] mainRobotReverseWalkImg;
    private BufferedImage [] mainRobotJumpImg;
    private BufferedImage [] mainRobotAttackImg;
    private BufferedImage [] mainRobotShotImg;
    private BufferedImage [] mainRobotDeathImg;
    
    private BufferedImage [] goldRobotIdleImg;
    protected BufferedImage [] goldRobotWalkImg;
    private BufferedImage [] goldRobotReverseWalkImg;
    private BufferedImage [] goldRobotJumpImg;
    private BufferedImage [] goldRobotAttackImg;
    private BufferedImage [] goldRobotShotImg;
    private BufferedImage [] goldRobotDeathImg;
    
    
    private BufferedImage healthDot;
    protected int standardWidth = (int)(1920 - Toolkit.getDefaultToolkit().getScreenSize().getWidth());
    protected int standardHeight = (int)(1080 - Toolkit.getDefaultToolkit().getScreenSize().getHeight());
    private int z=0;
        
    
    
    
        public MainRobotSprites(){
            mainRobotIdleImg = new BufferedImage[Array.getLength(MAIN_ROBOT_IDLE_PATH)];
            mainRobotWalkImg = new BufferedImage[Array.getLength(MAIN_ROBOT_WALK_PATH)];
            mainRobotReverseWalkImg = new BufferedImage[Array.getLength(MAIN_ROBOT_REVERSE_WALK_PATH)];
            mainRobotJumpImg = new BufferedImage[Array.getLength(MAIN_ROBOT_JUMP_PATH)];
            mainRobotAttackImg = new BufferedImage[Array.getLength(MAIN_ROBOT_ATTACK_PATH)];
            mainRobotShotImg = new BufferedImage [Array.getLength(MAIN_ROBOT_SHOT_PATH)];
            mainRobotDeathImg = new BufferedImage[Array.getLength(MAIN_ROBOT_DEATH_PATH)];
            
            
            goldRobotIdleImg = new BufferedImage[Array.getLength(GOLD_ROBOT_IDLE_PATH)];
            goldRobotWalkImg = new BufferedImage[Array.getLength(GOLD_ROBOT_WALK_PATH)];
            goldRobotReverseWalkImg = new BufferedImage[Array.getLength(GOLD_ROBOT_REVERSE_WALK_PATH)];
            goldRobotJumpImg = new BufferedImage[Array.getLength(GOLD_ROBOT_JUMP_PATH)];
            goldRobotAttackImg = new BufferedImage[Array.getLength(GOLD_ROBOT_ATTACK_PATH)];
            goldRobotShotImg = new BufferedImage [Array.getLength(GOLD_ROBOT_SHOT_PATH)];
            goldRobotDeathImg = new BufferedImage[Array.getLength(GOLD_ROBOT_DEATH_PATH)];
            
            
            try{
                                
                for(int i=0;i<Array.getLength(mainRobotIdleImg);i++){
                mainRobotIdleImg[i] = ImageIO.read(new File(getClass().getResource(MAIN_ROBOT_IDLE_PATH[i]).toURI()));
                
                goldRobotIdleImg[i] = ImageIO.read(new File(getClass().getResource(GOLD_ROBOT_IDLE_PATH[i]).toURI()));
                }// end for Robot idle
                for(int i=0;i<Array.getLength(mainRobotWalkImg);i++){
                mainRobotWalkImg[i] = ImageIO.read(new File(getClass().getResource(MAIN_ROBOT_WALK_PATH[i]).toURI()));
                
                goldRobotWalkImg[i] = ImageIO.read(new File(getClass().getResource(GOLD_ROBOT_WALK_PATH[i]).toURI()));
                }// end for Robot walk
                for(int i=0;i<Array.getLength(mainRobotReverseWalkImg);i++){
                mainRobotReverseWalkImg[i] = ImageIO.read(new File(getClass().getResource(MAIN_ROBOT_REVERSE_WALK_PATH[i]).toURI()));
                
                goldRobotReverseWalkImg[i] = ImageIO.read(new File(getClass().getResource(GOLD_ROBOT_REVERSE_WALK_PATH[i]).toURI()));
                }// end for Robot reverseWalk
                for(int i=0;i<Array.getLength(mainRobotJumpImg);i++){
                mainRobotJumpImg[i] = ImageIO.read(new File(getClass().getResource(MAIN_ROBOT_JUMP_PATH[i]).toURI()));
                
                goldRobotJumpImg[i] = ImageIO.read(new File(getClass().getResource(GOLD_ROBOT_JUMP_PATH[i]).toURI()));
                }// end for Robot jump
                for(int i=0;i<Array.getLength(mainRobotAttackImg);i++){
                mainRobotAttackImg[i] = ImageIO.read(new File(getClass().getResource(MAIN_ROBOT_ATTACK_PATH[i]).toURI()));
                
                goldRobotAttackImg[i] = ImageIO.read(new File(getClass().getResource(GOLD_ROBOT_ATTACK_PATH[i]).toURI()));
                }// end for Robot attack
               
                for(int i=0;i<Array.getLength(mainRobotDeathImg);i++){
                mainRobotDeathImg[i] = ImageIO.read(new File(getClass().getResource(MAIN_ROBOT_DEATH_PATH[i]).toURI()));
                
                goldRobotDeathImg[i] = ImageIO.read(new File(getClass().getResource(GOLD_ROBOT_DEATH_PATH[i]).toURI()));
                }// end for Robot death        
                
                for(int i=0;i<Array.getLength(mainRobotShotImg);i++){
                mainRobotShotImg[i] = ImageIO.read(new File(getClass().getResource(MAIN_ROBOT_SHOT_PATH[i]).toURI()));
                
                goldRobotShotImg[i] = ImageIO.read(new File(getClass().getResource(GOLD_ROBOT_SHOT_PATH[i]).toURI()));
                }// end for Robot shot 
                
                healthDot = ImageIO.read(new File((getClass().getResource("/Icon/Livelli/Health_Dot.png")).toURI()));
            } // end try
            catch (IOException ioe){
                ioe.printStackTrace();
            }// end catch
            catch(URISyntaxException uriSe){
                uriSe.printStackTrace();
            }
        }//end Constructor
                    
        
        
    public Image[] getMainRobotIdleSprites(){
        Image[] mainRobotIdleFrame = new Image[Array.getLength(mainRobotIdleImg)];
            for(int j=0;j<Array.getLength(mainRobotIdleImg);j++){
                mainRobotIdleFrame[j] = mainRobotIdleImg[j].getScaledInstance(475, 475, Image.SCALE_SMOOTH);
            }// end for getMainRobotIdleSprites ()            
        return mainRobotIdleFrame;
    }// end method getMainRobotIdleSprites()
    
    public Image[] getGoldRobotIdleSprites(){
        Image[] goldRobotIdleFrame = new Image[Array.getLength(goldRobotIdleImg)];
            for(int j=0;j<Array.getLength(goldRobotIdleImg);j++){
                if(j==0){
                    goldRobotIdleFrame[j] = goldRobotIdleImg[j].getScaledInstance(475, 475, Image.SCALE_SMOOTH);
                }
                else{
                    goldRobotIdleFrame[j] = goldRobotIdleImg[j].getScaledInstance(425, 475, Image.SCALE_SMOOTH);
                }
                
            }// end for getMainRobotIdleSprites ()            
        return goldRobotIdleFrame;
    }// end method getGoldRobotIdleSprites()
    
        
    public Image[] getMainRobotWalkSprites(){
       Image[] mainRobotWalkFrame = new Image[Array.getLength(mainRobotWalkImg)];
           for(int j=0;j<Array.getLength(mainRobotWalkImg);j++){
               if(j==1){
                   mainRobotWalkFrame[j] = mainRobotWalkImg[j].getScaledInstance(325,475, Image.SCALE_SMOOTH);
               }
               else if(j==2){
                   mainRobotWalkFrame[j] = mainRobotWalkImg[j].getScaledInstance(375,475, Image.SCALE_SMOOTH);
               }
               else{
                   mainRobotWalkFrame[j] = mainRobotWalkImg[j].getScaledInstance(350,475, Image.SCALE_SMOOTH);
               }
           }// end for getMainRobotWalkSprites ()            
       return mainRobotWalkFrame;
   }// end method getMainRobotWalkSprites()
    
    
     public Image[] getGoldRobotWalkSprites(){
       Image[] goldRobotWalkFrame = new Image[Array.getLength(goldRobotWalkImg)];
           for(int j=0;j<Array.getLength(goldRobotWalkImg);j++){
               if(j==1){
                   goldRobotWalkFrame[j] = goldRobotWalkImg[j].getScaledInstance(325,475, Image.SCALE_SMOOTH);
               }
               else if(j==2){
                   goldRobotWalkFrame[j] = goldRobotWalkImg[j].getScaledInstance(375,475, Image.SCALE_SMOOTH);
               }
               else{
                   goldRobotWalkFrame[j] = goldRobotWalkImg[j].getScaledInstance(350,475, Image.SCALE_SMOOTH);
               }
           }// end for getMainRobotWalkSprites ()            
       return goldRobotWalkFrame;
   }// end method getGoldRobotWalkSprites()
  
     
     
     
         
    public Image[] getMainRobotReverseWalkSprites(){
        Image[] mainRobotReverseWalkFrame = new Image[Array.getLength(mainRobotReverseWalkImg)];
            for(int j=0;j<Array.getLength(mainRobotReverseWalkImg);j++){
                if(j==1){
                    mainRobotReverseWalkFrame[j] = mainRobotReverseWalkImg[j].getScaledInstance(325,475, Image.SCALE_SMOOTH);
                }
                else if(j==2){
                    mainRobotReverseWalkFrame[j] = mainRobotReverseWalkImg[j].getScaledInstance(375,475, Image.SCALE_SMOOTH);
                }
                else{
                    mainRobotReverseWalkFrame[j] = mainRobotReverseWalkImg[j].getScaledInstance(350,475, Image.SCALE_SMOOTH);
                }
            }// end for getMainRobotWalkSprites ()            
        return mainRobotReverseWalkFrame;
    }// end method getMainRobotWalkSprites()
    
    
    public Image[] getGoldRobotReverseWalkSprites(){
        Image[] goldRobotReverseWalkFrame = new Image[Array.getLength(goldRobotReverseWalkImg)];
            for(int j=0;j<Array.getLength(goldRobotReverseWalkImg);j++){
                if(j==1){
                    goldRobotReverseWalkFrame[j] = goldRobotReverseWalkImg[j].getScaledInstance(325,475, Image.SCALE_SMOOTH);
                }
                else if(j==2){
                    goldRobotReverseWalkFrame[j] = goldRobotReverseWalkImg[j].getScaledInstance(375,475, Image.SCALE_SMOOTH);
                }
                else{
                    goldRobotReverseWalkFrame[j] = goldRobotReverseWalkImg[j].getScaledInstance(350,475, Image.SCALE_SMOOTH);
                }
            }// end for getMainRobotWalkSprites ()            
        return goldRobotReverseWalkFrame;
    }// end method getGoldRobotWalkSprites()
         

        
    public Image[] getMainRobotJumpSprites(){
        Image[] mainRobotJumpFrame = new Image[Array.getLength(mainRobotJumpImg)];
            for(int j=0;j<Array.getLength(mainRobotJumpImg);j++){
                if(j<1){
                    mainRobotJumpFrame[j] = mainRobotJumpImg[j].getScaledInstance(385, 425, Image.SCALE_SMOOTH);
                }
                if(j==1){
                    mainRobotJumpFrame[j] = mainRobotJumpImg[j].getScaledInstance(400, 500, Image.SCALE_SMOOTH);
                }
                if(j==2){
                    mainRobotJumpFrame[j] = mainRobotJumpImg[j].getScaledInstance(600, 400, Image.SCALE_SMOOTH);
                }
            }// end for getMainRobotJumpSprites ()            
        return mainRobotJumpFrame;
    }// end method getMainRobotJumpSprites()
    
    public Image[] getGoldRobotJumpSprites(){
        Image[] goldRobotJumpFrame = new Image[Array.getLength(goldRobotJumpImg)];
            for(int j=0;j<Array.getLength(goldRobotJumpImg);j++){
                if(j<1){
                    goldRobotJumpFrame[j] = goldRobotJumpImg[j].getScaledInstance(385, 425, Image.SCALE_SMOOTH);
                }
                if(j==1){
                    goldRobotJumpFrame[j] = goldRobotJumpImg[j].getScaledInstance(400, 500, Image.SCALE_SMOOTH);
                }
                if(j==2){
                    goldRobotJumpFrame[j] = goldRobotJumpImg[j].getScaledInstance(600, 400, Image.SCALE_SMOOTH);
                }
            }// end for getMainRobotJumpSprites ()            
        return goldRobotJumpFrame;
    }// end method getGoldRobotJumpSprites()
    

        
    public Image[] getMainRobotAttackSprites(){
        Image[] mainRobotAttackFrame = new Image[Array.getLength(mainRobotAttackImg)];
            for(int j=0;j<Array.getLength(mainRobotAttackImg);j++){ 
                mainRobotAttackFrame[j] = mainRobotAttackImg[j].getScaledInstance(460, 460, Image.SCALE_SMOOTH);
            }// end getMainRobotAttackSprites ()            
        return mainRobotAttackFrame;
    }// end method getMainRobotAttackSprites()
    
    public Image[] getGoldRobotAttackSprites(){
        Image[] goldRobotAttackFrame = new Image[Array.getLength(goldRobotAttackImg)];
            for(int j=0;j<Array.getLength(goldRobotAttackImg);j++){ 
                goldRobotAttackFrame[j] = goldRobotAttackImg[j].getScaledInstance(460, 460, Image.SCALE_SMOOTH);
            }// end getMainRobotAttackSprites ()            
        return goldRobotAttackFrame;
    }// end method getGoldRobotAttackSprites()
    
    
    public Image[] getMainRobotShotSprites(){
        Image[] mainRobotShotFrame = new Image[Array.getLength(mainRobotShotImg)];
            for(int j=0;j<Array.getLength(mainRobotShotImg);j++){
                if(j==1) {
                    mainRobotShotFrame[j] = mainRobotShotImg[j].getScaledInstance(1075, 475, Image.SCALE_SMOOTH);
                }
                else{
                    mainRobotShotFrame[j] = mainRobotShotImg[j].getScaledInstance(475, 475, Image.SCALE_SMOOTH);
                }
                
            }// end for getMainRobotShotSprites ()            
        return mainRobotShotFrame;
    }// end method getGoldRobotShotSprites()
    
    
    public Image[] getGoldRobotShotSprites(){
        Image[] goldRobotShotFrame = new Image[Array.getLength(goldRobotShotImg)];
            for(int j=0;j<Array.getLength(goldRobotShotImg);j++){
                if(j==1) {
                    goldRobotShotFrame[j] = goldRobotShotImg[j].getScaledInstance(1075, 475, Image.SCALE_SMOOTH);
                }
                else{
                    goldRobotShotFrame[j] = goldRobotShotImg[j].getScaledInstance(475, 475, Image.SCALE_SMOOTH);
                }
                
            }// end for getMainRobotIdleSprites ()            
        return goldRobotShotFrame;
    }// end method getGoldRobotShotSprites()
        
        
        
    public Image[] getMainRobotDeathSprites(){
        Image[] mainRobotDeathFrame = new Image[Array.getLength(mainRobotDeathImg)];
            for(int j=0;j<Array.getLength(mainRobotDeathImg);j++){
                if(j<1){
                    mainRobotDeathFrame[j] = mainRobotDeathImg[j].getScaledInstance(450, 450, Image.SCALE_SMOOTH);
                }
                if(j==1){
                    mainRobotDeathFrame[j] = mainRobotDeathImg[j].getScaledInstance(500, 400, Image.SCALE_SMOOTH);
                }
                if(j==2){
                    mainRobotDeathFrame[j] = mainRobotDeathImg[j].getScaledInstance(650, 200, Image.SCALE_SMOOTH);
                }
            }// end for getMainRobotDeathSprites ()            
        return mainRobotDeathFrame;
    }// end method getMainRobotDeathSprites()
    
    public Image[] getGoldRobotDeathSprites(){
        Image[] goldRobotDeathFrame = new Image[Array.getLength(goldRobotDeathImg)];
            for(int j=0;j<Array.getLength(goldRobotDeathImg);j++){
                if(j<1){
                    goldRobotDeathFrame[j] = goldRobotDeathImg[j].getScaledInstance(450, 450, Image.SCALE_SMOOTH);
                }
                if(j==1){
                    goldRobotDeathFrame[j] = goldRobotDeathImg[j].getScaledInstance(500, 400, Image.SCALE_SMOOTH);
                }
                if(j==2){
                    goldRobotDeathFrame[j] = goldRobotDeathImg[j].getScaledInstance(650, 200, Image.SCALE_SMOOTH);
                }
            }// end for getMainRobotDeathSprites ()            
        return goldRobotDeathFrame;
    }// end method getGoldRobotDeathSprites()
    
    
    
        
        
    public Image [] getMainRobotSprites(){
        Image [] mainRobotFrame = new Image[Array.getLength(mainRobotIdleImg)+Array.getLength(mainRobotWalkImg)+
                                            Array.getLength(mainRobotReverseWalkImg)+Array.getLength(mainRobotJumpImg)+
                                            Array.getLength(mainRobotAttackImg)+Array.getLength(mainRobotShotImg)+Array.getLength(mainRobotDeathImg)]; 


            for(Image IArr: this.getMainRobotIdleSprites()){
                mainRobotFrame[z] = IArr;
                    z++;
            }
            for(Image IArr: this.getMainRobotWalkSprites()){
                mainRobotFrame[z] = IArr;
                    z++;
            }
            for(Image IArr: this.getMainRobotReverseWalkSprites()){
                mainRobotFrame[z] = IArr;
                    z++;
            }
            for(Image IArr: this.getMainRobotJumpSprites()){
                mainRobotFrame[z] = IArr;
                    z++;
            }
            for(Image IArr: this.getMainRobotAttackSprites()){
                mainRobotFrame[z] = IArr;
                    z++;
            }
            for(Image IArr: this.getMainRobotShotSprites()){
                mainRobotFrame[z] = IArr;
                    z++;
            }
            for(Image IArr: this.getMainRobotDeathSprites()){
                mainRobotFrame[z] = IArr;
                    z++;
            }
        return mainRobotFrame;
    };
    
    public Image [] getGoldRobotSprites(){
        Image [] goldRobotFrame = new Image[Array.getLength(goldRobotIdleImg)+Array.getLength(goldRobotWalkImg)+
                                            Array.getLength(goldRobotReverseWalkImg)+Array.getLength(goldRobotJumpImg)+
                                            Array.getLength(goldRobotAttackImg)+Array.getLength(goldRobotShotImg)+Array.getLength(goldRobotDeathImg)]; 
        z=0;

            for(Image IArr: this.getGoldRobotIdleSprites()){
                goldRobotFrame[z] = IArr;
                    z++;
            }
            for(Image IArr: this.getGoldRobotWalkSprites()){
                goldRobotFrame[z] = IArr;
                    z++;
            }
            for(Image IArr: this.getGoldRobotReverseWalkSprites()){
                goldRobotFrame[z] = IArr;
                    z++;
            }
            for(Image IArr: this.getGoldRobotJumpSprites()){
                goldRobotFrame[z] = IArr;
                    z++;
            }
            for(Image IArr: this.getGoldRobotAttackSprites()){
                goldRobotFrame[z] = IArr;
                    z++;
            }
            for(Image IArr: this.getGoldRobotShotSprites()){
                goldRobotFrame[z] = IArr;
                    z++;
            }
            for(Image IArr: this.getGoldRobotDeathSprites()){
                goldRobotFrame[z] = IArr;
                    z++;
            }
        return goldRobotFrame;
    };
    
    
        
        
    public Image getHealthDot(){
        Image hD;
            hD = healthDot.getScaledInstance(40, 62, Image.SCALE_SMOOTH);
        return hD;
    }// end method getHealthDot()
        
        
    
}// end class 
