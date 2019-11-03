import java.util.Scanner;
class PalindromeNumber{
    public static void main(String [] args){
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = num;
        while(num!=0){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num =num/10;
        }
        if(reverse == temp){
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("Not Palindrome number");
        }
    }
}
