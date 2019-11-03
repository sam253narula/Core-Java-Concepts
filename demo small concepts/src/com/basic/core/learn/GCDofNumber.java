import java.util.Scanner;
class GCDofNumber{
    public static void main(String [] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
         a = sc.nextInt();
        System.out.println("Enter the second number");
         b = sc.nextInt();
       while(a != b){
            if(a>b){
                a = a - b;
            }     
            else{
                b = b- a;
            }
       }
       System.out.println("GCD is:" + a);
        
        
    }
}