package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;
import java.util.*;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);//T
        int a1 = hw.Method3(6, 0, 0);//F
        int a2 = hw.Method3(0,0,3);//T
        int b = hw.Method3(0,0,-3);//T
        int b1 = hw.Method3(0, 0, 0);//F
        //int c = hw.Method3(5,0,0);
    	
    }

    @Test
    public void testMethod4() {
        /**
         * TODO：finish the test function
         */
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0, 0, 0, 0, 0);//T
        int b1 = hw.Method4(5, 0, 0, 0, 0);//T
        int b3 = hw.Method4(3, 3, 0, 0, 0);//T 
        try{
            int b = hw.Method4(1, 0, 0, 0, 0);//F
        }catch(Exception e){}    
        try{
            int b2 = hw.Method4(5, 0, 1, 0, 0);//F
        }catch(Exception e){}     
    }

    @Test
    public void testisTriangle() {
        /**
         * TODO：finish the test function
         */
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isTriangle(1, 1, 1);
        boolean a1 = hw.isTriangle(1, 1, -1);
        boolean a2 = hw.isTriangle(1, -1, -1);
        boolean a3 = hw.isTriangle(-1, -1, -1);
        boolean b = hw.isTriangle(2, 1, 1);
        boolean b1 = hw.isTriangle(2, 3, 1);
        boolean b2 = hw.isTriangle(2, 1, 4);       
    }

    @Test
    public void testisBirthday() {
        /**
         * TODO：finish the test function
         */
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isBirthday(1990, 1, 1);//T
        boolean a1 = hw.isBirthday(1990, 1, 40);
        boolean a2 = hw.isBirthday(1990, 1, -1);
        boolean a3 = hw.isBirthday(1990, 13, 1);
        boolean a4 = hw.isBirthday(1990, -1, 1);
        boolean a5 = hw.isBirthday(2222, 1, 1);
        boolean a6 = hw.isBirthday(199, 1, 1);
        boolean b = hw.isBirthday(2000, 2, 2);
        boolean b1 = hw.isBirthday(2000, 2, 30);
        boolean b2 = hw.isBirthday(2001, 2, 2);
        boolean b3 = hw.isBirthday(2001, 2, 30);
        boolean c = hw.isBirthday(2019, 3, 1);
        boolean c1 = hw.isBirthday(2019, 4, 31);
        boolean c2 = hw.isBirthday(2019, 10, 1);
        boolean c3 = hw.isBirthday(2019, 10, 2);
        boolean d = hw.isBirthday(2018, 9, 31);

    }

    @Test
    public void testminiCalculator() {
        /**
         * TODO：finish the test function
         */
        HelloWorld hw = new HelloWorld();
        double a = hw.miniCalculator(1, 2, '&');//T
        double a1 = hw.miniCalculator(1, 2, '+');//T
        double a2 = hw.miniCalculator(1, 2, '-');//T
        double a3 = hw.miniCalculator(1, 2, '*');//T
        double a4 = hw.miniCalculator(1, 2, '/');//T
        double a5 = hw.miniCalculator(1, 0, '/');//T

    }

    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
}
