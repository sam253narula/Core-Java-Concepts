package com.learn;

public class DemoOfToString {
	
	    int a,b;
	    public void set(int x,int y){
	        a=x;
	        b=y;
	    }
	    public String toString(){
	        return (a+" "+b);
	    }
	    public static void main(String a[]){
	    	DemoOfToString d=new DemoOfToString();
	        d.set(4,5);
	        System.out.println(d);
	    }
	}

