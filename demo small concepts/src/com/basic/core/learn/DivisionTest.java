import java.util.Scanner;
class DivisionTest{
    public static void main(String [] sam){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        a= sc.nextInt();
        if(a%3 != 0 && a%5 != 0){
            System.out.println("number is not divisible by 5 nor 3");
        }
        else{
            System.out.println("number is  divisible by 5 and 3");
        }
    }
}