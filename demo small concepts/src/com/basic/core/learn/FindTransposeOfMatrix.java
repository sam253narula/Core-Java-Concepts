import java.util.Scanner;
class FindTransposeOfMatrix{
    public static void main(String [] args){
        int rows =0,columns=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for dimention of matrix");
        rows = sc.nextInt();
        columns = rows;
        int a[][] = new int[rows][columns];
        int b[][] = new int[rows][columns];
        System.out.println("Enter the elements of array");
        // input the array elements
        int temp =0;
        for(int i=0;i<rows;i++)
        {     
            for(int j =0;j<columns;j++){
                a[i][j] = sc.nextInt(); 
            }
        }
        // transpose logic below
        for(int i=0;i<rows-1;i++)
        {   
            for(int j =i+1;j<columns;j++){
                temp = a[j][i];
                a[j][i] = a[i][j];
                a[i][j] = temp;
            }
        }
        //display logic
        System.out.println("Below is the result ");
        for(int i=0;i<rows;i++)
        {   
            System.out.println();
            for(int j =0;j<columns;j++){
                System.out.print(" "+a[i][j]);
            }
        }
    }
}