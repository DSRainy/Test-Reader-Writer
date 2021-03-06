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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rainy
 */
public class TestReaderWriter {

    public static void main(String[] args) {
        File fileInput, fileOutput;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        BufferedReader inputFile = null;
        BufferedWriter outputFile = null;
        try {
            fileInput = new File("D:\\test\\test.txt");
            fileInputStream = new FileInputStream(fileInput);
            isr = new InputStreamReader(fileInputStream, "UTF-8");
            inputFile = new BufferedReader(isr);

            fileOutput = new File("D:\\test\\outputwriter.txt");
            fileOutputStream = new FileOutputStream(fileOutput);
            osw = new OutputStreamWriter(fileOutputStream, "UTF-8");
            outputFile = new BufferedWriter(osw);

            int c = 0;
            while ((c = inputFile.read()) != -1) {
                outputFile.write((char) c);
                System.out.print((char) c);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestReaderWriter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestReaderWriter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                inputFile.close();
                outputFile.close();
                isr.close();
                osw.close();
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(TestReaderWriter.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
