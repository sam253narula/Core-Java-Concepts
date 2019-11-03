import java.util.Scanner;
class UsingWhileLoopFindFactorial{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        int num = 1;
        int i = 1;
        while(i<= n){
        num = i*num;         
        i++;            
        }
        System.out.println("Factorail is : "+num);
    }
}