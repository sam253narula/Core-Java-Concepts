package com.experiment;

class Bike {
	int speedlimit = 90;

	public int testMethod() {
		return speedlimit + 20;
	}
}

class Honda3 extends Bike {
	int speedlimit = 150;

	public int testMethod() {
		return speedlimit + 40;
	}
}

public class PolymorphismTestAtUnexpectedLevel {
	public static void main(String args[]) {
		Bike obj = new Honda3();
		System.out.println(obj.speedlimit);// 90
		System.out.println(obj.testMethod()); // 190
	}
}
