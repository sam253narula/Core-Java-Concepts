package com.learn;

import java.io.*;
class A {
    double a;
    A(){
        System.out.println("Default");
    }
    A(int x){
        a=x;
        System.out.println("Parametrized");
    }
    {
        System.out.println("No Static "+a);
    }
    static{
        System.out.println("Static ");
    }
    public String toString(){
        return a+" ";
    }
}
class Demo{
    static{
		    System.out.println("Demo");
		}
	public static void main (String[] args) {
		A x=new A();
		A y=new A(1);
		A z=new A(2);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
