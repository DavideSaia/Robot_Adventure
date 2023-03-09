/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;


/**
 *
 * @author Utente
 */
public abstract class AbstractPanel extends JPanel implements MouseInputListener{    
    
    private final PictureCreator pC = new PictureCreator();
    protected final static String MAIN_ROBOT_PATH="/Icon/idle_003.png";
    protected final static String VILLAIN_ROBOT_PATH="/Icon/idle_003_reverse.png";
    protected final static String BACKGROUND_PATH="/Icon/BG.png";
    protected final static String NEXT_BUTTON_PATH = "/Icon/Start_BTN.png";
    protected final static String NEXT_BUTTON_YELLOW_PATH = "/Icon/Start_BTN_2.png";
    protected final static String WINDOW_PATH = "/Icon/Window.png";
    protected final static String INFO_BUTTON_PATH = "/Icon/Info_BTN.png";
    protected final static String INFO_BUTTON_ACTIVE_PATH = "/Icon/Info_BTN_2.png";
    protected final static String RATING_BUTTON_PATH = "/Icon/Rating_BTN.png";
    protected final static String RATING_BUTTON_ACTIVE_PATH = "/Icon/Rating_BTN_2.png";
    protected final static String PREVIEW_BUTTON_PATH = "/Icon/Replay_BTN.png";
    protected final static String PREVIEW_BUTTON_ACTIVE_PATH = "/Icon/Replay_BTN_2.png";
    protected final static String ARM_ICON_PATH = "/Icon/Arm_01.png" ;
    protected final static String SHOT_ICON_PATH = "/Icon/shot_01.png";
    protected final static String BOMB_ICON_PATH = "/Icon/bomb_09.png";
    protected final static String ZOMBIE_HEAD_ICON_PATH = "/Icon/head5.png";
    protected final static String ALIEN_HEAD_ICON_PATH = "/Icon/alienHead.png";
    protected final static String VILLAIN_ROBOT_HEAD_ICON_PATH = "/Icon/villain_robot_head.png";
    protected final static String QUESTION_PATH = "/Icon/FAQ_BTN.png";
    protected final static String BUTTON_ROBOT_1_PATH= "/Icon/bR1.png";
    protected final static String BUTTON_ROBOT_2_PATH= "/Icon/bR2.png";
    protected final static String BUTTON_ROBOT_1_ACTIVE_PATH= "/Icon/bR1_Active.png";
    protected final static String BUTTON_ROBOT_2_ACTIVE_PATH= "/Icon/bR2_Active.png";
    protected final static String ACCEPT_BUTTON_PATH = "/Icon/Ok_BTN.png";
    protected final static String DECLINE_BUTTON_PATH = "/Icon/Close_BTN.png";
    protected final static String ACCEPT_BUTTON_ACTIVE_PATH = "/Icon/Ok_BTN_Active.png";
    protected final static String DECLINE_BUTTON_ACTIVE_PATH = "/Icon/Close_BTN_Active.png";
    protected final static String WINDOW_RATING_PATH = "/Icon/Window_2.png";
    protected final static String FIRST_LEVEL_BUTTON_PATH = "/Icon/1-Livello_Button.png";
    protected final static String FIRST_LEVEL_BUTTON_ACTIVE_PATH = "/Icon/1-Livello_Button_Active.png";
    protected final static String PAUSE_BUTTON_PATH = "/Icon/Pause_BTN.png";
    protected final static String PAUSE_BUTTON_ACTIVE_PATH = "/Icon/Pause_BTN_2.png";
    protected final static String STAR_1_PATH = "/Icon/Star_01.png";
    protected final static String STAR_2_PATH = "/Icon/Star_02.png";
    protected final static String STAR_3_PATH = "/Icon/Star_03.png";
    protected final static String FORWARD_BUTTON_PATH = "/Icon/Forward_BTN.png";
    protected final static String FORWARD_BUTTON_ACTIVE_PATH = "/Icon/Forward_BTN_2.png";
    protected final static String BACKWARD_BUTTON_PATH = "/Icon/Backward_BTN.png";
    protected final static String BACKWARD_BUTTON_ACTIVE_PATH = "/Icon/Backward_BTN_2.png";
    protected final static String SECOND_LEVEL_BUTTON_PATH = "/Icon/2-Livello_Button.png";
    protected final static String SECOND_LEVEL_BUTTON_ACTIVE_PATH = "/Icon/2-Livello_Button_Active.png";
    protected final static String [] NATION_ARRAY = new String[] { "Arabia Saudita", "Argentina", "Australia", "Brasile", "Canada", "Cina", "Francia", "Germania", "Giappone", "India", "Indonesia", "Italia", "Messico", "Olanda", "Polonia", "Regno Unito", "Russia", "Stati Uniti", "Spagna", "Sud Africa", "Sud Corea", "Turchia" } ;
    protected final static String [] NATION_FLAG_ARRAY_PATH = new String[] {"/Icon/Flags/Flag_of_Argentina.png","/Icon/Flags/Flag_of_Australia.png",
    "/Icon/Flags/Flag_of_Brazil.png","/Icon/Flags/Flag_of_Canada.png","/Icon/Flags/Flag_of_China.png","/Icon/Flags/Flag_of_France.png",
    "/Icon/Flags/Flag_of_Germany.png","/Icon/Flags/Flag_of_India.png","/Icon/Flags/Flag_of_Indonesia.png","/Icon/Flags/Flag_of_Italy.png","/Icon/Flags/Flag_of_Japan.png",
    "/Icon/Flags/Flag_of_Mexico.png","/Icon/Flags/Flag_of_Poland.png","/Icon/Flags/Flag_of_Russia.png","/Icon/Flags/Flag_of_Saudi_Arabia.png",
    "/Icon/Flags/Flag_of_South_Africa.png","/Icon/Flags/Flag_of_South_Korea.png","/Icon/Flags/Flag_of_Spain.png","/Icon/Flags/Flag_of_the_United_Kingdom.png","/Icon/Flags/Flag_of_the_United_States.png","/Icon/Flags/Flag_of_Turkey.png"
    };
    
    
    public final  String fontPDK = "/Font/pdark.ttf";
    public final  String fontSpaceAge = "/Font/space age.ttf";
    
   
    
    protected  BufferedImage backgroundImg ;
    protected  BufferedImage mainRobotImg ;
    protected  BufferedImage villainRobotImg ;
    protected  BufferedImage nextButtonImg ;
    protected  BufferedImage nextButtonActiveImg;
    protected  BufferedImage windowImg ;
    protected  BufferedImage infoButtonImg ;
    protected  BufferedImage infoButtonActiveImg ;
    protected  BufferedImage ratingImg ;
    protected  BufferedImage ratingActiveImg ;
    protected  BufferedImage previewButtonImg;
    protected  BufferedImage previewButtonActiveImg;
    protected  BufferedImage armImg;
    protected  BufferedImage shotIconImg;
    protected  BufferedImage bombIconImg;
    protected  BufferedImage zombieHeadImg;
    protected  BufferedImage alienHeadImg;
    protected  BufferedImage villainRobotHeadImg;
    protected  BufferedImage questionImg;
    protected  BufferedImage buttonRobot1Img;
    protected  BufferedImage buttonRobot2Img;
    protected  BufferedImage buttonRobot1ActiveImg;
    protected  BufferedImage buttonRobot2ActiveImg;
    protected  BufferedImage acceptButtonImg;
    protected  BufferedImage declineButtonImg;
    protected  BufferedImage acceptButtonActiveImg;
    protected  BufferedImage declineButtonActiveImg;
    protected  BufferedImage windowRatingImg;
    protected  BufferedImage firstLevelBtImg;
    protected  BufferedImage firstLevelBtActiveImg;
    protected  BufferedImage secondLevelBtImg;
    protected  BufferedImage secondLevelBtActiveImg;
    protected  BufferedImage pauseButtonImg;
    protected  BufferedImage pauseButtonActiveImg;
    protected  BufferedImage star1Img;
    protected  BufferedImage star2Img;
    protected  BufferedImage star3Img;
    protected  BufferedImage forwardButtonImg;
    protected  BufferedImage forwardButtonActiveImg;
    protected  BufferedImage backwardButtonImg;
    protected  BufferedImage backwardButtonActiveImg;
    protected  BufferedImage [] flagsArrayImg;
    
    
    
    
    public AbstractPanel(){
            backgroundImg = pC.loadImage(BACKGROUND_PATH);
            mainRobotImg = pC.loadImage(MAIN_ROBOT_PATH);
            villainRobotImg = pC.loadImage(VILLAIN_ROBOT_PATH);
            nextButtonImg = pC.loadImage(NEXT_BUTTON_PATH);
            nextButtonActiveImg = pC.loadImage(NEXT_BUTTON_YELLOW_PATH);
            windowImg = pC.loadImage(WINDOW_PATH);
            infoButtonImg = pC.loadImage(INFO_BUTTON_PATH);
            ratingImg = pC.loadImage(RATING_BUTTON_PATH);
            infoButtonActiveImg = pC.loadImage(INFO_BUTTON_ACTIVE_PATH);
            ratingActiveImg = pC.loadImage(RATING_BUTTON_ACTIVE_PATH);
            previewButtonImg = pC.loadImage(PREVIEW_BUTTON_PATH);
            previewButtonActiveImg = pC.loadImage(PREVIEW_BUTTON_ACTIVE_PATH);
            armImg = pC.loadImage(ARM_ICON_PATH);
            shotIconImg = pC.loadImage(SHOT_ICON_PATH);
            bombIconImg = pC.loadImage(BOMB_ICON_PATH);
            zombieHeadImg = pC.loadImage(ZOMBIE_HEAD_ICON_PATH);
            alienHeadImg = pC.loadImage(ALIEN_HEAD_ICON_PATH);
            villainRobotHeadImg = pC.loadImage(VILLAIN_ROBOT_HEAD_ICON_PATH );
            questionImg = pC.loadImage(QUESTION_PATH);
            buttonRobot1Img = pC.loadImage(BUTTON_ROBOT_1_PATH);
            buttonRobot2Img = pC.loadImage(BUTTON_ROBOT_2_PATH);
            buttonRobot1ActiveImg = pC.loadImage(BUTTON_ROBOT_1_ACTIVE_PATH);
            buttonRobot2ActiveImg = pC.loadImage(BUTTON_ROBOT_2_ACTIVE_PATH);
            acceptButtonImg = pC.loadImage(ACCEPT_BUTTON_PATH);
            declineButtonImg = pC.loadImage(DECLINE_BUTTON_PATH);
            acceptButtonActiveImg = pC.loadImage(ACCEPT_BUTTON_ACTIVE_PATH);
            declineButtonActiveImg = pC.loadImage(DECLINE_BUTTON_ACTIVE_PATH);
            windowRatingImg = pC.loadImage(WINDOW_RATING_PATH);
            firstLevelBtImg = pC.loadImage(FIRST_LEVEL_BUTTON_PATH);
            firstLevelBtActiveImg = pC.loadImage(FIRST_LEVEL_BUTTON_ACTIVE_PATH);
            pauseButtonImg = pC.loadImage(PAUSE_BUTTON_PATH);
            pauseButtonActiveImg = pC.loadImage(PAUSE_BUTTON_ACTIVE_PATH);
            star1Img = pC.loadImage(STAR_1_PATH);
            star2Img = pC.loadImage(STAR_2_PATH);
            star3Img = pC.loadImage(STAR_3_PATH);
            forwardButtonImg = pC.loadImage(FORWARD_BUTTON_PATH);
            forwardButtonActiveImg = pC.loadImage(FORWARD_BUTTON_ACTIVE_PATH);
            backwardButtonImg = pC.loadImage(BACKWARD_BUTTON_PATH);
            backwardButtonActiveImg = pC.loadImage(BACKWARD_BUTTON_ACTIVE_PATH);
            secondLevelBtImg = pC.loadImage(SECOND_LEVEL_BUTTON_PATH);
            secondLevelBtActiveImg = pC.loadImage(SECOND_LEVEL_BUTTON_ACTIVE_PATH);
            flagsArrayImg = pC.loadImageArray(NATION_FLAG_ARRAY_PATH);
    };
    
    
    
    @Override
    public void mouseClicked(MouseEvent e){};
    
    @Override
    public void mouseEntered(MouseEvent e){
            
    };
    
    @Override
    public void mouseExited(MouseEvent e){};
    
    @Override
    public void mousePressed(MouseEvent e){};
    
    @Override
    public void mouseReleased(MouseEvent e){};
            
    
    //--------------------------------
    
    @Override
    public void mouseDragged(MouseEvent e){};
    
    @Override
    public void mouseMoved(MouseEvent e){};

    
    //----------------------------------
   
    
     public Graphics2D getGraphicsBackground(BufferedImage backImg){
        return backImg.createGraphics();
    };
     
     
     
    
    
    /*public static void AddButton (BufferedImage bI,AbstractPanel c,Dimension d,int chooseLayout){
    PictureCreator pC = new PictureCreator();
    int bWidth = (int)(((int)d.getWidth()) -(1920 - Toolkit.getDefaultToolkit().getScreenSize().getWidth()));
    int bHeight = (int)(((int)d.getHeight())-(1080 - Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
    Dimension newD = new Dimension(bWidth,bHeight);
    ImageIcon buttonIcon = pC.setPreferredIcon(bI, newD);
        JButton j = new JButton(buttonIcon);
        j.setPressedIcon(buttonIcon);
        j.setSize(newD);
        j.setOpaque(false);
        j.setContentAreaFilled(false);
        j.setBorderPainted(false);
        j.setMargin(new Insets(0,0,0,0));
    if(chooseLayout == 0){
            c.add(j, BorderLayout.PAGE_START);
        }
    if(chooseLayout == 1){
            c.add(j, BorderLayout.CENTER);
        };
    if(chooseLayout == 2){
            c.add(j, BorderLayout.EAST);
                };
    if(chooseLayout == 3){
            c.add(j, BorderLayout.WEST);  
                };
    if(chooseLayout == 4){
            c.add(j, BorderLayout.SOUTH);
                };
    }; // end method addButton()*/
    
    
    
    
    /*public static void AddComponentToPanel (JComponent j,AbstractPanel c,int chooseLayout){
            if(chooseLayout == 0){
                c.add(j, BorderLayout.PAGE_START);
                }
            if(chooseLayout == 1){
                    c.add(j, BorderLayout.CENTER);
                }
            if(chooseLayout == 2){
                    c.add(j, BorderLayout.EAST);
                        }
            if(chooseLayout == 3){
                    c.add(j, BorderLayout.WEST);  
                        };
            if(chooseLayout == 4){
                    c.add(j, BorderLayout.SOUTH);
                        }
    }; // end method addButtonToPanel()*/
    
   
    
    //public abstract int getPanelWidth();
    
    //public abstract int getPanelHeight();
    
    
   
    
}//end class
