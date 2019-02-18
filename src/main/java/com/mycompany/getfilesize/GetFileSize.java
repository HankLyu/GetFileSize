/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.getfilesize;

import java.net.*;
import java.io.*;

/**
 *
 * @author hank
 */
public class GetFileSize {

    public static void main(String[] args) throws Exception {
        UrlProcesser process = new UrlProcesser(
                new URL("https://3.bp.blogspot.com/-zNytxD3egzw/XGUro1yx2SI/AAAAAAAA1FY/yn0u0u3CMY8gACKxonANK8UYkqH6gGk-QCLcBGAs/s1600/01_valentine.jpg"));
        System.out.println("Target url size" + process.calculateSize());
    }
}
