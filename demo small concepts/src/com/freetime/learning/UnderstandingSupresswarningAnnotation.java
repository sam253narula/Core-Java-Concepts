package com.freetime.learning;
import java.util.*; 

public class UnderstandingSupresswarningAnnotation {
     
    @SuppressWarnings("unchecked")  
    public static void main(String args[]){  
    ArrayList list=new ArrayList();  
    list.add("sonoo");  
    list.add("vimal");  
    list.add("ratan");  
      
    for(Object obj:list)  
    System.out.println(obj);  
      
    }}  
