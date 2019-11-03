import java.util.*;
class Program{
    public static void main(String [] args){
        int num1;
        int sum= 0;
        int largest = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        num1 = sc.nextInt();
        while(num1 != 0)
        {
         int temp = num1%10;
         if(temp> largest){
             largest = temp;
         }
         
         num1 = num1/10;
         
         sum+=temp;
        }
        System.out.println("sum is "+ sum);
        System.out.println("largest digit is "+ largest);
        
        
        
        
    }
}