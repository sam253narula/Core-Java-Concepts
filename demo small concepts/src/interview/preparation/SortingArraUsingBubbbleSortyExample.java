package interview.preparation;

import java.util.Scanner;
class SortingArraUsingBubbbleSortyExample{
    public static void main(String [] args){
        System.out.println("Enter the number of elements to be stored");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberArray[] = new int[n];
        System.out.println("Entering the elements of array");  
        for(int i =0;i<n;i++){
        System.out.println("Enter all Elements");   
        numberArray[i] = sc.nextInt();
       }
       /* for(int i = 0; i<numberArray.length;i++){
       System.out.println("printing" + numberArray[i]);
       } */
       for(int i= 0;i < n-1;i++)//passes counter
       {  boolean counter = false;
          for(int j =0;j<n-1-i;j++)  //comparation counter
           {     ///swapping logic to set the array in ascending order for 2 elemets at a time
                if(numberArray[j] > numberArray[j+1]){
                   int temp = numberArray[j];
                   numberArray[j]= numberArray[j+1];
                   numberArray[j+1] = temp;
                   counter=true;
                }
           }
           if(counter)
           break;
       } 
     for(int i = 0; i<numberArray.length;i++){
       System.out.println("printing" + numberArray[i]);
       }
    }
}
