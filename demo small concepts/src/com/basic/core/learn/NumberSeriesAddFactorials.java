import java.util.Scanner;
class NumberSeriesAddFactorials{
    public static void main(String [] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        int num = 1;
        for(int i = 1,j = 1; i<= n;i++,j++){
            num = j*num;            
            sum += num;
        }
        System.out.println("sum : "+sum);
            
        
    }
    }