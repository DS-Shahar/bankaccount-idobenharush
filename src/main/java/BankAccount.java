public class BankAccount {
	private int minbalance;
    private int balance;
    private String owner;
    public BankAccount(int balance, int minBalance, String owner) {
        this.balance = balance;
        this.minbalance = minBalance;
        this.owner = owner;
    }
    public String getowner() {
        return this.owner;
      } 
    public String setowner() {
        return this.owner;
      } 
    public int getbalance() {
        return this.balance;
      } 
    public int setbalance() {
        return this.balance;
      } 
    public int getminbalance() {
        return this.minbalance;
      } 
    public int setminbalance() {
        return this.minbalance;
      }
    public void transfer(int answer,BankAccount Lisa) {
    	if(answer+this.minbalance<0) {
    		Lisa.balance=Lisa.balance + answer;
    		this.balance= balance - answer;
    	}else { 
    		System.out.println("you try to transfer a lot of money");	
    	}
    }
    public boolean withdraw(int amount) {
        if (balance - amount < minbalance)
            return false;
        balance = balance - amount;
        return true;
    }
    public void deposit(int amount) {
        balance = balance + amount;
    }
    public String toString(){ 
        return "balance        "+this.balance+" minbalance   "+this.minbalance+" name      "+this.owner;
    }
}
