import java.util.Scanner;
public class ConcesutiveFactorsOfNumber{
    public static void main(String [] args){
        int j = 0 ;
        boolean flag = false;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                if(i*j==n && i-j == 1){
                    flag = true;
                    System.out.println("The concesutive numbers are "+j+" and "+i);
                }
                
                j= i;
            }
        }
        if(flag == false)
        System.out.println("There are no set concesutive numbers for this number " +n);
    }
}