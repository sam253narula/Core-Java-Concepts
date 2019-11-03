import java.util.Scanner;
public class NumberSeries2 {
    public static void main(String [] args){
        int n,i,sum = -1,result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range");
        n = sc.nextInt();
        for(i=1; i<=n;i++){
          sum =  sum*(-1);
          result = result + sum * i;
        }
        System.out.println("Sum is " + result);
    }
    
}