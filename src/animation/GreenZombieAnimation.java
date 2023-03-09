/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animation;

import soundtrack.AudioClip;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

/**
 *
 * @author Utente
 */
public class GreenZombieAnimation extends AbstractAnimation{
    

private static int ZOMBIE_ANIMATION_DELAY = 280;
private static int ATTACK_ANIMATION_DELAY = 620;
private static int HURT_ANIMATION_DELAY = 775;
private static int DEATH_ANIMATION_DELAY = 825;
    
    
    private int posX;
    private int xShift=0;
    private int moveX;
    private int yShift=0;
    private int hit =0;
    private int count= 0;
    private boolean isStrike = false;
    private boolean isDead = false;
    private boolean isDeadTerminated = false;
    private int standardWidth = (int)(1920 - (Toolkit.getDefaultToolkit().getScreenSize().getWidth()));
    private int standardHeight = (int)(1080 - (Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
    
    private ZombieSprite zombieSp;
    private AbstractAnimation mrA;
    private Timer zombieTimer;
    private Timer zombieAttackTimer;
    private Timer zombieHurtTimer;
    private Timer zombieDeathTimer;
    private AudioClip aC;
    
        public GreenZombieAnimation(AnimationPanel animPanel){
            super(null,null,animPanel);
            zombieSp = new ZombieSprite();
            this.enemyFrameArray = zombieSp.getGreenZombieSprite();
            zombieTimer = new Timer(ZOMBIE_ANIMATION_DELAY,this);
            zombieAttackTimer = new Timer (ATTACK_ANIMATION_DELAY,this);
            zombieHurtTimer = new Timer (HURT_ANIMATION_DELAY,this);
            zombieDeathTimer = new Timer (DEATH_ANIMATION_DELAY,this);
            this.currentEnemyFrameIndex =2;
            aC = new AudioClip();
        }// end constructor
    
    
        
    @Override
    public void showCurrentFrame(Graphics g, int x, int y){
        
        Image frameImg = this.enemyFrameArray[this.currentEnemyFrameIndex];
        
        posX = x;
        moveX = (posX + xShift - standardWidth);
        int moveY = (y + yShift - standardHeight);
        
        if(isDeadTerminated== true && this.zombieDeathTimer.isRunning()==false){
            xShift = 350;
            this.zombieAttackTimer.stop();
            this.zombieHurtTimer.stop();
            this.zombieTimer.start();  
            isStrike = false;
            this.currentEnemyFrameIndex=2;
            isDeadTerminated = false;
            isDead = false;
            hit=0;
        }
        
        
        g.drawImage(frameImg, moveX  ,moveY , null);
        
        
   
    }; // end method showCurrentFrame()   
        
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        this.animPanel.repaint(this.getCurrentX()-600, 500, this.getMaxX(),580);
        
        if(gameTime>0){
            if(isDead == false){            

                if(this.getCurrentX() > mrA.getMaxX()+125 && this.zombieHurtTimer.isRunning()==false || (this.getCurrentX()< mrA.getCurrentX()-150  && this.zombieDeathTimer.isRunning()==false) ){
                    yShift=0;
                    this.currentEnemyFrameIndex++;
                    this.currentEnemyFrameIndex%=3;

                    if(moveX>150){
                        xShift -= 150;
                    }
                    else{
                        xShift += 1500;
                    }
                }// end if run

                if(this.getCurrentX() <= mrA.getMaxX()+125 && this.getCurrentX() > mrA.getCurrentX() && this.zombieHurtTimer.isRunning()==false){

                    this.zombieAttackTimer.start();
                    this.zombieTimer.stop();
                    yShift = 50;
                    this.currentEnemyFrameIndex%=2;
                    this.currentEnemyFrameIndex +=3;
                    if(count%7 == 6 && this.currentEnemyFrameIndex==4){
                        mrA.numberOfDot--;
                    }
                    if(this.currentEnemyFrameIndex==4){
                        count++;
                    }
                    if(mrA.numberOfDot<1 && this.currentEnemyFrameIndex==4){
                        this.zombieAttackTimer.stop();
                    }
                }

                if((this.getCurrentX() <= mrA.getMaxX()+150 && this.getMaxX() >=  mrA.getMaxX()) && mrA.getId() == 'e' ){
                    hit++;            
                }

                //HURT 

                if(hit==1 && isStrike == false || this.zombieHurtTimer.isRunning()){
                    this.zombieTimer.stop();
                    this.zombieAttackTimer.stop();
                    yShift = 0;
                    this.zombieHurtTimer.start();
                    this.currentEnemyFrameIndex%=2;
                    this.currentEnemyFrameIndex += 5;
                    if(this.currentEnemyFrameIndex==6){
                        this.zombieHurtTimer.stop();
                        isStrike=true;
                    if(isStrike==true && this.zombieHurtTimer.isRunning()==false){
                            this.zombieTimer.restart();
                        }
                    }
                }

                //END HURT

            } // end if isDead 

                if(hit>1){
                    yShift = 50;
                    isDead = true;
                    
                    this.zombieDeathTimer.start();
                    this.zombieTimer.stop();
                    this.zombieHurtTimer.stop();
                    this.zombieAttackTimer.stop();
                    this.currentEnemyFrameIndex %=3;
                    this.currentEnemyFrameIndex += 7;
                    
                    
                    
                    if(this.currentEnemyFrameIndex==8){
                        yShift=160;
                    }
                    if(this.currentEnemyFrameIndex==9){
                        this.zombieDeathTimer.stop();
                        yShift=210;
                        isDeadTerminated =true;
                        counterZombieDeath++;

                    }
                }// end if hit >1

        }// end if gameTime
    }// end method ActionPerformed
    
    
    
    
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
        return this.enemyFrameArray[this.currentEnemyFrameIndex].getWidth(null);
    };
    
    @Override
    public int getAnimationHeight(){
        return this.enemyFrameArray[this.currentEnemyFrameIndex].getHeight(null);
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
    
    public Timer getZombieTimer(){
        return zombieTimer;
    }// end getZombieTimer()
    
    public Timer getZombieAttackTimer(){
        return zombieAttackTimer;
    }// ene getZombieAttackTimer()
    
    public Timer getZombieHurtTimer(){
        return zombieHurtTimer;
    }// ene getZombieHurtTimer()
    
    public Timer getZombieDeathTimer(){
        return zombieDeathTimer;
    }// ene getZombieAttackTimer()
    
    
    @Override
    public void setInitPosition(){
        moveX = 1600;
    };
    
}// end class
