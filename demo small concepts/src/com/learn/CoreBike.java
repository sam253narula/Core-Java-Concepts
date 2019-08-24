package com.learn;

/*import java.util.Scanner;

public class CoreBike {

	public static void main(String[] args) {
		System.out.println("Provide a selection from the menu");
		Scanner sc = new Scanner(System.in);
		String selection = sc.nextLine();
		boolean start = false;
		boolean stop = false;
		Bike bike = new Bike();
		switch (selection) {
		case "Start":
			if(bike.isFrontTyre() == true && bike.isBackTyre() == true && start == false) {
			start = bike.start();
			System.out.println("Bike started");
			}
			else if(bike.isFrontTyre() == true && bike.isBackTyre() == true && start == true)
				System.out.println("Bike is already running");
			break;
			
		case "Stop":
			if(start == true) {
			stop = bike.stop();
			System.out.println("Bike is stopped");
			}
			else {
				System.out.println("Bike is already stopped");
			}
			
			
		}
		

	}

	private static boolean start() {
		boolean start = true;
		return start;
	}

}

class Engine {
	double capacity;

	public Engine(double capacity) {
		super();
		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

}

class Tyre {

	int radious;

	public int getRadious() {
		return radious;
	}

	public void setRadious(int radious) {
		this.radious = radious;
	}

}

class Bike {

	boolean start = false;
	Tyre f,r;
	Engine engine = new Engine(100);

	public boolean isFrontTyre() {
		return frontTyre;
	}

	public boolean isBackTyre() {
		return BackTyre;
	}

	boolean start() {
		if (f!=null&&r!=null&&e!=null&&start != true) {
			boolean start = true;
			Sop("Bike started");

			return start;
		}
		return true;
	}

	boolean stop() {
		boolean stop = true;
		return stop;
	}

	double get0to100() {
		Engine engine = new Engine(100);
		return engine.getCapacity();
	}

	void addFrontTyre(int rad) {
		f=new Tyre(rad);s
	}

	boolean addBackTyre() {
		BackTyre = true;
	}

	void addEngine(double cap) {
		e=new Engine(cap);
	}

}
*/