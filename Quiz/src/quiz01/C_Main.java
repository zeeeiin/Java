package quiz01;

public class C_Main {
	
	public static void main(String[] args) {
		
		
		FruitStore c = new FruitStore(100000);
		
		c.settleAccounts();
		c.receipt(args);
		
		Fruit f = new Fruit(100000);
		
		f.receipt(args);
		
		f.calculate(100000, 52000);
		
	}

}
