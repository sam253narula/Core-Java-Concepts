import java.util.Scanner;
public class NumberToWords{
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = 1,counter = 0,numRePopulate = num,numCopy;
        while(num != 0){
            int lastDigit = num%10;
            counter++;
            num = num/10;
        }
      //  System.out.println("value of counter " + counter);
        while(counter != 0){
            
            temp = 1;
            for(int i = 1;i <= counter -1;i++){
               temp = temp*10;  
            }  
          //  System.out.println("value of temp " + temp);
            numCopy = numRePopulate/temp;
            counter --;
            if(numCopy == 0){
            System.out.print("zero");
            }
            else if(numCopy == 1){
            System.out.print("One");
            }
            else if(numCopy == 2){
            System.out.print("two");    
            }
            else if(numCopy == 3){
            System.out.print("three");    
            }
            else if(numCopy == 4){
            System.out.print("four");    
            }
            else if(numCopy == 5){
            System.out.print("five");    
            }
            else if(numCopy == 6){
            System.out.print("six");    
            }
            else if(numCopy == 7){
            System.out.print("seven");    
            }
            else if(numCopy == 8){
            System.out.print("eight");    
            }
            else if(numCopy == 9){
            System.out.print("nine");      
            }
           
            numRePopulate  = numRePopulate%temp;
           // System.out.println("value of numRePopulate after last digits left  is::  " + numRePopulate);
           }
           
        }
    }

