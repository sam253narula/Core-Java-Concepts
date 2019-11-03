import java.util.Scanner;
public class GCDUsingEuclidsAlgorithm{
    public static void main(String [] args){
        int a,b,temp,asking = 0;
        Scanner sc  = new Scanner(System.in);
        do{
        System.out.println("Enter the first number");
        a  = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
         while(a%b != 0){
           temp = b;
           b = a%b;
           a = temp;
           if(a%b == 0){
           System.out.println("gcd of 2 number is: " + b);
           System.out.println("Do you want to continue,if yes type 1,else type 0");
           asking = sc.nextInt();
           }
        }
        }while(asking == 1);
       
        
    
}
}
