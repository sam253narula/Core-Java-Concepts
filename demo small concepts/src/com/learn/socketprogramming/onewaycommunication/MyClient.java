package com.learn.socketprogramming.onewaycommunication;

import java.io.*;  
import java.net.*;  

//Run the server first then shift this class to new file and run it as separate java instance or run it in a different eclipse workstation
public class MyClient {  
public static void main(String[] args) {  
try{      
Socket s=new Socket("localhost",6666);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("Hello Server");  
dout.flush();  
dout.close();  
//s.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  
