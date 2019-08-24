package com.learn;

public class ThreadLearn {

	public static void main(String[] args) {
		Thread t = new MyThread();
		Thread t2 = new MyThreadtwo();
		t.start();
		 try{
                t.wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
		
		
		t2.start();
		t2.notify();

	}

}

class MyThread extends Thread{
    public void run(){
        for(int i =0; i<10;i++){
            System.out.println(i);
          
        }
    }
}

class MyThreadtwo extends Thread{
    public void run(){
        for(int i =10; i<20;i++){
            System.out.println(i);
        }
    }
}



