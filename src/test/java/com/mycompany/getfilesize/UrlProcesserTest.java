/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.getfilesize;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hank
 */
public class UrlProcesserTest {

    public UrlProcesserTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of calculateSize method, of class UrlProcesser.
     *
     * @throws java.net.MalformedURLException
     */
    @org.junit.Test
    public void testCalculateSize() throws Exception {
        System.out.println("calculateSize");
        String input = "https://3.bp.blogspot.com/-zNytxD3egzw/XGUro1yx2SI/AAAAAAAA1FY/yn0u0u3CMY8gACKxonANK8UYkqH6gGk-QCLcBGAs/s1600/01_valentine.jpg";
        UrlProcessor instance = new UrlProcessor(new URL(input));

        int expResult = 55778;
        int result = instance.calculateSize();
        assertEquals(expResult, result);
        instance.setBufferedInputStream(new URL("https://8.blog.xuite.net/8/8/4/8/22908448/blog_1755256/txt/27907195/1.jpg"));
        expResult = 23588;
        result = instance.calculateSize();
        assertEquals(expResult, result);

    }

}
