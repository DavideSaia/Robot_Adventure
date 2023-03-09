/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import soundtrack.AudioClip;
import view.StringCreator;

/**
 *
 * @author Utente
 */
public class SecondLevelAnimationPanel extends AbstractLevel{
    
    private VioletRobotAnimation violetRobot;
    
    private AbstractAnimation blueRobot;
    private StringCreator sC;
    private Font scoreFont;
    private Color scoreColor;
    private AudioClip aC;
    
    
  
   
    
        

	public SecondLevelAnimationPanel(AbstractAnimation animation) {
            super();
            this.animation = animation;           
	} // end constructor

	public SecondLevelAnimationPanel() {
            super();
            sC = new StringCreator();
            
            scoreFont = sC.applyFont(StringCreator.FONTPDK, 72);
            scoreColor = sC.newColor(0, 0, 0);
            
            
            blueRobot = new MainRobotAnimation(this);
            this.setAnimation(blueRobot);
            this.addKeyListener(blueRobot);
            
            violetRobot = new VioletRobotAnimation(this);
            violetRobot.setRobotAnimation(blueRobot);
            super.setBossAnimation(violetRobot);
            
            aC = new AudioClip();
 
              
	} // end constructor
        
	

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
                
                
                if(animation.numberOfDot > 5){
                g.drawImage(super.backgroundSecondLvImg, 0, 0, null);
                }
                else{
                g.drawImage(super.backgroundSecondLvPaleImg, 0, 0, null);
                }
                
                g.drawImage(healthBar, 25, 25, 400, 75, null);
                g.drawImage(healthBossBar, 500, 45, 1000, 50, null);
		animation.show(g, 80, 525);
                bossAnimation.show(g, 1600, 550);
                
                
                // SCORE STRING 
                this.setScore();
                sC.stringDrawer(g, this.getScore(), scoreFont, scoreColor, 25, 175);
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
            scoreGame +=  violetRobot.getAttackCount()*5+violetRobot.getShotCount()*10;
        }// end method setScore
        
        @Override
        public void setInitScore(){
            violetRobot.setAttackCount(0);
            violetRobot.setShotCount(0);
            AbstractAnimation.hitAttack=0;
            AbstractAnimation.hitShot=0;
        }
        
        
        @Override
        public void startEnemyAnimation(){
            if(isUnlocked == true){
                violetRobot.getRunTimer().start();
            }
        }// end method startZombieAnimation()
        
        @Override
        public void stopEnemyAnimation(){
            if(isUnlocked==true){
                violetRobot.getAttackTimer().stop();
                violetRobot.getRunTimer().stop();
                violetRobot.getShotTimer().stop();
                violetRobot.getDeathTimer().stop();
            }
        }// end method startZombieAnimation()
        
        
       
        @Override
        public int getTimeGame(){
            return blueRobot.getGameTime();
        }
        
        
        @Override
        public boolean isTerminated(){
            return violetRobot.isTerminated();
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
            violetRobot.setInitialLife();
        }// end method setDot
    
    
       @Override
        public void setLocked(){
            isUnlocked = false;
            violetRobot.setInitialLife();
        }
        
        
        @Override
        public void setUnlocked(){
            isUnlocked = true;
        }
        
        @Override
        public void startMusic(){
            try{
                aC.getFinalBattleClip().open(aC.getFinalBattleAudio());
                aC.getFinalBattleClip().start();
                aC.getFinalBattleClip().loop(21);  
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }// end method startMusic
        
        @Override
        public void stopMusic(){
            aC.getFinalBattleClip().close();
            
            try{
                aC.getFinalBattleAudio().close();
            }
            catch(IOException ioe){
                ioe.printStackTrace();
            }
        }// end method stopMusic
        
        @Override
        public void setFocus(AbstractLevel lv){
            if(isUnlocked==true){
                lv.requestFocus();
            }
        }// end method setFocus
        
        @Override
        public void setDefaultPosition(){
            violetRobot.setInitPosition();
            blueRobot.setInitPosition();
        }// end method setDefaultPosition
        
        
    
}// end class
