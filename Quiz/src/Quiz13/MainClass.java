package Quiz13;

public class MainClass {

	public static void main(String[] args) {

		//Shape circle = new Circle("원", 4);	

		Circle circle = new Circle("원", 4);	
		System.out.println( circle.getArea() );
		System.out.println( circle.getName() );

		Rect rect = new Rect("사각형", 4);	
		System.out.println( rect.getArea());
		System.out.println( rect.getName() );

	}
}
