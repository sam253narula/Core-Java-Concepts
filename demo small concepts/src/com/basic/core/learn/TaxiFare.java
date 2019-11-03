import java.util.Scanner;
public class TaxiFare{
    public static void main(String [] taxifare){
        int distance,fare;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance travalled");
        distance = sc.nextInt();
        if(distance >= 1 && distance <= 4){
            fare = 9;
            System.out.println("Fare " +fare);
        }
        
        else if(distance >= 5 && distance <= 7){
        fare = 11;
        System.out.println("Fare " +fare);
            
        }
        
        else if(distance > 7){
            fare = 11 + 8*(distance-7);
            System.out.println("Fare " +fare);
        }
       }
    }