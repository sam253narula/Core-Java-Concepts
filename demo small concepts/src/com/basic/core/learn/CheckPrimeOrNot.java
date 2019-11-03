import java.util.Scanner;
class CheckPrimeOrNot{
    public static void main(String [] args){
        int n,count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        if(n<=1){
        System.out.println("Not a Prime number");    
        }
       for(int i = 1;i<=n;i++){
           if(n%i == 0)
               count++;
        }
        System.out.println("Count is" + count); 
        if(count == 2){
        System.out.println("Prime number");      
        }
        else{
            System.out.println("Not a Prime number");  
        }
    }
    
}
