import java.util.Scanner;
class Larger{
    public static void main(String [] lar){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number");
        int c = sc.nextInt();
        //int ans = a>b?a:b;
        //int ansd =  c>ans?c:ans;
        int ans =a>b?(c>a?c:a):(b>c?b:c);
        System.out.println("Largest number is: "+ans);
    }
}