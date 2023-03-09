/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animation;


import javax.swing.JPanel;

/**
 *
 * @author Utente
 */
public class AnimationPanel extends JPanel {
    
    protected AbstractAnimation animation;
    protected AbstractAnimation enemyAnimation;
    protected AbstractAnimation enemyAnimation1;
    protected AbstractAnimation bossAnimation;
    

	public AnimationPanel(AbstractAnimation animation) {
		super();
		this.animation = animation;
	} // end constructor

	public AnimationPanel() {
		super();
	} // end constructor

	public void setAnimation(AbstractAnimation animation) {
		this.animation = animation;
	} // end method setAnimation()

        public void setEnemyAnimation(AbstractAnimation animation) {
		this.enemyAnimation = animation;
	} // end method setEnemyAnimation()
        
        public void setEnemyAnimation1(AbstractAnimation animation) {
		this.enemyAnimation1 = animation;
	} // end method setEnemyAnimation()
        
        public void setBossAnimation (AbstractAnimation animation){
            this.bossAnimation = animation;
        }// end method setBossAnimation()

        
}// end class 
