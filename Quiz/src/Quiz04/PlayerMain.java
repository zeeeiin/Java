package Quiz04;

public class PlayerMain {
	
	public static void main(String[] args) {
		
		Wizard wizard = new Wizard("zei");
		
		System.out.println(wizard.mp);
		wizard.iceArrow();
		wizard.info();
		System.out.println(wizard.mp);
		
		
		Warrior warrior = new Warrior("zzz");
				
		warrior.info();
		warrior.bash();
		System.out.println(warrior.mp);
		
		
		
	}

}
