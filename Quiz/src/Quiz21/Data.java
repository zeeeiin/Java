package Quiz21;

public class Data {
	
	//값만 저장하는 클래스
	private String region;
	private String size;
	private String year;
	private String month;
	private String price;
	
	//기본 생성자
	public Data() {
		
	}


	//변수 값 가지는 생성자
	public Data(String region, String size, String year, String month, String price) {
		super();
		this.region = region;
		this.size = size;
		this.year = year;
		this.month = month;
		this.price = price;
	}


	//getter, setter
	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
