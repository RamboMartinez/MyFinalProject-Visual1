package com.mycompany.pokemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;


// Code from visual programming class to read a url

public class UrlHelper {
    
    // This will iterate throw the 250 pokemon I want to do
    // I am not sure where i am supposed to put it but I know it has to be in this file
//    for i = 1, 251, i++){
//        url = "https://pokeapi.co/api/v2/nature/" + i + "/";
//    }  
    ;
    public static String getResponse(String url){
    // code from: https://docs.oracle.com/javase/tutorial/networking/urls/readingWriting.html
        URL oracle;
        try {
            oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine;
            StringBuilder sb = new StringBuilder();
            
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
//                jTextArea1.append(inputLine);
                sb.append(inputLine);
            }
            in.close();
            
            return sb.toString();
                    
        } catch (MalformedURLException ex) {
//            Logger.getLogger(UrlViewer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
//            Logger.getLogger(UrlViewer.class.getName()).log(Level.SEVERE, null, ex);
        }
        // end code from above URL  
        return null;
    }
   
}
