/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import animation.AbstractAnimation;
import animation.AbstractLevel;
import animation.FirstLevelAnimationPanel;
import animation.SecondLevelAnimationPanel;
import static view.AbstractPanel.NATION_ARRAY;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author Utente
 */
public class RobotGUI extends AbstractPanel implements ActionListener{
    
    private CoverPanel cP;
    private SubmitPanel sP;
    private InfoPanel iP;
    private RobotChoicePanel rCP;
    private RatingPanel rP;
    private LevelOverviewPanel lOP;
    private AbstractLevel fLaP;
    private AbstractLevel sLaP;
    private ScorePanel scoreP;
    private JLayeredPane robotPane;
    private JButton startButton;
    private JButton infoButton;
    private JButton ratingButton;
    private JButton previewButton;
    private JButton buttonR1;
    private JButton buttonR2;
    private JButton acceptButton;
    private JButton declineButton;
    private JButton firstLvButton;
    private JButton secondLvButton;
    private JButton pauseButton;
    private JButton forwardButton;
    private JButton backwardButton;
    private JTextField nameTextField;
    private JComboBox<String> nationalityBox;
    private JComboBox nationSelected;
    private String nickName;
    private String nation;
    private boolean isPaused=false;
    private Timer changeTimer;
    private Font submitFont;
    private PictureCreator pC;
    private StringCreator sC;
    private PlayerData playerD;
    private Player player;
    private boolean isGameEnd = false;
    private Component[] panelArray;
    private final static int CHANGE_DELAY = 4000;
    private final static Dimension BUTTON_DIMENSION = new Dimension(500,150);
    private final static Dimension STANDARD_BUTTON_DIMENSION = new Dimension(100,100);
    private final static Dimension ROBOT_BUTTON_DIMENSION = new Dimension (750,810);
    private final Dimension LEVEL_BUTTON_DIMENSION = new Dimension (905,705);
    //private final int standardWidth = (int) (1920 - Toolkit.getDefaultToolkit().getScreenSize().getWidth());
    //private final int standardHeight = (int) (1080 - Toolkit.getDefaultToolkit().getScreenSize().getHeight());
    
        public RobotGUI(JFrame j){
            super();
            initRobotGUI();
            j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //j.setPreferredSize(new Dimension(1930,1050));
            //j.setResizable(false);
            j.setExtendedState(MAXIMIZED_BOTH);
            j.getContentPane().add(robotPane);
            j.pack();
        }; // end RobotGUI()
    
    public void initRobotGUI(){
        pC = new PictureCreator();
        sC = new StringCreator();
        sP = new SubmitPanel();
        cP = new CoverPanel();
        iP = new InfoPanel();
        rCP = new RobotChoicePanel();
        rP = new RatingPanel();
        lOP = new LevelOverviewPanel();
        fLaP = new FirstLevelAnimationPanel();
        sLaP = new SecondLevelAnimationPanel();
        scoreP = new ScorePanel();
        playerD = new PlayerData();
            robotPane = new JLayeredPane();
            changeTimer = new Timer (CHANGE_DELAY,this);
            this.setInitComponent();
            this.AddListenerToComponent();
            this.setPanelBounds();
            this.addComponent();
            this.setComponentVisibility();

            panelArray = robotPane.getComponentsInLayer(0);
           
    }; // end method initRobotGUI()
      
    public void setPanelBounds(){
        robotPane.setBounds(0,0,1920,1010);
        cP.setBounds(0, 0, 1920 , 1010);   
        sP.setBounds(0, 0, 1920, 1010);
        iP.setBounds(0, 0, 1920, 1010);
        rCP.setBounds(0, 0, 1920, 1010);
        rP.setBounds(0, 0, 1920, 1010);
        lOP.setBounds(0, 0, 1920, 1010);
        fLaP.setBounds(0, 0, 1920, 1010);
        sLaP.setBounds(0, 0, 1920, 1010);
        scoreP.setBounds(0, 0,1920, 1010);
    };//end method setPanelBounds()
    
    public void addComponent(){
        robotPane.add(startButton,1,0);
        robotPane.add(infoButton,1,0);
        robotPane.add(ratingButton,1,0);
        robotPane.add(previewButton, 1, 0);
        robotPane.add(nationalityBox, 1, 0);
        robotPane.add(nameTextField, 1, 0);
        robotPane.add(buttonR1,1,0);
        robotPane.add(buttonR2,1,0);
        robotPane.add(acceptButton, 1, 0);
        robotPane.add(declineButton, 1, 0);
        robotPane.add(firstLvButton,1,0);
        robotPane.add(secondLvButton,1,0);
        robotPane.add(pauseButton,1,0);
        robotPane.add(forwardButton,1,0);
        robotPane.add(backwardButton,1,0);
        robotPane.add(cP,0,0);
        robotPane.add(sP,0,1);
        robotPane.add(iP, 0, 2);
        robotPane.add(rCP,0,3);
        robotPane.add(rP,0,4);
        robotPane.add(lOP,0,5);
        robotPane.add(fLaP,0,6);
        robotPane.add(sLaP,0,7);
        robotPane.add(scoreP,0,8);
        
    };//addComponent ()
    
    //------------------------------------------------
        
    public void AddListenerToComponent(){
        startButton.addMouseListener(eventMouseHandler());
        startButton.addMouseMotionListener(eventMouseHandler());
        infoButton.addMouseListener(eventMouseHandler());
        infoButton.addMouseMotionListener(eventMouseHandler());
        ratingButton.addMouseListener(eventMouseHandler());
        ratingButton.addMouseMotionListener(eventMouseHandler());
        previewButton.addMouseListener(eventMouseHandler());
        previewButton.addMouseMotionListener(eventMouseHandler());
        buttonR1.addMouseListener(eventMouseHandler());
        buttonR1.addMouseMotionListener(eventMouseHandler());
        buttonR2.addMouseListener(eventMouseHandler());
        buttonR2.addMouseMotionListener(eventMouseHandler());
        acceptButton.addMouseListener(eventMouseHandler());
        acceptButton.addMouseMotionListener(eventMouseHandler());
        declineButton.addMouseListener(eventMouseHandler());
        declineButton.addMouseMotionListener(eventMouseHandler());
        firstLvButton.addMouseListener(eventMouseHandler());
        firstLvButton.addMouseMotionListener(eventMouseHandler());
        secondLvButton.addMouseListener(eventMouseHandler());
        secondLvButton.addMouseMotionListener(eventMouseHandler());
        pauseButton.addMouseListener(eventMouseHandler());
        pauseButton.addMouseMotionListener(eventMouseHandler());
        forwardButton.addMouseListener(eventMouseHandler());
        forwardButton.addMouseMotionListener(eventMouseHandler());
        backwardButton.addMouseListener(eventMouseHandler());
        backwardButton.addMouseMotionListener(eventMouseHandler());
        
        
        nameTextField.addActionListener((ActionEvent evt) ->{
            nameTextFieldActionPerformed();
        });
        
        nationalityBox.addActionListener((ActionEvent evt) -> {
            nationalityBoxActionPerformed(evt);
        });        
        
        
    };// end method AddListenerToComponent()
    
    public void setInitComponent(){
    nationalityBox =  new JComboBox<>();
    
        startButton = pC.setButton(super.nextButtonImg, BUTTON_DIMENSION, 710, 615);        
        infoButton = pC.setButton(this.infoButtonImg, STANDARD_BUTTON_DIMENSION, 1795, 150);
        ratingButton = pC.setButton(super.ratingImg, STANDARD_BUTTON_DIMENSION, 1795, 270);
        previewButton = pC.setButton(super.previewButtonImg, STANDARD_BUTTON_DIMENSION, 1795, 880);
    
    submitFont = sC.applyFont(super.fontSpaceAge,36);
        nationalityBox.setModel(new DefaultComboBoxModel<>(NATION_ARRAY));
        nationalityBox.setFont(submitFont);
        nationalityBox.setBounds(712, 625, 500, 50);
        
        
    submitFont = sC.applyFont(super.fontSpaceAge,48);
        nameTextField = new JTextField();
        nameTextField.setFont(submitFont);
        nameTextField.setToolTipText("MAX 8 CHARACTERS");
        nameTextField.setBounds(712, 350, 500, 80);      
        
        buttonR1 = rCP.getButtonRobot1();
        buttonR2 = rCP.getButtonRobot2();
               
        acceptButton = pC.setButton(super.acceptButtonImg, STANDARD_BUTTON_DIMENSION, 712, 850);
        declineButton = pC.setButton(super.declineButtonImg, STANDARD_BUTTON_DIMENSION, 1112, 850);
        
        firstLvButton = lOP.getFirstLevelButton();
        secondLvButton = lOP.getSecondLevelButton();
        
        pauseButton = pC.setButton(super.pauseButtonImg, STANDARD_BUTTON_DIMENSION, 1795, 20);
        
        forwardButton = pC.setButton(super.forwardButtonImg, STANDARD_BUTTON_DIMENSION, 1795, 880);
        backwardButton = pC.setButton(super.backwardButtonImg, STANDARD_BUTTON_DIMENSION, 30, 880);
       
    };// end method setInitComponent()
    
    
    
    public void buttonMouseEnteredPerformed(MouseEvent e){
        if(e.getSource().equals(startButton)){
           startButton.setIcon(pC.setPreferredIcon(this.nextButtonActiveImg, BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(infoButton)){
           infoButton.setIcon(pC.setPreferredIcon(this.infoButtonActiveImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(ratingButton)){
           ratingButton.setIcon(pC.setPreferredIcon(this.ratingActiveImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(previewButton)){
           previewButton.setIcon(pC.setPreferredIcon(this.previewButtonActiveImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(acceptButton)){
           acceptButton.setIcon(pC.setPreferredIcon(this.acceptButtonActiveImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(declineButton)){
           declineButton.setIcon(pC.setPreferredIcon(this.declineButtonActiveImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(buttonR1)){
           buttonR1.setIcon(pC.setPreferredIcon(this.buttonRobot1ActiveImg, ROBOT_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(buttonR2)){
           buttonR2.setIcon(pC.setPreferredIcon(this.buttonRobot2ActiveImg, ROBOT_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(firstLvButton)){
           firstLvButton.setIcon(pC.setPreferredIcon(this.firstLevelBtActiveImg, LEVEL_BUTTON_DIMENSION));
           this.repaint();
        }
        if(e.getSource().equals(secondLvButton)){
            if(AbstractAnimation.isWeaponUnlocked==true){
                secondLvButton.setIcon(pC.setPreferredIcon(this.secondLevelBtActiveImg, LEVEL_BUTTON_DIMENSION));
                this.repaint();
            }// end if isUnlocked
        }
        if(e.getSource().equals(pauseButton)){
           pauseButton.setIcon(pC.setPreferredIcon(this.pauseButtonActiveImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();
        }
        
        if(e.getSource().equals(forwardButton)){
           forwardButton.setIcon(pC.setPreferredIcon(super.forwardButtonActiveImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();
        }
        
        if(e.getSource().equals(backwardButton)){
           backwardButton.setIcon(pC.setPreferredIcon(super.backwardButtonActiveImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();
        }
        
    };// end method buttonMouseEnteredPerformed()
    
    
    public void buttonMouseExitedPerformed(MouseEvent e){
        if(e.getSource().equals(startButton)){
        startButton.setIcon(pC.setPreferredIcon(this.nextButtonImg, BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(infoButton)){
           infoButton.setIcon(pC.setPreferredIcon(this.infoButtonImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(ratingButton)){
           ratingButton.setIcon(pC.setPreferredIcon(this.ratingImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(previewButton)){
           previewButton.setIcon(pC.setPreferredIcon(this.previewButtonImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(acceptButton)){
           acceptButton.setIcon(pC.setPreferredIcon(this.acceptButtonImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(declineButton)){
           declineButton.setIcon(pC.setPreferredIcon(this.declineButtonImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(buttonR1)){
           buttonR1.setIcon(pC.setPreferredIcon(this.buttonRobot1Img, ROBOT_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(buttonR2)){
           buttonR2.setIcon(pC.setPreferredIcon(this.buttonRobot2Img, ROBOT_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(firstLvButton)){
           firstLvButton.setIcon(pC.setPreferredIcon(this.firstLevelBtImg, LEVEL_BUTTON_DIMENSION));
           this.repaint();}
        if(e.getSource().equals(secondLvButton)){
           secondLvButton.setIcon(pC.setPreferredIcon(this.secondLevelBtImg, LEVEL_BUTTON_DIMENSION));
           this.repaint();}
        
        if(e.getSource().equals(pauseButton)){
           pauseButton.setIcon(pC.setPreferredIcon(this.pauseButtonImg, STANDARD_BUTTON_DIMENSION));
           fLaP.setFocus(fLaP);
           sLaP.setFocus(sLaP);
           this.repaint();
        }
        
        if(e.getSource().equals(forwardButton)){
           forwardButton.setIcon(pC.setPreferredIcon(super.forwardButtonImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();
        }
        
        if(e.getSource().equals(backwardButton)){
           backwardButton.setIcon(pC.setPreferredIcon(super.backwardButtonImg, STANDARD_BUTTON_DIMENSION));
           this.repaint();
        }
                
        
    };// end method buttonMouseExitedPerformed()
    
    
    public void buttonMouseClickedPerformed(MouseEvent e){
        boolean isSetToBack= false;
        boolean isSetToFront= false;
        
        
        if(e.getSource().equals(startButton)){
            exchangePanel(cP,sP);
            } // if startButton
        
        if(e.getSource().equals(infoButton)){
           
           for(int i=0;i<Array.getLength(panelArray);i++){
               if(isSetToBack == false){
                    if(robotPane.getPosition(panelArray[i])==0){
                        robotPane.moveToBack(panelArray[i]);
                        isSetToBack=true;
                    }//end if (positon)
               }// end if (setToBack)
            }
           robotPane.moveToFront(iP);
        }// end if infoButton
        
        
        
        if(e.getSource().equals(previewButton)){
            isSetToBack = false;
                if(isSetToFront== true){
                    for(int i=0;i<Array.getLength(panelArray);i++){
                        if(robotPane.getPosition(panelArray[i])==1 && isSetToBack == false){
                            robotPane.moveToBack(panelArray[i]);
                            isSetToBack = true;
                        }// end if moveToBack
                    } // end for cicle
                }
                for(int j=0; j<Array.getLength(panelArray);j++){
                        if(robotPane.getPosition(panelArray[j])==8 && isSetToFront==false){
                            robotPane.moveToFront(panelArray[j]);
                            isSetToFront = true;
                        }// end if moveToFront
                    }// end for cicle (j)            
        } // end if previewButton
        
        
        
        
        
        if(e.getSource().equals(acceptButton)){
            if(nickName != null && nation != null){
                exchangePanel(sP,rCP);}
            scoreP.setPlayerName(nickName);
            } // if acceptButton
        
        if(e.getSource().equals(declineButton)){
            nickName = null;
            nation = null;
            nameTextField.setText("");
        }// end if declineButton
        
        if(e.getSource().equals(ratingButton)){
            isSetToBack = false;
            for(int i=0;i<Array.getLength(panelArray);i++){
               if(isSetToBack == false){
                    if(robotPane.getPosition(panelArray[i])==0){
                        robotPane.moveToBack(panelArray[i]);
                        isSetToBack=true;
                    }//end if (positon)
               }// end if (setToBack)
            }
           robotPane.moveToFront(rP);
        }// end if ratingButton
        
        
        if(e.getSource().equals(buttonR1)){
            exchangePanel(rCP,lOP);
        }// end if buttonR1
        
        if(e.getSource().equals(buttonR2)){
            fLaP.setGoldRobot("Gold Robot");
            sLaP.setGoldRobot("Gold Robot");
            exchangePanel(rCP,lOP);
        }// end if buttonR2
        
        if(e.getSource().equals(firstLvButton)){
            robotPane.moveToBack(lOP);
            robotPane.moveToFront(fLaP);
            sLaP.setLocked();
            fLaP.setUnlocked();
            fLaP.setDot(8);
            fLaP.setInitScore();
            fLaP.startMusic();
            fLaP.setDefaultPosition();
            fLaP.setTimeGame(230);
            scoreP.setCountZero();
            fLaP.requestFocus();
            fLaP.startEnemyAnimation();
            changeTimer.start();
        }// end if firstLvButton
        
        if(e.getSource().equals(secondLvButton)){
            if(AbstractAnimation.isWeaponUnlocked==true){
                robotPane.moveToBack(lOP);
                robotPane.moveToFront(sLaP);
                sLaP.setDot(8);
                sLaP.requestFocus();
                sLaP.setDefaultPosition();
                fLaP.setLocked();
                sLaP.setUnlocked();
                sLaP.startEnemyAnimation();
                sLaP.startMusic();
                changeTimer.start();
            }// end if isWeaponUnlocked
        }
        
        
        
        
        if(e.getSource().equals(pauseButton)){
            
            if(isPaused==false){
                fLaP.stopEnemyAnimation();
                sLaP.stopEnemyAnimation();
                isPaused=true;
            }
            else{
                fLaP.startEnemyAnimation();
                sLaP.startEnemyAnimation();
                isPaused=false;
            }
        }// end if pauseButton()
        
        if(e.getSource().equals(forwardButton)){
            robotPane.moveToBack(scoreP);
            robotPane.moveToFront(lOP);
            fLaP.setTimeGame(230);
            AbstractAnimation.isWeaponUnlocked=true;
        }
        
        if(e.getSource().equals(backwardButton)){
            exchangePanel(scoreP,cP);
            sLaP.setLocked();
            nickName = null;
            nation = null;
            nameTextField.setText("");
            isGameEnd = false;
            AbstractAnimation.isWeaponUnlocked=false;
            
        } 
        
            this.setComponentVisibility();
           
        
            
            
    };// end method buttonMouseClickedPerformed()    
    
    public void setComponentVisibility(){
        infoButton.setVisible(false);
        ratingButton.setVisible(false);
        previewButton.setVisible(false);
        startButton.setVisible(false);
        nationalityBox.setVisible(false);
        nameTextField.setVisible(false);
        buttonR1.setVisible(false);
        buttonR2.setVisible(false);
        acceptButton.setVisible(false);
        declineButton.setVisible(false);
        firstLvButton.setVisible(false);
        secondLvButton.setVisible(false);
        pauseButton.setVisible(false);
        forwardButton.setVisible(false);
        backwardButton.setVisible(false);
            if(robotPane.getPosition(cP)==0){
                startButton.setVisible(true);
            }        
            if(robotPane.getPosition(sP)==0){
                infoButton.setVisible(true);
                ratingButton.setVisible(true);
                nationalityBox.setVisible(true);
                nameTextField.setVisible(true);
                acceptButton.setVisible(true);
                declineButton.setVisible(true);
            }
            if(robotPane.getPosition(iP)==0){
                previewButton.setVisible(true);
            }  
            if(robotPane.getPosition(rCP)==0){
                buttonR1.setVisible(true);
                buttonR2.setVisible(true);
            }
            if(robotPane.getPosition(rP)==0){
                
                if(isGameEnd == false){
                    previewButton.setVisible(true);
                }
                if(isGameEnd == true){
                    backwardButton.setVisible(true);
                }
            }
            if(robotPane.getPosition(lOP)==0){
                firstLvButton.setVisible(true);
                secondLvButton.setVisible(true);
            }
            if(robotPane.getPosition(fLaP)==0){
                pauseButton.setVisible(true);
                infoButton.setVisible(true);
            }
            if(robotPane.getPosition(sLaP)==0){
                pauseButton.setVisible(true);
                infoButton.setVisible(true);
            }
            
            if(robotPane.getPosition(scoreP)==0){
                forwardButton.setVisible(true);
            }
            
    };// end method setButtonVisibility()
    
    
    private void nameTextFieldActionPerformed() {                                              
       nickName = nameTextField.getText();
       if(nickName.length()>8){
       JOptionPane.showMessageDialog(this,"Max 8 characters","Information",JOptionPane.INFORMATION_MESSAGE);
       }
       else{
       System.out.println(nickName);}
    } // end method nameTextFieldActionPerformed()    
    
    private void nationalityBoxActionPerformed(ActionEvent evt) {                                               
       nationSelected = (JComboBox)evt.getSource();
       nation = (String)nationSelected.getSelectedItem();
       System.out.println(nation);
    } // end nationalityBoxActionPerformed() 
    
    
    
    
    //--------------------------------------------
    //EVENT MOUSE HANDLER 
    //-----------------------------------
    private MouseAdapter eventMouseHandler(){
        return new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                        buttonMouseClickedPerformed(e);
                    } // end mouseClicked()
            @Override     
            public void mouseEntered(MouseEvent e){
                        buttonMouseEnteredPerformed(e);
                    };// end mouseEntered
            @Override
            public void mouseExited(MouseEvent e){
                        buttonMouseExitedPerformed(e);
                    };
        };
    };// end method eventMouseHandler()
    
    //--------------------------------------------
    //END EVENT MOUSE HANDLER 
    //-----------------------------------
    
    
    //---------------------------------------------------
    
    
    public void exchangePanel(AbstractPanel panelToBottom, AbstractPanel panelToTop){
        robotPane.moveToBack(panelToBottom);
        robotPane.moveToFront(panelToTop);
    };// end method exchangePanel()
         
    @Override
    public void actionPerformed (ActionEvent evt){
        if(fLaP.getTimeGame()<0){
            scoreP.setScore(fLaP.getScoreGame());
            fLaP.stopMusic();
            robotPane.moveToBack(fLaP);
            robotPane.moveToFront(scoreP);
            scoreP.getScoreTimer().start();
            this.setComponentVisibility();
            this.changeTimer.stop();
        }// end if GameTerminated
        if(sLaP.isTerminated()==true){
            player = new Player (nickName,nation,sLaP.getScoreGame());
            rP.setPlayerList(player);
            rP.setPlayerClassification();
            sLaP.stopMusic();
            robotPane.moveToBack(sLaP);
            robotPane.moveToFront(rP);
            isGameEnd = true;
            this.setComponentVisibility();
            this.changeTimer.stop();
        }// end if isTerminated
        
        
        
    }// end actionPerformed
    
    
    
    
}// end class
