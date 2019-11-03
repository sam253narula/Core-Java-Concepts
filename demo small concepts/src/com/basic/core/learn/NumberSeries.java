import java.util.Scanner;
class NumberSeries{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int n = sc.nextInt();
        
        int total = 0;
        for(int i = 1,j = 1;i<n;i++){
            j += i;
            int sum = j;
            total  += sum;
            }
            int sumfinallyis = total +1;
            System.out.println("total is "+sumfinallyis);
    }
}




// HW:

// Find the sum of the following series

// 1-1/2!+1/3!-1/4!+.......n terms