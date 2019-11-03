import java.util.Scanner;
public class LibraryFine{
    public static void main(String args []){
        int days;
        double fine;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many days late did you return the book");
        days = sc.nextInt();
        if(days<=7){
            fine = (double)days*0.5;
            System.out.println("Fine to be paid is: "+fine);
        }
        else if(days>7 && days <= 14){
            fine = 7*0.5 + (double)(days-7);
            System.out.println("Fine to be paid is: "+fine);
        }
        else if(days>14 && days <= 21){
            fine =  7*0.5 + (double)7 + (days-14)*1.5;
            System.out.println("Fine to be paid is: "+fine);
        }
        else{
            fine =  7*0.5 + (double)7 + 7*1.5 + (double)(days-21)*2;
            System.out.println("Fine to be paid is: "+fine);
        }
            
        }
    }

