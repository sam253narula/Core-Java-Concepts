import java.util.Scanner;
class SumOfFirstGivenNumbers{
    public static void main(String [] args){
        int n,i,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        int sum = 0;
        for(i = 0;i <= n;i++){
            sum = sum+i;
        }
        System.out.println("Result "+sum);
    } 
}