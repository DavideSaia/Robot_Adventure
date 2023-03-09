/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animation;


import static animation.AbstractAnimation.isWeaponUnlocked;
import view.StringCreator;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import soundtrack.AudioClip;


/**
 *
 * @author Utente
 */
public class FirstLevelAnimationPanel extends AbstractLevel {
    
    private GreenZombieAnimation greenZombie;
    private PirateZombieAnimation pirateZombie;
    private AbstractAnimation blueRobot;
    private StringCreator sC;
    private Font scoreFont;
    private Color scoreColor;
    private AudioClip aC;
    
  
   
    
        

	public FirstLevelAnimationPanel(AbstractAnimation animation) {
            super();
            this.animation = animation;           
	} // end constructor

	public FirstLevelAnimationPanel() {
            super();
            sC = new StringCreator();
            
            scoreFont = sC.applyFont(StringCreator.FONTPDK, 72);
            scoreColor = sC.newColor(0, 0, 0);
            
            
            blueRobot = new MainRobotAnimation(this);
            this.setAnimation(blueRobot);
            this.addKeyListener(blueRobot);
    
            greenZombie = new GreenZombieAnimation(this);
            super.setEnemyAnimation(greenZombie);
            greenZombie.setRobotAnimation(blueRobot);
            
            pirateZombie = new PirateZombieAnimation(this);
            super.setEnemyAnimation1(pirateZombie);
            pirateZombie.setRobotAnimation(blueRobot);
            
            aC = new AudioClip();
            
              
	} // end constructor
        
	

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
                
                
                if(animation.numberOfDot > 5){
                g.drawImage(super.backgroundFirstLvImg, 0, 0, null);
                }
                else{
                g.drawImage(super.backgroundFirstLvPaleImg, 0, 0, null);
                }
                
                g.drawImage(healthBar, 25, 25, 400, 75, null);
		animation.show(g, 80, 525);
                enemyAnimation.show(g, 1600, 590);
                if(this.enemyAnimation1!=null){
                    enemyAnimation1.show(g, 2100, 590);
                }
                
                // SCORE STRING 
                this.setScore();
                sC.stringDrawer(g, this.getScore(), scoreFont, scoreColor, 1500, 80);
                // END SCORE STRING

	} // end method paintComponent()
        
              
        private String getScore(){
            String s;
                s= String.valueOf(this.scoreGame);
            return s;
        }// end method getScore();
        
        
        @Override
        public int getScoreGame(){
            return scoreGame;
        };
        
        @Override
        public void setScore(){
            scoreGame =  AbstractAnimation.counterZombieDeath*100;
        }// end method setScore
        
        @Override
        public void setInitScore(){
            AbstractAnimation.counterZombieDeath=0;
        }
        
        
        @Override
        public void startEnemyAnimation(){
            if(isLocked==false){
                greenZombie.getZombieTimer().start();
                pirateZombie.getZombieTimer().start();
            }
        }// end method startEnemyAnimation()
        
        @Override
        public void stopEnemyAnimation(){
            if(isLocked==false){
                greenZombie.getZombieTimer().stop();
                greenZombie.getZombieAttackTimer().stop();
                greenZombie.getZombieHurtTimer().stop();
                greenZombie.getZombieDeathTimer().stop();
                pirateZombie.getZombieTimer().stop();
                pirateZombie.getZombieAttackTimer().stop();
                pirateZombie.getZombieHurtTimer().stop();
                pirateZombie.getZombieDeathTimer().stop();
            }
        }// end method startZombieAnimation()
        
        
       
        @Override
        public int getTimeGame(){
            return blueRobot.getGameTime();
        }
        
        @Override
        public void setGoldRobot(String s){
            blueRobot.setRobotFrame(s);
        }// end method setGoldRobot()
        
        @Override
        public void setTimeGame(int newT){
            blueRobot.setGameTime(newT);
        }// end method setTimeGame()
        
        @Override
        public void setDot(int numbD){
            blueRobot.setNumberOfDot(numbD);
        }// end method setDot
        
        @Override
        public boolean isTerminated(){
            return true;
        };
        
        
        @Override
        public void setLocked(){
            isLocked=true;
        }
        
        
        @Override
        public void setUnlocked(){
            isLocked = false;
        }
        
        @Override
        public void startMusic(){
            
            try{
                aC.getGameClip().open(aC.getGameAudio());
                aC.getGameClip().start();
                aC.getGameClip().loop(40);  
            }
            catch(Exception e){
                e.printStackTrace();
            }
        
        }// end method setMusic 
        
        @Override
        public void stopMusic(){
            aC.getGameClip().close();
            
            try{
                aC.getGameAudio().close();
            }
            catch(IOException ioe){
                ioe.printStackTrace();
            }
        }// end method stop music 
        
        @Override
        public void setFocus(AbstractLevel lv){
            if(isLocked==false){
                lv.requestFocus();
            }
        }// end method setFocus
        
        
         @Override
        public void setDefaultPosition(){
            blueRobot.setInitPosition();
            greenZombie.setInitPosition();
            pirateZombie.setInitPosition();
        }
        
        
        
}// end class
