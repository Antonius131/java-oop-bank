package jana60.bank;

public class Conto {

	private int number;
	private int balance;
	public String owner;
	
	public Conto(int number, int balance, String owner) {
		
		this.number = number;
		this.balance = balance;
		this.owner= owner;
	}

	public int getNumber() {
		
		return number;
	}

	public int getBalance() {
		
		return balance;
	}
	
	public String getOwner() {
		
		return owner;
	}

	public void setOwner(String owner) {
		
		this.owner = owner;
	}
	
	public int addMoney(int addedMoney) {
		
		return balance += addedMoney;
	}
	
	public void getMoney(int takenMoney) {
		
		if (balance - takenMoney >= 0) {
			
			balance -= takenMoney;	
		} else {
			
			return;
		}
	}
	
	public int getSaldo() {
		
		return balance;
	}
	
	
	
	@Override
	public String toString() {
		
		return "Numero conto: " + number
				+ "\nIntestatario: " + owner
				+ "\nSaldo: " + balance + "€";
	}
}
