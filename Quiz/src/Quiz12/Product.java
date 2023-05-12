package Quiz12;

public class Product {

	//product는 tv,radio,computer의 부모클래스

	private String name; //private 변수는 상속 안 됨, 대신에 get/set으로 상속!
	private int price;
	
	//생성자
	public Product(int price, String name) {
		this.price = price;
		this.name = name;		
	}

	//getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}










}
