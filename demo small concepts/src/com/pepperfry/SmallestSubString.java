package com.pepperfry;

public class SmallestSubString {
	public static void main(String[] args) {
		String test = "aabcda";
		char[] testchar = test.toCharArray();
		StringBuilder str = new StringBuilder();

		int count = 0;
		for (int i = 0; i < testchar.length - 1; i++) {
			if (testchar[i] == testchar[i + 1])
				continue;
			if (!str.toString().contains(String.valueOf(testchar[i]).toString())) {
				str.append(testchar[i]);
				count++;
			} else {
				break;
			}
		}
		System.out.println(count);
	}
}
