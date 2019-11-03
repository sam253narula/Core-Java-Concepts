import java.util.Scanner;
public class FactorailOfNUmberUsingDoWhile{
    public static void main(String [] args){
        int n;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the first number");
        n  = sc.nextInt();
        int num = 1;
        int i = 1;
        do{
        num = i*num;         
        i++;     
        }
        while(i<= n);
        System.out.println("Factorail is : "+num);
        }
}