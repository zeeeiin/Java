package Day07.overload;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		
		b.input(1);
		b.input("문자열");
		b.input(3, 3.14);
		b.input(3.14, 3);
		
	}
}
