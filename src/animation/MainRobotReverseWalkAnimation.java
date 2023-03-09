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
public class MainRobotReverseWalkAnimation extends AbstractAnimation{
    
    private MainRobotSprites mRSprites;
    private int posX;
    private int xShift;
    
    
    public MainRobotReverseWalkAnimation(AnimationPanel animPanel){
        super(null,null, animPanel);
        mRSprites = new MainRobotSprites();
        this.animFrameArray = mRSprites.getMainRobotReverseWalkSprites();
        //this.animShiftMatrix = mRSprites.getMainRobotReverseWalkShiftArray();
    };
    
    /*public MainRobotWalkAnimation(){
        super(null,null);
        mRSprites = new MainRobotSprites();
        this.animFrameArray = mRSprites.getMainRobotWalkSprites();
        this.animShiftMatrix = mRSprites.getMainRobotWalkShiftArray();
    }*/
    
    
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
        Image frameImg = this.animFrameArray[this.currentFrameIndex];
        
        xShift = this.animShiftMatrix[this.currentShiftIndex][0];
        int yShift = this.animShiftMatrix[this.currentShiftIndex][1];
        posX = x;
        int moveX = (posX + xShift - mRSprites.standardWidth);
        
        if(this.getCurrentX()<(0 + mRSprites.standardWidth)){
            moveX= posX;
            this.currentShiftIndex = 0;
        }
        
        g.drawImage(frameImg, moveX  , (y - mRSprites.standardHeight), null);
      
    }; // end method showCurrentFrame()
    
    @Override
    public Image getCurrentFrame (){
        Image currentFrame = this.animFrameArray[this.currentFrameIndex];
            return currentFrame;
    };
    
    @Override
    public int getCurrentX (){
        int currentX= this.posX + this.xShift;
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
    
    @Override
    public void setInitPosition(){};
    
}// end class


