import java.util.Scanner;
class PrintingEvenNumber{
    public static void main(String [] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i = 0; i<= n;i++){
            if(i%2 == 0)
            System.out.println(i);
        }
    }
}