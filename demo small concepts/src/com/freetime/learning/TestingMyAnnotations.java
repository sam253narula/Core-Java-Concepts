package com.freetime.learning;

import java.lang.reflect.Method;

public class TestingMyAnnotations {

	public static void main(String[] args) throws Exception {
		TestMySinghleValueAnnottaionWithDefaultValue annottaionWithDefaultValue = new TestMySinghleValueAnnottaionWithDefaultValue();
		Method method = annottaionWithDefaultValue.getClass().getMethod("sayHello");
		MySinghleValueAnnotaionWithDefaultValue realdeal  =   method.getAnnotation(MySinghleValueAnnotaionWithDefaultValue.class);
		System.out.println("value is: "+realdeal.value());
	}
}

class TestMySinghleValueAnnottaionWithDefaultValue {
	
	@MySinghleValueAnnotaionWithDefaultValue(value = 24)
	public void sayHello() {
		System.out.println("hello annotation");
	}
}
