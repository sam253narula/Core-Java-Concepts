import java.util.Scanner;
class ArraySecondMaxNumberExample{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        int n = sc.nextInt();
        int intArray[] = new int[n];
        for(int i =0;i < intArray.length;i++){
        System.out.println("Enter all Elements");   
        intArray[i] = sc.nextInt();
        }
        int max = intArray[0],secondMax = max,temp = max;
        for(int j =0;j < intArray.length;j++){
           if(intArray[j] > max)
             max = intArray[j];
        }
        for(int k =0;k < intArray.length;k++){
          temp = intArray[k];
         if(temp < max && temp > secondMax){
           secondMax  = temp;
         }
        }
        System.out.println(" secondMax of elements are: " +secondMax);
    }
}
