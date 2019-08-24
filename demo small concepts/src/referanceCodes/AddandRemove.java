package referanceCodes;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class AddandRemove extends Thread{
	   final Lock lock = new ReentrantLock();
	   final Condition notFull  = lock.newCondition(); 
	   final Condition notEmpty = lock.newCondition(); 
	   final Object[] items = new Object[100];
	   int putptr, takeptr, count;
	   Thread t1,t2;

	AddandRemove(){
		t1 = new Thread(this,"one");
		t2 = new Thread(this,"two");
		t1.start();
		t2.start();
	}
	
	void put(Object x){
		System.out.println("in side put");
		lock.lock();
	     try {
	       while (count == items.length) {
           System.out.println("in side put await called"+" "+"Count"+" "+count);
	    	     notFull.await();
		   }
	       items[putptr] = x; 
	       if (++putptr == items.length) putptr = 0;
	       ++count;
	       notEmpty.signal();
	       System.out.println("in side put signal called"+" "+"Count"+" "+count);
	     } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
	       lock.unlock();
	     }

	}
	  public Object take() throws InterruptedException {
		  System.out.println("in side take");
		     lock.lock();
		     try {
		       while (count == 0) 
				 {
				   System.out.println("in side take await called"+" "+"Count"+" "+count);
		         notEmpty.await();
				 }
		       Object x = items[takeptr]; 
		       if (++takeptr == items.length) takeptr = 0;
		       --count;
		       notFull.signal();
		       System.out.println("in side take signal called"+" "+"Count"+count);
		       return x;
		     } finally {
				 
		       lock.unlock();
		     }
		   } 

	
	public  void run(){
		
		int i=0;
		while(i<=3){
		
			try{
				if(Thread.currentThread()==t1){
				
						put(100);
					
					Thread.sleep(3000);
				}
				if(Thread.currentThread()==t2){
					
						take();
					
					Thread.sleep(1000);
				}
				
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			i++;
		}
	}
	
	public static void main(String args[]){
		AddandRemove a=new AddandRemove();
	}	
}