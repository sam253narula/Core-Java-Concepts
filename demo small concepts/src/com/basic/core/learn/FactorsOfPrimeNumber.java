import java.util.Scanner;
class FactorsOfPrimeNumber{
   public static void main(String [] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        if(n<=1){
        System.out.println("Not a Prime number");    
        }
       for(int i = 2;i<=n;i++){
           // Finds out whether i is a factor or not
           if(n%i == 0){
               // This is to determine whether i is prime or not 
               int count = 0;
               for(int j = 1;j<=i;j++){
                   if(i%j == 0){
                       count++;
                    }
                }
                if(count == 2) {
                    System.out.println("prime factor"+i);
                }
               
            }
       }
    }
}
