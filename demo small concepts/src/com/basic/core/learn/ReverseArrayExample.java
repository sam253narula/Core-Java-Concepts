import java.util.Scanner;
class ReverseArrayExample{
    public static void main(String [] args){
        int intArray[] = new int[5];
        int temp;
        Scanner sc = new Scanner(System.in);
        //whenever an array is created, all it's element values are initialised to zero
        for(int i =0;i < intArray.length;i++){
        System.out.println("Enter all Elements");   
        intArray[i] = sc.nextInt();
        }
        for(int j =0;j < intArray.length/2;j++){
         //   System.out.println("Elements are: " +intArray[j]);
             temp = intArray[j];
             intArray[j] = intArray[intArray.length - j -1];
             intArray[intArray.length - j -1] = temp;
        }
        for(int i =0;i < intArray.length;i++){
        System.out.println("reverse of all Elements are" + intArray[i]);   
        }
    
   
}
}