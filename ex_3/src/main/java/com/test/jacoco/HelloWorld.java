package com.test.jacoco;

import javax.imageio.event.IIOReadWarningListener;
import java.util.*;


public class HelloWorld {
    public HelloWorld() {

    }

    public String Method1() {
        return "Hello World";
    }

    public int Method2(int a, int b) {
        return a + b;
    }
    
    public int Method3(int a, int b, int c){
    	if((a>5&&b<0)||c>0) {
    		System.out.println("Condition 1");
    	}
    	else if(a<5 && c<-2 ) {
    		System.out.println("Condition 2");
    	}
    	else {
    		System.out.println("Condition 3");
    	}
    	return 0;
    }
    public int Method4(int a, int b, int c, int d, float e) {
    	if(a == 0) {
    		return 0;
    	}
    	int x = 0;
    	if((a == b) || ((c == d) && (bug(a)))) {
    		 x = 1; 
    	}
    	e = 1/x;
    	return 0;
    }
    public boolean bug(int a) {
    	if(a == 5) return true;
    	return false;
    }
    
    
    public boolean isTriangle(int a, int b, int c) {
    	/**
    	 * TODO: You need to complete this method to determine whether  a
    	 * triangle is formed or not when given the input edge a, b and c.
    	 */
        boolean ret = false;
        if(a>0 && b>0 && c>0){
            if (a+b>c && a+c>b && b+c>a) {
                ret = true;
            }
        }
    	return ret;
    }
    public boolean isBirthday(int a, int b, int c) {
    	/**
    	 * TODO: You need to complete this method to determine whether a 
    	 * legitimate date of birth between 1990/01/01 and 2019/10/01 is 
    	 * formed or not when given the input year, month and day.
    	 */
        HashMap<String,Integer> max=new HashMap<String,Integer>();
        max.put("1",31);
        max.put("2",28);
        max.put("3",31);
        max.put("4",30);
        max.put("5",31);
        max.put("6",30);
        max.put("7",31);
        max.put("8",31);
        max.put("9",30);
        max.put("10",31);
        max.put("11",30);
        max.put("12",31);
        boolean ret = false;
        if(a>=1990 && a<=2019 && b>0 && b<13 && c>0 && c<=31){
            if (b==2) {
                if((a%4==0 && c<30) || (a%4!=0 && c<29)){
                    ret = true;
                }
            }
            else if (a==2019) {
                if((b<=9 && c<= max.get(b+"")) || (b==10 && c==1)){
                    ret = true;
                }
            }
            else if (c<= max.get(b+"")) {
                ret = true;
            }

        }
        return ret;    	
    }
    public double miniCalculator(double a, double b, char op) {
    	/**
    	 * TODO: You need to complete this method to form a small calculator which 
    	 * can calculate the formula: "a op b", the op here can be four basic  
    	 * operation: "+","-","*","/". 
    	 */
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('+',1);
        map.put('-',2);
        map.put('*',3);
        map.put('/',4);
        double result = 0.0;
        Integer operation = map.get(op);
        if (operation!=null){
            switch(operation){
                case 1:
                    result = a+b;break;
                case 2:
                    result = a-b;break;
                case 3:
                    result = a*b;break;
                default:
                    if (b!=0) {
                        result=a/b;
                    }
                    break;
            }
        }
    	return result;
    }
    
}
