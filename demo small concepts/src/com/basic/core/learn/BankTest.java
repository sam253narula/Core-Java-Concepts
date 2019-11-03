import java.util.Scanner;
class BankTest{
    public static void main(String [] banker){
        Scanner sc = new Scanner(System.in);
        int withdrawn;
        int depositedAmount;
        int currentBalance;
        bank b = new bank();
        while(true){
            System.out.println("option menu \n 1)Withdraw Amount \n 2)Deposit Amount \n 3)CheckBalance");
            System.out.println("select option from the option menu");
            
            int menuOption = sc.nextInt();
            switch(menuOption){
                case 1 :
                     System.out.println("Enter the amount to be withdrawn");
                     withdrawn = sc.nextInt();
                     System.out.println("hay user you have withdrawn "+withdrawn);
                     currentBalance = b.withdraw(withdrawn);
                     System.out.println("Hay your current balance is "+ currentBalance);            
                     break;
                case 2:
                        System.out.println("Please enter the amount to be deposited");
                        depositedAmount = sc.nextInt();
                        currentBalance = b.deposit(depositedAmount);
                        System.out.println("Hay your current balance is "+ currentBalance);
                        break;            
                case 3:
                    System.out.println("CUrrrent Balance is: " + b.getBalance());
                    break;
                case 4:
                    System.out.println("You are exiting the System,have a Good Day");
                    break;
                    
        }
        int myCurrenntBalance = b.getBalance();
    }
}
}