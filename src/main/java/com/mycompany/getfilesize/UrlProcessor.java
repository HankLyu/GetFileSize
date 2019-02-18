/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.getfilesize;

import java.io.BufferedInputStream;
import java.net.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hank
 */
public class UrlProcessor {

    private URL url;

    public UrlProcessor(URL url) {
        this.url = url;
    }

    public void setBufferedInputStream(URL url) {
        this.url = url;
    }

    public int calculateSize() {
        int sum = 0;
        try (BufferedInputStream bs = new BufferedInputStream(url.openStream());) {
            int offset = 0;
            byte[] b = new byte[4 * 2 ^ 20];
            int len;
            while ((len = bs.read(b, 0, b.length)) != -1) {
                sum += len;
            }
        } catch (IOException ex) {
            Logger.getLogger(UrlProcessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sum;
    }

}
