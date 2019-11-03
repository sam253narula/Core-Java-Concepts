import java.util.Scanner;
class NumberSeries{
    public static void main(String [] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        for(int i = 1,j = 2;i<n;i+=2,j+=2){
            sum+=1/i;
            }
            System.out.println("sum is: "+sum);
        }
    }
