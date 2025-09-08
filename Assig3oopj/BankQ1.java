class BankAccount {
	   private double balance;
   public BankAccount(double intialBalance){
      this.balance = intialBalance;
   }


public void deposit(double amount){
	if (amount > 0){
      balance += amount;
	}
	else {
		System.out.println("Deposite must be positive");
	}
}		
public void withdraw(double amount){
	if (amount > balance){
	  System.out.println("withdraw denied");
	}else if (amount <= 0){
		System.out.println("withdraw must be positive");
	}else{
		 
		 balance -= amount;
	}
}
public double getBalance(){
  return balance;
   }
}	
public class BankQ1{
	public static void main(String args[]){
		BankAccount B = new BankAccount(0);
		B.deposit(5000);
		B.withdraw(2000);
		
		System.out.println("balance" + B.getBalance());
		
	}
}
		
