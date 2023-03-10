/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 *
 * @author Utente
 */
public class StringCreator {
    private Font f;
    private String s;
    public final static String FONTPDK = "/Font/pdark.ttf";
    
        public void StringCreator(){};
        
    public Font applyFont (String s,int size){
        Font newFont;
        try{
           f= Font.createFont(Font.TRUETYPE_FONT, new File ((getClass().getResource(s)).toURI()));
        }
           catch(URISyntaxException uri){
               System.out.print("Argomento errato");
           }
           catch(IllegalArgumentException iae){
               System.out.print("Argomento errato");
           }
            catch(IOException ioe){
               System.out.print("File non trovato");
           }
           catch(FontFormatException ffe){
               System.out.print("Font non trovato");
           }
        
            newFont = f.deriveFont(f.getStyle(), size);
        
        return newFont;
    };
    
    public Color newColor (int r,int gC, int b){
        Color c = new Color (r,gC,b);
            return c;
    };
        
    public void stringDrawer (Graphics g,String s,Font nF,Color nC,int posX,int posY){
        Graphics2D g2D = (Graphics2D)g;
        g2D.setColor(nC);
        g2D.setFont(nF);
        g2D.drawString(s, posX, posY);
    };//end method stringDrawer
    
    
    
    
}//end class
