import java.util.Scanner;
class MergeArrayExample{
    public static void main(String [] args){
        System.out.println("Enter the number of elements to be stored");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //input first array frorm user
        int intArrayone[] = new int[n];
        //whenever an array is created, all it's element values are initialised to zero
        System.out.println("Entering the elements of first array");  
        for(int i =0;i < intArrayone.length;i++){
        System.out.println("Enter all Elements");   
        intArrayone[i] = sc.nextInt();
        }
        //input second array from user
        System.out.println("Entering the elements of second array");
        int intArraytwo[] = new int[n];
        for(int i =0;i < intArraytwo.length;i++){
        System.out.println("Enter all Elements");   
        intArraytwo[i] = sc.nextInt();
        }
        //Merge the two input array into one array
        int mergedIntArray[] = new int[2*n];
        for(int i =0;i < intArrayone.length;i++){
        mergedIntArray[i] = intArrayone[i];
        }
        for(int i =0;i < intArraytwo.length;i++){
        mergedIntArray[n+i] = intArraytwo[i];
        }
        
        //display the merged array
        System.out.println("displaying the merged array below:");
        for(int i =0;i < mergedIntArray.length;i++){
        System.out.println("Elements are: "+mergedIntArray[i]); 
        }
        
        }
        
}