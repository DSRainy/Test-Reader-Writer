/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rainy.test.testio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rainy
 */
public class TestReaderWriter {
    
    public static void main(String[] args) {
        
        try {
            File fileInput = new File("C:\\Users\\Rainy\\Downloads\\test.txt");
            FileInputStream fileInputStream = new FileInputStream(fileInput);
            InputStreamReader isr = new InputStreamReader(fileInputStream, "UTF8");
            FileReader fileReader = new FileReader(fileInput);
            
            BufferedReader inputFile = new BufferedReader(isr);
            
            FileWriter fileOutput = new FileWriter("C:\\Users\\Rainy\\Downloads\\output.txt");
//            OutputStreamWriter osw = new OutputStreamWriter(fileOutputStream, "UTF8");
            BufferedWriter outputFile = new BufferedWriter(fileOutput);
            int ch = 0;
            while ((ch = inputFile.read()) != -1) {
                System.out.print((char) ch);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestReaderWriter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestReaderWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
