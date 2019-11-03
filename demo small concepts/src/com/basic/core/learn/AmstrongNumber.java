import java.util.Scanner;
class AmstrongNumber{
    public static void main(String [] args){
        int temp,lastNumberToTakeCube,c = 0,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        temp = num;
        while(num!=0){
        lastNumberToTakeCube = num%10;
        a =  lastNumberToTakeCube*lastNumberToTakeCube*lastNumberToTakeCube;
        c = c + a;
        num = num/10;
        }
        if(temp == c){
        System.out.println("Amstrong Number");    
        }
        else{
            System.out.println("Not Amstrong Number");
        }
        
    }
    
}