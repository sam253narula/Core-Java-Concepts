import java.util.Scanner;
class DivisionUsingternary{
    public static void main(String [] lar){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        String div = a%2==0 && a%3 == 0?"divisible by both":(a%2==0 && a%3 !=0)?"divisible by 2":(a%2!=0 && a%3==0)?"divisible by 3":"divisible by nun";
        System.out.println(div);
        
         
        
    }
}