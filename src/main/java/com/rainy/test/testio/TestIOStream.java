/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rainy.test.testio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rainy
 */
public class TestIOStream {

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
//        InputStreamReader inputStreamReader;
        try {
            fileInputStream = new FileInputStream("D:\\test\\test.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
//            inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            fileOutputStream = new FileOutputStream("D:\\test\\outputstream.txt");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            
            int c = 0;
            
            while((c=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write((char) c);
                System.out.print((char) c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestIOStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestIOStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                bufferedInputStream.close();
                bufferedOutputStream.close();
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(TestIOStream.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

    }

}
