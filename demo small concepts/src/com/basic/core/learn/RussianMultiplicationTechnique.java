import java.util.Scanner;
class RussianMultiplicationTechnique{
    public static void main(String [] args){
        int a,b,val = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
         a = sc.nextInt();
        System.out.println("Enter the second number");
         b = sc.nextInt();
         
        while(a!=0){
             if(a%2 == 1){
               val= val + b;
                System.out.println("val " +val);
            }
            a = a/2;
            b = b*2;
           
        }
        System.out.println("Product of 2 given number is " +val);
        
    }
}