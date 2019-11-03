import java.util.Scanner;
public class NumberSeries {
    public static void main(String [] args){
        int n,i;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range");
        n = sc.nextInt();
        for(i = 1;i<=n;i++){
             result = result + (1.0/i);
        }
        System.out.println("result = " + result);
  
    }
}