import java.util.Scanner;
class ArraySumExample{
    public static void main(String [] args){
        int intArray[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i =0;i < intArray.length;i++){
        System.out.println("Enter all Elements");   
        intArray[i] = sc.nextInt();
        }
        for(int j =0;j < intArray.length;j++){
            System.out.println("Elements are: " +intArray[j]);
    }
     for(int k =0;k < intArray.length;k++)
     { 
         sum = sum + intArray[k];
     }
     System.out.println(" Sum of elements are: " +sum);
    }
}
