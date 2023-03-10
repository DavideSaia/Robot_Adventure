/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animation;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.Timer;
import soundtrack.AudioClip;

/**
 *
 * @author Utente
 */
public class VioletRobotAnimation extends AbstractAnimation{
    
    private static final int VIOLET_RUN_ANIMATION_DELAY = 230;
    private static final int VIOLET_SHOT_ANIMATION_DELAY = 725;
    private final static int VIOLET_ATTACK_ANIMATION_DELAY = 380;
    private final static int VIOLET_DEATH_ANIMATION_DELAY = 900;
    
    private int posX;
    private int xShift=0;
    private int moveX;
    private int yShift=0;
    private int shotCount= 0;
    private int attackCount = 0;
    private boolean isStrike = false;
    private boolean isDead = false;
    private boolean isDeadTerminated = false;
    private boolean isFirstHp = true;
    private boolean isSecondHp = true;
    private boolean isThirdHp = true;
    private int standardWidth = (int)(1920 - (Toolkit.getDefaultToolkit().getScreenSize().getWidth()));
    private int standardHeight = (int)(1080 - (Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
    
    
    private VioletRobotSprites vrS;
    private AbstractAnimation mrA;
    private Timer runTimer;
    private Timer shotTimer;
    private Timer attackTimer;
    private Timer deathTimer;
    
    private AudioClip aC;
    
    
    public VioletRobotAnimation (AnimationPanel animPanel){
        super(null,null,animPanel);
        vrS = new VioletRobotSprites();
        this.bossFrameArray = vrS.getVioletRobotSprites();
        this.currentBossFrameIndex = 1;
        AbstractAnimation.hitAttack=0;
        AbstractAnimation.hitShot=0;
        runTimer = new Timer(VIOLET_RUN_ANIMATION_DELAY,this);
        shotTimer = new Timer (VIOLET_SHOT_ANIMATION_DELAY,this);
        attackTimer = new Timer (VIOLET_ATTACK_ANIMATION_DELAY,this);
        deathTimer = new Timer (VIOLET_DEATH_ANIMATION_DELAY,this);
        aC = new AudioClip();
    }// end constructor
    
    
    
    @Override
    public void showCurrentFrame(Graphics g, int x, int y){
        
        if(isFirstHp==true){
            g.drawImage(vrS.hpBoss1,525,55,150,30,null);
        }
        if(isSecondHp==true){
            g.drawImage(vrS.hpBoss2, 675, 55, 650, 30, null);
        }
        if(isThirdHp==true){
            g.drawImage(vrS.hpBoss3,1325,55,150,30,null);
        }
        g.drawImage(vrS.bossHead, 1525, 30, 125, 125, null);
        
        
        Image frameImg = this.bossFrameArray[this.currentBossFrameIndex];
        
        posX = x;
        moveX = (posX + xShift - this.getAnimationWidth() - standardWidth);
        int moveY = (y + yShift - standardHeight);
        
        
         // START DEAD
        
        if(isThirdHp==false){
            if(isDead == false){
                this.deathTimer.start();
                this.runTimer.stop();
                this.attackTimer.stop();
                this.shotTimer.stop();
                this.currentBossFrameIndex=9;
                startDeathMusic();
                isDead=true;
            }
        }
        
        

        if(this.currentBossFrameIndex==12 && isDead == true){
                this.deathTimer.stop();
                stopDeathMusic();
                this.isDeadTerminated=true;
        }
       
        // END DEAD
        
        
        g.drawImage(frameImg, moveX  ,moveY , null);
        
        if(this.currentBossFrameIndex==11 && this.deathTimer.isRunning()==true){
                yShift = 250;
        }     
   

    }; // end method showCurrentFrame()
   
    
    
    @Override
    public void actionPerformed (ActionEvent evt){
        this.animPanel.repaint();
        
        if(isDead == false){
            
            if(this.getCurrentX() > mrA.getMaxX()+600   ||  this.getCurrentX()-450 < mrA.getMaxX()&& this.getCurrentX()> mrA.getCurrentX()+442 || this.getCurrentX()<mrA.getCurrentX()+150){
                    yShift=0;
                    this.shotTimer.stop();
                    this.attackTimer.stop();
                    this.runTimer.start();
                    this.currentBossFrameIndex++;
                    this.currentBossFrameIndex%=2;

                    if(moveX>0 && this.getCurrentX()> mrA.getMaxX()-40 || this.getCurrentX()< mrA.getCurrentX()+233){
                        xShift -= 125;
                    }
                    if(moveX<0){
                        xShift += 1500;
                    }
            }// end if run
            
            
            if(this.getCurrentX()<= mrA.getMaxX()+600 && this.getCurrentX()-450>= mrA.getMaxX()){
                    
                    this.shotTimer.start();
                    this.runTimer.stop();
                    this.attackTimer.stop();
                    yShift = -25;
                    
                    
                    this.currentBossFrameIndex%=3;
                    this.currentBossFrameIndex += 7;
                    
                    
                    
                    if(shotCount%4==3 && this.currentBossFrameIndex==8){
                        mrA.numberOfDot--;
                    }
                    
                    if(currentBossFrameIndex==8){
                        shotCount++;
                    }
                    if(mrA.numberOfDot<1 && this.currentBossFrameIndex==8){
                    this.shotTimer.stop();
                    }
            
            }// end if shot 
        
            
            if(this.getCurrentX()< mrA.getMaxX()+200 && this.getCurrentX() > mrA.getCurrentX()&& this.shotTimer.isRunning()==false){
                yShift = -20;
                
                this.runTimer.stop();
                this.shotTimer.stop();
                this.attackTimer.start();
      
                this.currentBossFrameIndex%=2;
                this.currentBossFrameIndex+=5;
                
                if(attackCount%6==5 && this.currentBossFrameIndex==6){
                    mrA.numberOfDot--;
                }
                if(this.currentBossFrameIndex==6){
                    attackCount++;
                }
                if(mrA.numberOfDot<1 && this.currentBossFrameIndex==6){
                    this.attackTimer.stop();
                }

            }// end if attack 
            
            // START HIT ATTACK
            
            if(id == 'e' &&  this.getCurrentX() <= mrA.getMaxX()+150 && this.getMaxX() >=  mrA.getMaxX()){
                hitAttack++;            
            }
            
            if(hitAttack%21==20){
                isFirstHp = false;
            }
            if(hitAttack%31==30){
                isSecondHp = false;
            }
            if(hitAttack%41==40){
                isThirdHp = false;
            }
        
            // END HIT ATTACK
            
            
            // START HIT SHOT 
            
            if(id == 'q' &&  this.getCurrentX() <= mrA.getMaxX()+150 && this.getMaxX() >=  mrA.getMaxX()  ){
                hitShot++;            
            }
            
            if(hitShot%11==10){
                isFirstHp=false;
            }
            if(hitShot%21==20){
                isSecondHp=false;
            }
            if(hitShot%31==30){
                isThirdHp=false;
            }
            
            // END HIT SHOT    

        }// end if isDead
        
        // START DEAD
        
        if(this.deathTimer.isRunning()==true){
            
                this.currentBossFrameIndex%=3;
                this.currentBossFrameIndex+=10;
        }
            
        // END DEAD

    }// end actionPerformed

    @Override
    public void setRobotAnimation(AbstractAnimation mra){
        this.mrA = mra;
    }
    
    
    @Override
    public Image getCurrentFrame (){
        Image currentFrame = this.animFrameArray[this.currentFrameIndex];
            return currentFrame;
    };
        
    @Override
    public int getAnimationWidth(){
        return this.bossFrameArray[this.currentBossFrameIndex].getWidth(null);
    };
    
    @Override
    public int getAnimationHeight(){
        return this.bossFrameArray[this.currentBossFrameIndex].getHeight(null);
    };
    
   
    @Override
    public int getCurrentX (){
        int currentX= moveX;
        return currentX;
    } // end method getCurrentX;
    
    @Override
    public int getMaxX (){
        int maxX;
            maxX = this.getCurrentX() + this.getAnimationWidth();
        return maxX;
    }// end method maxX()
    
    @Override
    public char getId(){
        return 'z';
    };
    
    public Timer getRunTimer(){
        return this.runTimer;
    }
    
    public Timer getAttackTimer(){
        return this.attackTimer;
    }
    public Timer getShotTimer(){
        return this.shotTimer;
    }
    public Timer getDeathTimer(){
        return this.deathTimer;
    }
    
    public int getShotCount(){
        return AbstractAnimation.hitShot;
    }
    
    public int getAttackCount(){
        return AbstractAnimation.hitAttack;
    }
    
    public void setShotCount(int newC){
        this.shotCount=newC;
    }
    
    public void setAttackCount(int newC){
        this.attackCount=newC;
    }
    
    public boolean isTerminated(){
        return isDeadTerminated;
    }
    
    
    private void startDeathMusic(){
       try{
               aC.getRobotDeathClip().open(aC.getRobotDeathAudio());
               aC.getRobotDeathClip().start(); 
           }
           catch(Exception e){
               e.printStackTrace();
           }
   }// end method startDeathMusic
    
    
    public void stopDeathMusic(){
        aC.getRobotDeathClip().close();

        try{
            aC.getRobotDeathAudio().close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }// end method stopDeathMusic 
    
    
    @Override
    public void setInitPosition(){
        moveX = 1600 + this.getAnimationWidth();
    };
    
    public void setInitialLife(){
        isFirstHp = true;
        isSecondHp = true;
        isThirdHp = true;
        isDead = false;
        isDeadTerminated = false;
        hitShot = 0;
        hitAttack = 0;
    }
    
    
    
}// end class 
