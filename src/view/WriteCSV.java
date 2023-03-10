/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Utente
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.LinkedList;



public class WriteCSV {
    
    public static void print(String fileName, String charset, LinkedList<String[]> lstSA) throws IOException{
        PrintWriter printWriter = new PrintWriter(
            new BufferedWriter(
                new OutputStreamWriter(
                    new FileOutputStream(fileName), charset)), true);

        for (String[] sArr : lstSA)
            for (int i = 0; i < sArr.length; i++)
                if (i < (sArr.length - 1))
                    printWriter.print(sArr[i] + ";");
                else
                    printWriter.print(sArr[i] + "\r\n");

        printWriter.close();
    }// end method print()
    
}// end class
