/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animation;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

/**
 *
 * @author Utente
 */
public abstract class AbstractAnimation implements ActionListener, KeyListener{
    
    private final static int ANIMATION_DELAY = 3000; //milliseconds
	
	protected AnimationPanel animPanel;
	protected static Timer animTimer;
	protected Image[] animFrameArray;
        protected Image[] enemyFrameArray;
        protected Image[] enemyFrameArray1;
        protected Image[] bossFrameArray;
	protected int[][] animShiftMatrix;
	protected int currentFrameIndex;
        protected int currentEnemyFrameIndex;
        protected int currentEnemy1FrameIndex;
        protected int currentBossFrameIndex;
        protected int currentShiftIndex;
        protected int numberOfDot;
        protected static char id;
        protected static int score;
        protected static int counterZombieDeath;
        protected static int hitAttack;
        protected static int hitShot;
        public static boolean isWeaponUnlocked = false;
	private boolean isPaused;
        protected static int gameTime;
        
        
        
        

	protected AbstractAnimation(Image[] animFrameArray, int[][] animShiftMatrix, AnimationPanel animPanel) {
		this.animFrameArray = animFrameArray;
		this.animShiftMatrix = animShiftMatrix;
		this.animPanel = animPanel;
		score = 0;
                counterZombieDeath = 0;
                this.currentShiftIndex = 0;
		this.isPaused = false;
		animTimer = new Timer(ANIMATION_DELAY, this);
                gameTime = 200;
	} // end constructor
        
                
        
        
        public void setAnimationPanel(AnimationPanel aP){
            this.animPanel = aP;
        
        }
        
        public void setRobotAnimation (AbstractAnimation mra){};
        
        
        public void setRobotFrame(String g){};
        
        public abstract char getId();
        

	public void start() {
		this.animTimer.start();
	} // end start()

	public void stop() {
		this.animTimer.stop();
	} // end stop()

	public void show(Graphics g, int x, int y) {
		this.showCurrentFrame(g, x, y);
	} // end method show()
        
        @Override
	public void actionPerformed(ActionEvent evt) {} // end method actionPerformed()

	public abstract int getAnimationWidth();

	public abstract int getAnimationHeight();

	public abstract void showCurrentFrame(Graphics g, int x, int y);
        
        public abstract Image getCurrentFrame();
        
        public abstract int getCurrentX ();
        
        public abstract int getMaxX();
        
        public abstract void setInitPosition();
        
        
        
        
        @Override
	public void keyTyped(KeyEvent e){};// end method keyTyped()
        
        @Override
        public void keyPressed(KeyEvent e){};// end method KeyPressed()
            
            
        
        @Override
        public void keyReleased (KeyEvent e){
            
        };// end method KeyReleased
        
        
        public int getGameTime(){
            return this.gameTime;
        }// end method getGameTime
        
        public void setGameTime(int n){
            this.gameTime = n;
        }// end method setGameTime
        
        public void setNumberOfDot(int d){
            this.numberOfDot = d;
        }
        
        
    
    
}// end abstract class
