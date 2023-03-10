/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;



import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;


/**
 *
 * @author Utente
 */
public class CoverPanel extends AbstractPanel{
    
    private final static int MAIN_ROBOT_WIDTH_HEIGHT=700;
    private final static String COVER_STRING = "ROBOT ADVENTURE";
    private final static int STRING_SIZE = 100;
    private final static int STRING_RED = 178;
    private final static int STRING_GREEN_BLUE = 34;
    private final static int STRING_POS_X = 400;
    private final static int STRING_POS_Y = 540;
    private PictureCreator pC;
    private StringCreator sC;
    private Color nColor;
    private Font nFont;
    private BufferedImage [] imgArray ;
    private int [] posX = new int[2];
    private int [] posY = new int[2];
    private int [] widthI = new int [2];
    private int [] heightI = new int [2];
    private Graphics2D g2DBackground;
    
    
    public CoverPanel(){
        super();
        this.initVariable();
    };

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(this.backgroundImg, 0, 0, null);
           pC.imageArrayDrawer(g2DBackground, imgArray, widthI, heightI, posX, posY); 
           sC.stringDrawer(g2DBackground, COVER_STRING, nFont, nColor, STRING_POS_X , STRING_POS_Y);

    };
    
    public void initVariable (){
        pC = new PictureCreator();
        sC = new StringCreator();
        posX = new int [] {0,1200};
        posY = new int [] {200,200};
        widthI = new int [] {MAIN_ROBOT_WIDTH_HEIGHT,MAIN_ROBOT_WIDTH_HEIGHT};       
        heightI = new int[] {MAIN_ROBOT_WIDTH_HEIGHT,MAIN_ROBOT_WIDTH_HEIGHT};
        imgArray =  new BufferedImage[]{this.mainRobotImg,this.villainRobotImg};
        nColor = sC.newColor(STRING_RED,STRING_GREEN_BLUE,STRING_GREEN_BLUE);
        nFont = sC.applyFont(super.fontPDK,STRING_SIZE);
        g2DBackground = this.getGraphicsBackground(super.backgroundImg);
    };
        
    
}// end class
