import java.util.Scanner;
class NumberSeriesAddFactorialsPart2{
    public static void main(String [] args){
        double sum = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        double num ,temp = - 1.0;
        for(int i = 1,j = 1; i<= n;i++,j++){
           temp = temp*(-1);
           temp = j*temp;
           num = (1/temp);
           sum = sum + num;
        }
        System.out.println("sum : "+sum);
    }
}
