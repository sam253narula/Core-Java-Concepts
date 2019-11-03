class staticBank{
    private String name;
    private int account_number;
    private int balance =1000;
    private double ammount;
    String getname(){
        return name;
    }
    void setname(Striing name){
        return this.name = name;
    }
    int getAccountnumber(){
        return account_number;
    }
    void setAccountnumber(Striing account_number){
        return this.account_number = account_number;
    }
    
    int getbalance(){
        return balance;
    }
    void setbalance(Striing balance){
        return this.balance = balance;
    }
    boolean deposit(double amount){
       return balance += amount; 
     }
     boolean withdraw(double amount){
        return balance -= amount;
     }
     public static void main(String [] args){
         staticBank b  = new staticBank();
         b.deposit(1000);
         System.out.println("balance"+ b.balance);
     }
}