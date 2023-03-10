/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animation;

import java.awt.Container;
import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 *
 * @author Utente
 */
public class TestAnimationGUI extends JFrame{
    
    
    
    
    public TestAnimationGUI (){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        
        AnimationPanel animationPanel = new SecondLevelAnimationPanel();
        AbstractAnimation mainRobot = new MainRobotAnimation(animationPanel);
        AbstractAnimation violetRobot = new VioletRobotAnimation(animationPanel);
        //AbstractAnimation greenZombie = new GreenZombieAnimation (animationPanel);
        //AbstractAnimation pirateZombie = new PirateZombieAnimation (animationPanel);
        
        
        animationPanel.setAnimation(mainRobot);
        animationPanel.setBossAnimation(violetRobot);
        //animationPanel.setEnemyAnimation(greenZombie);
        //animationPanel.setEnemyAnimation1(pirateZombie);
        //mainRobotWalk.setAnimationPanel(animationPanel);
        mainRobot.setAnimationPanel(animationPanel);
        violetRobot.setRobotAnimation(mainRobot);
        
        //greenZombie.setAnimationPanel(animationPanel);
        //pirateZombie.setAnimationPanel(animationPanel);
        //greenZombie.setRobotAnimation(mainRobot);
        //pirateZombie.setRobotAnimation(mainRobot);
        //greenZombie.setRobotAnimation(mainRobot);
        //mainRobotDeath.start();
        
      
        
        
        Container contPane = getContentPane();
        contPane.setLayout(new BorderLayout());
        contPane.add(animationPanel, BorderLayout.CENTER);
        this.addKeyListener(mainRobot);
                
    }// end constructor
    
    /*public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
                            new TestAnimationGUI().setVisible(true);
			}
		}); // end method invokeLater()
                
                
                    
                
                
	} // end method main()*/
    
    
}// end class
