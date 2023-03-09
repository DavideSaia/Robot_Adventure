/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Utente
 */

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;




public class ReadCSV {
    
    public static LinkedList<String[]> getRows(String fileName, String charset) throws FileNotFoundException, IOException {
        LinkedList<String[]> lstRows = null;

    BufferedReader buffRead = null;
    try {
        buffRead = new BufferedReader(
             new InputStreamReader(
                 new FileInputStream(fileName), charset));

        lstRows = new LinkedList<String[]>();
         String s = null;

        while ((s = buffRead.readLine()) != null)
             if (!s.isEmpty() && s.contains(";"))
                 lstRows.add(s.trim().split(";"));
    }
        catch(IOException ioe) {
         ioe.printStackTrace();
        }
        finally {
         if (buffRead != null)
             buffRead.close();
        }

     return lstRows;
 }
        
}
