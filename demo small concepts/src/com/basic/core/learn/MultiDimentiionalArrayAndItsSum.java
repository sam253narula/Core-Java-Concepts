import java.util.Scanner;
class MultiDimentiionalArrayAndItsSum{
    public static void main(String sam[]){
        int sum =0;
        System.out.println("Enter the number of rows or 1D arrays in 2D array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number of columns");
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Enter the elements of array");
        for(int i =0; i< n; i++){
            for(int j = 0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of array are as below: ");
        for(int i =0; i< n; i++){
            System.out.println();
            for(int j = 0;j<m;j++)
            {   
                sum += a[i][j];
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println("Sum of all elements of array is: " +sum);
        
    }
}