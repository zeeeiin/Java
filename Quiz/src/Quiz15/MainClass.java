package Quiz15;

public class MainClass {

	public static void main(String[] args) {		
		
		MyBag my = new MyBag();
		
		//인터페이스타입이 붙어있다면 인터페이스 타입에 저장해도 된다.
		IBag bag = new MyBag();
		
		bag.insert("tv");
		bag.insert("tv");
		bag.insert("tv");
		bag.insert("radio");
		bag.insert("radio");
		bag.insert("radio");
		
		bag.print();
//		bag.search("tv");
		System.out.println("인덱스위치:" +  bag.search("tv"));
		System.out.println("인덱스위치:" +  bag.search("radio"));
		
		System.out.println("삭제:" + bag.delete("radio"));
		bag.print();
		
		
		
	}
}
