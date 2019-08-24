package com.learn;

import java.util.ArrayList;
/**
 * input:- "Hello all hi all bye all"
 * word:- all
 *1)Check whether word is present or not.
 *2)Count number of occurrence.
 *3)Invalid Cases - "Helloallhiall"
 *4)Tell me the position of word
 * 
 */

import java.util.Scanner;

/**
 * @author Samarth Narula.
 *
 */

class StringMethodsLearn {
	private static final String YES = "yes";
	private static final String NO = "no";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();
		String[] inputWordsArray = input.split(" ");
		choseOperation(sc, input, inputWordsArray);
	}

	private static Boolean askUser(Scanner sc, String input, String[] inputWordsArray, int choice) {
		System.out.println("Do you want to perform any other operations: ");
		String UserReply = sc.nextLine();
		if (UserReply.equalsIgnoreCase(YES))
			return true;
		else if (UserReply.equalsIgnoreCase(NO))
			return false;
		else if (!UserReply.equalsIgnoreCase(YES) || !UserReply.equalsIgnoreCase(NO)) {
			System.out.println("Please provide a valid input in yes or no \n Let's start again");
			choseOperation(sc, input, inputWordsArray);
		}
			return false;
		
		
	}
	
	private static void choseOperation(Scanner sc, String input, String[] inputWordsArray) {
		System.out.println(
				"Choose which operation you want to perform on sentence from the following operations mentioned below: \n"
						+ "1)Find whether the word is present in the sentence \n"
						+ "2)Find the count of occurrences of a particular word \n"
						+ "3)Find an index of the first occurrence of a word of the sentence \n"
						+ "4)Enter the word to find index's of all its occurrence of the provided sentence");
		int choice = sc.nextInt();
		sc.nextLine();
		allOperationBundle(sc, input, inputWordsArray, choice);
	}

	private static void allOperationBundle(Scanner sc, String input, String[] inputWordsArray, int choice) {

		Boolean userReply = false;
		switch (choice) {
		case 1:
			System.out.println("Enter the word to get if it is present or not");
			String word = sc.nextLine();
			presenceCheckHelper(input, word);
			System.out.println("Do you also want to find invalid cases for the word you have searched presence for");
			String replyFromUser = sc.nextLine();
			findInvalidCaseHelper(inputWordsArray, word, replyFromUser);
			userReply = askUser(sc, input, inputWordsArray, choice);
			if (userReply)
				choseOperation(sc, input, inputWordsArray);
			break;

		case 2:
			System.out.println("Enter the word whose number of occurrence you want to find");
			String findMyOccurance = sc.nextLine();
			occuranceCountHelper(input, findMyOccurance, inputWordsArray);
			userReply = askUser(sc, input, inputWordsArray, choice);
			if (userReply)
				choseOperation(sc, input, inputWordsArray);
			break;
		case 3:
			System.out.println("Enter the word to find index of first occurance");
			String findMyindex = sc.nextLine();
			findFirstOccuranceOfWordHelper(input, inputWordsArray, findMyindex);
			userReply = askUser(sc, input, inputWordsArray, choice);
			if (userReply)
				choseOperation(sc, input, inputWordsArray);
			break;
		case 4:
			System.out.println("Enter the word to find index's of all occurance");
			findMyindex = sc.nextLine();
			findMultipleOccuranceHelper(input, inputWordsArray, findMyindex);
			userReply = askUser(sc, input, inputWordsArray, choice);
			if (userReply)
				choseOperation(sc, input, inputWordsArray);
			break;

		default:
			System.out.println("Please provide a valid input from the list");
			choseOperation(sc, input, inputWordsArray);
		}
	}

	private static void findMultipleOccuranceHelper(String input, String[] inputWordsArray, String findMyindex) {
		ArrayList<Integer> indexList = new ArrayList<>(inputWordsArray.length);
		String nonCheckedString = "";
		String checkedString = "";
		for (String wordsInsentence : inputWordsArray) {

			if (wordsInsentence.equalsIgnoreCase(findMyindex)) {
				if (indexList.isEmpty() && nonCheckedString.isEmpty()) {
					int index = input.indexOf(findMyindex);
					indexList.add(index);
					checkedString = input.substring(0, index + findMyindex.length() + 1);
					nonCheckedString = input.substring(index + findMyindex.length() + 1);
				} else if (!nonCheckedString.isEmpty()) {
					int index = checkedString.length() + nonCheckedString.indexOf(findMyindex);
					indexList.add(index);
					if (index + findMyindex.length() < input.length())
						nonCheckedString = input.substring(index + findMyindex.length() + 1);
				}
			}
		}
		System.out.println("All indexes of this word " + findMyindex + " are:" + indexList.toString());
	}

	private static void findFirstOccuranceOfWordHelper(String input, String[] inputWordsArray, String findMyindex) {
		int index = input.indexOf(findMyindex);
		if (index != -1)
			System.out.println("Index found for the entered word is: " + index);
		else
			System.out.println("No index's found for the entered word");
	}

	/*
	 * public static boolean containsInBetween(String wordforcheck,String InnerWord)
	 * { if(wordforcheck.indexOf(InnerWord, 1) != -1){ return true; } return false;
	 * }
	 */
	private static void findInvalidCaseHelper(String[] inputWordsArray, String word, String replyFromUser) {

		if (replyFromUser.equalsIgnoreCase(YES)) {
			int countinvalidOccurances = 0;

			for (String wordsInsentence : inputWordsArray) {
				/*
				 * Boolean result = containsInBetween(wordforcheck, word); if(result == true)
				 * countinvalidOccurances++;
				 */
				if ((wordsInsentence.indexOf(word, 1) != -1) == true) {
					countinvalidOccurances++;
				}
			}
			System.out.println("Invalid cases of the search word are " + countinvalidOccurances);
		} else if (replyFromUser.equalsIgnoreCase(NO)) {
			System.out.println("ok user");
		} else {
			System.out.println("Please reply only yes or no");
		}
	}

	private static void occuranceCountHelper(String input, String findMyOccurance, String[] inputWordsArray) {
		int count = 0;
		for (String temp : inputWordsArray) {
			if (temp.equalsIgnoreCase(findMyOccurance))
				count++;
		}
		System.out.println("The word " + findMyOccurance + " has occured " + count + " times");
	}

	private static void presenceCheckHelper(String input, String word) {
		int presencechecker = input.indexOf(word);
		if (presencechecker == 0) {
			System.out.println("word " + word + " is not present in the sentence");
		} else {
			System.out.println("word " + word + " is present in the sentence");
		}
	}
}
