import java.util.Scanner;
class ArrayElementPresentNoOfTimesExample{
    public static void main(String [] args){
        int intArray[] = new int[5];
        int ocurance = 0;
        Scanner sc = new Scanner(System.in);
        for(int i =0;i < intArray.length;i++){
        System.out.println("Enter all Elements");   
        intArray[i] = sc.nextInt();
        }
        for(int j =0;j < intArray.length;j++){
            System.out.println("Elements are: " +intArray[j]);
        }
        System.out.println("Enter the element for which the number of occurance is to be found");
        int userChoice = sc.nextInt();
     for(int k =0;k < intArray.length;k++)
     {  
         if(userChoice == intArray[k])
          ocurance++;
     }
     System.out.println("Dear user the choosen number: "+userChoice+" has occured: "+ocurance + " times");
    }
}
