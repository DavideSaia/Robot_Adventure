/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Utente
 */
public class Config {
    
    
    // STATIC FIELDS
    private static Config config = null;
    
    //INSTANCE FIELDS
    private Properties properties;
    
    
    private Config(){   
                BufferedReader buffRead = null;
        try {
            buffRead = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("config.txt"),"UTF-8"));
            
            this.properties = new Properties();
            this.properties.load(buffRead);
        }
        catch(FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null,
                        "Configuration file not found, the program will be closed.",
                        "Serious ERROR",
                        JOptionPane.ERROR_MESSAGE);
            System.exit(-1);
        }
        catch(IOException ioe) {
            JOptionPane.showMessageDialog(null,
                        "Unable to read the configuration file, the program will be closed.",
                        "Serious ERROR",
                        JOptionPane.ERROR_MESSAGE);
            System.exit(-1);
        }
        finally {
            try {
                if (buffRead != null)
                    buffRead.close();
            }
            catch(IOException ioe) {
                ioe.printStackTrace();
            }
        } // end finally
    
    
    }// end constructor
    
    
    // INSTANCE METHOD
    public String getFirstLevelBackground(){
        return this.properties.getProperty("firstLevelBackground");
    }// end method getFirstLevelBackground
    
    public String getSecondLevelBackground(){
        return this.properties.getProperty("secondLevelBackground");
    }// end method getSecondLevelBackground
    
    
    // STATIC METHODS
    public static Config getInstance(){
        if(config == null)
            config = new Config();
        return config;
    }// end method getInstance
    
    
}// end class
