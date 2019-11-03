import java.util.Scanner;
class CountNumberOfDigits{
    public static void main(String [] args){
        int counter = 0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        while(num!=0){
            temp = num%10;
            counter++;
            num=num/10;
        }
        System.out.println("counter " + counter);
    }
    
}