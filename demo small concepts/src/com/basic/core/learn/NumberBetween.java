import java.util.Scanner;
class NumberBetween{
    public static void main(String [] sam){
                int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        a= sc.nextInt();
        boolean bo = !(a >=30 && a<= 49);
        System.out.println(bo);
        
      
    }
}