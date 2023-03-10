/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animation;

import java.io.File;
import java.lang.reflect.Array;
import java.net.URISyntaxException;

/**
 *
 * @author Utente
 */
public class ResourceMainRobotManager {
   
    public final static String[] MAIN_ROBOT_IDLE_PATH = new String[] {"/Icon/Personaggi/Main_Robot/01_Idle/Idle_000.png","/Icon/Personaggi/Main_Robot/01_Idle/Idle_001.png",
    "/Icon/Personaggi/Main_Robot/01_Idle/Idle_002.png","/Icon/Personaggi/Main_Robot/01_Idle/Idle_003.png","/Icon/Personaggi/Main_Robot/01_Idle/Idle_004.png",
    "/Icon/Personaggi/Main_Robot/01_Idle/Idle_005.png","/Icon/Personaggi/Main_Robot/01_Idle/Idle_006.png","/Icon/Personaggi/Main_Robot/01_Idle/Idle_007.png",
    "/Icon/Personaggi/Main_Robot/01_Idle/Idle_008.png"};
       
    
    private final static String[] MAIN_ROBOT_WALK_PATH = new String []{"/Icon/Personaggi/Main_Robot/03_Walk/Walk_000.png",
    "/Icon/Personaggi/Main_Robot/03_Walk/Walk_001.png","/Icon/Personaggi/Main_Robot/03_Walk/Walk_002.png","/Icon/Personaggi/Main_Robot/03_Walk/Walk_003.png","/Icon/Personaggi/Main_Robot/03_Walk/Walk_004.png",
    "/Icon/Personaggi/Main_Robot/03_Walk/Walk_005.png","/Icon/Personaggi/Main_Robot/03_Walk/Walk_006.png","/Icon/Personaggi/Main_Robot/03_Walk/Walk_007.png","/Icon/Personaggi/Main_Robot/03_Walk/Walk_008.png",
    "/Icon/Personaggi/Main_Robot/03_Walk/Walk_009.png","/Icon/Personaggi/Main_Robot/03_Walk/Walk_010.png","/Icon/Personaggi/Main_Robot/03_Walk/Walk_011.png"
    };
    
    private final static String[] MAIN_ROBOT_REVERSE_WALK_PATH = new String []{"/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_000.png",
    "/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_001.png","/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_002.png","/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_003.png","/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_004.png",
    "/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_005.png","/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_006.png","/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_007.png","/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_008.png",
    "/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_009.png","/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_010.png","/Icon/Personaggi/Main_Robot/04_Reverse_Walk/Walk_011.png"
    };    
    
    
    private final static String [] MAIN_ROBOT_JUMP_PATH = new String [] {
    "/Icon/Personaggi/Main_Robot/05_Jump/Jump_000.png","/Icon/Personaggi/Main_Robot/05_Jump/Jump_001.png","/Icon/Personaggi/Main_Robot/05_Jump/Jump_002.png",
    "/Icon/Personaggi/Main_Robot/05_Jump/Jump_003.png","/Icon/Personaggi/Main_Robot/05_Jump/Jump_004.png","/Icon/Personaggi/Main_Robot/05_Jump/Jump_005.png",
    "/Icon/Personaggi/Main_Robot/05_Jump/Jump_006.png","/Icon/Personaggi/Main_Robot/05_Jump/Jump_007.png","/Icon/Personaggi/Main_Robot/05_Jump/Jump_008.png",
    "/Icon/Personaggi/Main_Robot/05_Jump/Jump_009.png","/Icon/Personaggi/Main_Robot/05_Jump/Jump_010.png","/Icon/Personaggi/Main_Robot/05_Jump/Jump_011.png",
    "/Icon/Personaggi/Main_Robot/05_Jump/Jump_012.png"};
    
    private final static String [] MAIN_ROBOT_ATTACK_PATH = new String [] {
    "/Icon/Personaggi/Main_Robot/06_Attack/Attack_000.png","/Icon/Personaggi/Main_Robot/06_Attack/Attack_001.png","/Icon/Personaggi/Main_Robot/06_Attack/Attack_002.png",
    "/Icon/Personaggi/Main_Robot/06_Attack/Attack_003.png","/Icon/Personaggi/Main_Robot/06_Attack/Attack_004.png","/Icon/Personaggi/Main_Robot/06_Attack/Attack_005.png",
    "/Icon/Personaggi/Main_Robot/06_Attack/Attack_006.png","/Icon/Personaggi/Main_Robot/06_Attack/Attack_007.png","/Icon/Personaggi/Main_Robot/06_Attack/Attack_008.png",
    "/Icon/Personaggi/Main_Robot/06_Attack/Attack_009.png","/Icon/Personaggi/Main_Robot/06_Attack/Attack_010.png","/Icon/Personaggi/Main_Robot/06_Attack/Attack_011.png",
    "/Icon/Personaggi/Main_Robot/06_Attack/Attack_012.png", "/Icon/Personaggi/Main_Robot/06_Attack/Attack_013.png","/Icon/Personaggi/Main_Robot/06_Attack/Attack_014.png",
    "/Icon/Personaggi/Main_Robot/06_Attack/Attack_015.png","/Icon/Personaggi/Main_Robot/06_Attack/Attack_016.png","/Icon/Personaggi/Main_Robot/06_Attack/Attack_017.png"
    };
    
    private final static String[] MAIN_ROBOT_SHOT_PATH = new String [] {
    "/Icon/Personaggi/Main_Robot/07_Shot/Shot_000.png","/Icon/Personaggi/Main_Robot/07_Shot/Shot_001.png","/Icon/Personaggi/Main_Robot/07_Shot/Shot_002.png",
    "/Icon/Personaggi/Main_Robot/07_Shot/Shot_003.png","/Icon/Personaggi/Main_Robot/07_Shot/Shot_004.png","/Icon/Personaggi/Main_Robot/07_Shot/Shot_005.png",
    "/Icon/Personaggi/Main_Robot/07_Shot/Shot_006.png","/Icon/Personaggi/Main_Robot/07_Shot/Shot_007.png","/Icon/Personaggi/Main_Robot/07_Shot/Shot_008.png",
    "/Icon/Personaggi/Main_Robot/07_Shot/Shot_009.png","/Icon/Personaggi/Main_Robot/07_Shot/Shot_010.png","/Icon/Personaggi/Main_Robot/07_Shot/Shot_011.png",
    "/Icon/Personaggi/Main_Robot/07_Shot/Shot_012.png","/Icon/Personaggi/Main_Robot/07_Shot/Shot_013.png","/Icon/Personaggi/Main_Robot/07_Shot/Shot_014.png",
    "/Icon/Personaggi/Main_Robot/07_Shot/Shot_015.png"};
    
    private final static String[] MAIN_ROBOT_BOMB_PATH = new String[] {
    "/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_000.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_001.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_002.png",
    "/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_003.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_004.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_005.png",
    "/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_006.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_007.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_008.png",
    "/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_009.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_010.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_011.png",
    "/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_012.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_013.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_014.png",
    "/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_015.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_016.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_017.png",
    "/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_018.png","/Icon/Personaggi/Main_Robot/08_Bomb/Bomb_019.png"};
    
    private final static String[] MAIN_ROBOT_DEATH_PATH = new String[] {
    "/Icon/Personaggi/Main_Robot/13_Death/Death_000.png","/Icon/Personaggi/Main_Robot/13_Death/Death_001.png","/Icon/Personaggi/Main_Robot/13_Death/Death_002.png",
    "/Icon/Personaggi/Main_Robot/13_Death/Death_003.png","/Icon/Personaggi/Main_Robot/13_Death/Death_004.png","/Icon/Personaggi/Main_Robot/13_Death/Death_005.png",
    "/Icon/Personaggi/Main_Robot/13_Death/Death_006.png","/Icon/Personaggi/Main_Robot/13_Death/Death_007.png","/Icon/Personaggi/Main_Robot/13_Death/Death_008.png",
    "/Icon/Personaggi/Main_Robot/13_Death/Death_009.png","/Icon/Personaggi/Main_Robot/13_Death/Death_010.png","/Icon/Personaggi/Main_Robot/13_Death/Death_011.png",
    "/Icon/Personaggi/Main_Robot/13_Death/Death_012.png","/Icon/Personaggi/Main_Robot/13_Death/Death_013.png","/Icon/Personaggi/Main_Robot/13_Death/Death_014.png"};
    
    
    private static File[] mainRobotIdleSpritesFile = null;
    private static File[] mainRobotWalkSpritesFile = null;
    private static File[] mainRobotReverseWalkSpritesFile = null;
    private static File[] mainRobotJumpSpritesFile = null;
    private static File[] mainRobotAttackSpritesFile = null;
    private static File[] mainRobotShotSpritesFile = null;
    private static File[] mainRobotBombSpritesFile = null;
    private static File[] mainRobotDeathSpritesFile = null;
   
    
    public ResourceMainRobotManager(){
        
        
    } //end constructor
    
    
    
    public File[] getMainRobotIdleSprites(){
                
        if(mainRobotIdleSpritesFile == null){
            try{
                for(int i=0;i<Array.getLength(MAIN_ROBOT_IDLE_PATH);i++){
                    mainRobotIdleSpritesFile[i] = new File(getClass().getResource(MAIN_ROBOT_IDLE_PATH[i]).toURI());
                }                
            }
            catch(URISyntaxException uriSE){
                uriSE.printStackTrace();
            }
        }// end if
        
        return mainRobotIdleSpritesFile;
    }// end method getMainRobotIdleSprites()
    
    public File[] getMainRobotWalkSprites(){
        if(mainRobotWalkSpritesFile == null){
            try{
                for(int i=0;i<Array.getLength(MAIN_ROBOT_WALK_PATH);i++){
                    mainRobotWalkSpritesFile[i] = new File(getClass().getResource(MAIN_ROBOT_WALK_PATH[i]).toURI());
                }
            }
            catch(URISyntaxException uriSE){
                uriSE.printStackTrace();
            }
        }// end if
        
        return mainRobotWalkSpritesFile;
    }// end method getMainRobotWalkSprites()
    
    
    
    public File[] getMainRobotReverseWalkSprites(){
        if(mainRobotReverseWalkSpritesFile == null){
            try{
                for(int i=0;i<Array.getLength(MAIN_ROBOT_REVERSE_WALK_PATH);i++){
                    mainRobotReverseWalkSpritesFile[i] = new File(getClass().getResource(MAIN_ROBOT_REVERSE_WALK_PATH[i]).toURI());
                }
            }
            catch(URISyntaxException uriSE){
                uriSE.printStackTrace();
            }
        }// end if
        
        return mainRobotReverseWalkSpritesFile;
    }// end method getMainRobotWalkSprites()
    
    
    
    
    public File[] getMainRobotJumpSprites(){
        if(mainRobotJumpSpritesFile == null){
            try{
                for(int i=0;i<Array.getLength(MAIN_ROBOT_JUMP_PATH);i++){
                    mainRobotJumpSpritesFile[i] = new File(getClass().getResource(MAIN_ROBOT_JUMP_PATH[i]).toURI());
                }
            }
            catch(URISyntaxException uriSE){
                uriSE.printStackTrace();
            }
        }// end if
        
        return mainRobotJumpSpritesFile;
    }// end method getMainRobotJumpSprites()
    
    
    public File[] getMainRobotAttackSprites(){
        if(mainRobotAttackSpritesFile == null){
            try{
                for(int i=0;i<Array.getLength(MAIN_ROBOT_ATTACK_PATH);i++){
                    mainRobotAttackSpritesFile[i] = new File(getClass().getResource(MAIN_ROBOT_ATTACK_PATH[i]).toURI());
                }
            }
            catch(URISyntaxException uriSE){
                uriSE.printStackTrace();
            }
        }// end if
        
        return mainRobotAttackSpritesFile;
    }// end method getMainRobotJumpSprites()
    
    public File[] getMainRobotShotSprites(){
        if(mainRobotShotSpritesFile == null){
            try{
                for(int i=0;i<Array.getLength(MAIN_ROBOT_SHOT_PATH);i++){
                    mainRobotShotSpritesFile[i] = new File(getClass().getResource(MAIN_ROBOT_SHOT_PATH[i]).toURI());
                }
            }
            catch(URISyntaxException uriSE){
                uriSE.printStackTrace();
            }
        }// end if
        
        return mainRobotShotSpritesFile;
    }// end method getMainRobotShotSprites()
    
    
    public File[] getMainRobotBombSprites(){
        if(mainRobotBombSpritesFile == null){
            try{
                for(int i=0;i<Array.getLength(MAIN_ROBOT_BOMB_PATH);i++){
                    mainRobotBombSpritesFile[i] = new File(getClass().getResource(MAIN_ROBOT_BOMB_PATH[i]).toURI());
                }
            }
            catch(URISyntaxException uriSE){
                uriSE.printStackTrace();
            }
        }// end if
        
        return mainRobotBombSpritesFile;
    }// end method getMainRobotBombSprites()
    
    public File[] getMainRobotDeathSprites(){
        if(mainRobotDeathSpritesFile == null){
            try{
                for(int i=0;i<Array.getLength(MAIN_ROBOT_DEATH_PATH);i++){
                    mainRobotDeathSpritesFile[i] = new File(getClass().getResource(MAIN_ROBOT_DEATH_PATH[i]).toURI());
                }
            }
            catch(URISyntaxException uriSE){
                uriSE.printStackTrace();
            }
        }// end if
        
        return mainRobotDeathSpritesFile;
    }// end method getMainRobotDeathSprites()
    
    
 
}// end class
