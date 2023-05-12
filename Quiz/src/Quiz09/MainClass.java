package Quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAp ap = new SuperSonicAp("종이비행기");
		
//		System.out.println( ap.info());
		
		ap.takeOff();
		ap.fly(); //override
		ap.flyMode = 1;
		ap.fly();
		ap.land();
		
		
		
		
		
		
	}
}
