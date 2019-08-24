package com.learn;

public class C {
    double a;
    C(){
        System.out.println("Default");
    }
    C(int x){
        a=x;
        System.out.println("Parametrized");
    }
    public void finalize(){
        System.out.println(a+" is getting destroyed");
    }
    public String toString(){
        return a+" ";
    }
	public static void main (String[] args) {
		C x=new C();
		C y=new C(1);
		{
		    x=new C(2);
		    C z=new C(3);
		}
		for(int i=4;i<=20;i++){
		    y=new C(i);
		}
		System.gc();
		System.out.println(x);
		System.out.println(y);
	}
}
