package com.learn;

import java.util.HashSet;
import java.util.Set;

public class TestHowSetWorks {
public static void main(String[] args) {
	 Set<String> obj = new HashSet<>();
	    System.out.println(obj.add("123")); //Output : true
	    System.out.println(obj.add("123")); //Output : false
}
}
