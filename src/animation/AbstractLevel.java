/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animation;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;

/**
 *
 * @author Utente
 */
public abstract class AbstractLevel extends AnimationPanel {
        
    protected BufferedImage backgroundFirstLvImg;
    protected BufferedImage backgroundFirstLvPaleImg;
    protected BufferedImage backgroundSecondLvImg;
    protected BufferedImage backgroundSecondLvPaleImg;
    protected BufferedImage healthBar;
    protected BufferedImage healthBossBar;
    protected BufferedImage healthDot;
    protected static boolean isUnlocked = false;
    protected static boolean isLocked = false;
    protected static int scoreGame;
    
    public AbstractLevel(){
        super();
        try{
            backgroundFirstLvImg = ImageIO.read(new File((getClass().getResource("/Icon/Sfondi/"+ Config.getInstance().getFirstLevelBackground()+".png")).toURI()));
            backgroundSecondLvImg = ImageIO.read(new File((getClass().getResource("/Icon/Sfondi/"+ Config.getInstance().getSecondLevelBackground()+".png")).toURI()));
            healthBar = ImageIO.read(new File((getClass().getResource("/Icon/Livelli/Health_Bar_Table.png")).toURI()));
            healthDot = ImageIO.read(new File((getClass().getResource("/Icon/Livelli/Health_Dot.png")).toURI()));
            backgroundFirstLvPaleImg = ImageIO.read(new File((getClass().getResource("/Icon/Sfondi/"+ Config.getInstance().getFirstLevelBackground()+"_pale.png")).toURI()));
            backgroundSecondLvPaleImg = ImageIO.read(new File((getClass().getResource("/Icon/Sfondi/"+ Config.getInstance().getSecondLevelBackground()+"_pale.png")).toURI()));
            healthBossBar = ImageIO.read(new File((getClass().getResource("/Icon/Livelli/Boss_HP_Table.png")).toURI()));
        }
        catch (IOException e) {
            System.out.print("Immagine non trovata");
        }
        catch(URISyntaxException uri){
            System.out.print("Argomento errato");
        }   
    }// end constructor 
    
    
    @Override
    public void setAnimation(AbstractAnimation animation) {
            this.animation = animation;
    } // end method setAnimation()

    @Override
    public void setEnemyAnimation(AbstractAnimation animation) {
            this.enemyAnimation = animation;
    } // end method setEnemyAnimation()

    @Override
    public void setEnemyAnimation1(AbstractAnimation animation) {
            this.enemyAnimation1 = animation;
    } // end method setEnemyAnimation()

    
    public abstract void startEnemyAnimation();
    
    public abstract void stopEnemyAnimation();
    
    public abstract int getTimeGame();
    
    public abstract void setGoldRobot(String s);
    
    public abstract void setTimeGame(int newT);
    
    public abstract void setDot(int numbD);
    
   public abstract int getScoreGame();
   
   public abstract void setScore();
   
   public abstract void setInitScore();
   
   public abstract boolean isTerminated();
   
   public abstract void setLocked();
   
   public abstract void setUnlocked();
    
   public abstract void startMusic();
   
   public abstract void stopMusic();
   
   public abstract void setFocus(AbstractLevel lv);
    
   public abstract void setDefaultPosition();
    
}// end class 
