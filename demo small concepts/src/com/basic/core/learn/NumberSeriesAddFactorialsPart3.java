import java.util.Scanner;
class NumberSeriesAddFactorialsPart3{
    public static void main(String [] args){
        double sum = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        double num ,temp = - 1.0;
        for(int i = 1,j = 1; i<= 2*n - 1;i++,j++){
           
           temp = j*temp;
           System.out.println("temp : "+temp);
           if(j%2 == 1){
           temp = temp*(-1);
           num = (1/temp);
           System.out.println("num : "+num);
           sum = sum + num;
           
           System.out.println("sum : "+sum);
           }
        }
        System.out.println("sum : "+sum);
    }
}
