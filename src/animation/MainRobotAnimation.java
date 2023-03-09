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
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.Timer;

/**
 *
 * @author Utente
 */
public class MainRobotAnimation extends AbstractAnimation {
    
private final static int WALK_ANIMATION_DELAY = 135; //milliseconds
private final static int IDLE_ANIMATION_DELAY = 250; //milliseconds
private final static int JUMP_ANIMATION_DELAY = 300;
private final static int ATTACK_ANIMATION_DELAY = 380;
private final static int SHOT_ANIMATION_DELAY = 725;
private final static int DEATH_ANIMATION_DELAY = 800;

    private final MainRobotSprites mRSprites;
    private int posX;
    private int xShift=0;
    private int yShift=0;
    private int moveX;
    private int xShiftDot;
    private int countAttack =0;
    private final Image healthDot;
    private final Timer walkTimer;
    private final Timer idleTimer;
    private final Timer jumpTimer;
    private final Timer attackTimer;
    private final Timer shotTimer;
    private final Timer deathTimer;
    private boolean isDead = false;
    private boolean isOpen = false;
    private final AudioClip aC;
    
    
    
    public MainRobotAnimation(AnimationPanel animPanel){
        super(null,null, animPanel);
        mRSprites = new MainRobotSprites();
        this.currentFrameIndex=0;
        this.animFrameArray = mRSprites.getMainRobotSprites();
        this.walkTimer = new Timer(WALK_ANIMATION_DELAY,this);
        this.idleTimer = new Timer(IDLE_ANIMATION_DELAY,this);
        this.jumpTimer = new Timer (JUMP_ANIMATION_DELAY,this);
        this.attackTimer = new Timer (ATTACK_ANIMATION_DELAY,this);
        this.shotTimer = new Timer (SHOT_ANIMATION_DELAY,this);
        this.deathTimer = new Timer (DEATH_ANIMATION_DELAY,this);
        this.numberOfDot = 8;
        healthDot = mRSprites.getHealthDot();
        aC = new AudioClip();
    };
        
    @Override
    public char getId(){
        return id;
    }
    
    
    @Override
    public int getAnimationWidth(){
        return this.animFrameArray[this.currentFrameIndex].getWidth(null);
    };
    
    @Override
    public int getAnimationHeight(){
        return this.animFrameArray[this.currentFrameIndex].getHeight(null);
    };
    
    @Override
    public void showCurrentFrame(Graphics g, int x, int y){
        
        
        //HEALTH DOT
        
        this.getShiftDot();
        
        for(int i=0;i<this.numberOfDot;i++){
                if(i!=0){
                    
                    xShiftDot += 41;
                }
            g.drawImage(healthDot, xShiftDot, 31, null);
        }// end for cicle   
        
        // END HEALTH DOT
        
        
        Image frameImg = this.animFrameArray[this.currentFrameIndex];
        
        posX = x;
        moveX = (posX + xShift - mRSprites.standardWidth);
        int moveY = (y + yShift - mRSprites.standardHeight);
        
        if(moveY<30){
            yShift=50;
        }
        
        
        
        if(this.currentFrameIndex==18){
            this.deathTimer.stop();
            stopDeathMusic();
        }
          
       
        g.drawImage(frameImg, moveX  ,moveY , null);
        
        if(this.currentFrameIndex == 17 && this.deathTimer.isRunning()){
            yShift = 275;
        }
        
        if(this.numberOfDot == 0){
            if(isDead==false){
                this.idleTimer.stop();
                this.walkTimer.stop();
                this.jumpTimer.stop();
                this.attackTimer.stop();
                this.shotTimer.stop();
                this.deathTimer.start();
                this.currentFrameIndex=15;
                startDeathMusic();
                isDead = true;
                id ='z';
            }// end if isDead
        }
        
        
   
    }; // end method showCurrentFrame()
    
    @Override
    public Image getCurrentFrame (){
        Image currentFrame = this.animFrameArray[this.currentFrameIndex];
            return currentFrame;
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
    public void actionPerformed(ActionEvent evt) {
        this.animPanel.repaint();
        if(gameTime>0){
        
        
        
            if(isDead == false){
                if(id == 's'){
                    yShift=0;
                    this.currentFrameIndex++;
                    this.currentFrameIndex %= 2;
                    if(this.currentFrameIndex == 1){
                            this.idleTimer.stop();
                        }  
                } // end if idle  

                if(id == 'd'){
                    yShift=0;
                    this.currentFrameIndex++;
                    this.currentFrameIndex %= 5;
                    if(this.currentFrameIndex==4){
                        this.walkTimer.stop();
                    }
                    if(this.getMaxX()<(1825 - mRSprites.standardWidth)){
                        xShift +=75;
                    }
                } // end if walk  
                if(id == 'a'){
                    yShift=0;
                    this.currentFrameIndex++;
                    this.currentFrameIndex %= 8;
                    if(this.currentFrameIndex==7){
                        this.walkTimer.stop();
                    }
                    if(this.getCurrentX()>30){
                        xShift -=75;
                    }
                } // end if ReverseWalk 

                if(id == 'w'){
                    this.currentFrameIndex++;
                    this.currentFrameIndex %= 11;
                    if(this.currentFrameIndex==10){
                        this.jumpTimer.stop();
                    }
                    if((this.getMaxX()<(1750 - mRSprites.standardWidth))){
                        xShift +=250;
                        yShift=50;
                    }
                    if(this.getMaxX()>(1850 - mRSprites.standardWidth)){
                        xShift -=150;
                        yShift = 50;
                    }
                    if(this.currentFrameIndex==9){
                        yShift -=500;
                    }
                } // end if Jump 

                if(id == 'e'){
                    yShift=10;
                    this.currentFrameIndex++;
                    this.currentFrameIndex %= 13;
                    if(this.currentFrameIndex==12){
                        this.attackTimer.stop();
                        countAttack++;
                    }
                    if(this.attackTimer.isRunning()==false){
                        id='z';
                    }
                } // end if Attack
                
                if(isWeaponUnlocked == true){
                    if(id == 'q'){
                        yShift = -5;
                        this.currentFrameIndex++;
                        this.currentFrameIndex%=16;
                        if(this.currentFrameIndex==15){
                            this.shotTimer.stop();
                        }
                    if(this.shotTimer.isRunning()==false){
                        id='z';
                    }
                }// end if shot
            }

        }// end if isDead

                if(this.deathTimer.isRunning()){

                    this.currentFrameIndex %=3;
                    this.currentFrameIndex += 16;
                    
                    if(this.getMaxX()<(1825 - mRSprites.standardWidth)){
                        xShift += 100;
                    }
                } // end if death
            } // end if gameTime
                gameTime--;
                
               
                
    } // end method actionPerformed()

    @Override
    public void keyTyped(KeyEvent e){
        id = e.getKeyChar();
        if(isDead==false){
            if(id == 'd'){
                this.attackTimer.stop();
                this.idleTimer.stop();
                this.jumpTimer.stop();
                this.walkTimer.start();
                this.currentFrameIndex = 1;
            }

            if(id == 's'){
                this.walkTimer.stop();
                this.attackTimer.stop();
                this.jumpTimer.stop();
                this.idleTimer.start();
                this.currentFrameIndex = 1;
            }

            if(id == 'a'){
                this.attackTimer.stop();
                this.jumpTimer.stop();
                this.idleTimer.stop();
                this.walkTimer.start();
                this.currentFrameIndex = 4;
               //System.out.print(this.getMaxX()+"\n");
            }

            if(id == 'w'){
                this.attackTimer.stop();
                this.idleTimer.stop();
                this.walkTimer.stop();
                this.jumpTimer.start();
                this.currentFrameIndex = 7;
            }

            if(id == 'e'){
                this.jumpTimer.stop();
                this.walkTimer.stop();
                this.idleTimer.stop();
                this.attackTimer.start();
                this.currentFrameIndex = 11;
            }
            
            if(isWeaponUnlocked==true){
                if(id=='q'){
                    this.attackTimer.stop();
                    this.jumpTimer.stop();
                    this.walkTimer.stop();
                    this.idleTimer.stop();
                    this.shotTimer.start();
                    this.currentFrameIndex = 13;
                }
            }
            
        }// end if isDead 
                      
    };// end method keyTyped()

    @Override
    public void keyPressed(KeyEvent e){};// end method KeyPressed()



    @Override
    public void keyReleased (KeyEvent e){

    };// end method KeyReleased
        
    
    private void getShiftDot (){
        this.xShiftDot = (int)(32 - (1920-(Toolkit.getDefaultToolkit().getScreenSize().getWidth())));
    }
    
       
        
    @Override
    public void setRobotFrame(String g){
        if(g.equals("Gold Robot")){
            this.animFrameArray = mRSprites.getGoldRobotSprites();
        }
    }// end method setRobotFrame
        
    
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
    
    public void setInitialPosition(){
    
    
    }// end method setInitialPosition
    
    @Override
    public void setInitPosition(){
        moveX = 80;
    };
    
}// end class 
