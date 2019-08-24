package com.learn;


public class ThreadLearnTwo {

	public static void main(String[] args) {
		Thread t = new MyThreads("Thread1");
		Thread t2 = new MyThreadthree("Thread2");
		t.start();
		t2.start();
		System.out.println("End of main");

	}

}

class MyThreads extends Thread{
    MyThreads(String name){
        super(name);
    }
    
	public void run(){
        for(int i =0; i<5;i++){
            System.out.println(getName()+" "+i);
        }
    }
}

class MyThreadthree extends Thread{
	MyThreadthree(String name){
        super(name);
    }
    public void run(){
        for(int i =0; i<5;i++){
            System.out.println(getName()+" "+i);
        }
    }
}


