/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.getfilesize;

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hank
 */
public class GetFileSize {

    public static void main(String[] args) {
        if (args.length < 1) {
            Logger.getLogger(GetFileSize.class.getName()).log(Level.SEVERE, "Need to give url args");
            return ;
        }
        try {
            URL url = new URL(args[0]);
            UrlProcessor process = new UrlProcessor(url);
            System.out.println("Target url size " + process.calculateSize());
        } catch (MalformedURLException ex) {
            Logger.getLogger(GetFileSize.class.getName()).log(Level.SEVERE, "Can't found url", ex);
        }

    }
}
