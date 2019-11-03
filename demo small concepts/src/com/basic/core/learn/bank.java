public class bank{
    private int balance;
    public int getBalance(){
        return balance;
    }
    /*public void setBalance(int addBalance){
        this.balance= addBalance;
    }*/
    public int deposit(int addBalance){
        this.balance = addBalance;
        return balance;
    }
    public int withdraw(int removeMoney){
       
        if(removeMoney < balance){
            this.balance = balance - removeMoney;
        }
        else
        {
            System.out.println("insufficent balance");
        }
        return balance;
    }
    
    
}
 