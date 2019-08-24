package com.learn;

import java.util.Scanner;
class ReverseOfSentence{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        System.out.println(sb.reverse());
        
    }
}