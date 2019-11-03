import java.util.Scanner;
class MergeTwoMultiDimentiionalArrayIntoOne{
    public static void main(String sam[]){
        int sum =0;
        System.out.println("Enter the number of rows for array one or 1D arrays in 2D array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number of columns for array one");
        int m = sc.nextInt();
        int a1[][] = new int[n][m];
        System.out.println("Enter the elements for array one");
        for(int i =0; i< n; i++){
            for(int j = 0;j<m;j++)
            {
                a1[i][j] = sc.nextInt();
            }
        }
        
        int a2[][] = new int[n][m];
        System.out.println("Enter the elements for array two");
        for(int i =0; i< n; i++){
            for(int j = 0;j<m;j++)
            {
                a2[i][j] = sc.nextInt();
            }
        }
        
        int a3[][] = new int[n][m];
        System.out.println("Elements of 3rd array are: ");
        for(int i =0; i< n; i++){
            for(int j = 0;j<m;j++)
            {
               a3[i][j] = a1[i][j] + a2[i][j];
               System.out.print(a3[i][j]+" ");
            }
            System.out.println();
        }
    
        
    }
}