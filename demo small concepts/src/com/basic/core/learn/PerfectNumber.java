// Make the user to enter a number. 

// Find whether it is perfect number. Perfect number is number which
// is equal to sum of its factors less than itself

// ex: 6 1 2 3
import java.util.Scanner;
class PerfectNumber{
    public static void main(String [] args){
         int n,sum = 0,i;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the nuumber");
         n = sc.nextInt();
         for(i = 1;i<n;i++){
         if(n%i == 0){
           sum = sum +i;  
           System.out.println("sum" + sum);    
         }    
         }
         if(sum == n){
         System.out.println("Perfect number");    
         }
    }
}