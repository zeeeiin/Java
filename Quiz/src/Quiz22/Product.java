package Quiz22;

import java.util.regex.Matcher;

public class Product {

	private String day;
	private String store;
	private String grade;
	private String detail;
	private String price;
	
	//생성자
	public Product(String string, String string2, String string3, Matcher m5) {}
		
	public Product(String day, String store, String greade, String detail, String price) {
		super();
		this.day = day;
		this.store = store;
		this.grade = greade;
		this.detail = detail;
		this.price = price;
	}

//	public Product(String day, String store, String greade, String detail, String price) {
//		super();
//		this.day = day;
//		this.store = store;
//		this.grade = greade;
//		this.detail = detail;
//		this.price = price;
//	}
	
	
	
	//get/set
	public String getDay() {
		return day;
	}

	public void setDay(String dya) {
		this.day = day;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getGrade() {
		return grade;
	}

	public void setGreade(String grade) {
		this.grade = grade;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
	
}