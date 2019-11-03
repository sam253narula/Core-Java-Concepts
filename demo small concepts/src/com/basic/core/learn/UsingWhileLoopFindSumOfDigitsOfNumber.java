import java.util.Scanner;
class UsingWhileLoopFindSumOfDigitsOfNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0,y;
        while(n!=0){
            y = n%10;
            sum +=y;
            n = n/10;
        }
        System.out.println("sum is " +sum);
        
        
    }
    
}