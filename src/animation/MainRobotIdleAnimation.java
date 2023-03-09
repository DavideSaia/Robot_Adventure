/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animation;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Utente
 */
public class MainRobotIdleAnimation extends AbstractAnimation{
    
    private MainRobotSprites mRSprites;
    private int posX;
    
    
    
    public MainRobotIdleAnimation(AnimationPanel animPanel){
        super(null,null, animPanel);
        mRSprites = new MainRobotSprites();
        this.animFrameArray = mRSprites.getMainRobotIdleSprites();
        //this.animShiftMatrix = mRSprites.getMainRobotWalkShiftArray();
    };
    
    /*public MainRobotIdleAnimation(){
      super(null,null);
      mRSprites = new MainRobotSprites();
      this.animFrameArray = mRSprites.getMainRobotIdleSprites();
      
    };*/
    
    
    
    @Override
    public void showCurrentFrame(Graphics g, int x, int y){
        Image frameImg = this.animFrameArray[this.currentFrameIndex];
        posX = x;
        
        
        g.drawImage(frameImg, (posX- mRSprites.standardWidth) , (y - mRSprites.standardHeight), null);
      
    }; // end method showCurrentFrame()
    
    
    @Override
    public int getAnimationWidth(){
        return this.animFrameArray[this.currentFrameIndex].getWidth(null);
    };
    
    @Override
    public int getAnimationHeight(){
        return this.animFrameArray[this.currentFrameIndex].getHeight(null);
    };
    
    
    @Override
    public int getCurrentX (){
        return this.posX;
    };
    
    @Override
    public int getMaxX (){
        int maxX;
            maxX = this.getCurrentX() + this.getAnimationWidth();
        return maxX;
    }// end method maxX()
    
    @Override
    public Image getCurrentFrame (){
        Image currentFrame = this.animFrameArray[this.currentFrameIndex];
            return currentFrame;
    };
    
    
    @Override
    public char getId(){
        return 'z';
    };
    
    
    @Override
    public void setInitPosition(){};
    
}// end class 
