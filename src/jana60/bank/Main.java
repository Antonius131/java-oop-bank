package jana60.bank;

public class Main {

	public static void main(String[] args) {
		
		Conto cnt = new Conto(1234, 0 , "Antonio Mendetta");
		
		cnt.addMoney(1000);
		
		System.out.println(cnt.getMoney(1200));
		System.out.println(cnt);
	}
}
