/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soundtrack;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Utente
 */
public class AudioClip {
    
    private final static String VICTORY_AUDIO_PATH = "/Audio/victory_audio_2.wav";
    private final static String LOSE_AUDIO_PATH = "/Audio/lose_audio.mp3";
    private final static String GAME_TRACK_PATH = "/Audio/game_track_2.wav";
    private final static String ROBOT_DEATH_AUDIO_PATH = "/Audio/robot_death_audio.wav";
    private final static String ZOMBIE_HURT_AUDIO_PATH = "/Audio/zombie_hurt.mp3";
    private final static String FINAL_BATTLE_AUDIO_PATH = "/Audio/final_battle_audio.wav";
    private static AudioInputStream victoryAudio;
    private static AudioInputStream gameTrackAudio;
    private static AudioInputStream finalBTrackAudio;
    private static AudioInputStream robotDeathAudio;
    private static Clip victoryClip;
    private static Clip gameTrackClip;
    private static Clip finalBTrackClip;
    private static Clip robotDeathClip;
    private static int millisecondsLength;
    
    
    public AudioClip(){
        try{
            victoryAudio = AudioSystem.getAudioInputStream(new File(getClass().getResource(VICTORY_AUDIO_PATH).toURI()));
            gameTrackAudio = AudioSystem.getAudioInputStream(new File(getClass().getResource(GAME_TRACK_PATH).toURI()));
            finalBTrackAudio = AudioSystem.getAudioInputStream(new File(getClass().getResource(FINAL_BATTLE_AUDIO_PATH).toURI()));
            robotDeathAudio = AudioSystem.getAudioInputStream(new File(getClass().getResource(ROBOT_DEATH_AUDIO_PATH).toURI()));
        }
        catch(URISyntaxException uri){
            System.out.print("URI Syntax errata");
        }
        catch(UnsupportedAudioFileException uafe){
            System.out.print("File audio non supportato");
        }
        catch (IOException ioe){
            System.out.print("File non trovato");
        }
        
        DataLine.Info dataLineInfo = new DataLine.Info(Clip.class,victoryAudio.getFormat());
        DataLine.Info dataLineInfo1 = new DataLine.Info(Clip.class,gameTrackAudio.getFormat());
        DataLine.Info dataLineInfo2 = new DataLine.Info(Clip.class,finalBTrackAudio.getFormat());
        DataLine.Info dataLineInfo3 = new DataLine.Info(Clip.class,robotDeathAudio.getFormat());
        
        try{
            victoryClip = (Clip) AudioSystem.getLine(dataLineInfo);
            gameTrackClip = (Clip) AudioSystem.getLine(dataLineInfo1);
            finalBTrackClip = (Clip) AudioSystem.getLine(dataLineInfo2);
            robotDeathClip = (Clip) AudioSystem.getLine(dataLineInfo3);
        }
        catch(LineUnavailableException lue){
            System.out.print("line non utilizzabile");
        }
        
        millisecondsLength = (int)(gameTrackClip.getMicrosecondLength()/1000);
        
    }// end constructor 
    
        
    /*public  static void main (String []args) throws Exception{
        new AudioClip();
        
        /*victoryClip.open(victoryAudio);
        victoryClip.start();
        
        Thread.sleep(3200);
        
        victoryClip.close();
        victoryAudio.close();
        
        gameTrackClip.open(gameTrackAudio);
        //gameTrackClip.setLoopPoints(50000,80000);
        gameTrackClip.start();
        
        gameTrackClip.loop(4);
        
        
        System.out.print(gameTrackClip.getFrameLength());
         
        Thread.sleep(2*gameTrackClip.getMicrosecondLength()/1000);
        
        gameTrackClip.close();
        gameTrackAudio.close();
        
        
        
        
    }// end method main */
        
    
    public Clip getVictoryClip(){
        return AudioClip.victoryClip;
    }// end method getVictoryClip()
    
    public AudioInputStream getVictoryAudio(){
        return AudioClip.victoryAudio;
    }// end method getVictoryAudio()
    
    public Clip getGameClip(){
        return AudioClip.gameTrackClip;
    }// end method getVictoryClip()
    
    public AudioInputStream getGameAudio(){
        return AudioClip.gameTrackAudio;
    }// end method getVictoryAudio()
    
    public Clip getFinalBattleClip(){
        return AudioClip.finalBTrackClip;
    }// end method getVictoryClip()
    
    public AudioInputStream getFinalBattleAudio(){
        return AudioClip.finalBTrackAudio;
    }// end method getVictoryAudio()
    
    
    public Clip getRobotDeathClip(){
        return AudioClip.robotDeathClip;
    }// end method getVictoryClip()
    
    public AudioInputStream getRobotDeathAudio(){
        return AudioClip.robotDeathAudio;
    }// end method getVictoryAudio()
    
    
}// end class 
