import java.util.Scanner;
public class ElectricityBillCalculator{
    public static void main(String [] eletric){
        int units,bill;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units consumed from electricity meter");
        units = sc.nextInt();
        if(units <= 100){
           bill = (units*60)/100;
           System.out.println("Total bill is "+ bill);
        }
        else if(units>100 && units<=300){
            
            bill = (100*60 + (units-100)*80)/100;
            if(bill > 150){
               bill = bill - (int)(bill*0.1); 
              System.out.println("Total bill is "+ bill);
        }
        System.out.println("Total bill is "+ bill);
        }
        else if(units >= 300){
            bill = ((100*60)+(200*80)+((units - 300)*90))/100;
              if(bill > 150){
              bill = bill - (int)(bill*0.1); 
              System.out.println("Total bill is "+ bill);
        }
        System.out.println("Total bill is "+ bill);
        }
    }
} 

